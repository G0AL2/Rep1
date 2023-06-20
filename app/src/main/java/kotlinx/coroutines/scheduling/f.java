package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import we.b1;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
final class f extends b1 implements j, Executor {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f33582e = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f33583a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33584b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33585c;

    /* renamed from: d  reason: collision with root package name */
    private final l f33586d;
    private volatile int inFlightTasks;

    public f(d dVar, int i10, l lVar) {
        qe.k.g(dVar, "dispatcher");
        qe.k.g(lVar, "taskMode");
        this.f33584b = dVar;
        this.f33585c = i10;
        this.f33586d = lVar;
        this.f33583a = new ConcurrentLinkedQueue<>();
        this.inFlightTasks = 0;
    }

    private final void m0(Runnable runnable, boolean z10) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f33582e;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f33585c) {
                this.f33584b.r0(runnable, this, z10);
                return;
            }
            this.f33583a.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f33585c) {
                return;
            }
            runnable = this.f33583a.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.j
    public void L() {
        Runnable poll = this.f33583a.poll();
        if (poll != null) {
            this.f33584b.r0(poll, this, true);
            return;
        }
        f33582e.decrementAndGet(this);
        Runnable poll2 = this.f33583a.poll();
        if (poll2 != null) {
            m0(poll2, true);
        }
    }

    @Override // kotlinx.coroutines.scheduling.j
    public l Z() {
        return this.f33586d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        qe.k.g(runnable, "command");
        m0(runnable, false);
    }

    @Override // we.z
    public void g0(ie.g gVar, Runnable runnable) {
        qe.k.g(gVar, "context");
        qe.k.g(runnable, "block");
        m0(runnable, false);
    }

    @Override // we.z
    public String toString() {
        return super.toString() + "[dispatcher = " + this.f33584b + ']';
    }
}
