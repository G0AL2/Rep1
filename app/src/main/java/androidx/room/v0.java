package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.kt */
/* loaded from: classes.dex */
public final class v0 implements Executor {

    /* renamed from: a */
    private final Executor f4054a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f4055b;

    /* renamed from: c */
    private Runnable f4056c;

    /* renamed from: d */
    private final Object f4057d;

    public v0(Executor executor) {
        qe.k.f(executor, "executor");
        this.f4054a = executor;
        this.f4055b = new ArrayDeque<>();
        this.f4057d = new Object();
    }

    public static /* synthetic */ void a(Runnable runnable, v0 v0Var) {
        b(runnable, v0Var);
    }

    public static final void b(Runnable runnable, v0 v0Var) {
        qe.k.f(runnable, "$command");
        qe.k.f(v0Var, "this$0");
        try {
            runnable.run();
        } finally {
            v0Var.c();
        }
    }

    public final void c() {
        synchronized (this.f4057d) {
            Runnable poll = this.f4055b.poll();
            Runnable runnable = poll;
            this.f4056c = runnable;
            if (poll != null) {
                this.f4054a.execute(runnable);
            }
            ee.u uVar = ee.u.f29813a;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        qe.k.f(runnable, "command");
        synchronized (this.f4057d) {
            this.f4055b.offer(new Runnable() { // from class: androidx.room.u0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.a(runnable, this);
                }
            });
            if (this.f4056c == null) {
                c();
            }
            ee.u uVar = ee.u.f29813a;
        }
    }
}
