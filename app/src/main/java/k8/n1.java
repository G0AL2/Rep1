package k8;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.q;
import i9.u;
import j8.b2;
import j8.j3;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p1;
import j8.p2;
import j8.x1;
import java.io.IOException;
import java.util.List;
import jb.t;
import k8.b;

/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: classes2.dex */
public class n1 implements k8.a {

    /* renamed from: a */
    private final ea.c f33280a;

    /* renamed from: b */
    private final j3.b f33281b;

    /* renamed from: c */
    private final j3.c f33282c;

    /* renamed from: d */
    private final a f33283d;

    /* renamed from: e */
    private final SparseArray<b.a> f33284e;

    /* renamed from: f */
    private ea.q<b> f33285f;

    /* renamed from: g */
    private p2 f33286g;

    /* renamed from: h */
    private ea.n f33287h;

    /* renamed from: i */
    private boolean f33288i;

    /* compiled from: DefaultAnalyticsCollector.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final j3.b f33289a;

        /* renamed from: b */
        private jb.s<u.b> f33290b = jb.s.t();

        /* renamed from: c */
        private jb.t<u.b, j3> f33291c = jb.t.k();

        /* renamed from: d */
        private u.b f33292d;

        /* renamed from: e */
        private u.b f33293e;

        /* renamed from: f */
        private u.b f33294f;

        public a(j3.b bVar) {
            this.f33289a = bVar;
        }

        private void b(t.a<u.b, j3> aVar, u.b bVar, j3 j3Var) {
            if (bVar == null) {
                return;
            }
            if (j3Var.b(bVar.f31793a) != -1) {
                aVar.d(bVar, j3Var);
                return;
            }
            j3 j3Var2 = this.f33291c.get(bVar);
            if (j3Var2 != null) {
                aVar.d(bVar, j3Var2);
            }
        }

