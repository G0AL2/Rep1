package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.v;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8927a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f8928b;

    /* renamed from: c  reason: collision with root package name */
    private long f8929c;

    /* renamed from: d  reason: collision with root package name */
    private long f8930d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f8931e;

    /* renamed from: f  reason: collision with root package name */
    private long f8932f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f8933g = new Object();

    private o(com.applovin.impl.sdk.m mVar, Runnable runnable) {
        this.f8927a = mVar;
        this.f8931e = runnable;
    }

    public static o a(long j10, com.applovin.impl.sdk.m mVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        } else if (runnable != null) {
            o oVar = new o(mVar, runnable);
            oVar.f8929c = System.currentTimeMillis();
            oVar.f8930d = j10;
            try {
                Timer timer = new Timer();
                oVar.f8928b = timer;
                timer.schedule(oVar.e(), j10);
            } catch (OutOfMemoryError e10) {
                if (v.a()) {
                    mVar.A().b("Timer", "Failed to create timer due to OOM error", e10);
                }
            }
            return oVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.o.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    o.this.f8931e.run();
                    synchronized (o.this.f8933g) {
                        o.this.f8928b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (o.this.f8927a != null && v.a()) {
                            o.this.f8927a.A().b("Timer", "Encountered error while executing timed task", th);
                        }
                        synchronized (o.this.f8933g) {
                            o.this.f8928b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (o.this.f8933g) {
                            o.this.f8928b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    public long a() {
        if (this.f8928b != null) {
            return this.f8930d - (System.currentTimeMillis() - this.f8929c);
        }
        return this.f8930d - this.f8932f;
    }

    public void b() {
        synchronized (this.f8933g) {
            Timer timer = this.f8928b;
            if (timer != null) {
                timer.cancel();
                this.f8932f = Math.max(1L, System.currentTimeMillis() - this.f8929c);
                this.f8928b = null;
            }
        }
    }

    public void c() {
        synchronized (this.f8933g) {
            long j10 = this.f8932f;
            if (j10 > 0) {
                long j11 = this.f8930d - j10;
                this.f8930d = j11;
                if (j11 < 0) {
                    this.f8930d = 0L;
                }
                Timer timer = new Timer();
                this.f8928b = timer;
                timer.schedule(e(), this.f8930d);
                this.f8929c = System.currentTimeMillis();
                this.f8932f = 0L;
            }
        }
    }

    public void d() {
        synchronized (this.f8933g) {
            Timer timer = this.f8928b;
            if (timer != null) {
                timer.cancel();
                this.f8928b = null;
                this.f8932f = 0L;
            }
        }
    }
}
