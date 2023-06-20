package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class l0<T> {

    /* renamed from: e */
    public static Executor f5840e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<f0<T>> f5841a;

    /* renamed from: b */
    private final Set<f0<Throwable>> f5842b;

    /* renamed from: c */
    private final Handler f5843c;

    /* renamed from: d */
    private volatile j0<T> f5844d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<j0<T>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Callable<j0<T>> callable) {
            super(callable);
            l0.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                l0.this.k(get());
            } catch (InterruptedException | ExecutionException e10) {
                l0.this.k(new j0(e10));
            }
        }
    }

    public l0(Callable<j0<T>> callable) {
        this(callable, false);
    }

    public static /* synthetic */ void a(l0 l0Var) {
        l0Var.e();
    }

    public /* synthetic */ void e() {
        j0<T> j0Var = this.f5844d;
        if (j0Var == null) {
            return;
        }
        if (j0Var.b() != null) {
            h(j0Var.b());
        } else {
            f(j0Var.a());
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList<f0> arrayList = new ArrayList(this.f5842b);
        if (arrayList.isEmpty()) {
            i2.d.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (f0 f0Var : arrayList) {
            f0Var.a(th);
        }
    }

    private void g() {
        this.f5843c.post(new Runnable() { // from class: com.airbnb.lottie.k0
            @Override // java.lang.Runnable
            public final void run() {
                l0.a(l0.this);
            }
        });
    }

    private synchronized void h(T t10) {
        for (f0 f0Var : new ArrayList(this.f5841a)) {
            f0Var.a(t10);
        }
    }

    public void k(j0<T> j0Var) {
        if (this.f5844d == null) {
            this.f5844d = j0Var;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized l0<T> c(f0<Throwable> f0Var) {
        j0<T> j0Var = this.f5844d;
        if (j0Var != null && j0Var.a() != null) {
            f0Var.a(j0Var.a());
        }
        this.f5842b.add(f0Var);
        return this;
    }

    public synchronized l0<T> d(f0<T> f0Var) {
        j0<T> j0Var = this.f5844d;
        if (j0Var != null && j0Var.b() != null) {
            f0Var.a(j0Var.b());
        }
        this.f5841a.add(f0Var);
        return this;
    }

    public synchronized l0<T> i(f0<Throwable> f0Var) {
        this.f5842b.remove(f0Var);
        return this;
    }

    public synchronized l0<T> j(f0<T> f0Var) {
        this.f5841a.remove(f0Var);
        return this;
    }

    public l0(Callable<j0<T>> callable, boolean z10) {
        this.f5841a = new LinkedHashSet(1);
        this.f5842b = new LinkedHashSet(1);
        this.f5843c = new Handler(Looper.getMainLooper());
        this.f5844d = null;
        if (z10) {
            try {
                k(callable.call());
                return;
            } catch (Throwable th) {
                k(new j0<>(th));
                return;
            }
        }
        f5840e.execute(new a(callable));
    }
}
