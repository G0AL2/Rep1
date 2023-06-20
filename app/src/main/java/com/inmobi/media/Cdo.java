package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VastNetworkClient.java */
/* renamed from: com.inmobi.media.do  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo {

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f25136d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f25137e = "do";

    /* renamed from: g  reason: collision with root package name */
    private static final int f25138g;

    /* renamed from: h  reason: collision with root package name */
    private static final int f25139h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f25140i;

    /* renamed from: j  reason: collision with root package name */
    private static final ThreadFactory f25141j;

    /* renamed from: k  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f25142k;

    /* renamed from: a  reason: collision with root package name */
    gx f25143a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<dn> f25144b;

    /* renamed from: c  reason: collision with root package name */
    long f25145c = 0;

    /* renamed from: f  reason: collision with root package name */
    private final CountDownLatch f25146f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f25138g = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f25139h = max;
        int i10 = (availableProcessors * 2) + 1;
        f25140i = i10;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.inmobi.media.do.1

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f25147a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "VastNetworkTask #" + this.f25147a.getAndIncrement());
            }
        };
        f25141j = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f25142k = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f25136d = threadPoolExecutor;
    }

    public Cdo(dn dnVar, int i10, CountDownLatch countDownLatch) {
        gx gxVar = new gx("GET", dnVar.f25131a);
        this.f25143a = gxVar;
        gxVar.f25620o = false;
        gxVar.f25625t = false;
        gxVar.f25617l = i10;
        this.f25144b = new WeakReference<>(dnVar);
        this.f25146f = countDownLatch;
    }

    final void a() {
        CountDownLatch countDownLatch = this.f25146f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void a(gy gyVar) {
        try {
            iv.a().a(this.f25143a.g());
            iv.a().b(gyVar.d());
        } catch (Exception unused) {
        } finally {
            a();
        }
    }
}
