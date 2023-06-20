package we;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonPool.kt */
/* loaded from: classes3.dex */
public final class p extends b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f38631a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f38632b;

    /* renamed from: c  reason: collision with root package name */
    public static final p f38633c = new p();
    private static volatile Executor pool;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonPool.kt */
    /* loaded from: classes3.dex */
    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f38634a;

        a(AtomicInteger atomicInteger) {
            this.f38634a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f38634a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonPool.kt */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38635a = new b();

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    static {
        String str;
        int i10;
        Integer f10;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            f10 = ve.o.f(str);
            if (f10 != null && f10.intValue() >= 1) {
                i10 = f10.intValue();
            } else {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
        } else {
            i10 = -1;
        }
        f38631a = i10;
    }

    private p() {
    }

    private final ExecutorService m0() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(s0(), new a(new AtomicInteger()));
        qe.k.b(newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    private final ExecutorService q0() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return m0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            if (!f38632b && f38631a < 0) {
                try {
                    Method method = cls.getMethod("commonPool", new Class[0]);
                    Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                    if (!(invoke instanceof ExecutorService)) {
                        invoke = null;
                    }
                    executorService = (ExecutorService) invoke;
                } catch (Throwable unused2) {
                    executorService = null;
                }
                if (executorService != null) {
                    if (!f38633c.z0(cls, executorService)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                }
            }
            try {
                Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f38633c.s0()));
                if (!(newInstance instanceof ExecutorService)) {
                    newInstance = null;
                }
                executorService2 = (ExecutorService) newInstance;
            } catch (Throwable unused3) {
            }
            return executorService2 != null ? executorService2 : m0();
        }
        return m0();
    }

    private final synchronized Executor r0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = q0();
            pool = executor;
        }
        return executor;
    }

    private final int s0() {
        int b10;
        Integer valueOf = Integer.valueOf(f38631a);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        b10 = se.f.b(Runtime.getRuntime().availableProcessors() - 1, 1);
        return b10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // we.z
    public void g0(ie.g gVar, Runnable runnable) {
        Runnable runnable2;
        qe.k.g(gVar, "context");
        qe.k.g(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = r0();
            }
            f2 a10 = g2.a();
            if (a10 == null || (runnable2 = a10.f(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            f2 a11 = g2.a();
            if (a11 != null) {
                a11.a();
            }
            k0.f38620g.Z0(runnable);
        }
    }

    @Override // we.z
    public String toString() {
        return "CommonPool";
    }

    public final boolean z0(Class<?> cls, ExecutorService executorService) {
        qe.k.g(cls, "fjpClass");
        qe.k.g(executorService, "executor");
        executorService.submit(b.f38635a);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }
}
