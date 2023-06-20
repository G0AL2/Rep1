package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.g.f;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SDKUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28240a = "SDKUtils";

    /* renamed from: b  reason: collision with root package name */
    private static String f28241b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f28242c = true;

    /* renamed from: d  reason: collision with root package name */
    private static String f28243d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f28244e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static String f28245f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, String> f28246g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f28247h = "";

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicInteger f28248i = new AtomicInteger(1);

    /* loaded from: classes3.dex */
    static class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            String str2 = f28240a;
            Logger.d(str2, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((((float) j10) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1e
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L23
        L14:
            r3 = move-exception
            goto L1a
        L16:
            r3 = move-exception
            goto L20
        L18:
            r3 = move-exception
            r1 = r0
        L1a:
            r3.printStackTrace()
            goto L23
        L1e:
            r3 = move-exception
            r1 = r0
        L20:
            r3.printStackTrace()
        L23:
            if (r1 == 0) goto L2a
            byte[] r3 = r1.digest()
            return r3
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(f fVar) {
        return fetchDemandSourceId(fVar.f28189d);
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    String str = f28240a;
                    Logger.i(str, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 17) {
            do {
                atomicInteger = f28248i;
                i10 = atomicInteger.get();
                i11 = i10 + 1;
                if (i11 > 16777215) {
                    i11 = 1;
                }
            } while (!atomicInteger.compareAndSet(i10, i11));
            return i10;
        }
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 14 ? 2 : 0;
        if (i10 >= 16) {
            i11 |= 1796;
        }
        return (i10 < 19 || !z10) ? i11 : i11 | 4096;
    }

    public static String getAdvertiserId() {
        return f28241b;
    }

    public static String getControllerConfig() {
        return f28245f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f28243d) ? f28243d : "";
    }

    public static int getDebugMode() {
        return f28244e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f28246g;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, translateOrientation(h.o(context)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public static d.e getProductType(String str) {
        d.e eVar = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "5.116";
    }

    public static String getTesterParameters() {
        return f28247h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static boolean isLimitAdTrackingEnabled() {
        return f28242c;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        String[] C = h.C(context);
        if (C == null || C.length != 2) {
            return;
        }
        f28241b = C[0];
        f28242c = Boolean.parseBoolean(C[1]);
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((((float) j10) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        Objects.requireNonNull(str, str2);
        return str;
    }

    public static <T> T requireNonNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static void setControllerConfig(String str) {
        f28245f = str;
    }

    public static void setControllerUrl(String str) {
        f28243d = str;
    }

    public static void setDebugMode(int i10) {
        f28244e = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f28246g = map;
    }

    public static void setTesterParameters(String str) {
        f28247h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT;
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT;
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return DtbDeviceDataRetriever.ORIENTATION_PORTRAIT;
        }
        return DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE;
    }
}
