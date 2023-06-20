package bd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final bd.a f5210a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile bd.a f5211b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: bd.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0094b implements bd.a {
        private C0094b() {
        }

        @Override // bd.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0094b c0094b = new C0094b();
        f5210a = c0094b;
        f5211b = c0094b;
    }

    public static bd.a a() {
        return f5211b;
    }
}
