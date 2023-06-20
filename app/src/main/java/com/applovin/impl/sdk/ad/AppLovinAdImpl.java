package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* renamed from: a  reason: collision with root package name */
    private d f8061a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f8062b;

    /* renamed from: c  reason: collision with root package name */
    private f f8063c;
    protected final b source;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, b bVar, m mVar) {
        super(jSONObject, jSONObject2, mVar);
        this.f8062b = new Bundle();
        this.source = bVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd b10;
        if ((obj instanceof f) && (b10 = ((f) obj).b()) != null) {
            obj = b10;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject(Utils.KEY_AD_VALUES, new JSONObject()), str, str2);
    }

    public d getAdZone() {
        d dVar = this.f8061a;
        if (dVar != null) {
            if (dVar.c() != null && this.f8061a.d() != null) {
                return this.f8061a;
            }
            if (getSize() == null && getType() == null) {
                return this.f8061a;
            }
        }
        d a10 = d.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null));
        this.f8061a = a10;
        return a10;
    }

    public f getDummyAd() {
        return this.f8063c;
    }

    public Bundle getMAXAdValues() {
        return this.f8062b;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    public b getSource() {
        return this.source;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().e()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        if (v.a()) {
            this.sdk.A().e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(f fVar) {
        this.f8063c = fVar;
    }

    public void setHasShown(boolean z10) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f8062b);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", source=" + getSource() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
