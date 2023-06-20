package com.facebook.react.uimanager;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: ReactShadowNodeImpl.java */
/* loaded from: classes.dex */
public class e0 implements d0<e0> {

    /* renamed from: x  reason: collision with root package name */
    private static final com.facebook.yoga.c f15759x = g0.a();

    /* renamed from: a  reason: collision with root package name */
    private int f15760a;

    /* renamed from: b  reason: collision with root package name */
    private String f15761b;

    /* renamed from: c  reason: collision with root package name */
    private int f15762c;

    /* renamed from: d  reason: collision with root package name */
    private n0 f15763d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15764e;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<e0> f15766g;

    /* renamed from: h  reason: collision with root package name */
    private e0 f15767h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f15768i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15769j;

    /* renamed from: l  reason: collision with root package name */
    private e0 f15771l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<e0> f15772m;

    /* renamed from: n  reason: collision with root package name */
    private int f15773n;

    /* renamed from: o  reason: collision with root package name */
    private int f15774o;

    /* renamed from: p  reason: collision with root package name */
    private int f15775p;

    /* renamed from: q  reason: collision with root package name */
    private int f15776q;

    /* renamed from: s  reason: collision with root package name */
    private final float[] f15778s;

    /* renamed from: u  reason: collision with root package name */
    private com.facebook.yoga.p f15780u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f15781v;

    /* renamed from: w  reason: collision with root package name */
    private Integer f15782w;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15765f = true;

    /* renamed from: k  reason: collision with root package name */
    private int f15770k = 0;

    /* renamed from: t  reason: collision with root package name */
    private final boolean[] f15779t = new boolean[9];

    /* renamed from: r  reason: collision with root package name */
    private final l0 f15777r = new l0(0.0f);

