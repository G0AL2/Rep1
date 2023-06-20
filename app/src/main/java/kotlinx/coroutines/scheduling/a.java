package kotlinx.coroutines.scheduling;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.x;
import we.f2;
import we.g2;
import we.i0;
import we.j0;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f33544i;

    /* renamed from: j  reason: collision with root package name */
    static final AtomicLongFieldUpdater f33545j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f33546k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f33547l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f33548m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f33549n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f33550o;

    /* renamed from: p  reason: collision with root package name */
    private static final u f33551p;
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    private final e f33552a;

    /* renamed from: b  reason: collision with root package name */
    private final Semaphore f33553b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f33554c;
    volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    private final Random f33555d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33556e;

    /* renamed from: f  reason: collision with root package name */
    private final int f33557f;

    /* renamed from: g  reason: collision with root package name */
    private final long f33558g;

    /* renamed from: h  reason: collision with root package name */
    private final String f33559h;
    private volatile long parkedWorkersStack;

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0435a {
        private C0435a() {
        }

        public /* synthetic */ C0435a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes3.dex */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        int d10;
        int d11;
        long c10;
        long e10;
        new C0435a(null);
        d10 = x.d("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, null);
        f33547l = d10;
        d11 = x.d("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, null);
        f33548m = d10 + d11;
        int nanos = (int) TimeUnit.SECONDS.toNanos(1L);
        f33549n = nanos;
        c10 = se.f.c(m.f33596a / 4, 10L);
        e10 = se.f.e(c10, nanos);
        f33550o = (int) e10;
        f33551p = new u("NOT_IN_STACK");
        f33544i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        f33545j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        f33546k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    }

    public a(int i10, int i11, long j10, String str) {
        qe.k.g(str, "schedulerName");
        this.f33556e = i10;
        this.f33557f = i11;
        this.f33558g = j10;
        this.f33559h = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f33552a = new e();
            this.f33553b = new Semaphore(i10, false);
            this.parkedWorkersStack = 0L;
            this.f33554c = new b[i11 + 1];
            this.controlState = 0L;
            this.f33555d = new Random();
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final int C0(b bVar) {
        Object k10 = bVar.k();
        while (k10 != f33551p) {
            if (k10 == null) {
                return 0;
            }
            b bVar2 = (b) k10;
            int i10 = bVar2.i();
            if (i10 != 0) {
                return i10;
            }
            k10 = bVar2.k();
        }
        return -1;
    }

    private final b E0() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            b bVar = this.f33554c[(int) (2097151 & j10)];
            if (bVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int C0 = C0(bVar);
            if (C0 >= 0 && f33544i.compareAndSet(this, j10, C0 | j11)) {
                bVar.t(f33551p);
                return bVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(b bVar) {
        long j10;
        long j11;
        int i10;
        if (bVar.k() != f33551p) {
            return;
        }
        do {
            j10 = this.parkedWorkersStack;
            int i11 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & (-2097152);
            i10 = bVar.i();
            if (i0.a()) {
                if (!(i10 != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.t(this.f33554c[i11]);
        } while (!f33544i.compareAndSet(this, j10, i10 | j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(b bVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? C0(bVar) : i11;
            }
            if (i12 >= 0 && f33544i.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0() {
        if (this.f33553b.availablePermits() == 0) {
            X0();
        } else if (X0()) {
        } else {
            long j10 = this.controlState;
            if (((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)) < this.f33556e) {
                int h02 = h0();
                if (h02 == 1 && this.f33556e > 1) {
                    h0();
                }
                if (h02 > 0) {
                    return;
                }
            }
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                qe.k.b(currentThread, "thread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                f2 a10 = g2.a();
                if (a10 == null) {
                }
            } finally {
                f2 a11 = g2.a();
                if (a11 != null) {
                    a11.a();
                }
            }
        }
    }

    private final int U0(i iVar, boolean z10) {
        boolean b10;
        b q02 = q0();
        if (q02 == null || q02.m() == c.TERMINATED) {
            return 1;
        }
        int i10 = -1;
        if (iVar.a() == l.NON_BLOCKING) {
            if (q02.p()) {
                i10 = 0;
            } else if (!q02.u()) {
                return 1;
            }
        }
        if (z10) {
            b10 = q02.j().c(iVar, this.f33552a);
        } else {
            b10 = q02.j().b(iVar, this.f33552a);
        }
        if (!b10 || q02.j().e() > m.f33597b) {
            return 0;
        }
        return i10;
    }

    private final boolean X0() {
        while (true) {
            b E0 = E0();
            if (E0 == null) {
                return false;
            }
            E0.o();
            boolean q10 = E0.q();
            LockSupport.unpark(E0);
            if (q10 && E0.v()) {
                return true;
            }
        }
    }

    private final int h0() {
        synchronized (this.f33554c) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & 2097151);
            int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
            if (i11 >= this.f33556e) {
                return 0;
            }
            if (i10 < this.f33557f && this.f33553b.availablePermits() != 0) {
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (i12 > 0 && this.f33554c[i12] == null) {
                    b bVar = new b(this, i12);
                    bVar.start();
                    if (i12 == ((int) (2097151 & f33545j.incrementAndGet(this)))) {
                        this.f33554c[i12] = bVar;
                        return i11 + 1;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    private final b q0() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof b)) {
            currentThread = null;
        }
        b bVar = (b) currentThread;
        if (bVar == null || !qe.k.a(bVar.l(), this)) {
            return null;
        }
        return bVar;
    }

    public static /* synthetic */ void s0(a aVar, Runnable runnable, j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = h.f33589b;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.r0(runnable, jVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z0() {
        return (int) (this.controlState & 2097151);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r9 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.a.f33546k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.a$b r0 = r8.q0()
            kotlinx.coroutines.scheduling.a$b[] r3 = r8.f33554c
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch: java.lang.Throwable -> La1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L5d
            r3 = 1
        L1d:
            kotlinx.coroutines.scheduling.a$b[] r4 = r8.f33554c
            r4 = r4[r3]
            if (r4 != 0) goto L26
            qe.k.o()
        L26:
            if (r4 == r0) goto L58
        L28:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L35
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L28
        L35:
            kotlinx.coroutines.scheduling.a$c r6 = r4.m()
            boolean r7 = we.i0.a()
            if (r7 == 0) goto L4f
            kotlinx.coroutines.scheduling.a$c r7 = kotlinx.coroutines.scheduling.a.c.TERMINATED
            if (r6 != r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L4f:
            kotlinx.coroutines.scheduling.o r4 = r4.j()
            kotlinx.coroutines.scheduling.e r6 = r8.f33552a
            r4.f(r6)
        L58:
            if (r3 == r5) goto L5d
            int r3 = r3 + 1
            goto L1d
        L5d:
            kotlinx.coroutines.scheduling.e r9 = r8.f33552a
            r9.b()
        L62:
            if (r0 == 0) goto L6b
            kotlinx.coroutines.scheduling.i r9 = r0.g()
            if (r9 == 0) goto L6b
            goto L73
        L6b:
            kotlinx.coroutines.scheduling.e r9 = r8.f33552a
            java.lang.Object r9 = r9.d()
            kotlinx.coroutines.scheduling.i r9 = (kotlinx.coroutines.scheduling.i) r9
        L73:
            if (r9 == 0) goto L79
            r8.Q0(r9)
            goto L62
        L79:
            if (r0 == 0) goto L80
            kotlinx.coroutines.scheduling.a$c r9 = kotlinx.coroutines.scheduling.a.c.TERMINATED
            r0.w(r9)
        L80:
            boolean r9 = we.i0.a()
            if (r9 == 0) goto L9a
            java.util.concurrent.Semaphore r9 = r8.f33553b
            int r9 = r9.availablePermits()
            int r10 = r8.f33556e
            if (r9 != r10) goto L91
            r1 = 1
        L91:
            if (r1 == 0) goto L94
            goto L9a
        L94:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L9a:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        La1:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.T0(long):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        T0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        qe.k.g(runnable, "command");
        s0(this, runnable, null, false, 6, null);
    }

    public final i m0(Runnable runnable, j jVar) {
        qe.k.g(runnable, "block");
        qe.k.g(jVar, "taskContext");
        long a10 = m.f33601f.a();
        if (runnable instanceof i) {
            i iVar = (i) runnable;
            iVar.f33590a = a10;
            iVar.f33591b = jVar;
            return iVar;
        }
        return new k(runnable, a10, jVar);
    }

    public final void r0(Runnable runnable, j jVar, boolean z10) {
        qe.k.g(runnable, "block");
        qe.k.g(jVar, "taskContext");
        f2 a10 = g2.a();
        if (a10 != null) {
            a10.e();
        }
        i m02 = m0(runnable, jVar);
        int U0 = U0(m02, z10);
        if (U0 != -1) {
            if (U0 != 1) {
                N0();
            } else if (this.f33552a.a(m02)) {
                N0();
            } else {
                throw new RejectedExecutionException(this.f33559h + " was terminated");
            }
        }
    }

    public String toString() {
        b[] bVarArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (b bVar : this.f33554c) {
            if (bVar != null) {
                int i15 = bVar.j().i();
                int i16 = kotlinx.coroutines.scheduling.b.f33574a[bVar.m().ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    arrayList.add(String.valueOf(i15) + "b");
                } else if (i16 == 3) {
                    i10++;
                    arrayList.add(String.valueOf(i15) + l6.c.f33710i);
                } else if (i16 == 4) {
                    i13++;
                    if (i15 > 0) {
                        arrayList.add(String.valueOf(i15) + "r");
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f33559h + '@' + j0.b(this) + "[Pool Size {core = " + this.f33556e + ", max = " + this.f33557f + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", retired = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global queue size = " + this.f33552a.c() + ", Control State Workers {created = " + ((int) (2097151 & j10)) + ", blocking = " + ((int) ((j10 & 4398044413952L) >> 21)) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes3.dex */
    public final class b extends Thread {

        /* renamed from: h  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f33560h = AtomicIntegerFieldUpdater.newUpdater(b.class, "terminationState");

        /* renamed from: a  reason: collision with root package name */
        private final o f33561a;

        /* renamed from: b  reason: collision with root package name */
        private long f33562b;

        /* renamed from: c  reason: collision with root package name */
        private long f33563c;

        /* renamed from: d  reason: collision with root package name */
        private int f33564d;

        /* renamed from: e  reason: collision with root package name */
        private int f33565e;

        /* renamed from: f  reason: collision with root package name */
        private int f33566f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile c state;
        private volatile int terminationState;

        private b() {
            setDaemon(true);
            this.f33561a = new o();
            this.state = c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = a.f33551p;
            this.f33564d = a.f33550o;
            this.f33565e = a.this.f33555d.nextInt();
        }

        private final void a(l lVar) {
            if (lVar != l.NON_BLOCKING) {
                a.f33545j.addAndGet(a.this, -2097152L);
                c cVar = this.state;
                if (cVar != c.TERMINATED) {
                    if (i0.a()) {
                        if (!(cVar == c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = c.RETIRING;
                }
            }
        }

        private final void b(l lVar, long j10) {
            if (lVar == l.NON_BLOCKING) {
                if (a.this.f33553b.availablePermits() == 0) {
                    return;
                }
                long a10 = m.f33601f.a();
                long j11 = m.f33596a;
                if (a10 - j10 < j11 || a10 - this.f33563c < j11 * 5) {
                    return;
                }
                this.f33563c = a10;
                a.this.N0();
                return;
            }
            a.f33545j.addAndGet(a.this, 2097152L);
            if (w(c.BLOCKING)) {
                a.this.N0();
            }
        }

        private final boolean c() {
            i e10 = a.this.f33552a.e(l.PROBABLY_BLOCKING);
            if (e10 != null) {
                this.f33561a.b(e10, a.this.f33552a);
                return false;
            }
            return true;
        }

        private final void d() {
            w(c.PARKING);
            if (c()) {
                this.terminationState = 0;
                if (this.f33562b == 0) {
                    this.f33562b = System.nanoTime() + a.this.f33558g;
                }
                if (f(a.this.f33558g) && System.nanoTime() - this.f33562b >= 0) {
                    this.f33562b = 0L;
                    y();
                }
            }
        }

        private final void e() {
            int d10;
            int i10 = this.spins;
            if (i10 > a.f33548m) {
                if (this.f33564d < a.f33549n) {
                    d10 = se.f.d((this.f33564d * 3) >>> 1, a.f33549n);
                    this.f33564d = d10;
                }
                w(c.PARKING);
                f(this.f33564d);
                return;
            }
            this.spins = i10 + 1;
            if (i10 >= a.f33547l) {
                Thread.yield();
            }
        }

        private final boolean f(long j10) {
            a.this.H0(this);
            if (c()) {
                LockSupport.parkNanos(j10);
                return true;
            }
            return false;
        }

        private final i h() {
            i d10;
            i e10;
            boolean z10 = r(a.this.f33556e * 2) == 0;
            if (!z10 || (e10 = a.this.f33552a.e(l.NON_BLOCKING)) == null) {
                i h10 = this.f33561a.h();
                return h10 != null ? h10 : (z10 || (d10 = a.this.f33552a.d()) == null) ? x() : d10;
            }
            return e10;
        }

        private final void n(l lVar) {
            this.f33562b = 0L;
            this.f33566f = 0;
            if (this.state == c.PARKING) {
                if (i0.a()) {
                    if (!(lVar == l.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = c.BLOCKING;
                this.f33564d = a.f33550o;
            }
            this.spins = 0;
        }

        private final i x() {
            int z02 = a.this.z0();
            if (z02 < 2) {
                return null;
            }
            int i10 = this.f33566f;
            if (i10 == 0) {
                i10 = r(z02);
            }
            int i11 = i10 + 1;
            int i12 = i11 <= z02 ? i11 : 1;
            this.f33566f = i12;
            b bVar = a.this.f33554c[i12];
            if (bVar == null || bVar == this || !this.f33561a.k(bVar.f33561a, a.this.f33552a)) {
                return null;
            }
            return this.f33561a.h();
        }

        private final void y() {
            synchronized (a.this.f33554c) {
                if (a.this.isTerminated()) {
                    return;
                }
                if (a.this.z0() <= a.this.f33556e) {
                    return;
                }
                if (c()) {
                    if (f33560h.compareAndSet(this, 0, 1)) {
                        int i10 = this.indexInArray;
                        s(0);
                        a.this.K0(this, i10, 0);
                        int andDecrement = (int) (a.f33545j.getAndDecrement(a.this) & 2097151);
                        if (andDecrement != i10) {
                            b bVar = a.this.f33554c[andDecrement];
                            if (bVar == null) {
                                qe.k.o();
                            }
                            a.this.f33554c[i10] = bVar;
                            bVar.s(i10);
                            a.this.K0(bVar, andDecrement, i10);
                        }
                        a.this.f33554c[andDecrement] = null;
                        ee.u uVar = ee.u.f29813a;
                        this.state = c.TERMINATED;
                    }
                }
            }
        }

        public final i g() {
            if (u()) {
                return h();
            }
            i h10 = this.f33561a.h();
            return h10 != null ? h10 : a.this.f33552a.e(l.PROBABLY_BLOCKING);
        }

        public final int i() {
            return this.indexInArray;
        }

        public final o j() {
            return this.f33561a;
        }

        public final Object k() {
            return this.nextParkedWorker;
        }

        public final a l() {
            return a.this;
        }

        public final c m() {
            return this.state;
        }

        public final void o() {
            this.f33564d = a.f33550o;
            this.spins = 0;
        }

        public final boolean p() {
            return this.state == c.BLOCKING;
        }

        public final boolean q() {
            return this.state == c.PARKING;
        }

        public final int r(int i10) {
            int i11 = this.f33565e;
            int i12 = i11 ^ (i11 << 13);
            this.f33565e = i12;
            int i13 = i12 ^ (i12 >> 17);
            this.f33565e = i13;
            int i14 = i13 ^ (i13 << 5);
            this.f33565e = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10 = false;
            while (!a.this.isTerminated() && this.state != c.TERMINATED) {
                i g10 = g();
                if (g10 == null) {
                    if (this.state == c.CPU_ACQUIRED) {
                        e();
                    } else {
                        d();
                    }
                    z10 = true;
                } else {
                    l a10 = g10.a();
                    if (z10) {
                        n(a10);
                        z10 = false;
                    }
                    b(a10, g10.f33590a);
                    a.this.Q0(g10);
                    a(a10);
                }
            }
            w(c.TERMINATED);
        }

        public final void s(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f33559h);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void t(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean u() {
            c cVar = this.state;
            c cVar2 = c.CPU_ACQUIRED;
            if (cVar == cVar2) {
                return true;
            }
            if (a.this.f33553b.tryAcquire()) {
                this.state = cVar2;
                return true;
            }
            return false;
        }

        public final boolean v() {
            int i10 = this.terminationState;
            if (i10 == 1 || i10 == -1) {
                return false;
            }
            if (i10 == 0) {
                return f33560h.compareAndSet(this, 0, -1);
            }
            throw new IllegalStateException(("Invalid terminationState = " + i10).toString());
        }

        public final boolean w(c cVar) {
            qe.k.g(cVar, "newState");
            c cVar2 = this.state;
            boolean z10 = cVar2 == c.CPU_ACQUIRED;
            if (z10) {
                a.this.f33553b.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z10;
        }

        public b(a aVar, int i10) {
            this();
            s(i10);
        }
    }
}
