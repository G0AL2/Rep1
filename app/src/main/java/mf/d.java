package mf;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes3.dex */
public class d extends f0 {

    /* renamed from: h  reason: collision with root package name */
    private static final long f34434h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f34435i;

    /* renamed from: j  reason: collision with root package name */
    private static d f34436j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f34437k = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private boolean f34438e;

    /* renamed from: f  reason: collision with root package name */
    private d f34439f;

    /* renamed from: g  reason: collision with root package name */
    private long f34440g;

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d dVar2 = d.f34436j; dVar2 != null; dVar2 = dVar2.f34439f) {
                    if (dVar2.f34439f == dVar) {
                        dVar2.f34439f = dVar.f34439f;
                        dVar.f34439f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(d dVar, long j10, boolean z10) {
            synchronized (d.class) {
                if (d.f34436j == null) {
                    d.f34436j = new d();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 != 0 && z10) {
                    dVar.f34440g = Math.min(j10, dVar.c() - nanoTime) + nanoTime;
                } else if (i10 != 0) {
                    dVar.f34440g = j10 + nanoTime;
                } else if (z10) {
                    dVar.f34440g = dVar.c();
                } else {
                    throw new AssertionError();
                }
                long u10 = dVar.u(nanoTime);
                d dVar2 = d.f34436j;
                qe.k.c(dVar2);
                while (dVar2.f34439f != null) {
                    d dVar3 = dVar2.f34439f;
                    qe.k.c(dVar3);
                    if (u10 < dVar3.u(nanoTime)) {
                        break;
                    }
                    dVar2 = dVar2.f34439f;
                    qe.k.c(dVar2);
                }
                dVar.f34439f = dVar2.f34439f;
                dVar2.f34439f = dVar;
                if (dVar2 == d.f34436j) {
                    d.class.notify();
                }
                ee.u uVar = ee.u.f29813a;
            }
        }

        public final d c() throws InterruptedException {
            d dVar = d.f34436j;
            qe.k.c(dVar);
            d dVar2 = dVar.f34439f;
            if (dVar2 != null) {
                long u10 = dVar2.u(System.nanoTime());
                if (u10 <= 0) {
                    d dVar3 = d.f34436j;
                    qe.k.c(dVar3);
                    dVar3.f34439f = dVar2.f34439f;
                    dVar2.f34439f = null;
                    return dVar2;
                }
                long j10 = u10 / 1000000;
                d.class.wait(j10, (int) (u10 - (1000000 * j10)));
                return null;
            }
            long nanoTime = System.nanoTime();
            d.class.wait(d.f34434h);
            d dVar4 = d.f34436j;
            qe.k.c(dVar4);
            if (dVar4.f34439f != null || System.nanoTime() - nanoTime < d.f34435i) {
                return null;
            }
            return d.f34436j;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d c10;
            while (true) {
                try {
                    synchronized (d.class) {
                        c10 = d.f34437k.c();
                        if (c10 == d.f34436j) {
                            d.f34436j = null;
                            return;
                        }
                        ee.u uVar = ee.u.f29813a;
                    }
                    if (c10 != null) {
                        c10.x();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes3.dex */
    public static final class c implements c0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f34442b;

        c(c0 c0Var) {
            this.f34442b = c0Var;
        }

        @Override // mf.c0
        /* renamed from: a */
        public d k() {
            return d.this;
        }

        @Override // mf.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f34442b.close();
                ee.u uVar = ee.u.f29813a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (!dVar.s()) {
                    throw e10;
                }
                throw dVar.m(e10);
            } finally {
                dVar.s();
            }
        }

        @Override // mf.c0, java.io.Flushable
        public void flush() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f34442b.flush();
                ee.u uVar = ee.u.f29813a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (!dVar.s()) {
                    throw e10;
                }
                throw dVar.m(e10);
            } finally {
                dVar.s();
            }
        }

        @Override // mf.c0
        public void n0(f fVar, long j10) {
            qe.k.f(fVar, "source");
            mf.c.b(fVar.C0(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                z zVar = fVar.f34446a;
                qe.k.c(zVar);
                while (true) {
                    if (j11 >= ((long) Constants.MIN_PROGRESS_STEP)) {
                        break;
                    }
                    j11 += zVar.f34510c - zVar.f34509b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        zVar = zVar.f34513f;
                        qe.k.c(zVar);
                    }
                }
                d dVar = d.this;
                dVar.r();
                try {
                    this.f34442b.n0(fVar, j11);
                    ee.u uVar = ee.u.f29813a;
                    if (dVar.s()) {
                        throw dVar.m(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!dVar.s()) {
                        throw e10;
                    }
                    throw dVar.m(e10);
                } finally {
                    dVar.s();
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f34442b + ')';
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: mf.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0453d implements e0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f34444b;

        C0453d(e0 e0Var) {
            this.f34444b = e0Var;
        }

        @Override // mf.e0
        /* renamed from: a */
        public d k() {
            return d.this;
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f34444b.close();
                ee.u uVar = ee.u.f29813a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (!dVar.s()) {
                    throw e10;
                }
                throw dVar.m(e10);
            } finally {
                dVar.s();
            }
        }

        @Override // mf.e0
        public long e0(f fVar, long j10) {
            qe.k.f(fVar, "sink");
            d dVar = d.this;
            dVar.r();
            try {
                long e02 = this.f34444b.e0(fVar, j10);
                if (dVar.s()) {
                    throw dVar.m(null);
                }
                return e02;
            } catch (IOException e10) {
                if (dVar.s()) {
                    throw dVar.m(e10);
                }
                throw e10;
            } finally {
                dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f34444b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f34434h = millis;
        f34435i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j10) {
        return this.f34440g - j10;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!this.f34438e) {
            long h10 = h();
            boolean e10 = e();
            if (h10 != 0 || e10) {
                this.f34438e = true;
                f34437k.e(this, h10, e10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean s() {
        if (this.f34438e) {
            this.f34438e = false;
            return f34437k.d(this);
        }
        return false;
    }

    protected IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final c0 v(c0 c0Var) {
        qe.k.f(c0Var, "sink");
        return new c(c0Var);
    }

    public final e0 w(e0 e0Var) {
        qe.k.f(e0Var, "source");
        return new C0453d(e0Var);
    }

    protected void x() {
    }
}
