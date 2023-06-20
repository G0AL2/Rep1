package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s extends a {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f8446a;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8447c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinAdLoadListener f8448d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8449e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskRenderAppLovinAd", mVar);
        this.f8446a = jSONObject;
        this.f8447c = jSONObject2;
        this.f8449e = bVar;
        this.f8448d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f8446a, this.f8447c, this.f8449e, this.f8349b);
        boolean booleanValue = JsonUtils.getBoolean(this.f8446a, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f8446a, "vs_load_immediately", Boolean.TRUE).booleanValue();
        d dVar = new d(aVar, this.f8349b, this.f8448d);
        dVar.a(booleanValue2);
        dVar.b(booleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.bi)).booleanValue()) {
            AppLovinAdSize size = aVar.getSize();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
            if (size == appLovinAdSize && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == appLovinAdSize && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.f8349b.S().a(dVar, aVar2);
    }
}