        private static u.b c(p2 p2Var, jb.s<u.b> sVar, u.b bVar, j3.b bVar2) {
            j3 w10 = p2Var.w();
            int I = p2Var.I();
            Object m10 = w10.q() ? null : w10.m(I);
            int f10 = (p2Var.d() || w10.q()) ? -1 : w10.f(I, bVar2).f(ea.n0.C0(p2Var.getCurrentPosition()) - bVar2.p());
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                u.b bVar3 = sVar.get(i10);
                if (i(bVar3, m10, p2Var.d(), p2Var.r(), p2Var.M(), f10)) {
                    return bVar3;
                }
            }
            if (sVar.isEmpty() && bVar != null) {
                if (i(bVar, m10, p2Var.d(), p2Var.r(), p2Var.M(), f10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(u.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f31793a.equals(obj)) {
                return (z10 && bVar.f31794b == i10 && bVar.f31795c == i11) || (!z10 && bVar.f31794b == -1 && bVar.f31797e == i12);
            }
            return false;
        }

        private void m(j3 j3Var) {
            t.a<u.b, j3> a10 = jb.t.a();
            if (this.f33290b.isEmpty()) {
                b(a10, this.f33293e, j3Var);
                if (!ib.i.a(this.f33294f, this.f33293e)) {
                    b(a10, this.f33294f, j3Var);
                }
                if (!ib.i.a(this.f33292d, this.f33293e) && !ib.i.a(this.f33292d, this.f33294f)) {
                    b(a10, this.f33292d, j3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f33290b.size(); i10++) {
                    b(a10, this.f33290b.get(i10), j3Var);
                }
                if (!this.f33290b.contains(this.f33292d)) {
                    b(a10, this.f33292d, j3Var);
                }
            }
            this.f33291c = a10.b();
        }

        public u.b d() {
            return this.f33292d;
        }

        public u.b e() {
            if (this.f33290b.isEmpty()) {
                return null;
            }
            return (u.b) jb.v.c(this.f33290b);
        }

        public j3 f(u.b bVar) {
            return this.f33291c.get(bVar);
        }

        public u.b g() {
            return this.f33293e;
        }

        public u.b h() {
            return this.f33294f;
        }

        public void j(p2 p2Var) {
            this.f33292d = c(p2Var, this.f33290b, this.f33293e, this.f33289a);
        }

        public void k(List<u.b> list, u.b bVar, p2 p2Var) {
            this.f33290b = jb.s.p(list);
            if (!list.isEmpty()) {
                this.f33293e = list.get(0);
                this.f33294f = (u.b) ea.a.e(bVar);
            }
            if (this.f33292d == null) {
                this.f33292d = c(p2Var, this.f33290b, this.f33293e, this.f33289a);
            }
            m(p2Var.w());
        }

        public void l(p2 p2Var) {
            this.f33292d = c(p2Var, this.f33290b, this.f33293e, this.f33289a);
            m(p2Var.w());
        }
    }

    public n1(ea.c cVar) {
        this.f33280a = (ea.c) ea.a.e(cVar);
        this.f33285f = new ea.q<>(ea.n0.Q(), cVar, new q.b() { // from class: k8.h1
            @Override // ea.q.b
            public final void a(Object obj, ea.l lVar) {
                n1.l1((b) obj, lVar);
            }
        });
        j3.b bVar = new j3.b();
        this.f33281b = bVar;
        this.f33282c = new j3.c();
        this.f33283d = new a(bVar);
        this.f33284e = new SparseArray<>();
    }

    public static /* synthetic */ void A0(b.a aVar, int i10, p2.e eVar, p2.e eVar2, b bVar) {
        s2(aVar, i10, eVar, eVar2, bVar);
    }

    private b.a A1(int i10, u.b bVar) {
        ea.a.e(this.f33286g);
        if (bVar != null) {
            if (this.f33283d.f(bVar) != null) {
                return x1(bVar);
            }
            return y1(j3.f32506a, i10, bVar);
        }
        j3 w10 = this.f33286g.w();
        if (!(i10 < w10.p())) {
            w10 = j3.f32506a;
        }
        return y1(w10, i10, null);
    }

    public static /* synthetic */ void B0(b.a aVar, boolean z10, b bVar) {
        bVar.m0(aVar, z10);
    }

    private b.a B1() {
        return x1(this.f33283d.g());
    }

    public static /* synthetic */ void C0(b.a aVar, b bVar) {
        bVar.n(aVar);
    }

    private b.a C1() {
        return x1(this.f33283d.h());
    }

    public static /* synthetic */ void D0(b.a aVar, x1 x1Var, int i10, b bVar) {
        bVar.w(aVar, x1Var, i10);
    }

    private b.a D1(m2 m2Var) {
        i9.s sVar;
        if ((m2Var instanceof j8.n) && (sVar = ((j8.n) m2Var).f32631h) != null) {
            return x1(new u.b(sVar));
        }
        return w1();
    }

    public static /* synthetic */ void E0(b.a aVar, Exception exc, b bVar) {
        bVar.u(aVar, exc);
    }

    public static /* synthetic */ void E1(b bVar, ea.l lVar) {
    }

    public static /* synthetic */ void E2(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.i(aVar, str, j10);
        bVar.g(aVar, str, j11, j10);
        bVar.j0(aVar, 2, str, j10);
    }

    public static /* synthetic */ void F0(b.a aVar, i9.n nVar, i9.q qVar, b bVar) {
        bVar.n0(aVar, nVar, qVar);
    }

    public static /* synthetic */ void G0(b.a aVar, p2.b bVar, b bVar2) {
        bVar2.g0(aVar, bVar);
    }

    public static /* synthetic */ void G2(b.a aVar, m8.e eVar, b bVar) {
        bVar.q(aVar, eVar);
        bVar.G(aVar, 2, eVar);
    }

    public static /* synthetic */ void H0(b.a aVar, b bVar) {
        bVar.t(aVar);
    }

    public static /* synthetic */ void H1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.b(aVar, str, j10);
        bVar.j(aVar, str, j11, j10);
        bVar.j0(aVar, 1, str, j10);
    }

    public static /* synthetic */ void H2(b.a aVar, m8.e eVar, b bVar) {
        bVar.t0(aVar, eVar);
        bVar.O(aVar, 2, eVar);
    }

    public static /* synthetic */ void I0(b.a aVar, int i10, int i11, b bVar) {
        bVar.V(aVar, i10, i11);
    }

    public static /* synthetic */ void J0(b.a aVar, n3 n3Var, b bVar) {
        bVar.m(aVar, n3Var);
    }

    public static /* synthetic */ void J1(b.a aVar, m8.e eVar, b bVar) {
        bVar.k0(aVar, eVar);
        bVar.G(aVar, 1, eVar);
    }

    public static /* synthetic */ void J2(b.a aVar, p1 p1Var, m8.i iVar, b bVar) {
        bVar.L(aVar, p1Var);
        bVar.N(aVar, p1Var, iVar);
        bVar.e0(aVar, 2, p1Var);
    }

    public static /* synthetic */ void K0(b.a aVar, m2 m2Var, b bVar) {
        bVar.i0(aVar, m2Var);
    }

    public static /* synthetic */ void K1(b.a aVar, m8.e eVar, b bVar) {
        bVar.p0(aVar, eVar);
        bVar.O(aVar, 1, eVar);
    }

    public static /* synthetic */ void K2(b.a aVar, fa.v vVar, b bVar) {
        bVar.a0(aVar, vVar);
        bVar.T(aVar, vVar.f30292a, vVar.f30293b, vVar.f30294c, vVar.f30295d);
    }

    public static /* synthetic */ void L0(b.a aVar, i9.q qVar, b bVar) {
        bVar.R(aVar, qVar);
    }

    public static /* synthetic */ void L1(b.a aVar, p1 p1Var, m8.i iVar, b bVar) {
        bVar.q0(aVar, p1Var);
        bVar.A(aVar, p1Var, iVar);
        bVar.e0(aVar, 1, p1Var);
    }

    public static /* synthetic */ void M0(b.a aVar, int i10, b bVar) {
        bVar.W(aVar, i10);
    }

    public static /* synthetic */ void N0(b.a aVar, boolean z10, int i10, b bVar) {
        bVar.a(aVar, z10, i10);
    }

    public /* synthetic */ void N2(p2 p2Var, b bVar, ea.l lVar) {
        bVar.c(p2Var, new b.C0429b(lVar, this.f33284e));
    }

    public static /* synthetic */ void O0(b.a aVar, int i10, b bVar) {
        Y1(aVar, i10, bVar);
    }

    public void O2() {
        final b.a w12 = w1();
        P2(w12, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new q.a() { // from class: k8.n
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.H0(b.a.this, (b) obj);
            }
        });
        this.f33285f.j();
    }

