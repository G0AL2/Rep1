package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f20309a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f20310b = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f20311a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "IAConcurrencyUtil#" + this.f20311a.getAndIncrement());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.a("rejectedExecution received for - %s", runnable);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new a(), new b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20309a = threadPoolExecutor;
    }

    public static void a(Runnable runnable) {
        ((ThreadPoolExecutor) f20309a).execute(runnable);
    }
}
