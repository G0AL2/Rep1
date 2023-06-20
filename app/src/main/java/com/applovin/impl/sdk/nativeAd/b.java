package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.m;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f8598c;

    public b(com.applovin.impl.sdk.ad.c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, mVar);
        this.f8598c = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected Map<String, String> a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f8598c.a());
        hashMap.put("adtoken_prefix", this.f8598c.c());
        return hashMap;
    }
}
