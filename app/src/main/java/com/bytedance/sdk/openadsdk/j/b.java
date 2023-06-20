package com.bytedance.sdk.openadsdk.j;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashMonitor.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private g f13348b;

    /* renamed from: d  reason: collision with root package name */
    private a f13350d;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f13347a = null;

    /* renamed from: c  reason: collision with root package name */
    private long f13349c = 0;

    /* compiled from: CrashMonitor.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public b(g gVar) {
        this.f13348b = gVar;
    }

    public void a(long j10) {
        this.f13349c = j10;
    }

    public void a(int i10) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f13347a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.j.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (System.currentTimeMillis() - b.this.f13349c > Constants.MIN_PROGRESS_TIME) {
                    b.this.f13347a.shutdown();
                    if (b.this.f13348b != null) {
                        b.this.f13348b.t();
                    }
                    if (b.this.f13350d != null) {
                        b.this.f13350d.a();
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void a() {
        ScheduledExecutorService scheduledExecutorService = this.f13347a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
