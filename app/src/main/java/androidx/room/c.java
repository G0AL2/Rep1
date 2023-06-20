package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: AutoCloser.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public z0.h f3842a;

    /* renamed from: b */
    private final Handler f3843b;

    /* renamed from: c */
    private Runnable f3844c;

    /* renamed from: d */
    private final Object f3845d;

    /* renamed from: e */
    private long f3846e;

    /* renamed from: f */
    private final Executor f3847f;

    /* renamed from: g */
    private int f3848g;

    /* renamed from: h */
    private long f3849h;

    /* renamed from: i */
    private z0.g f3850i;

    /* renamed from: j */
    private boolean f3851j;

    /* renamed from: k */
    private final Runnable f3852k;

    /* renamed from: l */
    private final Runnable f3853l;

    /* compiled from: AutoCloser.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public c(long j10, TimeUnit timeUnit, Executor executor) {
        qe.k.f(timeUnit, "autoCloseTimeUnit");
        qe.k.f(executor, "autoCloseExecutor");
        this.f3843b = new Handler(Looper.getMainLooper());
        this.f3845d = new Object();
        this.f3846e = timeUnit.toMillis(j10);
        this.f3847f = executor;
        this.f3849h = SystemClock.uptimeMillis();
        this.f3852k = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this);
            }
        };
        this.f3853l = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                c.b(c.this);
            }
        };
    }

    public static /* synthetic */ void a(c cVar) {
        f(cVar);
    }

    public static /* synthetic */ void b(c cVar) {
        c(cVar);
    }

    public static final void c(c cVar) {
        ee.u uVar;
        qe.k.f(cVar, "this$0");
        synchronized (cVar.f3845d) {
            if (SystemClock.uptimeMillis() - cVar.f3849h < cVar.f3846e) {
                return;
            }
            if (cVar.f3848g != 0) {
                return;
            }
            Runnable runnable = cVar.f3844c;
            if (runnable != null) {
                runnable.run();
                uVar = ee.u.f29813a;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                z0.g gVar = cVar.f3850i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                cVar.f3850i = null;
                ee.u uVar2 = ee.u.f29813a;
                return;
            }
            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
        }
    }

    public static final void f(c cVar) {
        qe.k.f(cVar, "this$0");
        cVar.f3847f.execute(cVar.f3853l);
    }

    public final void d() throws IOException {
        synchronized (this.f3845d) {
            this.f3851j = true;
            z0.g gVar = this.f3850i;
            if (gVar != null) {
                gVar.close();
            }
            this.f3850i = null;
            ee.u uVar = ee.u.f29813a;
        }
    }

    public final void e() {
        synchronized (this.f3845d) {
            int i10 = this.f3848g;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f3848g = i11;
                if (i11 == 0) {
                    if (this.f3850i == null) {
                        return;
                    }
                    this.f3843b.postDelayed(this.f3852k, this.f3846e);
                }
                ee.u uVar = ee.u.f29813a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    public final <V> V g(pe.l<? super z0.g, ? extends V> lVar) {
        qe.k.f(lVar, "block");
        try {
            return lVar.b(j());
        } finally {
            e();
        }
    }

    public final z0.g h() {
        return this.f3850i;
    }

    public final z0.h i() {
        z0.h hVar = this.f3842a;
        if (hVar != null) {
            return hVar;
        }
        qe.k.s("delegateOpenHelper");
        return null;
    }

    public final z0.g j() {
        synchronized (this.f3845d) {
            this.f3843b.removeCallbacks(this.f3852k);
            this.f3848g++;
            if (!this.f3851j) {
                z0.g gVar = this.f3850i;
                if (gVar == null || !gVar.isOpen()) {
                    z0.g F0 = i().F0();
                    this.f3850i = F0;
                    return F0;
                }
                return gVar;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void k(z0.h hVar) {
        qe.k.f(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f3851j;
    }

    public final void m(Runnable runnable) {
        qe.k.f(runnable, "onAutoClose");
        this.f3844c = runnable;
    }

    public final void n(z0.h hVar) {
        qe.k.f(hVar, "<set-?>");
        this.f3842a = hVar;
    }
}
