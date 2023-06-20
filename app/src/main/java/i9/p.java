package i9;

import i9.u;
import j8.j3;
import j8.x1;

/* compiled from: MaskingMediaSource.java */
/* loaded from: classes2.dex */
public final class p extends f<Void> {

    /* renamed from: k  reason: collision with root package name */
    private final u f31756k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f31757l;

    /* renamed from: m  reason: collision with root package name */
    private final j3.c f31758m;

    /* renamed from: n  reason: collision with root package name */
    private final j3.b f31759n;

    /* renamed from: o  reason: collision with root package name */
    private a f31760o;

    /* renamed from: p  reason: collision with root package name */
    private o f31761p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f31762q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f31763r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f31764s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: e  reason: collision with root package name */
        public static final Object f31765e = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final Object f31766c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f31767d;

        private a(j3 j3Var, Object obj, Object obj2) {
            super(j3Var);
            this.f31766c = obj;
            this.f31767d = obj2;
        }

        public static a u(x1 x1Var) {
            return new a(new b(x1Var), j3.c.f32515r, f31765e);
        }

        public static a v(j3 j3Var, Object obj, Object obj2) {
            return new a(j3Var, obj, obj2);
        }

        @Override // i9.l, j8.j3
        public int b(Object obj) {
            Object obj2;
            j3 j3Var = this.f31696b;
            if (f31765e.equals(obj) && (obj2 = this.f31767d) != null) {
                obj = obj2;
            }
            return j3Var.b(obj);
        }

        @Override // i9.l, j8.j3
        public j3.b g(int i10, j3.b bVar, boolean z10) {
            this.f31696b.g(i10, bVar, z10);
            if (ea.n0.c(bVar.f32509b, this.f31767d) && z10) {
                bVar.f32509b = f31765e;
            }
            return bVar;
        }

        @Override // i9.l, j8.j3
        public Object m(int i10) {
            Object m10 = this.f31696b.m(i10);
            return ea.n0.c(m10, this.f31767d) ? f31765e : m10;
        }

        @Override // i9.l, j8.j3
        public j3.c o(int i10, j3.c cVar, long j10) {
            this.f31696b.o(i10, cVar, j10);
            if (ea.n0.c(cVar.f32519a, this.f31766c)) {
                cVar.f32519a = j3.c.f32515r;
            }
            return cVar;
        }

