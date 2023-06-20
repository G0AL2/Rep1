package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.o;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RoomTrackingLiveData.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class q0<T> extends LiveData<T> {

    /* renamed from: l */
    private final k0 f4008l;

    /* renamed from: m */
    private final m f4009m;

    /* renamed from: n */
    private final boolean f4010n;

    /* renamed from: o */
    private final Callable<T> f4011o;

    /* renamed from: p */
    private final o.c f4012p;

    /* renamed from: q */
    private final AtomicBoolean f4013q;

    /* renamed from: r */
    private final AtomicBoolean f4014r;

    /* renamed from: s */
    private final AtomicBoolean f4015s;

    /* renamed from: t */
    private final Runnable f4016t;

    /* renamed from: u */
    private final Runnable f4017u;

    /* compiled from: RoomTrackingLiveData.kt */
    /* loaded from: classes.dex */
    public static final class a extends o.c {

        /* renamed from: b */
        final /* synthetic */ q0<T> f4018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, q0<T> q0Var) {
            super(strArr);
            this.f4018b = q0Var;
        }

        @Override // androidx.room.o.c
        public void c(Set<String> set) {
            qe.k.f(set, "tables");
            k.a.f().b(this.f4018b.r());
        }
    }

    public q0(k0 k0Var, m mVar, boolean z10, Callable<T> callable, String[] strArr) {
        qe.k.f(k0Var, "database");
        qe.k.f(mVar, "container");
        qe.k.f(callable, "computeFunction");
        qe.k.f(strArr, "tableNames");
        this.f4008l = k0Var;
        this.f4009m = mVar;
        this.f4010n = z10;
        this.f4011o = callable;
        this.f4012p = new a(strArr, this);
        this.f4013q = new AtomicBoolean(true);
        this.f4014r = new AtomicBoolean(false);
        this.f4015s = new AtomicBoolean(false);
        this.f4016t = new Runnable() { // from class: androidx.room.o0
            @Override // java.lang.Runnable
            public final void run() {
                q0.p(q0.this);
            }
        };
        this.f4017u = new Runnable() { // from class: androidx.room.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.q(q0.this);
            }
        };
    }

    public static /* synthetic */ void p(q0 q0Var) {
        u(q0Var);
    }

    public static /* synthetic */ void q(q0 q0Var) {
        t(q0Var);
    }

    public static final void t(q0 q0Var) {
        qe.k.f(q0Var, "this$0");
        boolean h10 = q0Var.h();
        if (q0Var.f4013q.compareAndSet(false, true) && h10) {
            q0Var.s().execute(q0Var.f4016t);
        }
    }

    public static final void u(q0 q0Var) {
        boolean z10;
        qe.k.f(q0Var, "this$0");
        if (q0Var.f4015s.compareAndSet(false, true)) {
            q0Var.f4008l.getInvalidationTracker().c(q0Var.f4012p);
        }
        do {
            if (q0Var.f4014r.compareAndSet(false, true)) {
                T t10 = null;
                z10 = false;
                while (q0Var.f4013q.compareAndSet(true, false)) {
                    try {
                        try {
                            t10 = q0Var.f4011o.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        q0Var.f4014r.set(false);
                    }
                }
                if (z10) {
                    q0Var.m(t10);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (q0Var.f4013q.get());
    }

    @Override // androidx.lifecycle.LiveData
    public void k() {
        super.k();
        m mVar = this.f4009m;
        qe.k.d(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.b(this);
        s().execute(this.f4016t);
    }

    @Override // androidx.lifecycle.LiveData
    public void l() {
        super.l();
        m mVar = this.f4009m;
        qe.k.d(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.c(this);
    }

    public final Runnable r() {
        return this.f4017u;
    }

    public final Executor s() {
        if (this.f4010n) {
            return this.f4008l.getTransactionExecutor();
        }
        return this.f4008l.getQueryExecutor();
    }
}
