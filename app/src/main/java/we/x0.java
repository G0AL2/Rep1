package we;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public abstract class x0 extends y0 implements m0 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38667d = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38668e = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed");
    private volatile boolean isCompleted;
    private volatile Object _queue = null;
    private volatile Object _delayed = null;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes3.dex */
    private final class a extends b {

        /* renamed from: d  reason: collision with root package name */
        private final h<ee.u> f38669d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x0 f38670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0 x0Var, long j10, h<? super ee.u> hVar) {
            super(j10);
            qe.k.g(hVar, "cont");
            this.f38670e = x0Var;
            this.f38669d = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38669d.f(this.f38670e, ee.u.f29813a);
        }

        @Override // we.x0.b
        public String toString() {
            return super.toString() + this.f38669d.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes3.dex */
    public static abstract class b implements Runnable, Comparable<b>, t0, kotlinx.coroutines.internal.a0 {

        /* renamed from: a  reason: collision with root package name */
        private Object f38671a;

        /* renamed from: b  reason: collision with root package name */
        private int f38672b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f38673c;

        public b(long j10) {
            this.f38673c = j10;
        }

        @Override // kotlinx.coroutines.internal.a0
        public void a(kotlinx.coroutines.internal.z<?> zVar) {
            kotlinx.coroutines.internal.u uVar;
            Object obj = this.f38671a;
            uVar = a1.f38587a;
            if (obj != uVar) {
                this.f38671a = zVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(b bVar) {
            qe.k.g(bVar, InneractiveMediationNameConsts.OTHER);
            int i10 = ((this.f38673c - bVar.f38673c) > 0L ? 1 : ((this.f38673c - bVar.f38673c) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final synchronized int d(long j10, c cVar, x0 x0Var) {
            kotlinx.coroutines.internal.u uVar;
            qe.k.g(cVar, "delayed");
            qe.k.g(x0Var, "eventLoop");
            Object obj = this.f38671a;
            uVar = a1.f38587a;
            if (obj == uVar) {
                return 2;
            }
            synchronized (cVar) {
                b b10 = cVar.b();
                if (x0Var.isCompleted) {
                    return 1;
                }
                if (b10 == null) {
                    cVar.f38674b = j10;
                } else {
                    long j11 = b10.f38673c;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - cVar.f38674b > 0) {
                        cVar.f38674b = j10;
                    }
                }
                long j12 = this.f38673c;
                long j13 = cVar.f38674b;
                if (j12 - j13 < 0) {
                    this.f38673c = j13;
                }
                cVar.a(this);
                return 0;
            }
        }

        public final boolean e(long j10) {
            return j10 - this.f38673c >= 0;
        }

        @Override // we.t0
        public final synchronized void f() {
            kotlinx.coroutines.internal.u uVar;
            kotlinx.coroutines.internal.u uVar2;
            Object obj = this.f38671a;
            uVar = a1.f38587a;
            if (obj == uVar) {
                return;
            }
            if (!(obj instanceof c)) {
                obj = null;
            }
            c cVar = (c) obj;
            if (cVar != null) {
                cVar.g(this);
            }
            uVar2 = a1.f38587a;
            this.f38671a = uVar2;
        }

        @Override // kotlinx.coroutines.internal.a0
        public kotlinx.coroutines.internal.z<?> g() {
            Object obj = this.f38671a;
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                obj = null;
            }
            return (kotlinx.coroutines.internal.z) obj;
        }

        @Override // kotlinx.coroutines.internal.a0
        public void h(int i10) {
            this.f38672b = i10;
        }

        @Override // kotlinx.coroutines.internal.a0
        public int i() {
            return this.f38672b;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f38673c + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlinx.coroutines.internal.z<b> {

        /* renamed from: b  reason: collision with root package name */
        public long f38674b;

        public c(long j10) {
            this.f38674b = j10;
        }
    }

    private final void X0() {
        kotlinx.coroutines.internal.u uVar;
        kotlinx.coroutines.internal.u uVar2;
        if (i0.a() && !this.isCompleted) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38667d;
                uVar = a1.f38588b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                uVar2 = a1.f38588b;
                if (obj == uVar2) {
                    return;
                }
                kotlinx.coroutines.internal.l lVar = new kotlinx.coroutines.internal.l(8, true);
                lVar.d((Runnable) obj);
                if (f38667d.compareAndSet(this, obj, lVar)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.l) obj).g();
                return;
            }
        }
    }

    private final Runnable Y0() {
        kotlinx.coroutines.internal.u uVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                uVar = a1.f38588b;
                if (obj == uVar) {
                    return null;
                }
                if (f38667d.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) obj;
                Object m10 = lVar.m();
                if (m10 != kotlinx.coroutines.internal.l.f33518g) {
                    return (Runnable) m10;
                }
                f38667d.compareAndSet(this, obj, lVar.l());
            }
        }
    }

    private final boolean b1(Runnable runnable) {
        kotlinx.coroutines.internal.u uVar;
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f38667d.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                uVar = a1.f38588b;
                if (obj == uVar) {
                    return false;
                }
                kotlinx.coroutines.internal.l lVar = new kotlinx.coroutines.internal.l(8, true);
                lVar.d((Runnable) obj);
                lVar.d(runnable);
                if (f38667d.compareAndSet(this, obj, lVar)) {
                    return true;
                }
            } else {
                kotlinx.coroutines.internal.l lVar2 = (kotlinx.coroutines.internal.l) obj;
                int d10 = lVar2.d(runnable);
                if (d10 == 0) {
                    return true;
                }
                if (d10 == 1) {
                    f38667d.compareAndSet(this, obj, lVar2.l());
                } else if (d10 == 2) {
                    return false;
                }
            }
        }
    }

    private final void i1() {
        b i10;
        f2 a10 = g2.a();
        long nanoTime = a10 != null ? a10.nanoTime() : System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (i10 = cVar.i()) == null) {
                return;
            }
            Q0(nanoTime, i10);
        }
    }

    private final int l1(long j10, b bVar) {
        if (this.isCompleted) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            f38668e.compareAndSet(this, null, new c(j10));
            Object obj = this._delayed;
            if (obj == null) {
                qe.k.o();
            }
            cVar = (c) obj;
        }
        return bVar.d(j10, cVar, this);
    }

    private final boolean m1(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? cVar.e() : null) == bVar;
    }

    public final void Z0(Runnable runnable) {
        qe.k.g(runnable, "task");
        if (b1(runnable)) {
            T0();
        } else {
            k0.f38620g.Z0(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c1() {
        kotlinx.coroutines.internal.u uVar;
        if (H0()) {
            c cVar = (c) this._delayed;
            if (cVar == null || cVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.l) {
                        return ((kotlinx.coroutines.internal.l) obj).j();
                    }
                    uVar = a1.f38588b;
                    if (obj != uVar) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d1() {
        /*
            r7 = this;
            boolean r0 = r7.K0()
            if (r0 == 0) goto Lb
            long r0 = r7.s0()
            return r0
        Lb:
            java.lang.Object r0 = r7._delayed
            we.x0$c r0 = (we.x0.c) r0
            if (r0 == 0) goto L4f
            boolean r1 = r0.d()
            if (r1 != 0) goto L4f
            we.f2 r1 = we.g2.a()
            if (r1 == 0) goto L22
            long r1 = r1.nanoTime()
            goto L26
        L22:
            long r1 = java.lang.System.nanoTime()
        L26:
            monitor-enter(r0)
            kotlinx.coroutines.internal.a0 r3 = r0.b()     // Catch: java.lang.Throwable -> L4c
            r4 = 0
            if (r3 == 0) goto L46
            we.x0$b r3 = (we.x0.b) r3     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r3.e(r1)     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            if (r5 == 0) goto L3c
            boolean r3 = r7.b1(r3)     // Catch: java.lang.Throwable -> L4c
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L44
            kotlinx.coroutines.internal.a0 r3 = r0.h(r6)     // Catch: java.lang.Throwable -> L4c
            r4 = r3
        L44:
            monitor-exit(r0)
            goto L47
        L46:
            monitor-exit(r0)
        L47:
            we.x0$b r4 = (we.x0.b) r4
            if (r4 == 0) goto L4f
            goto L26
        L4c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4f:
            java.lang.Runnable r0 = r7.Y0()
            if (r0 == 0) goto L58
            r0.run()
        L58:
            long r0 = r7.s0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: we.x0.d1():long");
    }

    @Override // we.m0
    public void e(long j10, h<? super ee.u> hVar) {
        qe.k.g(hVar, "continuation");
        long c10 = a1.c(j10);
        if (c10 < 4611686018427387903L) {
            f2 a10 = g2.a();
            long nanoTime = a10 != null ? a10.nanoTime() : System.nanoTime();
            a aVar = new a(this, c10 + nanoTime, hVar);
            j.a(hVar, aVar);
            k1(nanoTime, aVar);
        }
    }

    @Override // we.z
    public final void g0(ie.g gVar, Runnable runnable) {
        qe.k.g(gVar, "context");
        qe.k.g(runnable, "block");
        Z0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void k1(long j10, b bVar) {
        qe.k.g(bVar, "delayedTask");
        int l12 = l1(j10, bVar);
        if (l12 == 0) {
            if (m1(bVar)) {
                T0();
            }
        } else if (l12 == 1) {
            Q0(j10, bVar);
        } else if (l12 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // we.w0
    public long s0() {
        b e10;
        long c10;
        kotlinx.coroutines.internal.u uVar;
        if (super.s0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                uVar = a1.f38588b;
                return obj == uVar ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.l) obj).j()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (e10 = cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f38673c;
        f2 a10 = g2.a();
        c10 = se.f.c(j10 - (a10 != null ? a10.nanoTime() : System.nanoTime()), 0L);
        return c10;
    }

    @Override // we.w0
    protected void shutdown() {
        e2.f38598b.b();
        this.isCompleted = true;
        X0();
        do {
        } while (d1() <= 0);
        i1();
    }
}
