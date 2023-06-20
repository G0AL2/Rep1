package com.amazon.device.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DtbDeviceData {
    private static final String DEFAULT_USER_AGENT = "Android";
    private static final String LOG_TAG = "DtbDeviceData";
    private static DtbDeviceData deviceDataInstance;
    private boolean bad_serial = false;
    private boolean bad_udid = false;
    private boolean bad_mac = false;
    private String sha1_mac = null;
    private String sha1_udid = null;
    private String sha1_serial = null;

    /* renamed from: ua  reason: collision with root package name */
    private String f5932ua = null;
    private String screenSize = null;
    private String orientation = null;
    private HashMap<String, Object> deviceParams = new HashMap<>();
    private JSONObject deviceInfoJson = new JSONObject();

    private DtbDeviceData(Context context) {
        getOrientation();
        getScreenSize();
        getDeviceInfoJson();
        getUserAgent();
        buildDeviceParams();
    }

    private void buildDeviceParams() {
        this.deviceParams.put("dt", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        this.deviceParams.put("app", "app");
        this.deviceParams.put("aud", "3p");
        String str = this.f5932ua;
        if (str != null) {
            this.deviceParams.put("ua", str);
        }
        this.deviceParams.put("sdkVer", DtbCommonUtils.getSDKVersion());
        JSONObject jSONObject = this.deviceInfoJson;
        if (jSONObject != null) {
            this.deviceParams.put("dinfo", jSONObject);
        }
    }

    private String generateSha1Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : digest) {
            sb2.append(Integer.toHexString((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1));
        }
        return sb2.toString();
    }

    public static DtbDeviceData getDeviceDataInstance() {
        if (AdRegistration.getContext() != null) {
            if (deviceDataInstance == null) {
                if (AdRegistration.getContext() != null) {
                    deviceDataInstance = new DtbDeviceData(AdRegistration.getContext());
                } else {
                    DtbLog.debugError("Invalid intialization of Device Data. Context is null");
                    throw new IllegalArgumentException("Invalid intialization of Device Data. Context is null");
                }
            }
            return deviceDataInstance;
        }
        DtbLog.debugError("unable to initialize advertising info without setting app context");
        throw new IllegalArgumentException("unable to initialize advertising info without setting app context");
    }

    private void getDeviceInfoJson() {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.DEVICE;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        String connectionType = getConnectionType();
        int screenPpi = getScreenPpi();
        TelephonyManager telephonyManager = (TelephonyManager) AdRegistration.getContext().getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        String f10 = Float.toString((str2.equals("motorola") && str.equals("MB502")) ? 1.0f : getDisplayMetrics().scaledDensity);
        try {
            placeProperty(DEFAULT_USER_AGENT, "os");
            placeProperty(str, "model");
            placeProperty(str2, "make");
            placeProperty(str4, "hwv");
            placeProperty(str3, "osVersion");
            placeProperty(country, ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);
            placeProperty(networkOperatorName, "carrier");
            placeProperty(language, "language");
            placeProperty(this.screenSize, "screenSize");
            placeProperty(f10, "scalingFactor");
            placeProperty(Integer.toString(screenPpi), "ppi");
            placeProperty(this.orientation, AdUnitActivity.EXTRA_ORIENTATION);
            placeProperty(connectionType, "connectionType");
        } catch (UnsupportedEncodingException unused) {
            DtbLog.error(LOG_TAG, "Unsupported encoding");
        } catch (JSONException unused2) {
            DtbLog.error(LOG_TAG, "JSONException while producing deviceInfoJson");
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return AdRegistration.getContext().getResources().getDisplayMetrics();
    }

    private void getOrientation() {
        this.orientation = DtbDeviceDataRetriever.getOrientation(AdRegistration.getContext());
    }

    private int getScreenPpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        return (int) (Math.sqrt(Math.pow(displayMetrics.widthPixels, 2.0d) + Math.pow(displayMetrics.heightPixels, 2.0d)) / Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)));
    }

    private void getScreenSize() {
        this.screenSize = DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), this.orientation);
    }

    private void getUserAgent() {
        try {
            this.f5932ua = WebSettings.getDefaultUserAgent(AdRegistration.getContext());
        } catch (Exception unused) {
            DtbLog.info("Unable to Get User Agent, Setting it to default");
            this.f5932ua = DEFAULT_USER_AGENT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getConnectionType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "0";
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? type != 6 ? "0" : "13" : "Wifi";
        }
        return Integer.toString(activeNetworkInfo.getSubtype());
    }

    public HashMap<String, Object> getDeviceParams() {
        if (!this.deviceParams.containsKey("ua") || (this.deviceParams.containsKey("ua") && this.deviceParams.get("ua").equals(DEFAULT_USER_AGENT))) {
            getUserAgent();
            buildDeviceParams();
        }
        return this.deviceParams;
    }

    public JSONObject getParamsJson() {
        try {
            getOrientation();
            placeProperty(this.orientation, AdUnitActivity.EXTRA_ORIENTATION);
            getScreenSize();
            placeProperty(this.screenSize, "screenSize");
        } catch (Exception e10) {
            DtbLog.error("Error:" + e10);
        }
        return this.deviceInfoJson;
    }

    public JSONObject getParamsJsonGetSafe() {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = this.deviceInfoJson.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = this.deviceInfoJson.get(next);
                if (obj instanceof String) {
                    jSONObject.put(next, URLEncoder.encode((String) obj, "UTF-8"));
                }
            } catch (Exception unused) {
                DtbLog.error("Error converting to JsonGetSafe");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserAgentString() {
        return this.f5932ua;
    }

    void placeProperty(String str, String str2) throws JSONException, UnsupportedEncodingException {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.deviceInfoJson.put(str2, str);
    }
}
