package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.a f7200a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7201b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0114a f7202c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f7203d;

    /* renamed from: e  reason: collision with root package name */
    private int f7204e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7205f;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0114a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(m mVar) {
        this.f7201b = mVar.A();
        this.f7200a = mVar.af();
    }

    public void a() {
        if (v.a()) {
            this.f7201b.b("AdActivityObserver", "Cancelling...");
        }
        this.f7200a.b(this);
        this.f7202c = null;
        this.f7203d = null;
        this.f7204e = 0;
        this.f7205f = false;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0114a interfaceC0114a) {
        if (v.a()) {
            v vVar = this.f7201b;
            vVar.b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + "...");
        }
        a();
        this.f7202c = interfaceC0114a;
        this.f7203d = cVar;
        this.f7200a.a(this);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f7205f) {
            this.f7205f = true;
        }
        this.f7204e++;
        if (v.a()) {
            this.f7201b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f7204e);
        }
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f7205f) {
            this.f7204e--;
            if (v.a()) {
                this.f7201b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f7204e);
            }
            if (this.f7204e <= 0) {
                if (v.a()) {
                    this.f7201b.b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f7202c != null) {
                    if (v.a()) {
                        this.f7201b.b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f7202c.a(this.f7203d);
                }
                a();
            }
        }
    }
}
