package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NetworkSettings {

    /* renamed from: a  reason: collision with root package name */
    private String f27194a;

    /* renamed from: b  reason: collision with root package name */
    private String f27195b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f27196c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f27197d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f27198e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f27199f;

    /* renamed from: g  reason: collision with root package name */
    private String f27200g;

    /* renamed from: h  reason: collision with root package name */
    private String f27201h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27202i;

    /* renamed from: j  reason: collision with root package name */
    private String f27203j;

    /* renamed from: k  reason: collision with root package name */
    private int f27204k;

    /* renamed from: l  reason: collision with root package name */
    private int f27205l;

    /* renamed from: m  reason: collision with root package name */
    private int f27206m;

    /* renamed from: n  reason: collision with root package name */
    private String f27207n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f27194a = networkSettings.getProviderName();
        this.f27203j = networkSettings.getProviderName();
        this.f27195b = networkSettings.getProviderTypeForReflection();
        this.f27197d = networkSettings.getRewardedVideoSettings();
        this.f27198e = networkSettings.getInterstitialSettings();
        this.f27199f = networkSettings.getBannerSettings();
        this.f27196c = networkSettings.getApplicationSettings();
        this.f27204k = networkSettings.getRewardedVideoPriority();
        this.f27205l = networkSettings.getInterstitialPriority();
        this.f27206m = networkSettings.getBannerPriority();
        this.f27207n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f27194a = str;
        this.f27203j = str;
        this.f27195b = str;
        this.f27207n = str;
        this.f27197d = new JSONObject();
        this.f27198e = new JSONObject();
        this.f27199f = new JSONObject();
        this.f27196c = new JSONObject();
        this.f27204k = -1;
        this.f27205l = -1;
        this.f27206m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f27194a = str;
        this.f27203j = str;
        this.f27195b = str2;
        this.f27207n = str3;
        this.f27197d = jSONObject2;
        this.f27198e = jSONObject3;
        this.f27199f = jSONObject4;
        this.f27196c = jSONObject;
        this.f27204k = -1;
        this.f27205l = -1;
        this.f27206m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f27201h;
    }

    public JSONObject getApplicationSettings() {
        return this.f27196c;
    }

    public int getBannerPriority() {
        return this.f27206m;
    }

    public JSONObject getBannerSettings() {
        return this.f27199f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f27196c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit != null || (jSONObject2 = this.f27196c) == null) && ((!ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || (jSONObject2 = this.f27197d) == null) && (!ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) || (jSONObject2 = this.f27198e) == null))) {
            if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f27199f) == null) {
                return null;
            }
            return jSONObject.optString("customNetworkAdapterName");
        }
        return jSONObject2.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f27196c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f27205l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f27198e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f27207n;
    }

    public String getProviderInstanceName() {
        return this.f27203j;
    }

    public String getProviderName() {
        return this.f27194a;
    }

    public String getProviderTypeForReflection() {
        return this.f27195b;
    }

    public int getRewardedVideoPriority() {
        return this.f27204k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f27197d;
    }

    public String getSubProviderId() {
        return this.f27200g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f27202i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f27201h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f27196c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f27206m = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f27199f.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f27199f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f27205l = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f27198e.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f27198e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f27202i = z10;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f27204k = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f27197d.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f27197d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f27200g = str;
    }
}
