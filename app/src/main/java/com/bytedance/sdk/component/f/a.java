package com.bytedance.sdk.component.f;

import android.os.Looper;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.bytedance.sdk.component.utils.l;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ADThreadPoolExecutor.java */
/* loaded from: classes.dex */
class a extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private String f10400a;

    /* compiled from: ADThreadPoolExecutor.java */
    /* renamed from: com.bytedance.sdk.component.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0160a {

        /* renamed from: h  reason: collision with root package name */
        private RejectedExecutionHandler f10414h;

        /* renamed from: a  reason: collision with root package name */
        private String f10407a = "io";

        /* renamed from: b  reason: collision with root package name */
        private int f10408b = 1;

        /* renamed from: c  reason: collision with root package name */
        private long f10409c = 30;

        /* renamed from: d  reason: collision with root package name */
        private TimeUnit f10410d = TimeUnit.SECONDS;

        /* renamed from: e  reason: collision with root package name */
        private int f10411e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: f  reason: collision with root package name */
        private BlockingQueue<Runnable> f10412f = null;

        /* renamed from: g  reason: collision with root package name */
        private ThreadFactory f10413g = null;

        /* renamed from: i  reason: collision with root package name */
        private int f10415i = 5;

        public C0160a a(String str) {
            this.f10407a = str;
            return this;
        }

        public C0160a b(int i10) {
            this.f10415i = i10;
            return this;
        }

        public C0160a a(int i10) {
            this.f10408b = i10;
            return this;
        }

        public C0160a a(long j10) {
            this.f10409c = j10;
            return this;
        }

        public C0160a a(TimeUnit timeUnit) {
            this.f10410d = timeUnit;
            return this;
        }

        public C0160a a(BlockingQueue<Runnable> blockingQueue) {
            this.f10412f = blockingQueue;
            return this;
        }

        public C0160a a(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f10414h = rejectedExecutionHandler;
            return this;
        }

        public a a() {
            if (this.f10413g == null) {
                this.f10413g = new h(this.f10415i, this.f10407a);
            }
            if (this.f10414h == null) {
                this.f10414h = e.f();
            }
            if (this.f10412f == null) {
                this.f10412f = new LinkedBlockingQueue();
            }
            return new a(this.f10407a, this.f10408b, this.f10411e, this.f10409c, this.f10410d, this.f10412f, this.f10413g, this.f10414h);
        }
    }

    public a(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f10400a = str;
    }

    private void a(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            a(runnable, e10);
        } catch (Throwable th) {
            a(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!e.e() || TextUtils.isEmpty(this.f10400a) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.f10400a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3366:
                if (str.equals("io")) {
                    c10 = 0;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                a(queue, 4);
                return;
            case 1:
                a(queue, 2);
                return;
            case 2:
                a(queue, 2);
                return;
            default:
                return;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof g) {
            a(new b((g) runnable, this));
        } else {
            a(new b(new g(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN) { // from class: com.bytedance.sdk.component.f.a.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!e.e() || TextUtils.isEmpty(this.f10400a) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.f10400a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3366:
                if (str.equals("io")) {
                    c10 = 0;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                a(queue, e.f10429a + 2, getCorePoolSize() * 2);
                return;
            case 1:
                a(queue, 6, 6);
                return;
            case 2:
                a(queue, 5, 5);
                return;
            default:
                return;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.f10400a) || "aidl".equals(this.f10400a)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (!"io".equals(this.f10400a) && !"aidl".equals(this.f10400a)) {
            return super.shutdownNow();
        }
        return Collections.emptyList();
    }

    private void a(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        a(runnable, (Throwable) outOfMemoryError);
    }

    private void a(Runnable runnable, Throwable th) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th2) {
            l.c("", "try exc failed", th2);
        }
    }

    private void a(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            l.a("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.f10400a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e10) {
            l.c("ADThreadPoolExecutor", e10.getMessage());
        }
    }

    private void a(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            l.a("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.f10400a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
        } catch (Exception e10) {
            l.c("ADThreadPoolExecutor", e10.getMessage());
        }
    }

    public String a() {
        return this.f10400a;
    }
}
