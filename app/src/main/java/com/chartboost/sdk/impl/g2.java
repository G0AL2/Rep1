package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.s0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g2 implements s0.a {

    /* renamed from: a  reason: collision with root package name */
    public j1 f14017a;

    /* renamed from: b  reason: collision with root package name */
    private final p1 f14018b;

    /* renamed from: c  reason: collision with root package name */
    private final com.chartboost.sdk.Networking.b f14019c;

    /* renamed from: d  reason: collision with root package name */
    private final l2 f14020d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f14021e;

    /* renamed from: f  reason: collision with root package name */
    private int f14022f = 1;

    /* renamed from: g  reason: collision with root package name */
    private int f14023g = 0;

    /* renamed from: h  reason: collision with root package name */
    private long f14024h = 0;

    /* renamed from: i  reason: collision with root package name */
    private s0 f14025i = null;

    /* renamed from: j  reason: collision with root package name */
    private AtomicInteger f14026j = null;

    public g2(j1 j1Var, p1 p1Var, com.chartboost.sdk.Networking.b bVar, l2 l2Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference) {
        this.f14017a = j1Var;
        this.f14018b = p1Var;
        this.f14019c = bVar;
        this.f14020d = l2Var;
        this.f14021e = atomicReference;
    }

    private void a(com.chartboost.sdk.Model.e eVar) {
        if (this.f14023g == 2 && !eVar.f13720k) {
            CBLogging.a("Prefetcher", "Change state to IDLE");
            this.f14022f = 1;
            this.f14023g = 0;
            this.f14024h = 0L;
            this.f14025i = null;
            AtomicInteger atomicInteger = this.f14026j;
            this.f14026j = null;
            if (atomicInteger != null) {
                this.f14017a.a(atomicInteger);
            }
        }
    }

    public synchronized void b() {
        com.chartboost.sdk.Model.e eVar;
        try {
            CBLogging.c("Chartboost SDK", "Sdk Version = 8.4.3, Commit: 57765bc2b2f75148b38b00aeb311ac30843720cb");
            eVar = this.f14021e.get();
            a(eVar);
        } catch (Exception e10) {
            if (this.f14022f == 2) {
                CBLogging.a("Prefetcher", "Change state to COOLDOWN");
                this.f14022f = 4;
                this.f14025i = null;
            }
            CBLogging.b("Prefetcher", "prefetch: " + e10.toString());
        }
        if (!eVar.f13712c && !eVar.f13711b && com.chartboost.sdk.g.f13891p) {
            if (this.f14022f == 3) {
                if (this.f14026j.get() > 0) {
                    return;
                }
                CBLogging.a("Prefetcher", "Change state to COOLDOWN");
                this.f14022f = 4;
                this.f14026j = null;
            }
            if (this.f14022f == 4) {
                if (this.f14024h - System.nanoTime() > 0) {
                    CBLogging.a("Prefetcher", "Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires");
                    return;
                }
                CBLogging.a("Prefetcher", "Change state to IDLE");
                this.f14022f = 1;
                this.f14023g = 0;
                this.f14024h = 0L;
            }
            if (this.f14022f != 1) {
                return;
            }
            if (eVar.f13720k) {
                a1 a1Var = new a1(eVar.f13726q, this.f14020d, 2, this);
                a1Var.a("cache_assets", this.f14018b.f(), 0);
                a1Var.f14299m = true;
                CBLogging.a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                this.f14022f = 2;
                this.f14023g = 2;
                this.f14024h = System.nanoTime() + TimeUnit.MINUTES.toNanos(eVar.f13723n);
                this.f14025i = a1Var;
                this.f14019c.a(a1Var);
                return;
            }
            CBLogging.b("Prefetcher", "Did not prefetch because neither native nor webview are enabled.");
            return;
        }
        a();
    }

    public synchronized void a() {
        int i10 = this.f14022f;
        if (i10 == 2) {
            CBLogging.a("Prefetcher", "Change state to COOLDOWN");
            this.f14022f = 4;
            this.f14025i = null;
        } else if (i10 == 3) {
            CBLogging.a("Prefetcher", "Change state to COOLDOWN");
            this.f14022f = 4;
            AtomicInteger atomicInteger = this.f14026j;
            this.f14026j = null;
            if (atomicInteger != null) {
                this.f14017a.a(atomicInteger);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.s0.a
    public synchronized void a(s0 s0Var, JSONObject jSONObject) {
        try {
        } catch (Exception e10) {
            CBLogging.b("Prefetcher", "prefetch onSuccess: " + e10.toString());
        }
        if (this.f14022f != 2) {
            return;
        }
        if (s0Var != this.f14025i) {
            return;
        }
        CBLogging.a("Prefetcher", "Change state to DOWNLOAD_ASSETS");
        this.f14022f = 3;
        this.f14025i = null;
        this.f14026j = new AtomicInteger();
        if (jSONObject != null) {
            CBLogging.a("Prefetcher", "Got Asset list for Prefetch from server :)" + jSONObject);
            this.f14017a.a(3, com.chartboost.sdk.Model.b.b(jSONObject, this.f14021e.get().f13717h), this.f14026j, null, "");
        }
    }

    @Override // com.chartboost.sdk.impl.s0.a
    public synchronized void a(s0 s0Var, CBError cBError) {
        m1.d(new com.chartboost.sdk.Tracking.b("prefetch_request_error", cBError != null ? cBError.getErrorDesc() : "Prefetch failure", "", ""));
        if (this.f14022f != 2) {
            return;
        }
        if (s0Var != this.f14025i) {
            return;
        }
        this.f14025i = null;
        CBLogging.a("Prefetcher", "Change state to COOLDOWN");
        this.f14022f = 4;
    }
}
