package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0114a, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7328a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7329b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdListener f7330c;

    public b(m mVar, MaxAdListener maxAdListener) {
        this.f7330c = maxAdListener;
        this.f7328a = new a(mVar);
        this.f7329b = new c(mVar, this);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0114a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7330c.onAdHidden(cVar);
            }
        }, cVar.x());
    }

    public void a(MaxAd maxAd) {
        this.f7329b.a();
        this.f7328a.a();
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long v10 = cVar.v();
        if (v10 >= 0) {
            this.f7329b.a(cVar, v10);
        }
        if (cVar.w()) {
            this.f7328a.a(cVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.f7330c.onAdHidden(cVar);
    }
}
