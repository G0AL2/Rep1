package yb;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes3.dex */
public final class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f39495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f39496b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: yb.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0548a extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f39497a;

            C0548a(a aVar, Runnable runnable) {
                this.f39497a = runnable;
            }

            @Override // yb.c
            public void a() {
                this.f39497a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f39495a = str;
            this.f39496b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0548a(this, runnable));
            newThread.setName(this.f39495a + this.f39496b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes3.dex */
    public class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f39498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecutorService f39499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f39500c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TimeUnit f39501d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f39498a = str;
            this.f39499b = executorService;
            this.f39500c = j10;
            this.f39501d = timeUnit;
        }

        @Override // yb.c
        public void a() {
            try {
                vb.f f10 = vb.f.f();
                f10.b("Executing shutdown hook for " + this.f39498a);
                this.f39499b.shutdown();
                if (this.f39499b.awaitTermination(this.f39500c, this.f39501d)) {
                    return;
                }
                vb.f f11 = vb.f.f();
                f11.b(this.f39498a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f39499b.shutdownNow();
            } catch (InterruptedException unused) {
                vb.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f39498a));
                this.f39499b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j10, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
