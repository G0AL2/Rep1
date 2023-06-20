package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final m f8160a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8161b;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, x> f8163d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, x> f8164e = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f8162c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(m mVar) {
        this.f8160a = mVar;
        this.f8161b = mVar.A();
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.f()) {
            this.f8163d.put(dVar, new x());
            this.f8164e.put(dVar, new x());
        }
    }

    private x d(com.applovin.impl.sdk.ad.d dVar) {
        x xVar;
        synchronized (this.f8162c) {
            xVar = this.f8163d.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f8163d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x e(com.applovin.impl.sdk.ad.d dVar) {
        x xVar;
        synchronized (this.f8162c) {
            xVar = this.f8164e.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f8164e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x f(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f8162c) {
            x e10 = e(dVar);
            if (e10.a() > 0) {
                return e10;
            }
            return d(dVar);
        }
    }

    public AppLovinAdImpl a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.f fVar;
        StringBuilder sb2;
        String str;
        synchronized (this.f8162c) {
            x d10 = d(dVar);
            if (d10.a() > 0) {
                e(dVar).a(d10.c());
                fVar = new com.applovin.impl.sdk.ad.f(dVar, this.f8160a);
            } else {
                fVar = null;
            }
        }
        if (v.a()) {
            v vVar = this.f8161b;
            if (fVar != null) {
                sb2 = new StringBuilder();
                str = "Retrieved ad of zone ";
            } else {
                sb2 = new StringBuilder();
                str = "Unable to retrieve ad of zone ";
            }
            sb2.append(str);
            sb2.append(dVar);
            sb2.append("...");
            vVar.b("AdPreloadManager", sb2.toString());
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8162c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (v.a()) {
                v vVar = this.f8161b;
                vVar.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public AppLovinAdImpl b(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl c10;
        synchronized (this.f8162c) {
            c10 = f(dVar).c();
        }
        return c10;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl d10;
        synchronized (this.f8162c) {
            d10 = f(dVar).d();
        }
        return d10;
    }
}
