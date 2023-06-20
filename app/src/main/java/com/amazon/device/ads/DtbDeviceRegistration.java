package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public class DtbDeviceRegistration {
    private static final String LOG_TAG = "com.amazon.device.ads.DtbDeviceRegistration";
    private static String amznAdId;
    private static String appId;
    private static DtbDeviceRegistration dtbDeviceRegistrationInstance;
    private final DtbMetrics metrics = new DtbMetrics();

    private DtbDeviceRegistration() {
        DtbLog.debug("Running the initialization in background thread.");
        initializeAds();
    }

    public static /* synthetic */ void a() {
        lambda$verifyRegistration$0();
    }

    private HashMap<String, Object> buildConfigInfoParams(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("appId", str);
        hashMap.put("sdkVer", DtbCommonUtils.getSDKVersion());
        hashMap.put("fp", "false");
        hashMap.put("testMode", Boolean.toString(AdRegistration.isTestMode()));
        JSONObject paramsJsonGetSafe = DtbDeviceData.getDeviceDataInstance().getParamsJsonGetSafe();
        if (paramsJsonGetSafe != null) {
            hashMap.put("dinfo", paramsJsonGetSafe);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            hashMap.put("pkg", paramsJson);
        }
        if (AdRegistration.getCustomDictionary() != null && AdRegistration.getCustomDictionary().containsKey("mediationName")) {
            String str2 = AdRegistration.getCustomDictionary().get("mediationName");
            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                hashMap.put("mediationName", str2);
            }
        }
        if (Math.random() <= DTBMetricsConfiguration.getClientConfigVal("distribution_pixel", DTBMetricsConfiguration.DISTRIBUTION_PIXEL_DEFAULT_VALUE.intValue(), "sample_rates").intValue() / 100.0f) {
            String sDKDistributionPlace = AdRegistration.getSDKDistributionPlace();
            if (!DtbCommonUtils.isNullOrEmpty(sDKDistributionPlace)) {
                hashMap.put("distribution", sDKDistributionPlace);
            }
        }
        return hashMap;
    }

    private HashMap<String, Object> buildSISParams(String str) {
        HashMap<String, Object> hashMap = new HashMap<>(DtbDeviceData.getDeviceDataInstance().getDeviceParams());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            hashMap.put("adId", adId);
        }
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            hashMap.put("idfa", idfa);
        }
        hashMap.put("oo", convertBooleanToFlag(optOut));
        if (str != null) {
            hashMap.put("appId", str);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            hashMap.put("pkg", paramsJson);
        }
        Context context = AdRegistration.getContext();
        if (context != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Object obj = defaultSharedPreferences.contains("IABTCF_gdprApplies") ? defaultSharedPreferences.getAll().get("IABTCF_gdprApplies") : null;
            String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
            if (obj != null) {
                try {
                    if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                        hashMap.put("gdpr", obj);
                    } else if (((obj instanceof String) && ((String) obj).equals("1")) || ((String) obj).equals("0")) {
                        hashMap.put("gdpr", obj);
                    } else {
                        DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                    }
                } catch (ClassCastException unused) {
                    DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                }
            }
            if (string != null) {
                hashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
            }
        }
        String encodedNonIABString = AdRegistration.getEncodedNonIABString();
        if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
            hashMap.put("gdpr_custom", encodedNonIABString);
        }
        return hashMap;
    }

    private static String convertBooleanToFlag(Boolean bool) {
        return (bool != null && bool.booleanValue()) ? "1" : "0";
    }

    private synchronized void initializeAds() {
        DtbMetric dtbMetric;
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = DtbSharedPreferences.getInstance().getSisLastCheckIn().longValue();
        if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
            long j10 = currentTimeMillis - longValue;
            if (j10 <= 86400000) {
                DtbLog.debug("SIS call not required, last registration duration:" + j10 + ", expiration:86400000");
                return;
            }
        }
        if (!DtbCommonUtils.isNetworkConnected()) {
            DtbLog.debug("Network is not available");
            return;
        }
        appId = AdRegistration.getAppKey();
        if (DtbCommonUtils.isOnMainThread()) {
            DtbLog.error(LOG_TAG, "Unable to fetch advertising identifier information on main thread.");
            return;
        }
        new DtbAdvertisingInfo();
        DtbDebugProperties.getInstance();
        registerConfig(appId);
        String sisEndpoint = DtbSharedPreferences.getInstance().getSisEndpoint();
        if (sisEndpoint.startsWith("null")) {
            DtbLog.debug("SIS is not ready");
            return;
        }
        StringBuilder sb2 = new StringBuilder(DtbDebugProperties.getSISUrl(sisEndpoint));
        boolean z10 = false;
        if (longValue == 0) {
            DtbLog.info(LOG_TAG, "Trying to register ad id..");
            sb2.append("/generate_did");
        } else {
            DtbLog.info(LOG_TAG, "Trying to update ad id..");
            sb2.append("/update_dev_info");
            z10 = true;
        }
        HashMap<String, Object> buildSISParams = buildSISParams(appId);
        try {
            try {
                DtbHttpClient dtbHttpClient = new DtbHttpClient(sb2.toString());
                dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                dtbHttpClient.setParams(buildSISParams);
                dtbHttpClient.enableQueryParams();
                if (z10) {
                    dtbMetric = DtbMetric.SIS_LATENCY_UPDATE_DEVICE_INFO;
                } else {
                    dtbMetric = DtbMetric.SIS_LATENCY_REGISTER_EVENT;
                }
                DtbMetric dtbMetric2 = dtbMetric;
                this.metrics.startTimer(dtbMetric2);
                dtbHttpClient.executePOST(60000);
                this.metrics.stopTimer(dtbMetric2);
                if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                    JSONObject jSONObject = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
                    DtbSharedPreferences.getInstance().setIsSisRegisterationSuccessful(isRegistrationRequestSuccessful(jSONObject));
                    if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
                        if (dtbMetric2 != null) {
                            this.metrics.resetMetric(dtbMetric2);
                        }
                        pingSis(sisEndpoint, appId);
                        return;
                    }
                    String str = LOG_TAG;
                    DtbLog.info(str, "ad id failed registration: " + jSONObject.toString());
                    throw new Exception("ad id failed registration: ");
                }
                DtbLog.debug("No response from sis call.");
                throw new Exception("SIS Response is null");
            } catch (Exception e10) {
                DtbLog.error("Error registering device for ads:" + e10.toString());
                if (0 != 0) {
                    this.metrics.resetMetric(null);
                }
            }
        } catch (JSONException e11) {
            DtbLog.error("JSON error parsing return from SIS: " + e11.getMessage());
            if (0 != 0) {
                this.metrics.resetMetric(null);
            }
        }
    }

    private boolean isPingRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("rcode")) {
            if (jSONObject.getInt("rcode") == 1) {
                DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
                DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
                return true;
            } else if (jSONObject.getInt("rcode") == 103 || (jSONObject.getInt("rcode") == 101 && jSONObject.has("msg") && jSONObject.getInt("msg") == 103)) {
                DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
                DtbLog.info("gdpr consent not granted");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private boolean isRegistrationRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("rcode")) {
            DtbSharedPreferences.getInstance().saveSisLastCheckIn(System.currentTimeMillis());
            if (jSONObject.getInt("rcode") == 1 && jSONObject.has("adId")) {
                String string = jSONObject.getString("adId");
                if (jSONObject.has("idChanged") && jSONObject.getBoolean("idChanged")) {
                    DtbLog.info(LOG_TAG, "ad id has changed, updating..");
                    this.metrics.incrementMetric(DtbMetric.SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED);
                }
                DtbSharedPreferences.getInstance().saveAdId(string);
                DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
                return true;
            }
            if (jSONObject.getInt("rcode") != 103) {
                if (jSONObject.getInt("rcode") != 101 || !jSONObject.has("msg")) {
                    return false;
                }
                if (jSONObject.optInt("msg") != 103 && !"need at least one native id in parameter".equals(jSONObject.get("msg"))) {
                    return false;
                }
            }
            DtbSharedPreferences.getInstance().removeAdid();
            DtbLog.debug("No ad-id returned");
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$verifyRegistration$0() {
        dtbDeviceRegistrationInstance.initializeAds();
    }

    private boolean parseRegisterConfigResponse(String str, long j10, boolean z10) throws Exception {
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (jSONObject.has("pj")) {
            DtbSharedPreferences.getInstance().savePJTemplate(jSONObject.getJSONObject("pj"));
        } else {
            DtbSharedPreferences.getInstance().removePJTemplate();
        }
        if (!jSONObject.has(DtbDebugProperties.AAX_HOSTNAME) && !jSONObject.has("sisURL")) {
            String str2 = LOG_TAG;
            DtbLog.info(str2, "ad configuration failed load: " + jSONObject.toString());
            throw new Exception("ad configuration failed load");
        }
        if (jSONObject.has(DtbDebugProperties.AAX_HOSTNAME)) {
            DtbSharedPreferences.getInstance().saveAaxHostname(jSONObject.getString(DtbDebugProperties.AAX_HOSTNAME));
        }
        if (jSONObject.has("sisURL")) {
            z10 = DtbSharedPreferences.getInstance().saveSisEndpoint(jSONObject.getString("sisURL"));
        }
        if (jSONObject.has("ttl")) {
            DtbSharedPreferences.getInstance().saveConfigTtl(DtbCommonUtils.getMilliSeconds(jSONObject.getString("ttl")));
        }
        if (jSONObject.has("bidTimeout")) {
            DtbSharedPreferences.getInstance().saveBidTimeout(Integer.valueOf(jSONObject.getInt("bidTimeout")));
        } else {
            DtbSharedPreferences.getInstance().removeBidTimeout();
        }
        DtbSharedPreferences.getInstance().saveConfigLastCheckIn(j10);
        DtbLog.info(LOG_TAG, "ad configuration loaded successfully.");
        return z10;
    }

    private void pingSis(String str, String str2) {
        if (System.currentTimeMillis() - DtbSharedPreferences.getInstance().getSisLastPing() < 2592000000L) {
            return;
        }
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null && !adId.isEmpty()) {
            try {
                if (!DtbCommonUtils.isNetworkConnected()) {
                    DtbLog.debug("Network is not available");
                    return;
                }
                DtbHttpClient dtbHttpClient = new DtbHttpClient(str + "/ping");
                dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("appId", str2);
                hashMap.put("adId", adId);
                Context context = AdRegistration.getContext();
                if (context != null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Object obj = defaultSharedPreferences.contains("IABTCF_gdprApplies") ? defaultSharedPreferences.getAll().get("IABTCF_gdprApplies") : null;
                    String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
                    if (obj != null) {
                        try {
                            if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                                hashMap.put("gdpr", obj);
                            } else if (((obj instanceof String) && ((String) obj).equals("1")) || ((String) obj).equals("0")) {
                                hashMap.put("gdpr", obj);
                            } else {
                                DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                            }
                        } catch (ClassCastException unused) {
                            DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                        }
                    }
                    if (string != null) {
                        hashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                    }
                }
                String encodedNonIABString = AdRegistration.getEncodedNonIABString();
                if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
                    hashMap.put("gdpr_custom", encodedNonIABString);
                }
                dtbHttpClient.setParams(hashMap);
                dtbHttpClient.executeGET(60000);
                if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                    JSONObject jSONObject = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
                    if (isPingRequestSuccessful(jSONObject)) {
                        return;
                    }
                    String str3 = LOG_TAG;
                    DtbLog.info(str3, "sis ping failed failed registration: " + jSONObject.toString());
                    throw new Exception("sis ping failed registration: ");
                }
                DtbLog.debug("No response from sis ping.");
                throw new Exception("Ping SIS Response is null");
            } catch (Exception e10) {
                DtbLog.error("Error pinging sis: " + e10.toString());
                return;
            }
        }
        DtbLog.info("error retrieving ad id, cancelling sis ping");
    }

    private boolean registerConfig(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = currentTimeMillis - DtbSharedPreferences.getInstance().getConfigLastCheckIn().longValue();
        DtbLog.debug("Config last checkin duration: " + longValue + ", Expiration: " + DtbSharedPreferences.getInstance().getConfigTtl());
        boolean z10 = false;
        if (longValue <= 172800000) {
            DtbLog.debug("No config refresh required");
            return false;
        } else if (!DtbCommonUtils.isNetworkConnected()) {
            DtbLog.debug("Network is not available");
            return false;
        } else {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(DtbDebugProperties.getConfigHostName("mads.amazon-adsystem.com") + "/msdk/getConfig");
            dtbHttpClient.addHeader("Accept", "application/json");
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.setParams(buildConfigInfoParams(str));
            try {
                DtbMetrics dtbMetrics = this.metrics;
                DtbMetric dtbMetric = DtbMetric.CONFIG_DOWNLOAD_LATENCY;
                dtbMetrics.startTimer(dtbMetric);
                dtbHttpClient.executeGET(60000);
                this.metrics.stopTimer(dtbMetric);
            } catch (Exception e10) {
                DtbLog.error("Error fetching DTB config: " + e10.toString());
            }
            if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                z10 = parseRegisterConfigResponse(dtbHttpClient.getResponse(), currentTimeMillis, false);
                try {
                    double intValue = DTBMetricsConfiguration.getClientConfigVal("sampling_rate", DTBMetricsConfiguration.ANALYTIC_PIXEL_DEFAULT_VALUE.intValue(), "analytics").intValue() / 100.0f;
                    String clientConfigVal = DTBMetricsConfiguration.getClientConfigVal(ImagesContract.URL, "", "analytics");
                    String clientConfigVal2 = DTBMetricsConfiguration.getClientConfigVal("api_key", "", "analytics");
                    if (!l2.a.g()) {
                        l2.a.e(AdRegistration.getContext());
                    }
                    l2.a.n((int) intValue);
                    l2.a.m(clientConfigVal);
                    l2.a.l(clientConfigVal2);
                } catch (RuntimeException e11) {
                    DtbLog.warn("Error when reading client config file for APSAndroidShared library" + e11.toString());
                }
                return z10;
            }
            throw new Exception("Config Response is null");
        }
    }

    public static void verifyRegistration() {
        if (dtbDeviceRegistrationInstance == null) {
            dtbDeviceRegistrationInstance = new DtbDeviceRegistration();
        }
        DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.j0
            @Override // java.lang.Runnable
            public final void run() {
                DtbDeviceRegistration.a();
            }
        });
    }
}
