package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f7163a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f7163a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.f7163a, "class", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.f7163a, MediationMetaData.KEY_VERSION, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.f7163a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.f7163a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
