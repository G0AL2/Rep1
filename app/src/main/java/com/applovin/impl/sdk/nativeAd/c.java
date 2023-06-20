package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8599c;

    public c(com.applovin.impl.sdk.ad.d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super(dVar, str, mVar);
        this.f8599c = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected com.applovin.impl.sdk.e.a a(JSONObject jSONObject) {
        return new d(jSONObject, this.f8599c, this.f8349b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.h
    public void a(int i10) {
        super.a(i10);
        this.f8599c.onNativeAdLoadFailed(i10);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String b() {
        return com.applovin.impl.sdk.utils.h.i(this.f8349b);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String c() {
        return com.applovin.impl.sdk.utils.h.j(this.f8349b);
    }
}
