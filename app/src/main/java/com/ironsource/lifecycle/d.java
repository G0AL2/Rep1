package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: i  reason: collision with root package name */
    private static d f26187i = new d();

    /* renamed from: j  reason: collision with root package name */
    static AtomicBoolean f26188j = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    int f26189a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f26190b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f26191c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f26192d = true;

    /* renamed from: e  reason: collision with root package name */
    int f26193e = com.ironsource.lifecycle.e.f26203a;

    /* renamed from: f  reason: collision with root package name */
    List<com.ironsource.lifecycle.c> f26194f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    Runnable f26195g = new a();

    /* renamed from: h  reason: collision with root package name */
    private b.a f26196h = new f();

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.b(d.this);
            d.this.e();
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.ironsource.lifecycle.c cVar : d.this.f26194f) {
                cVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.f26194f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class RunnableC0339d implements Runnable {
        RunnableC0339d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.f26194f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.ironsource.lifecycle.c cVar : d.this.f26194f) {
                cVar.b();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class f implements b.a {
        f() {
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void a(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f26189a + 1;
            dVar.f26189a = i10;
            if (i10 == 1 && dVar.f26192d) {
                com.ironsource.environment.e.c.f26160a.c(new b());
                dVar.f26192d = false;
                dVar.f26193e = com.ironsource.lifecycle.e.f26204b;
            }
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void b(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f26190b + 1;
            dVar.f26190b = i10;
            if (i10 == 1) {
                if (!dVar.f26191c) {
                    com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
                    com.ironsource.environment.e.c.b(dVar.f26195g);
                    return;
                }
                com.ironsource.environment.e.c.f26160a.c(new c());
                dVar.f26191c = false;
                dVar.f26193e = com.ironsource.lifecycle.e.f26205c;
            }
        }
    }

    public static d a() {
        return f26187i;
    }

    static /* synthetic */ void b(d dVar) {
        if (dVar.f26190b == 0) {
            dVar.f26191c = true;
            com.ironsource.environment.e.c.f26160a.c(new RunnableC0339d());
            dVar.f26193e = com.ironsource.lifecycle.e.f26206d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f26189a == 0 && this.f26191c) {
            com.ironsource.environment.e.c.f26160a.c(new e());
            this.f26192d = true;
            this.f26193e = com.ironsource.lifecycle.e.f26207e;
        }
    }

    public final void a(com.ironsource.lifecycle.c cVar) {
        if (!IronsourceLifecycleProvider.a() || this.f26194f.contains(cVar)) {
            return;
        }
        this.f26194f.add(cVar);
    }

    public final boolean b() {
        return this.f26193e == com.ironsource.lifecycle.e.f26207e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.b.b(activity);
        com.ironsource.lifecycle.b a10 = com.ironsource.lifecycle.b.a(activity);
        if (a10 != null) {
            a10.f26186a = this.f26196h;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = this.f26190b - 1;
        this.f26190b = i10;
        if (i10 == 0) {
            com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
            com.ironsource.environment.e.c.a(this.f26195g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f26189a--;
        e();
    }
}
