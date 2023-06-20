package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.aa;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.z;

/* loaded from: classes.dex */
public class b implements aa.a {

    /* renamed from: a  reason: collision with root package name */
    private final m f7323a;

    /* renamed from: b  reason: collision with root package name */
    private final d f7324b;

    /* renamed from: c  reason: collision with root package name */
    private final aa f7325c;

    /* renamed from: d  reason: collision with root package name */
    private final z f7326d;

    /* renamed from: e  reason: collision with root package name */
    private final a.InterfaceC0115a f7327e;

    public b(d dVar, a.InterfaceC0115a interfaceC0115a, m mVar) {
        this.f7323a = mVar;
        this.f7324b = dVar;
        this.f7327e = interfaceC0115a;
        this.f7326d = new z(dVar.u(), mVar);
        aa aaVar = new aa(dVar.u(), mVar, this);
        this.f7325c = aaVar;
        aaVar.a(dVar);
        if (v.a()) {
            v A = mVar.A();
            A.b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    private void a(long j10) {
        if (this.f7324b.y().compareAndSet(false, true)) {
            if (v.a()) {
                this.f7323a.A().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f7323a.E().processViewabilityAdImpressionPostback(this.f7324b, j10, this.f7327e);
        }
    }

    public void a() {
        this.f7325c.a();
    }

    public void b() {
        if (v.a()) {
            this.f7323a.A().b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f7324b.x().compareAndSet(false, true)) {
            if (v.a()) {
                this.f7323a.A().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            this.f7323a.E().processRawAdImpressionPostback(this.f7324b, this.f7327e);
        }
    }

    public d c() {
        return this.f7324b;
    }

    @Override // com.applovin.impl.sdk.aa.a
    public void onLogVisibilityImpression() {
        a(this.f7326d.a(this.f7324b));
    }
}
