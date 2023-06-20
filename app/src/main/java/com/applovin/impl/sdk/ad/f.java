package com.applovin.impl.sdk.ad;

import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends AppLovinAdImpl {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinAd f8118a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8119b;

    public f(d dVar, m mVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, mVar);
        this.f8119b = dVar;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.Z().c(this.f8119b);
    }

    private String d() {
        d adZone = getAdZone();
        if (adZone == null || adZone.e()) {
            return null;
        }
        return adZone.a();
    }

    public AppLovinAd a() {
        return this.f8118a;
    }

    public void a(AppLovinAd appLovinAd) {
        this.f8118a = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f8118a;
        return appLovinAd != null ? appLovinAd : c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        AppLovinAd b10 = b();
        return b10 != null ? b10.equals(obj) : super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f8119b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f8119b.e()) {
            return null;
        }
        return this.f8119b.a();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd b10 = b();
        return b10 != null ? b10.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd b10 = b();
        return b10 != null && b10.isVideoAd();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + d() + "'}";
    }
}