    public static /* synthetic */ void P0(b.a aVar, p1 p1Var, m8.i iVar, b bVar) {
        L1(aVar, p1Var, iVar, bVar);
    }

    public static /* synthetic */ void Q0(b.a aVar, b bVar) {
        bVar.l0(aVar);
    }

    public static /* synthetic */ void R0(b.a aVar, b bVar) {
        bVar.f(aVar);
    }

    public static /* synthetic */ void S0(b.a aVar, int i10, b bVar) {
        bVar.v(aVar, i10);
    }

    public static /* synthetic */ void T0(b.a aVar, i9.n nVar, i9.q qVar, b bVar) {
        bVar.s(aVar, nVar, qVar);
    }

    public static /* synthetic */ void U0(b.a aVar, int i10, long j10, long j11, b bVar) {
        bVar.o(aVar, i10, j10, j11);
    }

    public static /* synthetic */ void V0(b.a aVar, i9.n nVar, i9.q qVar, IOException iOException, boolean z10, b bVar) {
        bVar.s0(aVar, nVar, qVar, iOException, z10);
    }

    public static /* synthetic */ void W0(b.a aVar, int i10, long j10, b bVar) {
        bVar.k(aVar, i10, j10);
    }

    public static /* synthetic */ void X0(b.a aVar, Exception exc, b bVar) {
        bVar.y(aVar, exc);
    }

    public static /* synthetic */ void Y0(b.a aVar, String str, long j10, long j11, b bVar) {
        H1(aVar, str, j10, j11, bVar);
    }

