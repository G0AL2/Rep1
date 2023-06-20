package com.amazon.device.ads;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DtbAdRequestParamsBuilder {
    private final String LOG_TAG = DtbAdRequestParamsBuilder.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.amazon.device.ads.DtbAdRequestParamsBuilder$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private HashMap<String, Object> getCustomParams(Map<String, String> map) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (map != null) {
            for (String str : map.keySet()) {
                hashMap.put(str, map.get(str));
            }
        }
        return hashMap;
    }

    private HashMap<String, Object> getSlotParams(List<DTBAdSize> list) {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 1;
            for (DTBAdSize dTBAdSize : list) {
                JSONObject jSONObject = new JSONObject();
                if (dTBAdSize.isInterstitialAd()) {
                    jSONObject.put("sz", "interstitial");
                } else {
                    jSONObject.put("sz", dTBAdSize.getWidth() + "x" + dTBAdSize.getHeight());
                }
                jSONObject.put("slot", dTBAdSize.getSlotUUID());
                int i11 = i10 + 1;
                jSONObject.put("slotId", i10);
                JSONArray jSONArray2 = new JSONArray();
                if (AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdType[dTBAdSize.getDTBAdType().ordinal()] != 1) {
                    jSONArray2.put(AdType.DISPLAY.toString());
                } else {
                    jSONArray2.put(AdType.VIDEO.toString());
                }
                jSONObject.put("supportedMediaTypes", jSONArray2);
                if (dTBAdSize.getPubSettings() != null) {
                    jSONObject.put("ps", dTBAdSize.getPubSettings());
                }
                jSONArray.put(jSONObject);
                i10 = i11;
            }
            hashMap.put("slots", jSONArray);
        } catch (JSONException unused) {
            DtbLog.warn(this.LOG_TAG, "Error constructing slot parameters");
        }
        return hashMap;
    }

    void addCurrentEnvironmentToCustomAtt() {
        String str;
        Map hashMap = new HashMap();
        if (AdRegistration.getCustomDictionary() != null) {
            hashMap = AdRegistration.getCustomDictionary();
        }
        if (hashMap.containsKey("framework")) {
            return;
        }
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            DtbLog.debug(this.LOG_TAG, "SDK used in Unity environment");
            str = "unity";
        } catch (ClassNotFoundException unused) {
            DtbLog.debug(this.LOG_TAG, "SDK used in native Android environment");
            str = "native";
        }
        AdRegistration.addCustomAttribute("framework", str);
    }

    HashMap<String, Object> getCommonParams(Context context) {
        String locationParam;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isDTBMobile", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        hashMap.put("appId", AdRegistration.getAppKey());
        hashMap.put("adsdk", DtbCommonUtils.getSDKVersion());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            hashMap.put("idfa", idfa);
        }
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut != null) {
            hashMap.put("oo", Boolean.toString(optOut.booleanValue()));
        }
        JSONObject paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
        if (paramsJson != null) {
            hashMap.put("dinfo", paramsJson);
        }
        String userAgentString = DtbDeviceData.getDeviceDataInstance().getUserAgentString();
        if (userAgentString != null) {
            hashMap.put("ua", userAgentString);
        }
        hashMap.put("pkg", DtbPackageNativeData.getPackageNativeDataInstance(context).getParamsJson());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            hashMap.put("ad-id", adId);
        }
        if (AdRegistration.isTestMode()) {
            hashMap.put("isTest", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }
        if (AdRegistration.isLocationEnabled() && (locationParam = new DtbGeoLocation().getLocationParam()) != null && !locationParam.isEmpty()) {
            hashMap.put("geoloc", locationParam);
        }
        return hashMap;
    }

    HashMap<String, Object> getCustomAttributeParams() {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject pJTemplate = DtbSharedPreferences.getInstance().getPJTemplate();
        JSONObject jSONObject = new JSONObject();
        addCurrentEnvironmentToCustomAtt();
        Iterator<String> keys = pJTemplate.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (pJTemplate.get(next) instanceof String) {
                    String str = AdRegistration.getCustomDictionary().get(pJTemplate.getString(next));
                    if (!DtbCommonUtils.isNullOrEmpty(str)) {
                        jSONObject.put(next, str);
                    }
                } else if (pJTemplate.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = pJTemplate.getJSONObject(next);
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (jSONObject2.get(next2) instanceof String) {
                            String str2 = AdRegistration.getCustomDictionary().get(jSONObject2.getString(next2));
                            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                                jSONObject3.put(next2, str2);
                            }
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject.put(next, jSONObject3);
                    }
                }
            } catch (Exception unused) {
                DtbLog.warn(this.LOG_TAG, "Error when constructing custom attribute parameters");
            }
        }
        if (jSONObject.length() > 0) {
            hashMap.put("pj", jSONObject);
        }
        return hashMap;
    }

    public HashMap<String, Object> getParams(Context context, List<DTBAdSize> list, Map<String, String> map, boolean z10) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(getCommonParams(context));
        hashMap.putAll(getSlotParams(list));
        hashMap.putAll(getCustomParams(map));
        hashMap.putAll(getCustomAttributeParams());
        hashMap.put("autoRefresh", String.valueOf(z10));
        return hashMap;
    }
}