        public a t(j3 j3Var) {
            return new a(j3Var, this.f31766c, this.f31767d);
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends j3 {

        /* renamed from: b  reason: collision with root package name */
        private final x1 f31768b;

        public b(x1 x1Var) {
            this.f31768b = x1Var;
        }

        @Override // j8.j3
        public int b(Object obj) {
            return obj == a.f31765e ? 0 : -1;
        }

        @Override // j8.j3
        public j3.b g(int i10, j3.b bVar, boolean z10) {
            bVar.v(z10 ? 0 : null, z10 ? a.f31765e : null, 0, -9223372036854775807L, 0L, j9.c.f32908g, true);
            return bVar;
        }

        @Override // j8.j3
        public int i() {
            return 1;
        }

        @Override // j8.j3
        public Object m(int i10) {
            return a.f31765e;
        }

        @Override // j8.j3
        public j3.c o(int i10, j3.c cVar, long j10) {
            cVar.i(j3.c.f32515r, this.f31768b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f32530l = true;
            return cVar;
        }

        @Override // j8.j3
        public int p() {
            return 1;
        }
    }

    public p(u uVar, boolean z10) {
        this.f31756k = uVar;
        this.f31757l = z10 && uVar.q();
        this.f31758m = new j3.c();
        this.f31759n = new j3.b();
        j3 r10 = uVar.r();
        if (r10 != null) {
            this.f31760o = a.v(r10, null, null);
            this.f31764s = true;
            return;
        }
        this.f31760o = a.u(uVar.d());
    }

    private Object N(Object obj) {
        return (this.f31760o.f31767d == null || !this.f31760o.f31767d.equals(obj)) ? obj : a.f31765e;
    }

    private Object O(Object obj) {
        return (this.f31760o.f31767d == null || !obj.equals(a.f31765e)) ? obj : this.f31760o.f31767d;
    }

    private void S(long j10) {
        o oVar = this.f31761p;
        int b10 = this.f31760o.b(oVar.f31747a.f31793a);
        if (b10 == -1) {
            return;
        }
        long j11 = this.f31760o.f(b10, this.f31759n).f32511d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.v(j10);
    }

    @Override // i9.f, i9.a
    public void C(da.m0 m0Var) {
        super.C(m0Var);
        if (this.f31757l) {
            return;
        }
        this.f31762q = true;
        L(null, this.f31756k);
    }

    @Override // i9.f, i9.a
    public void E() {
        this.f31763r = false;
        this.f31762q = false;
        super.E();
    }

    @Override // i9.u
    /* renamed from: M */
    public o f(u.b bVar, da.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.x(this.f31756k);
        if (this.f31763r) {
            oVar.a(bVar.c(O(bVar.f31793a)));
        } else {
            this.f31761p = oVar;
            if (!this.f31762q) {
                this.f31762q = true;
                L(null, this.f31756k);
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.f
    /* renamed from: P */
    public u.b G(Void r12, u.b bVar) {
        return bVar.c(N(bVar.f31793a));
    }

    public j3 Q() {
        return this.f31760o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // i9.f
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(java.lang.Void r13, i9.u r14, j8.j3 r15) {
        /*
            r12 = this;
            boolean r13 = r12.f31763r
            if (r13 == 0) goto L19
            i9.p$a r13 = r12.f31760o
            i9.p$a r13 = r13.t(r15)
            r12.f31760o = r13
            i9.o r13 = r12.f31761p
            if (r13 == 0) goto Lae
            long r13 = r13.j()
            r12.S(r13)
            goto Lae
        L19:
            boolean r13 = r15.q()
            if (r13 == 0) goto L36
            boolean r13 = r12.f31764s
            if (r13 == 0) goto L2a
            i9.p$a r13 = r12.f31760o
            i9.p$a r13 = r13.t(r15)
            goto L32
        L2a:
            java.lang.Object r13 = j8.j3.c.f32515r
            java.lang.Object r14 = i9.p.a.f31765e
            i9.p$a r13 = i9.p.a.v(r15, r13, r14)
        L32:
            r12.f31760o = r13
            goto Lae
        L36:
            j8.j3$c r13 = r12.f31758m
            r14 = 0
            r15.n(r14, r13)
            j8.j3$c r13 = r12.f31758m
            long r0 = r13.e()
            j8.j3$c r13 = r12.f31758m
            java.lang.Object r13 = r13.f32519a
            i9.o r2 = r12.f31761p
            if (r2 == 0) goto L74
            long r2 = r2.o()
            i9.p$a r4 = r12.f31760o
            i9.o r5 = r12.f31761p
            i9.u$b r5 = r5.f31747a
            java.lang.Object r5 = r5.f31793a
            j8.j3$b r6 = r12.f31759n
            r4.h(r5, r6)
            j8.j3$b r4 = r12.f31759n
            long r4 = r4.p()
            long r4 = r4 + r2
            i9.p$a r2 = r12.f31760o
            j8.j3$c r3 = r12.f31758m
            j8.j3$c r14 = r2.n(r14, r3)
            long r2 = r14.e()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            j8.j3$c r7 = r12.f31758m
            j8.j3$b r8 = r12.f31759n
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f31764s
            if (r14 == 0) goto L94
            i9.p$a r13 = r12.f31760o
            i9.p$a r13 = r13.t(r15)
            goto L98
        L94:
            i9.p$a r13 = i9.p.a.v(r15, r13, r0)
        L98:
            r12.f31760o = r13
            i9.o r13 = r12.f31761p
            if (r13 == 0) goto Lae
            r12.S(r1)
            i9.u$b r13 = r13.f31747a
            java.lang.Object r14 = r13.f31793a
            java.lang.Object r14 = r12.O(r14)
            i9.u$b r13 = r13.c(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f31764s = r14
            r12.f31763r = r14
            i9.p$a r14 = r12.f31760o
            r12.D(r14)
            if (r13 == 0) goto Lc6
            i9.o r14 = r12.f31761p
            java.lang.Object r14 = ea.a.e(r14)
            i9.o r14 = (i9.o) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.p.K(java.lang.Void, i9.u, j8.j3):void");
    }

    @Override // i9.u
    public x1 d() {
        return this.f31756k.d();
    }

    @Override // i9.u
    public void i(r rVar) {
        ((o) rVar).w();
        if (rVar == this.f31761p) {
            this.f31761p = null;
        }
    }

    @Override // i9.f, i9.u
    public void p() {
    }
}