    public static /* synthetic */ void Y1(b.a aVar, int i10, b bVar) {
        bVar.h0(aVar);
        bVar.H(aVar, i10);
    }

    public static /* synthetic */ void Z0(b.a aVar, m2 m2Var, b bVar) {
        bVar.E(aVar, m2Var);
    }

    public static /* synthetic */ void a1(b.a aVar, boolean z10, b bVar) {
        bVar.r(aVar, z10);
    }

    public static /* synthetic */ void b1(b.a aVar, String str, b bVar) {
        bVar.K(aVar, str);
    }

    public static /* synthetic */ void c1(b.a aVar, boolean z10, b bVar) {
        bVar.c0(aVar, z10);
    }

    public static /* synthetic */ void c2(b.a aVar, boolean z10, b bVar) {
        bVar.d(aVar, z10);
        bVar.B(aVar, z10);
    }

    public static /* synthetic */ void d1(b.a aVar, int i10, long j10, long j11, b bVar) {
        bVar.r0(aVar, i10, j10, j11);
    }

    public static /* synthetic */ void e1(b.a aVar, b bVar) {
        bVar.b0(aVar);
    }

    public static /* synthetic */ void f1(b.a aVar, int i10, b bVar) {
        bVar.F(aVar, i10);
    }

    public static /* synthetic */ void g1(b.a aVar, m8.e eVar, b bVar) {
        J1(aVar, eVar, bVar);
    }

    public static /* synthetic */ void h1(b.a aVar, i9.n nVar, i9.q qVar, b bVar) {
        bVar.h(aVar, nVar, qVar);
    }

    public static /* synthetic */ void i1(b.a aVar, m8.e eVar, b bVar) {
        K1(aVar, eVar, bVar);
    }

    public static /* synthetic */ void j1(b.a aVar, int i10, b bVar) {
        bVar.Z(aVar, i10);
    }

    public static /* synthetic */ void k1(n1 n1Var, p2 p2Var, b bVar, ea.l lVar) {
        n1Var.N2(p2Var, bVar, lVar);
    }

    public static /* synthetic */ void l0(b.a aVar, o2 o2Var, b bVar) {
        bVar.D(aVar, o2Var);
    }

    public static /* synthetic */ void l1(b bVar, ea.l lVar) {
        E1(bVar, lVar);
    }

    public static /* synthetic */ void m0(b.a aVar, Exception exc, b bVar) {
        bVar.z(aVar, exc);
    }

    public static /* synthetic */ void m1(b.a aVar, b bVar) {
        bVar.Y(aVar);
    }

    public static /* synthetic */ void n0(b.a aVar, int i10, boolean z10, b bVar) {
        bVar.u0(aVar, i10, z10);
    }

    public static /* synthetic */ void n1(b.a aVar, long j10, b bVar) {
        bVar.x(aVar, j10);
    }

    public static /* synthetic */ void o0(b.a aVar, p1 p1Var, m8.i iVar, b bVar) {
        J2(aVar, p1Var, iVar, bVar);
    }

    public static /* synthetic */ void o1(b.a aVar, i9.y0 y0Var, ba.u uVar, b bVar) {
        bVar.o0(aVar, y0Var, uVar);
    }

    public static /* synthetic */ void p0(n1 n1Var) {
        n1Var.O2();
    }

    public static /* synthetic */ void p1(b.a aVar, m8.e eVar, b bVar) {
        H2(aVar, eVar, bVar);
    }

    public static /* synthetic */ void q0(b.a aVar, Metadata metadata, b bVar) {
        bVar.C(aVar, metadata);
    }

    public static /* synthetic */ void q1(b.a aVar, String str, b bVar) {
        bVar.I(aVar, str);
    }

    public static /* synthetic */ void r0(b.a aVar, fa.v vVar, b bVar) {
        K2(aVar, vVar, bVar);
    }

    public static /* synthetic */ void r1(b.a aVar, Object obj, long j10, b bVar) {
        bVar.Q(aVar, obj, j10);
    }

