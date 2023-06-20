package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import j8.m1;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public abstract class Utils {
    public static final int BYTES_PER_KB = 1000;
    public static final String KEY_AD_VALUES = "ad_values";
    public static final String MACRO_CLCODE = "{CLCODE}";
    public static final String MACRO_CLICK_X = "{CLICK_X}";
    public static final String MACRO_CLICK_Y = "{CLICK_Y}";
    private static final String MACRO_EVENT_ID = "{EVENT_ID}";
    public static final String MACRO_IS_VIDEO_CLICK = "{IS_VIDEO_CLICK}";
    public static final String MACRO_SCREEN_HEIGHT = "{SCREEN_HEIGHT}";
    public static final String MACRO_SCREEN_WIDTH = "{SCREEN_WIDTH}";
    public static final String PLAY_STORE_PACKAGE_NAME = "com.android.vending";
    public static final String PLAY_STORE_SCHEME = "market";
    private static final String SDK_EXTRA_PARAM_RUN_IN_RELEASE_MODE = "run_in_release_mode";
    private static final String SDK_EXTRA_PARAM_USER_AGENT_COLLECTION_ENABLED = "user_agent_collection_enabled";
    private static final String TAG = "Utils";
    private static final DecimalFormat decimalFormat = new DecimalFormat();
    public static Boolean isDspDemoApp;
    public static Boolean isExoPlayerEligible;

    public static boolean bitMaskContainsFlag(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static List<Uri> checkCachedResourcesExist(boolean z10, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.m mVar, Context context) {
        if (eVar instanceof com.applovin.impl.a.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(eVar.A())) {
            if (!(mVar.aa() != null ? mVar.aa().b(uri.getLastPathSegment(), context) : mVar.ab().b(uri.getLastPathSegment(), context))) {
                if (v.a()) {
                    v A = mVar.A();
                    A.e(TAG, "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z10) {
            Uri h10 = eVar.h();
            if (!(mVar.aa() != null ? mVar.aa().b(h10.getLastPathSegment(), context) : mVar.ab().b(h10.getLastPathSegment(), context))) {
                if (v.a()) {
                    v A2 = mVar.A();
                    A2.e(TAG, "Cached video missing: " + h10);
                }
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    public static boolean checkClassExistence(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkClassesExistence(List<String> list) {
        for (String str : list) {
            if (checkClassExistence(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExoPlayerEligibility(com.applovin.impl.sdk.m mVar) {
        if (isExoPlayerEligible == null) {
            int tryToGetExoPlayerVersionCode = tryToGetExoPlayerVersionCode();
            int intValue = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cE)).intValue();
            isExoPlayerEligible = Boolean.valueOf(checkClassExistence("com.google.android.exoplayer2.ui.PlayerView") && tryToGetExoPlayerVersionCode >= ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cD)).intValue() && (intValue < 0 || tryToGetExoPlayerVersionCode <= intValue));
        }
        return isExoPlayerEligible.booleanValue();
    }

    public static void close(Closeable closeable, com.applovin.impl.sdk.m mVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (mVar == null || !v.a()) {
                return;
            }
            v A = mVar.A();
            A.b(TAG, "Unable to close stream: " + closeable, th);
        }
    }

    public static int compare(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                int compareTo = VersionInfo.getInstance(digitsOnlyVersionString).compareTo(VersionInfo.getInstance(digitsOnlyVersionString2));
                return compareTo == 0 ? compareTo : compareTo > 0 ? 1 : -1;
            }
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            int i10 = 0;
            while (i10 < max) {
                String str3 = StringUtils.isValidString(split[i10]) ? split[i10] : "0";
                String str4 = StringUtils.isValidString(split2[i10]) ? split2[i10] : "0";
                int parseInt = i10 < split.length ? Integer.parseInt(str3) : 0;
                int parseInt2 = i10 < split2.length ? Integer.parseInt(str4) : 0;
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i10++;
            }
            return 0;
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Failed to process version string.", th);
            }
            return 0;
        }
    }

    public static void disconnect(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.m mVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (mVar == null || !v.a()) {
                return;
            }
            v A = mVar.A();
            A.b(TAG, "Unable to disconnect connection: " + httpURLConnection, th);
        }
    }

    public static String encodeUrlMap(Map<String, String> map, boolean z10, boolean z11) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.Utils.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(String str, String str2) {
                    return str.compareToIgnoreCase(str2);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            String value = entry.getValue();
            if (z11 && (value instanceof String)) {
                String str = value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb2.append((Object) entry.getKey());
            sb2.append('=');
            sb2.append((Object) value);
        }
        return sb2.toString();
    }

    private static long floatToLong(float f10) {
        return Math.round(f10);
    }

    public static String formatDoubleValue(double d10, int i10) {
        DecimalFormat decimalFormat2 = decimalFormat;
        decimalFormat2.setMaximumFractionDigits(i10);
        return decimalFormat2.format(d10);
    }

    private static List<Class> generateClassesList(List<String> list, com.applovin.impl.sdk.m mVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                if (v.a()) {
                    v A = mVar.A();
                    A.e(TAG, "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static int getAlwaysFinishActivitiesSetting(Context context) {
        g.b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String getAndroidOSInfo() {
        try {
            return Build.VERSION.RELEASE + " (" + getAndroidSdkCodename() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Unable to get Android OS info", th);
                return "";
            }
            return "";
        }
    }

    public static String getAndroidSdkCodename() {
        Field[] fields;
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Unable to get Android SDK codename", th);
                return "";
            }
            return "";
        }
    }

    public static boolean getBooleanForProbability(int i10) {
        return i10 > 0 && i10 <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= i10;
    }

    public static String getCurrentAdServeId(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).f();
        }
        if (com.applovin.impl.mediation.d.c.a(obj)) {
            return ((com.applovin.impl.sdk.ad.e) obj).N();
        }
        return null;
    }

    public static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    public static String getFileName(Uri uri) {
        return TextUtils.join("_", uri.getPathSegments());
    }

    public static Map<String, String> getMetaData(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field field = getField(appLovinSdkSettings.getClass(), "metaData");
            if (field != null) {
                field.setAccessible(true);
            }
            return (Map) field.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, com.applovin.impl.sdk.m mVar) {
        return getPostbacks(str, jSONObject, str2, (Map<String, String>) null, str3, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, Map<String, String> map, com.applovin.impl.sdk.m mVar) {
        return getPostbacks(str, jSONObject, str2, Collections.emptyMap(), str3, map, false, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, com.applovin.impl.sdk.m mVar) {
        return getPostbacks(str, jSONObject, str2, map, str3, null, false, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.m mVar) {
        if (map == null) {
            map = new HashMap<>(1);
        }
        Map<String, String> map3 = map;
        map3.put(MACRO_CLCODE, str2);
        return getPostbacks(str, jSONObject, map3, str3, map2, z10, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, com.applovin.impl.sdk.m mVar) {
        return getPostbacks(str, jSONObject, map, str2, (Map<String, String>) null, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, com.applovin.impl.sdk.m mVar) {
        return getPostbacks(str, jSONObject, map, str2, map2, false, mVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z10, com.applovin.impl.sdk.m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new com.applovin.impl.sdk.d.a(str2, null, map2, z10));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = jSONObject2.optString(next);
                        String replace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = StringUtils.replace(optString, map);
                        }
                        arrayList.add(new com.applovin.impl.sdk.d.a(replace, optString, map2, z10));
                    }
                } catch (Throwable th) {
                    if (v.a()) {
                        mVar.A().b(TAG, "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public static View getRootView(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    public static int getRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static long getServerAdjustedUnixTimestampMillis(com.applovin.impl.sdk.m mVar) {
        long longValue = ((Long) mVar.a(com.applovin.impl.sdk.c.b.er)).longValue();
        long longValue2 = ((Long) mVar.a(com.applovin.impl.sdk.c.b.es)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static String getString(Class cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getUserEngagementSdkVersion() {
        try {
            return (String) Class.forName("com.applovin.sdk.userengagement.impl.api.AppLovinUserEngagementSdkImpl").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getVideoCompletionPercent(JSONObject jSONObject) {
        int i10 = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i10 < 0 || i10 > 100) {
            return 95;
        }
        return i10;
    }

    public static com.applovin.impl.sdk.ad.d getZone(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null));
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean hasAndroidCoreJsonLibrary(com.applovin.impl.sdk.m mVar) {
        if (g.c()) {
            try {
                JSONObject.wrap(JSONObject.NULL);
                return true;
            } catch (Throwable th) {
                if (v.a()) {
                    mVar.A().a(TAG, "Failed to wrap JSONObject with exception", th);
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isAppLovinTestEnvironment(Context context) {
        return d.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean isBML(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER || appLovinAdSize == AppLovinAdSize.CROSS_PROMO;
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Exception thrown while getting memory state.", th);
            }
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean isDeepLinkPlusUrl(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static boolean isDomainWhitelisted(String str, List<String> list) {
        for (String str2 : list) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDspDemoApp(Context context) {
        if (isDspDemoApp == null) {
            isDspDemoApp = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return isDspDemoApp.booleanValue();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isProguardRulesOmitted() {
        try {
            String str = AppLovinSdk.VERSION;
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static boolean isPubInDebugMode(Context context, com.applovin.impl.sdk.m mVar) {
        String str = mVar.p().getExtraParameters().get(SDK_EXTRA_PARAM_RUN_IN_RELEASE_MODE);
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean isTestApp(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean isUserAgentCollectionEnabled(com.applovin.impl.sdk.m mVar) {
        String str = mVar.p().getExtraParameters().get(SDK_EXTRA_PARAM_USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000a, B:7:0x001c, B:9:0x0024), top: B:19:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVPNConnected() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L2e
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L2e
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getDisplayName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L4
        L2c:
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.v.a()
            if (r1 == 0) goto L3c
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.v.c(r1, r2, r0)
        L3c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.Utils.isVPNConnected():boolean");
    }

    @Keep
    public static boolean isVerboseLoggingConfigured() {
        Context M = com.applovin.impl.sdk.m.M();
        if (M != null) {
            return d.a(M).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean isVerboseLoggingEnabled(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.m.M();
        }
        if (context != null) {
            return d.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean isVideoMutedInitially(com.applovin.impl.sdk.m mVar) {
        return ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cu)).booleanValue() ? mVar.p().isMuted() : ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cs)).booleanValue();
    }

    public static boolean isViewInChildView(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (isViewInChildView(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isViewInTopActivity(View view, Activity activity) {
        View rootView;
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                rootView = window.getDecorView();
            } else {
                View findViewById = activity.findViewById(16908290);
                if (findViewById != null) {
                    rootView = findViewById.getRootView();
                }
            }
            return isViewInChildView(view, rootView);
        }
        return false;
    }

    public static int kilobytesToByes(int i10) {
        return i10 * 1000;
    }

    public static void maybeHandleNoFillResponseForPublisher(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        if (jSONObject.has("no_fill_reason") && v.a()) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            mVar.A().e("AppLovinSdk", "\n**************************************************\nNO FILL received:\n..ID: \"" + str + "\"\n..FORMAT: \"" + maxAdFormat.getLabel() + "\"\n..SDK KEY: \"" + mVar.z() + "\"\n..PACKAGE NAME: \"" + mVar.L().getPackageName() + "\"\n..Reason: " + object + "\n**************************************************\n");
        }
    }

    public static void maybeLogCustomDataSizeLimit(String str, String str2) {
        if (str == null || str.length() <= kilobytesToByes(8)) {
            return;
        }
        v.h(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + kilobytesToByes(8) + " maximum)");
    }

    public static AppLovinAd maybeRetrieveNonDummyAd(AppLovinAd appLovinAd, com.applovin.impl.sdk.m mVar) {
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.f) {
            com.applovin.impl.sdk.ad.f fVar = (com.applovin.impl.sdk.ad.f) appLovinAd;
            AppLovinAd dequeueAd = mVar.u().dequeueAd(fVar.getAdZone());
            if (v.a()) {
                v A = mVar.A();
                A.b(TAG, "Dequeued ad for dummy ad: " + dequeueAd);
            }
            if (dequeueAd != null) {
                fVar.a(dequeueAd);
                ((AppLovinAdImpl) dequeueAd).setDummyAd(fVar);
                return dequeueAd;
            }
            return fVar.a();
        }
        return appLovinAd;
    }

    public static double millisToSeconds(long j10) {
        return j10 / 1000.0d;
    }

    public static boolean objectIsOfType(Object obj, List<String> list, com.applovin.impl.sdk.m mVar) {
        if (list == null) {
            return false;
        }
        for (Class cls : generateClassesList(list, mVar)) {
            if (cls.isInstance(obj)) {
                if (!(obj instanceof Map)) {
                    if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (!objectIsOfType(obj2, list, mVar)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!(entry.getKey() instanceof String)) {
                        if (v.a()) {
                            mVar.A().b(TAG, "Invalid key type used. Map keys should be of type String.");
                        }
                        return false;
                    } else if (!objectIsOfType(entry.getValue(), list, mVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (v.a()) {
            v A = mVar.A();
            A.b(TAG, "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static boolean openUri(Context context, Uri uri, com.applovin.impl.sdk.m mVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if (PLAY_STORE_SCHEME.equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            mVar.ad().c();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            if (v.a()) {
                v A = mVar.A();
                A.b(TAG, "Unable to open \"" + uri + "\".", th);
            }
        }
        if (!z10) {
            mVar.ad().d();
        }
        return z10;
    }

    public static long parseColor(String str) {
        if (StringUtils.isValidString(str)) {
            try {
                return Color.parseColor(str);
            } catch (Throwable unused) {
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public static void putObjectForStringIfValid(String str, String str2, Map map) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public static void renameKeyInObjectMap(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static String retrieveLauncherActivityFullyQualifiedName(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return queryIntentActivities.get(0).activityInfo.name;
    }

    public static Activity retrieveParentActivity(View view, com.applovin.impl.sdk.m mVar) {
        if (view == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 1000) {
            i10++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                if (v.a()) {
                    mVar.A().b(TAG, "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static Object sanitizeSuperProperty(Object obj, com.applovin.impl.sdk.m mVar) {
        int intValue;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                hashMap.put(key instanceof String ? (String) key : String.valueOf(key), sanitizeSuperProperty(entry.getValue(), mVar));
            }
            return hashMap;
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj2 : list) {
                arrayList.add(sanitizeSuperProperty(obj2, mVar));
            }
            return arrayList;
        } else if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        } else {
            String valueOf = String.valueOf(obj);
            if (obj instanceof String) {
                intValue = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.f8204bf)).intValue();
                if (intValue <= 0 || valueOf.length() <= intValue) {
                    return valueOf;
                }
            } else if (!(obj instanceof Uri) || (intValue = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.bg)).intValue()) <= 0 || valueOf.length() <= intValue) {
                return valueOf;
            }
            return valueOf.substring(0, intValue);
        }
    }

    public static float secondsToMillis(float f10) {
        return f10 * 1000.0f;
    }

    public static long secondsToMillisLong(float f10) {
        return floatToLong(secondsToMillis(f10));
    }

    public static String shortenKey(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static void showAlert(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    public static void showToast(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(context, str, 0);
                makeText.setMargin(0.0f, 0.1f);
                makeText.show();
            }
        });
    }

    public static void showToast(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static Map<String, String> stringifyObjectMap(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static Map<String, String> toUrlSafeMap(Map<String, String> map, com.applovin.impl.sdk.m mVar) {
        HashMap hashMap = new HashMap(map);
        for (String str : hashMap.keySet()) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                hashMap.put(str, StringUtils.encodeUriString(str2, mVar));
            }
        }
        return hashMap;
    }

    public static int toVersionCode(String str) {
        String[] split;
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                if (v.a()) {
                    v.i(TAG, "Version number components cannot be longer than two digits -> " + str);
                }
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static double tryParseDouble(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Failed to parse double from String: " + str, th);
            }
            return d10;
        }
    }

    public static WebView tryToCreateWebView(Context context, String str) {
        try {
            return new WebView(context);
        } catch (Throwable th) {
            if (v.a()) {
                v.c(TAG, "Failed to initialize WebView for " + str + ".", th);
                return null;
            }
            return null;
        }
    }

    public static int tryToGetExoPlayerVersionCode() {
        try {
            int i10 = m1.f32622c;
            Field field = getField(m1.class, "VERSION_INT");
            field.setAccessible(true);
            return ((Integer) field.get(null)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String urlStringWithoutQueryParameters(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    public static void validateAdSdkKey(AppLovinAd appLovinAd, com.applovin.impl.sdk.m mVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String z10 = mVar.z();
            String z11 = ((AppLovinAdBase) appLovinAd).getSdk().z();
            if (z10.equals(z11)) {
                return;
            }
            if (v.a()) {
                v.i("AppLovinAd", "Ad was loaded from sdk with key: " + z11 + ", but is being rendered from sdk with key: " + z10);
            }
            mVar.T().a(com.applovin.impl.sdk.d.f.f8329l);
        }
    }
}
