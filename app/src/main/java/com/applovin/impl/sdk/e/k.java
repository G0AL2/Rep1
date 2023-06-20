package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends h {

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f8388c;

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", mVar);
    }

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.m mVar) {
        super(dVar, str, mVar);
        this.f8388c = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected a a(JSONObject jSONObject) {
        return new p(jSONObject, ((h) this).f8379a, h(), this.f8388c, this.f8349b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.h
    public void a(int i10) {
        super.a(i10);
        this.f8388c.failedToReceiveAd(i10);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String b() {
        return com.applovin.impl.sdk.utils.h.g(this.f8349b);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String c() {
        return com.applovin.impl.sdk.utils.h.h(this.f8349b);
    }
}