    public e0() {
        float[] fArr = new float[9];
        this.f15778s = fArr;
        if (!R()) {
            com.facebook.yoga.p b10 = g1.a().b();
            b10 = b10 == null ? com.facebook.yoga.q.a(f15759x) : b10;
            this.f15780u = b10;
            b10.z(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.f15780u = null;
    }

    private int m0() {
        m V = V();
        if (V == m.NONE) {
            return this.f15770k;
        }
        if (V == m.LEAF) {
            return 1 + this.f15770k;
        }
        return 1;
    }

    private void n1(int i10) {
        if (V() != m.PARENT) {
            for (e0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f15770k += i10;
                if (parent.V() == m.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o1() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.f15778s
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f15780u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.a(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f15777r
            float r3 = r3.b(r0)
            r1.a0(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.f15778s
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f15778s
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f15778s
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f15780u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.a(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f15777r
            float r3 = r3.b(r0)
            r1.a0(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.f15778s
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f15778s
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f15778s
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f15780u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.a(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f15777r
            float r3 = r3.b(r0)
            r1.a0(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.f15779t
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.p r1 = r4.f15780u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.a(r0)
            float[] r3 = r4.f15778s
            r3 = r3[r0]
            r1.b0(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.p r1 = r4.f15780u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.a(r0)
            float[] r3 = r4.f15778s
            r3 = r3[r0]
            r1.a0(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.e0.o1():void");
    }

    @Override // com.facebook.react.uimanager.d0
    public void A(int i10) {
        this.f15760a = i10;
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: A0 */
    public e0 J(int i10) {
        ArrayList<e0> arrayList = this.f15766g;
        if (arrayList != null) {
            e0 remove = arrayList.remove(i10);
            remove.f15767h = null;
            if (this.f15780u != null && !v0()) {
                this.f15780u.r(i10);
            }
            x0();
            int m02 = remove.m0();
            this.f15770k -= m02;
            n1(-m02);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.d0
    public final float B() {
        return this.f15780u.k();
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: B0 */
    public final e0 D(int i10) {
        f6.a.c(this.f15772m);
        e0 remove = this.f15772m.remove(i10);
        remove.f15771l = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.d0
    public int C() {
        return this.f15773n;
    }

    public void C0(com.facebook.yoga.a aVar) {
        this.f15780u.t(aVar);
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f15780u.u(aVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public final float E() {
        return this.f15780u.j();
    }

    public void E0(com.facebook.yoga.a aVar) {
        this.f15780u.v(aVar);
    }

    public void F0(com.facebook.yoga.b bVar) {
        this.f15780u.x(bVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public final void G(boolean z10) {
        f6.a.b(getParent() == null, "Must remove from no opt parent first");
        f6.a.b(this.f15771l == null, "Must remove from native parent first");
        f6.a.b(p() == 0, "Must remove all native children first");
        this.f15769j = z10;
    }

    public void G0(int i10, float f10) {
        this.f15780u.y(com.facebook.yoga.j.a(i10), f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final void H(f0 f0Var) {
        b1.f(this, f0Var);
        y0();
    }

    public void H0(int i10, float f10) {
        this.f15777r.d(i10, f10);
        o1();
    }

    @Override // com.facebook.react.uimanager.d0
    public int I() {
        return this.f15776q;
    }

    public void I0(com.facebook.yoga.i iVar) {
        this.f15780u.B(iVar);
    }

    public void J0(float f10) {
        this.f15780u.D(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void K() {
        if (!R()) {
            this.f15780u.c();
        } else if (getParent() != null) {
            getParent().K();
        }
    }

    public void K0() {
        this.f15780u.E();
    }

    @Override // com.facebook.react.uimanager.d0
    public final void L(String str) {
        this.f15761b = str;
    }

    public void L0(float f10) {
        this.f15780u.F(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final com.facebook.yoga.v M() {
        return this.f15780u.d();
    }

    public void M0(com.facebook.yoga.k kVar) {
        this.f15780u.G(kVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public Iterable<? extends d0> N() {
        if (u0()) {
            return null;
        }
        return this.f15766g;
    }

    public void N0(com.facebook.yoga.w wVar) {
        this.f15780u.i0(wVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public final int O() {
        return this.f15760a;
    }

    public void O0(com.facebook.yoga.l lVar) {
        this.f15780u.M(lVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public final void P() {
        ArrayList<e0> arrayList = this.f15772m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f15772m.get(size).f15771l = null;
            }
            this.f15772m.clear();
        }
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: P0 */
    public final void z(e0 e0Var) {
        this.f15768i = e0Var;
    }

    @Override // com.facebook.react.uimanager.d0
    public void Q() {
        Z(Float.NaN, Float.NaN);
    }

    public void Q0(int i10, float f10) {
        this.f15780u.N(com.facebook.yoga.j.a(i10), f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean R() {
        return false;
    }

    public void R0(int i10) {
        this.f15780u.O(com.facebook.yoga.j.a(i10));
    }

    @Override // com.facebook.react.uimanager.d0
    public void S(float f10) {
        this.f15780u.f0(f10);
    }

    public void S0(int i10, float f10) {
        this.f15780u.P(com.facebook.yoga.j.a(i10), f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public int T() {
        return this.f15775p;
    }

    public void T0(com.facebook.yoga.m mVar) {
        this.f15780u.U(mVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public final n0 U() {
        return (n0) f6.a.c(this.f15763d);
    }

    public void U0(com.facebook.yoga.s sVar) {
        this.f15780u.Z(sVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public m V() {
        if (R() || d0()) {
            return m.NONE;
        }
        return o0() ? m.LEAF : m.PARENT;
    }

    public void V0(int i10, float f10) {
        this.f15778s[i10] = f10;
        this.f15779t[i10] = false;
        o1();
    }

    @Override // com.facebook.react.uimanager.d0
    public final int W() {
        f6.a.a(this.f15762c != 0);
        return this.f15762c;
    }

    public void W0(int i10, float f10) {
        this.f15778s[i10] = f10;
        this.f15779t[i10] = !com.facebook.yoga.g.a(f10);
        o1();
    }

    @Override // com.facebook.react.uimanager.d0
    public final boolean X() {
        return this.f15764e;
    }

    public void X0(int i10, float f10) {
        this.f15780u.c0(com.facebook.yoga.j.a(i10), f10);
    }

    public void Y0(int i10, float f10) {
        this.f15780u.d0(com.facebook.yoga.j.a(i10), f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void Z(float f10, float f11) {
        this.f15780u.b(f10, f11);
    }

    public void Z0(com.facebook.yoga.t tVar) {
        this.f15780u.e0(tVar);
    }

    @Override // com.facebook.react.uimanager.d0
    public void a0(o oVar) {
    }

    public void a1(float f10) {
        this.f15780u.w(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final int b() {
        ArrayList<e0> arrayList = this.f15766g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void b1() {
        this.f15780u.K();
    }

    public void c1(float f10) {
        this.f15780u.L(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: d */
    public void x(e0 e0Var, int i10) {
        if (this.f15766g == null) {
            this.f15766g = new ArrayList<>(4);
        }
        this.f15766g.add(i10, e0Var);
        e0Var.f15767h = this;
        if (this.f15780u != null && !v0()) {
            com.facebook.yoga.p pVar = e0Var.f15780u;
            if (pVar != null) {
                this.f15780u.a(pVar, i10);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + e0Var.toString() + "' to a '" + toString() + "')");
            }
        }
        x0();
        int m02 = e0Var.m0();
        this.f15770k += m02;
        n1(m02);
    }

    @Override // com.facebook.react.uimanager.d0
    public final boolean d0() {
        return this.f15769j;
    }

    public void d1(float f10) {
        this.f15780u.Q(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: e */
    public final void r(e0 e0Var, int i10) {
        f6.a.a(V() == m.PARENT);
        f6.a.a(e0Var.V() != m.NONE);
        if (this.f15772m == null) {
            this.f15772m = new ArrayList<>(4);
        }
        this.f15772m.add(i10, e0Var);
        e0Var.f15771l = this;
    }

    @Override // com.facebook.react.uimanager.d0
    public final float e0() {
        return this.f15780u.i();
    }

    public void e1(float f10) {
        this.f15780u.R(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void f() {
        com.facebook.yoga.p pVar = this.f15780u;
        if (pVar != null) {
            pVar.s();
            g1.a().a(this.f15780u);
        }
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: f0 */
    public final e0 a(int i10) {
        ArrayList<e0> arrayList = this.f15766g;
        if (arrayList != null) {
            return arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public void f1(float f10) {
        this.f15780u.S(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final void g() {
        this.f15765f = false;
        if (n0()) {
            w0();
        }
    }

    public final com.facebook.yoga.h g0() {
        return this.f15780u.e();
    }

    public void g1(float f10) {
        this.f15780u.T(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public Integer getHeightMeasureSpec() {
        return this.f15782w;
    }

    @Override // com.facebook.react.uimanager.d0
    public Integer getWidthMeasureSpec() {
        return this.f15781v;
    }

    @Override // com.facebook.react.uimanager.d0
    public void h(float f10) {
        this.f15780u.J(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: h0 */
    public final e0 b0() {
        e0 e0Var = this.f15768i;
        return e0Var != null ? e0Var : c0();
    }

    public void h1(float f10) {
        this.f15780u.V(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void i(int i10, int i11) {
        this.f15781v = Integer.valueOf(i10);
        this.f15782w = Integer.valueOf(i11);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: i0 */
    public final int o(e0 e0Var) {
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= b()) {
                break;
            }
            e0 a10 = a(i10);
            if (e0Var == a10) {
                z10 = true;
                break;
            }
            i11 += a10.m0();
            i10++;
        }
        if (z10) {
            return i11;
        }
        throw new RuntimeException("Child " + e0Var.O() + " was not a child of " + this.f15760a);
    }

    public void i1(float f10) {
        this.f15780u.W(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void j(com.facebook.yoga.h hVar) {
        this.f15780u.A(hVar);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: j0 */
    public final e0 c0() {
        return this.f15771l;
    }

    public void j1(float f10) {
        this.f15780u.X(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final float k() {
        return this.f15780u.f();
    }

    public final float k0(int i10) {
        return this.f15780u.g(com.facebook.yoga.j.a(i10));
    }

    public void k1(float f10) {
        this.f15780u.Y(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public final boolean l() {
        return this.f15765f || n0() || s0();
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: l0 */
    public final e0 getParent() {
        return this.f15767h;
    }

    public void l1() {
        this.f15780u.g0();
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean m(float f10, float f11, x0 x0Var, o oVar) {
        if (this.f15765f) {
            z0(x0Var);
        }
        boolean z10 = false;
        if (n0()) {
            float E = E();
            float B = B();
            float f12 = f10 + E;
            int round = Math.round(f12);
            float f13 = f11 + B;
            int round2 = Math.round(f13);
            int round3 = Math.round(f12 + e0());
            int round4 = Math.round(f13 + k());
            int round5 = Math.round(E);
            int round6 = Math.round(B);
            int i10 = round3 - round;
            int i11 = round4 - round2;
            z10 = (round5 == this.f15773n && round6 == this.f15774o && i10 == this.f15775p && i11 == this.f15776q) ? true : true;
            this.f15773n = round5;
            this.f15774o = round6;
            this.f15775p = i10;
            this.f15776q = i11;
            if (z10) {
                if (oVar != null) {
                    oVar.l(this);
                } else {
                    x0Var.R(getParent().O(), O(), C(), v(), T(), I());
                }
            }
        }
        return z10;
    }

    public void m1(float f10) {
        this.f15780u.h0(f10);
    }

    @Override // com.facebook.react.uimanager.d0
    public void n() {
        if (b() == 0) {
            return;
        }
        int i10 = 0;
        for (int b10 = b() - 1; b10 >= 0; b10--) {
            if (this.f15780u != null && !v0()) {
                this.f15780u.r(b10);
            }
            e0 a10 = a(b10);
            a10.f15767h = null;
            i10 += a10.m0();
            a10.f();
        }
        ((ArrayList) f6.a.c(this.f15766g)).clear();
        x0();
        this.f15770k -= i10;
        n1(-i10);
    }

    public final boolean n0() {
        com.facebook.yoga.p pVar = this.f15780u;
        return pVar != null && pVar.n();
    }

    public boolean o0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.d0
    public final int p() {
        ArrayList<e0> arrayList = this.f15772m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: p0 */
    public final int Y(e0 e0Var) {
        ArrayList<e0> arrayList = this.f15766g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(e0Var);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: q0 */
    public final int q(e0 e0Var) {
        f6.a.c(this.f15772m);
        return this.f15772m.indexOf(e0Var);
    }

    @Override // com.facebook.react.uimanager.d0
    /* renamed from: r0 */
    public boolean F(e0 e0Var) {
        for (e0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == e0Var) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.d0
    public final void s(int i10) {
        this.f15762c = i10;
    }

    public final boolean s0() {
        com.facebook.yoga.p pVar = this.f15780u;
        return pVar != null && pVar.o();
    }

    public void setFlex(float f10) {
        this.f15780u.C(f10);
    }

    public void setFlexGrow(float f10) {
        this.f15780u.H(f10);
    }

    public void setFlexShrink(float f10) {
        this.f15780u.I(f10);
    }

    public void setShouldNotifyOnLayout(boolean z10) {
        this.f15764e = z10;
    }

    @Override // com.facebook.react.uimanager.d0
    public void t(n0 n0Var) {
        this.f15763d = n0Var;
    }

    public boolean t0() {
        return this.f15780u.p();
    }

    public String toString() {
        return "[" + this.f15761b + " " + O() + "]";
    }

    @Override // com.facebook.react.uimanager.d0
    public final com.facebook.yoga.v u() {
        return this.f15780u.m();
    }

    public boolean u0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.d0
    public int v() {
        return this.f15774o;
    }

    public boolean v0() {
        return t0();
    }

    @Override // com.facebook.react.uimanager.d0
    public void w(Object obj) {
    }

    public final void w0() {
        com.facebook.yoga.p pVar = this.f15780u;
        if (pVar != null) {
            pVar.q();
        }
    }

    public void x0() {
        if (this.f15765f) {
            return;
        }
        this.f15765f = true;
        e0 parent = getParent();
        if (parent != null) {
            parent.x0();
        }
    }

    @Override // com.facebook.react.uimanager.d0
    public final String y() {
        return (String) f6.a.c(this.f15761b);
    }

    public void y0() {
    }

    public void z0(x0 x0Var) {
    }
}
