package df;

import df.e;
import ee.u;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import ye.f0;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final long f29450a;

    /* renamed from: b  reason: collision with root package name */
    private final cf.d f29451b;

    /* renamed from: c  reason: collision with root package name */
    private final b f29452c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f29453d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29454e;

    /* compiled from: RealConnectionPool.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    /* loaded from: classes3.dex */
    public static final class b extends cf.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // cf.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    static {
        new a(null);
    }

    public h(cf.e eVar, int i10, long j10, TimeUnit timeUnit) {
        qe.k.f(eVar, "taskRunner");
        qe.k.f(timeUnit, "timeUnit");
        this.f29454e = i10;
        this.f29450a = timeUnit.toNanos(j10);
        this.f29451b = eVar.i();
        this.f29452c = new b(ze.c.f40526h + " ConnectionPool");
        this.f29453d = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f fVar, long j10) {
        if (ze.c.f40525g && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<e>> n10 = fVar.n();
        int i10 = 0;
        while (i10 < n10.size()) {
            Reference<e> reference = n10.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                okhttp3.internal.platform.h.f35277c.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                n10.remove(i10);
                fVar.D(true);
                if (n10.isEmpty()) {
                    fVar.C(j10 - this.f29450a);
                    return 0;
                }
            }
        }
        return n10.size();
    }

    public final boolean a(ye.a aVar, e eVar, List<f0> list, boolean z10) {
        qe.k.f(aVar, "address");
        qe.k.f(eVar, "call");
        Iterator<f> it = this.f29453d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            qe.k.e(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (!next.v()) {
                        u uVar = u.f29813a;
                    }
                }
                if (next.t(aVar, list)) {
                    eVar.c(next);
                    return true;
                }
                u uVar2 = u.f29813a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        Iterator<f> it = this.f29453d.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f next = it.next();
            qe.k.e(next, "connection");
            synchronized (next) {
                if (d(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long o10 = j10 - next.o();
                    if (o10 > j11) {
                        u uVar = u.f29813a;
                        fVar = next;
                        j11 = o10;
                    } else {
                        u uVar2 = u.f29813a;
                    }
                }
            }
        }
        long j12 = this.f29450a;
        if (j11 < j12 && i10 <= this.f29454e) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        qe.k.c(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.D(true);
            this.f29453d.remove(fVar);
            ze.c.k(fVar.E());
            if (this.f29453d.isEmpty()) {
                this.f29451b.a();
            }
            return 0L;
        }
    }

    public final boolean c(f fVar) {
        qe.k.f(fVar, "connection");
        if (ze.c.f40525g && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        } else if (!fVar.p() && this.f29454e != 0) {
            cf.d.j(this.f29451b, this.f29452c, 0L, 2, null);
            return false;
        } else {
            fVar.D(true);
            this.f29453d.remove(fVar);
            if (this.f29453d.isEmpty()) {
                this.f29451b.a();
                return true;
            }
            return true;
        }
    }

    public final void e(f fVar) {
        qe.k.f(fVar, "connection");
        if (ze.c.f40525g && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        this.f29453d.add(fVar);
        cf.d.j(this.f29451b, this.f29452c, 0L, 2, null);
    }
}
