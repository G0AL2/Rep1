package io.invertase.firebase.common;

import ce.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TaskExecutorService.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: e */
    private static final Map<String, ExecutorService> f32080e = new HashMap();

    /* renamed from: a */
    private final String f32081a;

    /* renamed from: b */
    private final int f32082b;

    /* renamed from: c */
    private final int f32083c;

    /* renamed from: d */
    private final RejectedExecutionHandler f32084d = new RejectedExecutionHandler() { // from class: ce.l
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            io.invertase.firebase.common.b.a(io.invertase.firebase.common.b.this, runnable, threadPoolExecutor);
        }
    };

    public b(String str) {
        this.f32081a = str;
        i d10 = i.d();
        this.f32082b = d10.b("android_task_executor_maximum_pool_size", 1);
        this.f32083c = d10.b("android_task_executor_keep_alive_seconds", 3);
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        bVar.h(runnable, threadPoolExecutor);
    }

    private ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f32082b, this.f32083c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f32084d);
        return threadPoolExecutor;
    }

    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f32082b <= 1, "");
    }

    public ExecutorService c(boolean z10, String str) {
        String d10 = d(z10, str);
        Map<String, ExecutorService> map = f32080e;
        synchronized (map) {
            ExecutorService executorService = map.get(d10);
            if (executorService == null) {
                ExecutorService e10 = e(z10);
                map.put(d10, e10);
                return e10;
            }
            return executorService;
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f32081a + "TransactionalExecutor" + str;
        }
        return this.f32081a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f32082b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map<String, ExecutorService> map = f32080e;
        synchronized (map) {
            ExecutorService executorService = map.get(str);
            if (executorService != null) {
                executorService.shutdownNow();
                map.remove(str);
            }
        }
    }

    public void j() {
        Map<String, ExecutorService> map = f32080e;
        synchronized (map) {
            for (String str : new ArrayList(map.keySet())) {
                if (!str.startsWith(this.f32081a)) {
                    f32080e.remove(str);
                } else {
                    i(str);
                }
            }
        }
    }
}
