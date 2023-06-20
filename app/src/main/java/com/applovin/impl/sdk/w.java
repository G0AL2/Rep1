package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final m f8958a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8959b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f8960c = new HashMap(4);

    /* renamed from: d  reason: collision with root package name */
    private final Object f8961d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(m mVar) {
        this.f8958a = mVar;
        this.f8959b = mVar.A();
    }

    public com.applovin.impl.mediation.a.a a(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f8961d) {
            aVar = this.f8960c.get(str);
        }
        return aVar;
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f8961d) {
            if (v.a()) {
                v vVar = this.f8959b;
                vVar.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f8960c.put(aVar.getAdUnitId(), aVar);
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f8961d) {
            String adUnitId = aVar.getAdUnitId();
            com.applovin.impl.mediation.a.a aVar2 = this.f8960c.get(adUnitId);
            if (aVar == aVar2) {
                if (v.a()) {
                    v vVar = this.f8959b;
                    vVar.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                }
                this.f8960c.remove(adUnitId);
            } else if (v.a()) {
                v vVar2 = this.f8959b;
                vVar2.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }
}
