package com.bytedance.sdk.component.b.a.a.a;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetDispatcher.java */
/* loaded from: classes.dex */
public class d extends com.bytedance.sdk.component.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f9994a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.bytedance.sdk.component.b.a.b> f9995b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<com.bytedance.sdk.component.b.a.b> f9996c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f9997d = new AtomicInteger(64);

    public d() {
        if (this.f9994a == null) {
            this.f9994a = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.b.a.a.a.d.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.b.a.d
    public void a(int i10) {
        this.f9997d.set(i10);
    }

    @Override // com.bytedance.sdk.component.b.a.d
    public ExecutorService b() {
        return this.f9994a;
    }

    @Override // com.bytedance.sdk.component.b.a.d
    public List<com.bytedance.sdk.component.b.a.b> c() {
        return this.f9995b;
    }

    @Override // com.bytedance.sdk.component.b.a.d
    public List<com.bytedance.sdk.component.b.a.b> d() {
        return this.f9996c;
    }

    @Override // com.bytedance.sdk.component.b.a.d
    public int a() {
        return this.f9997d.get();
    }
}
