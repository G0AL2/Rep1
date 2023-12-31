package f0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class g {

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f29931a;

        /* renamed from: b  reason: collision with root package name */
        private int f29932b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: f0.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0376a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f29933a;

            C0376a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f29933a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f29933a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f29931a = str;
            this.f29932b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0376a(runnable, this.f29931a, this.f29932b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f29934a;

        /* renamed from: b  reason: collision with root package name */
        private h0.a<T> f29935b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f29936c;

        /* compiled from: RequestExecutor.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0.a f29937a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f29938b;

            a(b bVar, h0.a aVar, Object obj) {
                this.f29937a = aVar;
                this.f29938b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f29937a.accept(this.f29938b);
            }
        }

        b(Handler handler, Callable<T> callable, h0.a<T> aVar) {
            this.f29934a = callable;
            this.f29935b = aVar;
            this.f29936c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f29934a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f29936c.post(new a(this, this.f29935b, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, h0.a<T> aVar) {
        executor.execute(new b(f0.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
