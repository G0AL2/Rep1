package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.a0;
import androidx.lifecycle.i;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public class z implements p {

    /* renamed from: i  reason: collision with root package name */
    private static final z f3411i = new z();

    /* renamed from: e  reason: collision with root package name */
    private Handler f3416e;

    /* renamed from: a  reason: collision with root package name */
    private int f3412a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f3413b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3414c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3415d = true;

    /* renamed from: f  reason: collision with root package name */
    private final q f3417f = new q(this);

    /* renamed from: g  reason: collision with root package name */
    private Runnable f3418g = new a();

    /* renamed from: h  reason: collision with root package name */
    a0.a f3419h = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f();
            z.this.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    class b implements a0.a {
        b() {
        }

        @Override // androidx.lifecycle.a0.a
        public void a() {
        }

        @Override // androidx.lifecycle.a0.a
        public void onResume() {
            z.this.b();
        }

        @Override // androidx.lifecycle.a0.a
        public void onStart() {
            z.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class c extends f {

        /* compiled from: ProcessLifecycleOwner.java */
        /* loaded from: classes.dex */
        class a extends f {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                z.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                z.this.c();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                a0.f(activity).h(z.this.f3419h);
            }
        }

        @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            z.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            z.this.d();
        }
    }

    private z() {
    }

    public static p h() {
        return f3411i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Context context) {
        f3411i.e(context);
    }

    void a() {
        int i10 = this.f3413b - 1;
        this.f3413b = i10;
        if (i10 == 0) {
            this.f3416e.postDelayed(this.f3418g, 700L);
        }
    }

    void b() {
        int i10 = this.f3413b + 1;
        this.f3413b = i10;
        if (i10 == 1) {
            if (this.f3414c) {
                this.f3417f.h(i.b.ON_RESUME);
                this.f3414c = false;
                return;
            }
            this.f3416e.removeCallbacks(this.f3418g);
        }
    }

    void c() {
        int i10 = this.f3412a + 1;
        this.f3412a = i10;
        if (i10 == 1 && this.f3415d) {
            this.f3417f.h(i.b.ON_START);
            this.f3415d = false;
        }
    }

    void d() {
        this.f3412a--;
        g();
    }

    void e(Context context) {
        this.f3416e = new Handler();
        this.f3417f.h(i.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void f() {
        if (this.f3413b == 0) {
            this.f3414c = true;
            this.f3417f.h(i.b.ON_PAUSE);
        }
    }

    void g() {
        if (this.f3412a == 0 && this.f3414c) {
            this.f3417f.h(i.b.ON_STOP);
            this.f3415d = true;
        }
    }

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f3417f;
    }
}
