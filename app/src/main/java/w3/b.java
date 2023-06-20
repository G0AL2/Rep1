package w3;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ConstrainedExecutorService.java */
/* loaded from: classes.dex */
public class b extends AbstractExecutorService {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f38180h = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final String f38181a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f38182b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f38183c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Runnable> f38184d;

    /* renamed from: e  reason: collision with root package name */
    private final RunnableC0525b f38185e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f38186f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f38187g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConstrainedExecutorService.java */
    /* renamed from: w3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0525b implements Runnable {
        private RunnableC0525b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f38184d.poll();
                if (runnable == null) {
                    z3.a.w(b.f38180h, "%s: Worker has nothing to run", b.this.f38181a);
                } else {
                    runnable.run();
                }
                int decrementAndGet = b.this.f38186f.decrementAndGet();
                if (!b.this.f38184d.isEmpty()) {
                    b.this.f();
                } else {
                    z3.a.x(b.f38180h, "%s: worker finished; %d workers left", b.this.f38181a, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = b.this.f38186f.decrementAndGet();
                if (!b.this.f38184d.isEmpty()) {
                    b.this.f();
                } else {
                    z3.a.x(b.f38180h, "%s: worker finished; %d workers left", b.this.f38181a, Integer.valueOf(decrementAndGet2));
                }
                throw th;
            }
        }
    }

    public b(String str, int i10, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i10 > 0) {
            this.f38181a = str;
            this.f38182b = executor;
            this.f38183c = i10;
            this.f38184d = blockingQueue;
            this.f38185e = new RunnableC0525b();
            this.f38186f = new AtomicInteger(0);
            this.f38187g = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i10 = this.f38186f.get();
        while (i10 < this.f38183c) {
            int i11 = i10 + 1;
            if (this.f38186f.compareAndSet(i10, i11)) {
                z3.a.y(f38180h, "%s: starting worker %d of %d", this.f38181a, Integer.valueOf(i11), Integer.valueOf(this.f38183c));
                this.f38182b.execute(this.f38185e);
                return;
            }
            z3.a.w(f38180h, "%s: race in startWorkerIfNeeded; retrying", this.f38181a);
            i10 = this.f38186f.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.f38184d.offer(runnable)) {
            int size = this.f38184d.size();
            int i10 = this.f38187g.get();
            if (size > i10 && this.f38187g.compareAndSet(i10, size)) {
                z3.a.x(f38180h, "%s: max pending work in queue = %d", this.f38181a, Integer.valueOf(size));
            }
            f();
            return;
        }
        throw new RejectedExecutionException(this.f38181a + " queue is full, size=" + this.f38184d.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