    public static /* synthetic */ void s0(b.a aVar, b2 b2Var, b bVar) {
        bVar.l(aVar, b2Var);
    }

    public static /* synthetic */ void s1(b.a aVar, boolean z10, int i10, b bVar) {
        bVar.X(aVar, z10, i10);
    }

    public static /* synthetic */ void s2(b.a aVar, int i10, p2.e eVar, p2.e eVar2, b bVar) {
        bVar.S(aVar, i10);
        bVar.U(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void t0(b.a aVar, i9.q qVar, b bVar) {
        bVar.e(aVar, qVar);
    }

    public static /* synthetic */ void t1(b.a aVar, Exception exc, b bVar) {
        bVar.M(aVar, exc);
    }

    public static /* synthetic */ void u0(b.a aVar, long j10, int i10, b bVar) {
        bVar.p(aVar, j10, i10);
    }

    public static /* synthetic */ void u1(b.a aVar, b bVar) {
        bVar.f0(aVar);
    }

    public static /* synthetic */ void v0(b.a aVar, boolean z10, b bVar) {
        c2(aVar, z10, bVar);
    }

    public static /* synthetic */ void v1(b.a aVar, String str, long j10, long j11, b bVar) {
        E2(aVar, str, j10, j11, bVar);
    }

    public static /* synthetic */ void w0(b.a aVar, m8.e eVar, b bVar) {
        G2(aVar, eVar, bVar);
    }

    public static /* synthetic */ void x0(b.a aVar, j8.m mVar, b bVar) {
        bVar.J(aVar, mVar);
    }

    private b.a x1(u.b bVar) {
        ea.a.e(this.f33286g);
        j3 f10 = bVar == null ? null : this.f33283d.f(bVar);
        if (bVar != null && f10 != null) {
            return y1(f10, f10.h(bVar.f31793a, this.f33281b).f32510c, bVar);
        }
        int T = this.f33286g.T();
        j3 w10 = this.f33286g.w();
        if (!(T < w10.p())) {
            w10 = j3.f32506a;
        }
        return y1(w10, T, null);
    }

    public static /* synthetic */ void y0(b.a aVar, List list, b bVar) {
        bVar.d0(aVar, list);
    }

    public static /* synthetic */ void z0(b.a aVar, float f10, b bVar) {
        bVar.P(aVar, f10);
    }

    private b.a z1() {
        return x1(this.f33283d.e());
    }

    @Override // da.f.a
    public final void A(final int i10, final long j10, final long j11) {
        final b.a z12 = z1();
        P2(z12, 1006, new q.a() { // from class: k8.i
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.U0(b.a.this, i10, j10, j11, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void B() {
        if (this.f33288i) {
            return;
        }
        final b.a w12 = w1();
        this.f33288i = true;
        P2(w12, -1, new q.a() { // from class: k8.j1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.u1(b.a.this, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void C(final boolean z10) {
        final b.a w12 = w1();
        P2(w12, 9, new q.a() { // from class: k8.b1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.a1(b.a.this, z10, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void D(final p2.b bVar) {
        final b.a w12 = w1();
        P2(w12, 13, new q.a() { // from class: k8.h0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.G0(b.a.this, bVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void E(final j8.m mVar) {
        final b.a w12 = w1();
        P2(w12, 29, new q.a() { // from class: k8.z
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.x0(b.a.this, mVar, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void F(int i10, u.b bVar, final i9.n nVar, final i9.q qVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, 1002, new q.a() { // from class: k8.s
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.T0(b.a.this, nVar, qVar, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void G(int i10, u.b bVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new q.a() { // from class: k8.y
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.Q0(b.a.this, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void H(final int i10, final boolean z10) {
        final b.a w12 = w1();
        P2(w12, 30, new q.a() { // from class: k8.l
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.n0(b.a.this, i10, z10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void I(List<u.b> list, u.b bVar) {
        this.f33283d.k(list, bVar, (p2) ea.a.e(this.f33286g));
    }

    @Override // j8.p2.d
    public void J() {
    }

    @Override // j8.p2.d
    public final void K(final m2 m2Var) {
        final b.a D1 = D1(m2Var);
        P2(D1, 10, new q.a() { // from class: k8.f0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.Z0(b.a.this, m2Var, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public /* synthetic */ void L(int i10, u.b bVar) {
        n8.e.a(this, i10, bVar);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void M(int i10, u.b bVar, final Exception exc) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, new q.a() { // from class: k8.n0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.t1(b.a.this, exc, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void N(final b2 b2Var) {
        final b.a w12 = w1();
        P2(w12, 14, new q.a() { // from class: k8.d0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.s0(b.a.this, b2Var, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void O(final n3 n3Var) {
        final b.a w12 = w1();
        P2(w12, 2, new q.a() { // from class: k8.i0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.J0(b.a.this, n3Var, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void P(final int i10, final int i11) {
        final b.a C1 = C1();
        P2(C1, 24, new q.a() { // from class: k8.g
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.I0(b.a.this, i10, i11, (b) obj);
            }
        });
    }

    protected final void P2(b.a aVar, int i10, q.a<b> aVar2) {
        this.f33284e.put(i10, aVar);
        this.f33285f.l(i10, aVar2);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void Q(int i10, u.b bVar, final int i11) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new q.a() { // from class: k8.m1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.O0(b.a.this, i11, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void R(int i10, u.b bVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new q.a() { // from class: k8.u0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.e1(b.a.this, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void S(int i10, u.b bVar, final i9.n nVar, final i9.q qVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, 1000, new q.a() { // from class: k8.t
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.h1(b.a.this, nVar, qVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void T(p2 p2Var, p2.c cVar) {
    }

    @Override // j8.p2.d
    public void U(int i10) {
    }

    @Override // j8.p2.d
    public final void V(final p2.e eVar, final p2.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f33288i = false;
        }
        this.f33283d.j((p2) ea.a.e(this.f33286g));
        final b.a w12 = w1();
        P2(w12, 11, new q.a() { // from class: k8.k
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.A0(b.a.this, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void W(final boolean z10) {
        final b.a w12 = w1();
        P2(w12, 3, new q.a() { // from class: k8.z0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.v0(b.a.this, z10, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void X() {
        final b.a w12 = w1();
        P2(w12, -1, new q.a() { // from class: k8.j0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.R0(b.a.this, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void Y(final float f10) {
        final b.a C1 = C1();
        P2(C1, 22, new q.a() { // from class: k8.k1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.z0(b.a.this, f10, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void Z(final i9.y0 y0Var, final ba.u uVar) {
        final b.a w12 = w1();
        P2(w12, 2, new q.a() { // from class: k8.x
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.o1(b.a.this, y0Var, uVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void a(final boolean z10) {
        final b.a C1 = C1();
        P2(C1, 23, new q.a() { // from class: k8.a1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.B0(b.a.this, z10, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void a0(int i10, u.b bVar, final i9.q qVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, 1005, new q.a() { // from class: k8.w
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.L0(b.a.this, qVar, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void b(final Exception exc) {
        final b.a C1 = C1();
        P2(C1, 1014, new q.a() { // from class: k8.m0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.X0(b.a.this, exc, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void b0(int i10, u.b bVar, final i9.n nVar, final i9.q qVar, final IOException iOException, final boolean z10) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, 1003, new q.a() { // from class: k8.u
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.V0(b.a.this, nVar, qVar, iOException, z10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void c(final String str) {
        final b.a C1 = C1();
        P2(C1, 1019, new q.a() { // from class: k8.p0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.b1(b.a.this, str, (b) obj);
            }
        });
    }

    @Override // k8.a
    public void c0(final p2 p2Var, Looper looper) {
        ea.a.f(this.f33286g == null || this.f33283d.f33290b.isEmpty());
        this.f33286g = (p2) ea.a.e(p2Var);
        this.f33287h = this.f33280a.b(looper, null);
        this.f33285f = this.f33285f.e(looper, new q.b() { // from class: k8.g1
            @Override // ea.q.b
            public final void a(Object obj, ea.l lVar) {
                n1.k1(n1.this, p2Var, (b) obj, lVar);
            }
        });
    }

    @Override // j8.p2.d
    public final void d(final o2 o2Var) {
        final b.a w12 = w1();
        P2(w12, 12, new q.a() { // from class: k8.g0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.l0(b.a.this, o2Var, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void d0(final boolean z10, final int i10) {
        final b.a w12 = w1();
        P2(w12, -1, new q.a() { // from class: k8.d1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.N0(b.a.this, z10, i10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void e(final p1 p1Var, final m8.i iVar) {
        final b.a C1 = C1();
        P2(C1, 1009, new q.a() { // from class: k8.b0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.P0(b.a.this, p1Var, iVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void e0(final m2 m2Var) {
        final b.a D1 = D1(m2Var);
        P2(D1, 10, new q.a() { // from class: k8.e0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.K0(b.a.this, m2Var, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void f(final String str) {
        final b.a C1 = C1();
        P2(C1, 1012, new q.a() { // from class: k8.q0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.q1(b.a.this, str, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void f0(int i10, u.b bVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new q.a() { // from class: k8.f1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.m1(b.a.this, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void g(final Metadata metadata) {
        final b.a w12 = w1();
        P2(w12, 28, new q.a() { // from class: k8.p
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.q0(b.a.this, metadata, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void g0(j3 j3Var, final int i10) {
        this.f33283d.l((p2) ea.a.e(this.f33286g));
        final b.a w12 = w1();
        P2(w12, 0, new q.a() { // from class: k8.f
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.j1(b.a.this, i10, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void h(int i10, u.b bVar, final i9.q qVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL, new q.a() { // from class: k8.v
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.t0(b.a.this, qVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void h0(final boolean z10, final int i10) {
        final b.a w12 = w1();
        P2(w12, 5, new q.a() { // from class: k8.e1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.s1(b.a.this, z10, i10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void i(final m8.e eVar) {
        final b.a C1 = C1();
        P2(C1, IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS, new q.a() { // from class: k8.x0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.i1(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void i0(int i10, u.b bVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new q.a() { // from class: k8.c
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.C0(b.a.this, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void j(final fa.v vVar) {
        final b.a C1 = C1();
        P2(C1, 25, new q.a() { // from class: k8.q
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.r0(b.a.this, vVar, (b) obj);
            }
        });
    }

    @Override // i9.b0
    public final void j0(int i10, u.b bVar, final i9.n nVar, final i9.q qVar) {
        final b.a A1 = A1(i10, bVar);
        P2(A1, 1001, new q.a() { // from class: k8.r
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.F0(b.a.this, nVar, qVar, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void k(final List<r9.b> list) {
        final b.a w12 = w1();
        P2(w12, 27, new q.a() { // from class: k8.t0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.y0(b.a.this, list, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public void k0(final boolean z10) {
        final b.a w12 = w1();
        P2(w12, 7, new q.a() { // from class: k8.c1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.c1(b.a.this, z10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void l(final long j10) {
        final b.a C1 = C1();
        P2(C1, 1010, new q.a() { // from class: k8.m
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.n1(b.a.this, j10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void m(final p1 p1Var, final m8.i iVar) {
        final b.a C1 = C1();
        P2(C1, 1017, new q.a() { // from class: k8.a0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.o0(b.a.this, p1Var, iVar, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void n(final Exception exc) {
        final b.a C1 = C1();
        P2(C1, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new q.a() { // from class: k8.l0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.E0(b.a.this, exc, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void o(final m8.e eVar) {
        final b.a B1 = B1();
        P2(B1, IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, new q.a() { // from class: k8.v0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.w0(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a C1 = C1();
        P2(C1, IronSourceError.AUCTION_ERROR_DECOMPRESSION, new q.a() { // from class: k8.r0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.Y0(b.a.this, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void onDroppedFrames(final int i10, final long j10) {
        final b.a B1 = B1();
        P2(B1, 1018, new q.a() { // from class: k8.h
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.W0(b.a.this, i10, j10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final b.a C1 = C1();
        P2(C1, 1016, new q.a() { // from class: k8.s0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.v1(b.a.this, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void p(final m8.e eVar) {
        final b.a C1 = C1();
        P2(C1, IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE, new q.a() { // from class: k8.y0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.p1(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void q(final Object obj, final long j10) {
        final b.a C1 = C1();
        P2(C1, 26, new q.a() { // from class: k8.o0
            @Override // ea.q.a
            public final void b(Object obj2) {
                n1.r1(b.a.this, obj, j10, (b) obj2);
            }
        });
    }

    @Override // j8.p2.d
    public final void r(final int i10) {
        final b.a w12 = w1();
        P2(w12, 8, new q.a() { // from class: k8.l1
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.M0(b.a.this, i10, (b) obj);
            }
        });
    }

    @Override // k8.a
    public void release() {
        ((ea.n) ea.a.h(this.f33287h)).post(new Runnable() { // from class: k8.i1
            @Override // java.lang.Runnable
            public final void run() {
                n1.p0(n1.this);
            }
        });
    }

    @Override // k8.a
    public final void s(final Exception exc) {
        final b.a C1 = C1();
        P2(C1, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new q.a() { // from class: k8.k0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.m0(b.a.this, exc, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void t(final m8.e eVar) {
        final b.a B1 = B1();
        P2(B1, 1013, new q.a() { // from class: k8.w0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.g1(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void u(final int i10, final long j10, final long j11) {
        final b.a C1 = C1();
        P2(C1, IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, new q.a() { // from class: k8.j
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.d1(b.a.this, i10, j10, j11, (b) obj);
            }
        });
    }

    @Override // k8.a
    public final void v(final long j10, final int i10) {
        final b.a B1 = B1();
        P2(B1, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new q.a() { // from class: k8.o
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.u0(b.a.this, j10, i10, (b) obj);
            }
        });
    }

    @Override // j8.p2.d
    public final void w(final int i10) {
        final b.a w12 = w1();
        P2(w12, 6, new q.a() { // from class: k8.e
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.f1(b.a.this, i10, (b) obj);
            }
        });
    }

    protected final b.a w1() {
        return x1(this.f33283d.d());
    }

    @Override // j8.p2.d
    public void x(boolean z10) {
    }

    @Override // j8.p2.d
    public final void y(final x1 x1Var, final int i10) {
        final b.a w12 = w1();
        P2(w12, 1, new q.a() { // from class: k8.c0
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.D0(b.a.this, x1Var, i10, (b) obj);
            }
        });
    }

    protected final b.a y1(j3 j3Var, int i10, u.b bVar) {
        long P;
        u.b bVar2 = j3Var.q() ? null : bVar;
        long elapsedRealtime = this.f33280a.elapsedRealtime();
        boolean z10 = true;
        boolean z11 = j3Var.equals(this.f33286g.w()) && i10 == this.f33286g.T();
        long j10 = 0;
        if (bVar2 != null && bVar2.b()) {
            if ((z11 && this.f33286g.r() == bVar2.f31794b && this.f33286g.M() == bVar2.f31795c) ? false : false) {
                j10 = this.f33286g.getCurrentPosition();
            }
        } else if (z11) {
            P = this.f33286g.P();
            return new b.a(elapsedRealtime, j3Var, i10, bVar2, P, this.f33286g.w(), this.f33286g.T(), this.f33283d.d(), this.f33286g.getCurrentPosition(), this.f33286g.e());
        } else if (!j3Var.q()) {
            j10 = j3Var.n(i10, this.f33282c).d();
        }
        P = j10;
        return new b.a(elapsedRealtime, j3Var, i10, bVar2, P, this.f33286g.w(), this.f33286g.T(), this.f33283d.d(), this.f33286g.getCurrentPosition(), this.f33286g.e());
    }

    @Override // j8.p2.d
    public final void z(final int i10) {
        final b.a w12 = w1();
        P2(w12, 4, new q.a() { // from class: k8.d
            @Override // ea.q.a
            public final void b(Object obj) {
                n1.S0(b.a.this, i10, (b) obj);
            }
        });
    }
}
