package s1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AndroidExecutors.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f36678b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f36679c;

    /* renamed from: d  reason: collision with root package name */
    static final int f36680d;

    /* renamed from: e  reason: collision with root package name */
    static final int f36681e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f36682a = new b();

    /* compiled from: AndroidExecutors.java */
    /* loaded from: classes.dex */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f36679c = availableProcessors;
        f36680d = availableProcessors + 1;
        f36681e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z10);
        }
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f36680d, f36681e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f36678b.f36682a;
    }
}
