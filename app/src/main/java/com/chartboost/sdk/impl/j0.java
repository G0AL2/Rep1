package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j0 {

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f14085a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Chartboost Thread #" + this.f14085a.getAndIncrement());
        }
    }

    public static ScheduledExecutorService a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new a());
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    public static ExecutorService a(int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 10L, TimeUnit.SECONDS, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }
}
