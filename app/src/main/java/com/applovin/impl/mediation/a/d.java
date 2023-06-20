package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7213c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f7214d;

    private d(d dVar, com.applovin.impl.mediation.g gVar) {
        super(dVar.T(), dVar.J(), dVar.I(), gVar, dVar.f7216b);
        this.f7213c = new AtomicBoolean();
        this.f7214d = new AtomicBoolean();
    }

    public d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
        this.f7213c = new AtomicBoolean();
        this.f7214d = new AtomicBoolean();
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new d(this, gVar);
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        ((a) this).f7206a.a(maxNativeAdView);
    }

    @Override // com.applovin.impl.mediation.a.a, com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        return ((a) this).f7206a.b();
    }

    public MaxNativeAdView u() {
        return ((a) this).f7206a.c();
    }

    public String v() {
        return BundleUtils.getString("template", "", U());
    }

    public boolean w() {
        return ((a) this).f7206a == null;
    }

    public AtomicBoolean x() {
        return this.f7213c;
    }

    public AtomicBoolean y() {
        return this.f7214d;
    }
}
