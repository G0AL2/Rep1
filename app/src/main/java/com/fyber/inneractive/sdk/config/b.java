package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b implements i.b {

    /* renamed from: c  reason: collision with root package name */
    public w0 f16912c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f16913d;

    /* renamed from: f  reason: collision with root package name */
    public final w0.b f16915f;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f16910a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public boolean f16911b = false;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f16914e = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 123) {
                b bVar = b.this;
                if (bVar.f16910a.compareAndSet(false, true)) {
                    if (bVar.f16910a.get() && bVar.f16912c != null) {
                        IAlog.a("startCounting", new Object[0]);
                        bVar.f16912c.c();
                    }
                    IAlog.a("Pause signal", new Object[0]);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0227b implements Application.ActivityLifecycleCallbacks {
        public C0227b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (b.this.f16914e.hasMessages(123) || b.this.f16910a.get()) {
                return;
            }
            b.this.f16914e.sendEmptyMessageDelayed(123, 3000L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b.this.f16914e.removeMessages(123);
            b bVar = b.this;
            if (bVar.f16910a.compareAndSet(true, false)) {
                if (bVar.f16911b) {
                    IAlog.a("onActivityResumed: restartSession", new Object[0]);
                    bVar.f16911b = false;
                    e0 e0Var = bVar.f16913d;
                    if (e0Var != null) {
                        com.fyber.inneractive.sdk.cache.session.d dVar = ((d0) e0Var).f16930a;
                        if (dVar != null) {
                            dVar.a(dVar.f16838a);
                            com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.b.f16858i));
                        }
                        e0 e0Var2 = bVar.f16913d;
                        ((d0) e0Var2).f16932c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        ((d0) bVar.f16913d).f16931b.clear();
                    }
                }
                w0 w0Var = bVar.f16912c;
                if (w0Var != null) {
                    w0Var.f20350d = false;
                    w0Var.f20352f = 0L;
                    Handler handler = w0Var.f20349c;
                    if (handler != null) {
                        handler.removeMessages(1932593528);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements w0.b {
        public c() {
        }

        @Override // com.fyber.inneractive.sdk.util.w0.b
        public void a(w0 w0Var) {
            IAlog.a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            b.this.f16911b = true;
        }
    }

    public b(e0 e0Var) {
        C0227b c0227b = new C0227b();
        this.f16915f = new c();
        this.f16913d = e0Var;
        Application a10 = com.fyber.inneractive.sdk.util.l.a();
        if (a10 != null) {
            a10.registerActivityLifecycleCallbacks(c0227b);
        }
    }

    @Override // com.fyber.inneractive.sdk.config.i.b
    public void onGlobalConfigChanged(i iVar, h hVar) {
        w0 w0Var = this.f16912c;
        if (w0Var != null) {
            w0Var.f20350d = false;
            w0Var.f20352f = 0L;
            Handler handler = w0Var.f20349c;
            if (handler != null) {
                handler.removeMessages(1932593528);
            }
            w0 w0Var2 = new w0(TimeUnit.MINUTES, hVar.a("session_duration", 30, 1), this.f16912c.f20352f);
            this.f16912c = w0Var2;
            w0Var2.f20351e = this.f16915f;
        }
        iVar.f16988c.remove(this);
    }
}
