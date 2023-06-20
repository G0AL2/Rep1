package we;

import ie.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.j;
import we.i1;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public class p1 implements i1, o, x1 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38637a = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_state");
    private volatile Object _state;
    public volatile m parentHandle;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes3.dex */
    public static final class a extends o1<i1> {

        /* renamed from: e  reason: collision with root package name */
        private final p1 f38638e;

        /* renamed from: f  reason: collision with root package name */
        private final b f38639f;

        /* renamed from: g  reason: collision with root package name */
        private final n f38640g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f38641h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1 p1Var, b bVar, n nVar, Object obj) {
            super(nVar.f38624e);
            qe.k.g(p1Var, "parent");
            qe.k.g(bVar, "state");
            qe.k.g(nVar, "child");
            this.f38638e = p1Var;
            this.f38639f = bVar;
            this.f38640g = nVar;
            this.f38641h = obj;
        }

        @Override // pe.l
        public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
            y(th);
            return ee.u.f29813a;
        }

        @Override // kotlinx.coroutines.internal.j
        public String toString() {
            return "ChildCompletion[" + this.f38640g + ", " + this.f38641h + ']';
        }

        @Override // we.v
        public void y(Throwable th) {
            this.f38638e.s(this.f38639f, this.f38640g, this.f38641h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes3.dex */
    public static final class b implements d1 {
        private volatile Object _exceptionsHolder;

        /* renamed from: a  reason: collision with root package name */
        private final t1 f38642a;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public b(t1 t1Var, boolean z10, Throwable th) {
            qe.k.g(t1Var, "list");
            this.f38642a = t1Var;
            this.isCompleting = z10;
            this.rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        @Override // we.d1
        public boolean a() {
            return this.rootCause == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void b(Throwable th) {
            qe.k.g(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r02 = this._exceptionsHolder;
                if (r02 == 0) {
                    this._exceptionsHolder = th;
                } else if (r02 instanceof Throwable) {
                    if (th == r02) {
                        return;
                    }
                    ArrayList<Throwable> c10 = c();
                    c10.add(r02);
                    c10.add(th);
                    this._exceptionsHolder = c10;
                } else if (r02 instanceof ArrayList) {
                    ((ArrayList) r02).add(th);
                } else {
                    throw new IllegalStateException(("State is " + ((Object) r02)).toString());
                }
            }
        }

        @Override // we.d1
        public t1 d() {
            return this.f38642a;
        }

        public final boolean e() {
            return this.rootCause != null;
        }

        public final boolean f() {
            kotlinx.coroutines.internal.u uVar;
            Object obj = this._exceptionsHolder;
            uVar = q1.f38646a;
            return obj == uVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        public final List<Throwable> g(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.u uVar;
            ?? r02 = this._exceptionsHolder;
            if (r02 == 0) {
                arrayList = c();
            } else if (r02 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(r02);
                arrayList = c10;
            } else if (!(r02 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + ((Object) r02)).toString());
            } else {
                arrayList = (ArrayList) r02;
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!qe.k.a(th, th2))) {
                arrayList.add(th);
            }
            uVar = q1.f38646a;
            this._exceptionsHolder = uVar;
            return arrayList;
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + d() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes3.dex */
    public static final class c extends j.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p1 f38643d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f38644e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.j jVar, kotlinx.coroutines.internal.j jVar2, p1 p1Var, Object obj) {
            super(jVar2);
            this.f38643d = p1Var;
            this.f38644e = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: g */
        public Object d(kotlinx.coroutines.internal.j jVar) {
            qe.k.g(jVar, "affected");
            if (this.f38643d.G() == this.f38644e) {
                return null;
            }
            return kotlinx.coroutines.internal.i.a();
        }
    }

    public p1(boolean z10) {
        this._state = z10 ? q1.f38648c : q1.f38647b;
    }

    private final Throwable B(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.e()) {
                return u();
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final t1 F(d1 d1Var) {
        t1 d10 = d1Var.d();
        if (d10 != null) {
            return d10;
        }
        if (d1Var instanceof v0) {
            return new t1();
        }
        if (d1Var instanceof o1) {
            Z((o1) d1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + d1Var).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean M(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r7.G()
            boolean r3 = r2 instanceof we.p1.b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4a
            monitor-enter(r2)
            r3 = r2
            we.p1$b r3 = (we.p1.b) r3     // Catch: java.lang.Throwable -> L47
            boolean r3 = r3.f()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L18
            monitor-exit(r2)
            return r4
        L18:
            r3 = r2
            we.p1$b r3 = (we.p1.b) r3     // Catch: java.lang.Throwable -> L47
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L47
            if (r8 != 0) goto L23
            if (r3 != 0) goto L30
        L23:
            if (r1 == 0) goto L26
            goto L2a
        L26:
            java.lang.Throwable r1 = r7.t(r8)     // Catch: java.lang.Throwable -> L47
        L2a:
            r8 = r2
            we.p1$b r8 = (we.p1.b) r8     // Catch: java.lang.Throwable -> L47
            r8.b(r1)     // Catch: java.lang.Throwable -> L47
        L30:
            r8 = r2
            we.p1$b r8 = (we.p1.b) r8     // Catch: java.lang.Throwable -> L47
            java.lang.Throwable r8 = r8.rootCause     // Catch: java.lang.Throwable -> L47
            r1 = r3 ^ 1
            if (r1 == 0) goto L3a
            r0 = r8
        L3a:
            monitor-exit(r2)
            if (r0 == 0) goto L46
            we.p1$b r2 = (we.p1.b) r2
            we.t1 r8 = r2.d()
            r7.S(r8, r0)
        L46:
            return r5
        L47:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L4a:
            boolean r3 = r2 instanceof we.d1
            if (r3 == 0) goto La1
            if (r1 == 0) goto L51
            goto L55
        L51:
            java.lang.Throwable r1 = r7.t(r8)
        L55:
            r3 = r2
            we.d1 r3 = (we.d1) r3
            boolean r6 = r3.a()
            if (r6 == 0) goto L65
            boolean r2 = r7.j0(r3, r1)
            if (r2 == 0) goto L2
            return r5
        L65:
            we.r r3 = new we.r
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.k0(r2, r3, r4)
            if (r3 == 0) goto L86
            if (r3 == r5) goto L85
            if (r3 == r6) goto L85
            r2 = 3
            if (r3 != r2) goto L79
            goto L2
        L79:
            java.lang.String r8 = "unexpected result"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L85:
            return r5
        L86:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: we.p1.M(java.lang.Object):boolean");
    }

    private final o1<?> P(pe.l<? super Throwable, ee.u> lVar, boolean z10) {
        if (z10) {
            k1 k1Var = lVar instanceof k1 ? lVar : null;
            if (k1Var != null) {
                if (k1Var.f38630d == this) {
                    return k1Var;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return new g1(this, lVar);
        }
        o1<?> o1Var = lVar instanceof o1 ? lVar : null;
        if (o1Var != null) {
            if ((o1Var.f38630d != this || (o1Var instanceof k1)) ? false : false) {
                return o1Var;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return new h1(this, lVar);
    }

    private final n R(kotlinx.coroutines.internal.j jVar) {
        while (jVar.s()) {
            jVar = jVar.p();
        }
        while (true) {
            jVar = jVar.n();
            if (!jVar.s()) {
                if (jVar instanceof n) {
                    return (n) jVar;
                }
                if (jVar instanceof t1) {
                    return null;
                }
            }
        }
    }

    private final void S(t1 t1Var, Throwable th) {
        V(th);
        Object m10 = t1Var.m();
        if (m10 != null) {
            w wVar = null;
            for (kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) m10; !qe.k.a(jVar, t1Var); jVar = jVar.n()) {
                if (jVar instanceof k1) {
                    o1 o1Var = (o1) jVar;
                    try {
                        o1Var.y(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            ee.b.a(wVar, th2);
                        } else {
                            wVar = new w("Exception in completion handler " + o1Var + " for " + this, th2);
                            ee.u uVar = ee.u.f29813a;
                        }
                    }
                }
            }
            if (wVar != null) {
                I(wVar);
            }
            p(th);
            return;
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void U(t1 t1Var, Throwable th) {
        Object m10 = t1Var.m();
        if (m10 != null) {
            w wVar = null;
            for (kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) m10; !qe.k.a(jVar, t1Var); jVar = jVar.n()) {
                if (jVar instanceof o1) {
                    o1 o1Var = (o1) jVar;
                    try {
                        o1Var.y(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            ee.b.a(wVar, th2);
                        } else {
                            wVar = new w("Exception in completion handler " + o1Var + " for " + this, th2);
                            ee.u uVar = ee.u.f29813a;
                        }
                    }
                }
            }
            if (wVar != null) {
                I(wVar);
                return;
            }
            return;
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [we.c1] */
    private final void Y(v0 v0Var) {
        t1 t1Var = new t1();
        if (!v0Var.a()) {
            t1Var = new c1(t1Var);
        }
        f38637a.compareAndSet(this, v0Var, t1Var);
    }

    private final void Z(o1<?> o1Var) {
        o1Var.g(new t1());
        f38637a.compareAndSet(this, o1Var, o1Var.n());
    }

    private final int b0(Object obj) {
        v0 v0Var;
        if (obj instanceof v0) {
            if (((v0) obj).a()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38637a;
            v0Var = q1.f38648c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, v0Var)) {
                X();
                return 1;
            }
            return -1;
        } else if (obj instanceof c1) {
            if (f38637a.compareAndSet(this, obj, ((c1) obj).d())) {
                X();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final String c0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof d1 ? ((d1) obj).a() ? "Active" : "New" : obj instanceof r ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.isCompleting ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException f0(p1 p1Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return p1Var.e0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean h(Object obj, t1 t1Var, o1<?> o1Var) {
        int x10;
        c cVar = new c(o1Var, o1Var, this, obj);
        do {
            Object o10 = t1Var.o();
            if (o10 != null) {
                x10 = ((kotlinx.coroutines.internal.j) o10).x(o1Var, t1Var, cVar);
                if (x10 == 1) {
                    return true;
                }
            } else {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (x10 != 2);
        return false;
    }

    private final boolean h0(b bVar, Object obj, int i10) {
        boolean e10;
        Throwable B;
        boolean z10 = false;
        if (G() == bVar) {
            if (!bVar.f()) {
                if (bVar.isCompleting) {
                    r rVar = (r) (!(obj instanceof r) ? null : obj);
                    Throwable th = rVar != null ? rVar.f38650a : null;
                    synchronized (bVar) {
                        e10 = bVar.e();
                        List<Throwable> g10 = bVar.g(th);
                        B = B(bVar, g10);
                        if (B != null) {
                            j(B, g10);
                        }
                    }
                    if (B != null && B != th) {
                        obj = new r(B, false, 2, null);
                    }
                    if (B != null) {
                        if ((p(B) || H(B)) ? true : true) {
                            if (obj == null) {
                                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                            }
                            ((r) obj).b();
                        }
                    }
                    if (!e10) {
                        V(B);
                    }
                    W(obj);
                    if (f38637a.compareAndSet(this, bVar, q1.d(obj))) {
                        r(bVar, obj, i10);
                        return true;
                    }
                    throw new IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + bVar + ", update: " + obj).toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final boolean i0(d1 d1Var, Object obj, int i10) {
        if (i0.a()) {
            if (!((d1Var instanceof v0) || (d1Var instanceof o1))) {
                throw new AssertionError();
            }
        }
        if (!i0.a() || (!(obj instanceof r))) {
            if (f38637a.compareAndSet(this, d1Var, q1.d(obj))) {
                V(null);
                W(obj);
                r(d1Var, obj, i10);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final void j(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set a10 = kotlinx.coroutines.internal.d.a(list.size());
        Throwable k10 = kotlinx.coroutines.internal.t.k(th);
        for (Throwable th2 : list) {
            Throwable k11 = kotlinx.coroutines.internal.t.k(th2);
            if (k11 != th && k11 != k10 && !(k11 instanceof CancellationException) && a10.add(k11)) {
                ee.b.a(th, k11);
            }
        }
    }

    private final boolean j0(d1 d1Var, Throwable th) {
        if (!i0.a() || (!(d1Var instanceof b))) {
            if (!i0.a() || d1Var.a()) {
                t1 F = F(d1Var);
                if (F != null) {
                    if (f38637a.compareAndSet(this, d1Var, new b(F, false, th))) {
                        S(F, th);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final int k0(Object obj, Object obj2, int i10) {
        if (obj instanceof d1) {
            if ((!(obj instanceof v0) && !(obj instanceof o1)) || (obj instanceof n) || (obj2 instanceof r)) {
                return l0((d1) obj, obj2, i10);
            }
            return !i0((d1) obj, obj2, i10) ? 3 : 1;
        }
        return 0;
    }

    private final int l0(d1 d1Var, Object obj, int i10) {
        t1 F = F(d1Var);
        if (F != null) {
            b bVar = (b) (!(d1Var instanceof b) ? null : d1Var);
            if (bVar == null) {
                bVar = new b(F, false, null);
            }
            synchronized (bVar) {
                if (bVar.isCompleting) {
                    return 0;
                }
                bVar.isCompleting = true;
                if (bVar == d1Var || f38637a.compareAndSet(this, d1Var, bVar)) {
                    if (!bVar.f()) {
                        boolean e10 = bVar.e();
                        r rVar = (r) (!(obj instanceof r) ? null : obj);
                        if (rVar != null) {
                            bVar.b(rVar.f38650a);
                        }
                        Throwable th = e10 ^ true ? bVar.rootCause : null;
                        ee.u uVar = ee.u.f29813a;
                        if (th != null) {
                            S(F, th);
                        }
                        n v10 = v(d1Var);
                        if (v10 == null || !m0(bVar, v10, obj)) {
                            return h0(bVar, obj, i10) ? 1 : 3;
                        }
                        return 2;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return 3;
            }
        }
        return 3;
    }

    private final boolean m0(b bVar, n nVar, Object obj) {
        while (i1.a.d(nVar.f38624e, false, false, new a(this, bVar, nVar, obj), 1, null) == v1.f38663a) {
            nVar = R(nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean o(Object obj) {
        int k02;
        do {
            Object G = G();
            if (!(G instanceof d1) || (((G instanceof b) && ((b) G).isCompleting) || (k02 = k0(G, new r(t(obj), false, 2, null), 0)) == 0)) {
                return false;
            }
            if (k02 == 1 || k02 == 2) {
                return true;
            }
        } while (k02 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    private final boolean p(Throwable th) {
        if (L()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        m mVar = this.parentHandle;
        return (mVar == null || mVar == v1.f38663a) ? z10 : mVar.c(th) || z10;
    }

    private final void r(d1 d1Var, Object obj, int i10) {
        m mVar = this.parentHandle;
        if (mVar != null) {
            mVar.f();
            this.parentHandle = v1.f38663a;
        }
        r rVar = (r) (!(obj instanceof r) ? null : obj);
        Throwable th = rVar != null ? rVar.f38650a : null;
        if (d1Var instanceof o1) {
            try {
                ((o1) d1Var).y(th);
            } catch (Throwable th2) {
                I(new w("Exception in completion handler " + d1Var + " for " + this, th2));
            }
        } else {
            t1 d10 = d1Var.d();
            if (d10 != null) {
                U(d10, th);
            }
        }
        k(obj, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(b bVar, n nVar, Object obj) {
        if (G() == bVar) {
            n R = R(nVar);
            if (R == null || !m0(bVar, R, obj)) {
                h0(bVar, obj, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final Throwable t(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : u();
        } else if (obj != null) {
            return ((x1) obj).y();
        } else {
            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final j1 u() {
        return new j1("Job was cancelled", null, this);
    }

    private final n v(d1 d1Var) {
        n nVar = (n) (!(d1Var instanceof n) ? null : d1Var);
        if (nVar != null) {
            return nVar;
        }
        t1 d10 = d1Var.d();
        if (d10 != null) {
            return R(d10);
        }
        return null;
    }

    private final Throwable x(Object obj) {
        if (!(obj instanceof r)) {
            obj = null;
        }
        r rVar = (r) obj;
        if (rVar != null) {
            return rVar.f38650a;
        }
        return null;
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return false;
    }

    public final Object G() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.p)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.p) obj).a(this);
        }
    }

    protected boolean H(Throwable th) {
        qe.k.g(th, "exception");
        return false;
    }

    public void I(Throwable th) {
        qe.k.g(th, "exception");
        throw th;
    }

    public final void J(i1 i1Var) {
        if (i0.a()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (i1Var == null) {
            this.parentHandle = v1.f38663a;
            return;
        }
        i1Var.start();
        m d02 = i1Var.d0(this);
        this.parentHandle = d02;
        if (K()) {
            d02.f();
            this.parentHandle = v1.f38663a;
        }
    }

    public final boolean K() {
        return !(G() instanceof d1);
    }

    protected boolean L() {
        return false;
    }

    public final boolean N(Object obj, int i10) {
        int k02;
        do {
            k02 = k0(G(), obj, i10);
            if (k02 == 0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, x(obj));
            } else if (k02 == 1) {
                return true;
            } else {
                if (k02 == 2) {
                    return false;
                }
            }
        } while (k02 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    public String Q() {
        return j0.a(this);
    }

    @Override // we.o
    public final void T(x1 x1Var) {
        qe.k.g(x1Var, "parentJob");
        m(x1Var);
    }

    protected void V(Throwable th) {
    }

    protected void W(Object obj) {
    }

    public void X() {
    }

    @Override // we.i1
    public boolean a() {
        Object G = G();
        return (G instanceof d1) && ((d1) G).a();
    }

    public final void a0(o1<?> o1Var) {
        Object G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v0 v0Var;
        qe.k.g(o1Var, "node");
        do {
            G = G();
            if (!(G instanceof o1)) {
                if (!(G instanceof d1) || ((d1) G).d() == null) {
                    return;
                }
                o1Var.u();
                return;
            } else if (G != o1Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f38637a;
                v0Var = q1.f38648c;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, G, v0Var));
    }

    @Override // we.i1
    public final t0 d(boolean z10, boolean z11, pe.l<? super Throwable, ee.u> lVar) {
        Throwable th;
        qe.k.g(lVar, "handler");
        o1<?> o1Var = null;
        while (true) {
            Object G = G();
            if (G instanceof v0) {
                v0 v0Var = (v0) G;
                if (v0Var.a()) {
                    if (o1Var == null) {
                        o1Var = P(lVar, z10);
                    }
                    if (f38637a.compareAndSet(this, G, o1Var)) {
                        return o1Var;
                    }
                } else {
                    Y(v0Var);
                }
            } else if (G instanceof d1) {
                t1 d10 = ((d1) G).d();
                if (d10 != null) {
                    t0 t0Var = v1.f38663a;
                    if (z10 && (G instanceof b)) {
                        synchronized (G) {
                            th = ((b) G).rootCause;
                            if (th == null || ((lVar instanceof n) && !((b) G).isCompleting)) {
                                if (o1Var == null) {
                                    o1Var = P(lVar, z10);
                                }
                                if (h(G, d10, o1Var)) {
                                    if (th == null) {
                                        return o1Var;
                                    }
                                    t0Var = o1Var;
                                }
                            }
                            ee.u uVar = ee.u.f29813a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            lVar.b(th);
                        }
                        return t0Var;
                    }
                    if (o1Var == null) {
                        o1Var = P(lVar, z10);
                    }
                    if (h(G, d10, o1Var)) {
                        return o1Var;
                    }
                } else if (G == null) {
                    throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                } else {
                    Z((o1) G);
                }
            } else {
                if (z11) {
                    if (!(G instanceof r)) {
                        G = null;
                    }
                    r rVar = (r) G;
                    lVar.b(rVar != null ? rVar.f38650a : null);
                }
                return v1.f38663a;
            }
        }
    }

    @Override // we.i1
    public final m d0(o oVar) {
        qe.k.g(oVar, "child");
        t0 d10 = i1.a.d(this, true, false, new n(this, oVar), 2, null);
        if (d10 != null) {
            return (m) d10;
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    protected final CancellationException e0(Throwable th, String str) {
        qe.k.g(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = j0.a(th) + " was cancelled";
            }
            cancellationException = new j1(str, th, this);
        }
        return cancellationException;
    }

    @Override // ie.g
    public <R> R fold(R r10, pe.p<? super R, ? super g.b, ? extends R> pVar) {
        qe.k.g(pVar, "operation");
        return (R) i1.a.b(this, r10, pVar);
    }

    public final String g0() {
        return Q() + '{' + c0(G()) + '}';
    }

    @Override // ie.g.b, ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        qe.k.g(cVar, "key");
        return (E) i1.a.c(this, cVar);
    }

    @Override // ie.g.b
    public final g.c<?> getKey() {
        return i1.f38615f0;
    }

    protected void k(Object obj, int i10) {
    }

    @Override // we.i1
    public final CancellationException l() {
        Object G = G();
        if (G instanceof b) {
            Throwable th = ((b) G).rootCause;
            if (th != null) {
                CancellationException e02 = e0(th, j0.a(this) + " is cancelling");
                if (e02 != null) {
                    return e02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(G instanceof d1)) {
            if (G instanceof r) {
                return f0(this, ((r) G).f38650a, null, 1, null);
            }
            return new j1(j0.a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean m(Object obj) {
        if (E() && o(obj)) {
            return true;
        }
        return M(obj);
    }

    @Override // ie.g
    public ie.g minusKey(g.c<?> cVar) {
        qe.k.g(cVar, "key");
        return i1.a.e(this, cVar);
    }

    public boolean n(Throwable th) {
        return m(th) && D();
    }

    @Override // ie.g
    public ie.g plus(ie.g gVar) {
        qe.k.g(gVar, "context");
        return i1.a.f(this, gVar);
    }

    public boolean q(Throwable th) {
        qe.k.g(th, "cause");
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && D();
    }

    @Override // we.i1
    public final boolean start() {
        int b02;
        do {
            b02 = b0(G());
            if (b02 == 0) {
                return false;
            }
        } while (b02 != 1);
        return true;
    }

    public String toString() {
        return g0() + '@' + j0.b(this);
    }

    @Override // we.x1
    public CancellationException y() {
        Throwable th;
        Object G = G();
        if (G instanceof b) {
            th = ((b) G).rootCause;
        } else if (G instanceof r) {
            th = ((r) G).f38650a;
        } else if (G instanceof d1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + G).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new j1("Parent job is " + c0(G), th, this);
    }

    @Override // we.i1
    public void z(CancellationException cancellationException) {
        n(cancellationException);
    }
}
