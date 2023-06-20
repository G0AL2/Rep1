package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.C1740n;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.I;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceUtils {
    private static final String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final String DEFAULT_PXL_EVENTS_URL = "default_pxl_events_url";
    private static final String DEFAULT_PXL_TRIGGER_EVENTS = "default_pxl_trigger_events";
    private static final String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final String GENERAL_PROPERTIES = "general_properties";
    private static final String LAST_RESPONSE = "last_response";
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;
    private static final String PROVIDER_PRIORITY = "providerPriority";
    private static final String SDK_VERSION = "7.2.3.1";
    private static final String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static int serr = 1;
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static String mSessionId = null;
    private static Boolean mFirstSession = null;
    private static IronSourceUtils instance = new IronSourceUtils();

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        thread.start();
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getBase64Auth(String str, String str2) {
        String str3 = str + ":" + str2;
        return "Basic " + Base64.encodeToString(str3.getBytes(), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z10) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z10);
    }

    @Deprecated
    private static JSONObject getCachedInitResponse(Context context) {
        try {
            return new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        return getCachedInitResponse(context).optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e10) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_URL : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_EVENTS_URL : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_EVENTS_URL : "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_FORMATTER_TYPE : (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? DEFAULT_RV_EVENTS_FORMATTER_TYPE : "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_NON_CONNECTIVITY_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_NON_CONNECTIVITY_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_IN_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_IN_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_OUT_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_OUT_EVENTS : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_TRIGGER_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_TRIGGER_EVENTS : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_TRIGGER_EVENTS : "";
    }

    public static String getDeviceType(Context context) {
        return com.ironsource.environment.h.c(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!F.b(context));
        }
        return mFirstSession.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1L;
        }
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong("firstSessionTimestamp", -1L);
    }

    public static synchronized JSONObject getGeneralProperties(Context context) {
        synchronized (IronSourceUtils.class) {
            JSONObject jSONObject = new JSONObject();
            if (context == null) {
                return jSONObject;
            }
            try {
                jSONObject = new JSONObject(context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(GENERAL_PROPERTIES, jSONObject.toString()));
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getIntFromSharedPrefs(Context context, String str, int i10) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i10);
    }

    public static I getIronSourceAdvId(Context context) {
        String str;
        if (context != null) {
            J.a();
            String a10 = J.a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
                str = IronSourceConstants.TYPE_UUID;
            } else {
                str = IronSourceConstants.TYPE_GAID;
            }
            return new I(a10, str);
        }
        return null;
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i10 < list.size() && i11 < list2.size(); i11++) {
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i10++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLongFromSharedPrefs(Context context, String str, long j10) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j10);
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z10) {
        return getMediationAdditionalData(z10, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z10, boolean z11, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z11 && i10 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return com.ironsource.mediationsdk.sdk.f.a().a(DataKeys.USER_ID);
    }

    public static JSONObject getProviderAdditionalData(AbstractC1728b abstractC1728b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PROVIDER_PRIORITY, abstractC1728b.f26991n);
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, abstractC1728b.f26983f);
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(abstractC1728b.f26984g) ? abstractC1728b.f26984g : abstractC1728b.j());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractC1728b.f26979b.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractC1728b.f26979b.getVersion());
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + abstractC1728b.j() + ")", e10);
        }
        return jSONObject;
    }

    public static JSONObject getProviderAdditionalData(C1740n c1740n) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, c1740n.f27296b.getSubProviderId());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, !TextUtils.isEmpty(c1740n.f27296b.getAdSourceNameForEvents()) ? c1740n.f27296b.getAdSourceNameForEvents() : c1740n.a());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, c1740n.f27295a.getCoreSDKVersion());
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, c1740n.f27295a.getVersion());
            jSONObject.put(PROVIDER_PRIORITY, c1740n.f27300f);
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + c1740n.a() + ")", e10);
        }
        return jSONObject;
    }

    public static String getSDKVersion() {
        return "7.2.3.1";
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e10);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (mDidCreateSessionID.compareAndSet(false, true)) {
                mSessionId = UUID.randomUUID().toString();
            }
            str = mSessionId;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j10, String str) {
        return getSHA256(String.format("%s%s%s", Long.valueOf(j10), J.a().f26338j, str));
    }

    public static String getUserIdForNetworks() {
        String a10 = com.ironsource.mediationsdk.sdk.f.a().a("userIdType");
        String a11 = com.ironsource.mediationsdk.sdk.f.a().a(DataKeys.USER_ID);
        if (a10 == null || !a10.equals(IronSourceConstants.TYPE_USER_GENERATED) || TextUtils.isEmpty(a11)) {
            return null;
        }
        return a11;
    }

    public static boolean isAndroidXAvailable() {
        return doesClassExist("androidx.appcompat.app.AppCompatActivity") || doesClassExist("androidx.core.app.CoreComponentFactory") || doesClassExist("androidx.fragment.app.Fragment") || doesClassExist("androidx.lifecycle.LiveData") || doesClassExist("androidx.annotation.Keep");
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return com.ironsource.environment.k.a(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        return (TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "appKey")) || TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID)) || TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "response"))) ? false : true;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static Vector<Pair<String, String>> parseJsonToPairVector(JSONObject jSONObject) {
        Vector<Pair<String, String>> vector = new Vector<>();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        vector.add(new Pair<>(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return vector;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveBooleanToSharedPrefs(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultFormatterTypeByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultEventsUrlByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                }
                edit.putString(getDefaultNonConnectivityEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                }
                edit.putString(getDefaultOptInEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                }
                edit.putString(getDefaultOptOutEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    str2 = sb2.toString();
                }
                edit.putString(getDefaultTriggerEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putLong("firstSessionTimestamp", j10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void saveGeneralProperties(Context context, JSONObject jSONObject) {
        synchronized (IronSourceUtils.class) {
            if (context == null || jSONObject == null) {
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            edit.putString(GENERAL_PROPERTIES, jSONObject.toString());
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveIntToSharedPrefs(Context context, String str, int i10) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putInt(str, i10);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            edit.putString(LAST_RESPONSE, str);
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveLongToSharedPrefs(Context context, String str, long j10) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }

    private static void setSerr(int i10) {
        serr = i10;
    }
}
