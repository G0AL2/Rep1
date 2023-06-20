package com.applovin.impl.mediation;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final m f7353a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7354b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7355c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.e f7356d;

    /* loaded from: classes.dex */
    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(m mVar, a aVar) {
        this.f7353a = mVar;
        this.f7354b = mVar.A();
        this.f7355c = aVar;
    }

    public void a() {
        if (v.a()) {
            this.f7354b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.sdk.utils.e eVar = this.f7356d;
        if (eVar != null) {
            eVar.a();
            this.f7356d = null;
        }
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j10) {
        if (v.a()) {
            v vVar = this.f7354b;
            vVar.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f7356d = com.applovin.impl.sdk.utils.e.a(j10, this.f7353a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (v.a()) {
                    c.this.f7354b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                c.this.f7355c.c(cVar);
            }
        });
    }
}
