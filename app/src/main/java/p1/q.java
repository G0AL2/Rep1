package p1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutorImpl.java */
/* loaded from: classes.dex */
public class q implements q1.a {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f35460b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f35461c;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f35459a = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    final Object f35462d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialExecutorImpl.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final q f35463a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f35464b;

        a(q qVar, Runnable runnable) {
            this.f35463a = qVar;
            this.f35464b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35464b.run();
                synchronized (this.f35463a.f35462d) {
                    this.f35463a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f35463a.f35462d) {
                    this.f35463a.a();
                    throw th;
                }
            }
        }
    }

    public q(Executor executor) {
        this.f35460b = executor;
    }

    @Override // q1.a
    public boolean U() {
        boolean z10;
        synchronized (this.f35462d) {
            z10 = !this.f35459a.isEmpty();
        }
        return z10;
    }

    void a() {
        a poll = this.f35459a.poll();
        this.f35461c = poll;
        if (poll != null) {
            this.f35460b.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f35462d) {
            this.f35459a.add(new a(this, runnable));
            if (this.f35461c == null) {
                a();
            }
        }
    }
}
