package com.inmobi.media;

import android.util.SparseArray;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AdExecutorService.java */
/* loaded from: classes3.dex */
public class hq {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25690b = "hq";

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<Queue<af>> f25691a;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f25692c;

    /* renamed from: d  reason: collision with root package name */
    private byte f25693d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdExecutorService.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final hq f25694a = new hq((byte) 0);
    }

    /* synthetic */ hq(byte b10) {
        this();
    }

    public static hq a() {
        return a.f25694a;
    }

    private hq() {
        this.f25693d = (byte) -1;
        this.f25691a = new SparseArray<>();
        int i10 = ((fq) fs.a("ads", ho.f(), null)).maxPoolSize;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 5L, timeUnit, linkedBlockingQueue, new ht(f25690b + "-AD"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f25692c = threadPoolExecutor;
    }

    public final void a(int i10, af afVar) {
        Queue<af> queue = this.f25691a.get(i10);
        if (queue == null) {
            queue = new LinkedList<>();
            this.f25691a.put(i10, queue);
        }
        queue.add(afVar);
        af peek = queue.peek();
        if (queue.size() != 1 || peek == null) {
            return;
        }
        a(peek);
    }

    public final void a(af afVar) {
        try {
            this.f25692c.execute(afVar);
        } catch (OutOfMemoryError unused) {
            afVar.b();
        }
    }

    public final void a(int i10) {
        this.f25691a.remove(i10);
        this.f25691a.size();
    }
}
