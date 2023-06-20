package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: JobScheduler.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14884a;

    /* renamed from: b  reason: collision with root package name */
    private final d f14885b;

    /* renamed from: e  reason: collision with root package name */
    private final int f14888e;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f14886c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f14887d = new b();

    /* renamed from: f  reason: collision with root package name */
    w5.e f14889f = null;

    /* renamed from: g  reason: collision with root package name */
    int f14890g = 0;

    /* renamed from: h  reason: collision with root package name */
    f f14891h = f.IDLE;

    /* renamed from: i  reason: collision with root package name */
    long f14892i = 0;

    /* renamed from: j  reason: collision with root package name */
    long f14893j = 0;

    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.d();
        }
    }

    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.j();
        }
    }

    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14896a;

        static {
            int[] iArr = new int[f.values().length];
            f14896a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14896a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14896a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14896a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(w5.e eVar, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f14897a;

        static ScheduledExecutorService a() {
            if (f14897a == null) {
                f14897a = Executors.newSingleThreadScheduledExecutor();
            }
            return f14897a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JobScheduler.java */
    /* loaded from: classes.dex */
    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public a0(Executor executor, d dVar, int i10) {
        this.f14884a = executor;
        this.f14885b = dVar;
        this.f14888e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        w5.e eVar;
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f14889f;
            i10 = this.f14890g;
            this.f14889f = null;
            this.f14890g = 0;
            this.f14891h = f.RUNNING;
            this.f14893j = uptimeMillis;
        }
        try {
            if (i(eVar, i10)) {
                this.f14885b.a(eVar, i10);
            }
        } finally {
            w5.e.d(eVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable a10 = x5.a.a(this.f14887d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(a10, j10, TimeUnit.MILLISECONDS);
        } else {
            a10.run();
        }
    }

    private void g() {
        long j10;
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f14891h == f.RUNNING_AND_PENDING) {
                j10 = Math.max(this.f14893j + this.f14888e, uptimeMillis);
                z10 = true;
                this.f14892i = uptimeMillis;
                this.f14891h = f.QUEUED;
            } else {
                this.f14891h = f.IDLE;
                j10 = 0;
                z10 = false;
            }
        }
        if (z10) {
            e(j10 - uptimeMillis);
        }
    }

    private static boolean i(w5.e eVar, int i10) {
        return com.facebook.imagepipeline.producers.b.e(i10) || com.facebook.imagepipeline.producers.b.n(i10, 4) || w5.e.r0(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f14884a.execute(x5.a.a(this.f14886c, "JobScheduler_submitJob"));
    }

    public void c() {
        w5.e eVar;
        synchronized (this) {
            eVar = this.f14889f;
            this.f14889f = null;
            this.f14890g = 0;
        }
        w5.e.d(eVar);
    }

    public synchronized long f() {
        return this.f14893j - this.f14892i;
    }

    public boolean h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z10 = false;
            if (i(this.f14889f, this.f14890g)) {
                int i10 = c.f14896a[this.f14891h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f14891h = f.RUNNING_AND_PENDING;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.f14893j + this.f14888e, uptimeMillis);
                    this.f14892i = uptimeMillis;
                    this.f14891h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(max - uptimeMillis);
                }
                return true;
            }
            return false;
        }
    }

    public boolean k(w5.e eVar, int i10) {
        w5.e eVar2;
        if (i(eVar, i10)) {
            synchronized (this) {
                eVar2 = this.f14889f;
                this.f14889f = w5.e.b(eVar);
                this.f14890g = i10;
            }
            w5.e.d(eVar2);
            return true;
        }
        return false;
    }
}
