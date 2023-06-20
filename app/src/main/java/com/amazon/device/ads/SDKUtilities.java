package com.amazon.device.ads;

import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SDKUtilities {
    static final String BID_HTML_BANNER_TEMPLATE = "<div style=\"display:inline-block\"><div id=\"__dtbAd__\" style=\"width:%dpx; height:%dpx; overflow:hidden;\"/><script type=\"text/javascript\">amzn.dtb.loadAd(\"%s\",\"%s\",\"%s\", %s);</script></div>";
    static final String BID_HTML_TEMPLATE = "<div style=\"display:inline-block\"><div id=\"__dtbAd__\" style=\"width:100%%; height:auto; overflow:hidden;\"/><script type=\"text/javascript\">amzn.dtb.loadAd(\"%s\",\"%s\",\"%s\", %s);</script></div>";
    private static final String LOG_TAG = "SDKUtilities";
    private static String amznDebugStateFlag = "false";

    /* loaded from: classes.dex */
    public static class SimpleSize {
        int height;
        int width;

        public SimpleSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public void setHeight(int i10) {
            this.height = i10;
        }

        public void setWidth(int i10) {
            this.width = i10;
        }
    }

    protected static List<Object> convertJSONArrayToList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = convertJSONArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = convertJSONObjectToMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Map<String, Object> convertJSONObjectToMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                hashMap.put(next, convertJSONObjectToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                hashMap.put(next, convertJSONArrayToList((JSONArray) obj));
            } else {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public static String getBidInfo(DTBAdResponse dTBAdResponse) {
        try {
            if (dTBAdResponse.getDTBAds().size() == 0) {
                return "";
            }
            DTBAdSize dTBAdSize = dTBAdResponse.getDTBAds().get(0);
            int width = dTBAdSize.getWidth();
            int height = dTBAdSize.getHeight();
            Map<String, List<String>> defaultDisplayAdsRequestCustomParams = dTBAdResponse.getDefaultDisplayAdsRequestCustomParams();
            List<String> list = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_BID_ID_KEY);
            String str = !DtbCommonUtils.isNullOrEmpty(list) ? list.get(0) : "";
            List<String> list2 = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_HOST_KEY);
            String str2 = !DtbCommonUtils.isNullOrEmpty(list2) ? list2.get(0) : "";
            List<String> list3 = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            String str3 = !DtbCommonUtils.isNullOrEmpty(list3) ? list3.get(0) : "";
            return (width == 9999 && height == 9999) ? String.format(BID_HTML_TEMPLATE, str3, str, str2, amznDebugStateFlag) : String.format(BID_HTML_BANNER_TEMPLATE, Integer.valueOf(width), Integer.valueOf(height), str3, str, str2, amznDebugStateFlag);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getBidInfo method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getBidInfo method", e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getHeight(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getHeight();
    }

    public static String getPricePoint(DTBAdResponse dTBAdResponse) {
        try {
            List<String> list = dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            return (list == null || list.size() <= 0) ? "" : list.get(0);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getPricePoint method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getPricePoint method", e10);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getWidth(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getWidth();
    }

    @Deprecated
    public static boolean isEmulator() {
        try {
            String str = Build.FINGERPRINT;
            String str2 = Build.MODEL;
            String str3 = Build.MANUFACTURER;
            if (!str.startsWith("generic") && !str.startsWith(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN) && !str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !str3.contains("Genymotion") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                if (!"google_sdk".equals(Build.PRODUCT)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute isEmulator method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute isEmulator method", e10);
            return false;
        }
    }

    public static boolean isTelSupported() {
        try {
            if (Build.VERSION.SDK_INT < 23 || AdRegistration.getContext().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                return ((TelephonyManager) AdRegistration.getContext().getSystemService("phone")).getPhoneType() != 0;
            }
            return false;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute isTelSupported method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute isTelSupported method", e10);
            return false;
        }
    }

    static void setAmznDebugStateFlagValue(String str) {
        amznDebugStateFlag = str;
    }
}
