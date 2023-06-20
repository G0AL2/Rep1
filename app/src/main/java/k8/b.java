package k8;

import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
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

/* compiled from: AnalyticsListener.java */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f33190a;

        /* renamed from: b  reason: collision with root package name */
        public final j3 f33191b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33192c;

        /* renamed from: d  reason: collision with root package name */
        public final u.b f33193d;

        /* renamed from: e  reason: collision with root package name */
        public final long f33194e;

        /* renamed from: f  reason: collision with root package name */
        public final j3 f33195f;

        /* renamed from: g  reason: collision with root package name */
        public final int f33196g;

        /* renamed from: h  reason: collision with root package name */
        public final u.b f33197h;

        /* renamed from: i  reason: collision with root package name */
        public final long f33198i;

        /* renamed from: j  reason: collision with root package name */
        public final long f33199j;

        public a(long j10, j3 j3Var, int i10, u.b bVar, long j11, j3 j3Var2, int i11, u.b bVar2, long j12, long j13) {
            this.f33190a = j10;
            this.f33191b = j3Var;
            this.f33192c = i10;
            this.f33193d = bVar;
            this.f33194e = j11;
            this.f33195f = j3Var2;
            this.f33196g = i11;
            this.f33197h = bVar2;
            this.f33198i = j12;
            this.f33199j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33190a == aVar.f33190a && this.f33192c == aVar.f33192c && this.f33194e == aVar.f33194e && this.f33196g == aVar.f33196g && this.f33198i == aVar.f33198i && this.f33199j == aVar.f33199j && ib.i.a(this.f33191b, aVar.f33191b) && ib.i.a(this.f33193d, aVar.f33193d) && ib.i.a(this.f33195f, aVar.f33195f) && ib.i.a(this.f33197h, aVar.f33197h);
        }

        public int hashCode() {
            return ib.i.b(Long.valueOf(this.f33190a), this.f33191b, Integer.valueOf(this.f33192c), this.f33193d, Long.valueOf(this.f33194e), this.f33195f, Integer.valueOf(this.f33196g), this.f33197h, Long.valueOf(this.f33198i), Long.valueOf(this.f33199j));
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* renamed from: k8.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0429b {
        public C0429b(ea.l lVar, SparseArray<a> sparseArray) {
            SparseArray sparseArray2 = new SparseArray(lVar.d());
            for (int i10 = 0; i10 < lVar.d(); i10++) {
                int c10 = lVar.c(i10);
                sparseArray2.append(c10, (a) ea.a.e(sparseArray.get(c10)));
            }
        }
    }

    void A(a aVar, p1 p1Var, m8.i iVar);

    void B(a aVar, boolean z10);

    void C(a aVar, Metadata metadata);

    void D(a aVar, o2 o2Var);

    void E(a aVar, m2 m2Var);

    void F(a aVar, int i10);

    @Deprecated
    void G(a aVar, int i10, m8.e eVar);

    void H(a aVar, int i10);

    void I(a aVar, String str);

    void J(a aVar, j8.m mVar);

    void K(a aVar, String str);

    @Deprecated
    void L(a aVar, p1 p1Var);

    void M(a aVar, Exception exc);

    void N(a aVar, p1 p1Var, m8.i iVar);

    @Deprecated
    void O(a aVar, int i10, m8.e eVar);

    void P(a aVar, float f10);

    void Q(a aVar, Object obj, long j10);

    void R(a aVar, i9.q qVar);

    @Deprecated
    void S(a aVar, int i10);

    @Deprecated
    void T(a aVar, int i10, int i11, int i12, float f10);

    void U(a aVar, p2.e eVar, p2.e eVar2, int i10);

    void V(a aVar, int i10, int i11);

    void W(a aVar, int i10);

    void X(a aVar, boolean z10, int i10);

    void Y(a aVar);

    void Z(a aVar, int i10);

    @Deprecated
    void a(a aVar, boolean z10, int i10);

    void a0(a aVar, fa.v vVar);

    @Deprecated
    void b(a aVar, String str, long j10);

    void b0(a aVar);

    void c(p2 p2Var, C0429b c0429b);

    void c0(a aVar, boolean z10);

    @Deprecated
    void d(a aVar, boolean z10);

    void d0(a aVar, List<r9.b> list);

    void e(a aVar, i9.q qVar);

    @Deprecated
    void e0(a aVar, int i10, p1 p1Var);

    @Deprecated
    void f(a aVar);

    @Deprecated
    void f0(a aVar);

    void g(a aVar, String str, long j10, long j11);

    void g0(a aVar, p2.b bVar);

    void h(a aVar, i9.n nVar, i9.q qVar);

    @Deprecated
    void h0(a aVar);

    @Deprecated
    void i(a aVar, String str, long j10);

    void i0(a aVar, m2 m2Var);

    void j(a aVar, String str, long j10, long j11);

    @Deprecated
    void j0(a aVar, int i10, String str, long j10);

    void k(a aVar, int i10, long j10);

    void k0(a aVar, m8.e eVar);

    void l(a aVar, b2 b2Var);

    void l0(a aVar);

    void m(a aVar, n3 n3Var);

    void m0(a aVar, boolean z10);

    void n(a aVar);

    void n0(a aVar, i9.n nVar, i9.q qVar);

    void o(a aVar, int i10, long j10, long j11);

    @Deprecated
    void o0(a aVar, i9.y0 y0Var, ba.u uVar);

    void p(a aVar, long j10, int i10);

    void p0(a aVar, m8.e eVar);

    void q(a aVar, m8.e eVar);

    @Deprecated
    void q0(a aVar, p1 p1Var);

    void r(a aVar, boolean z10);

    void r0(a aVar, int i10, long j10, long j11);

    void s(a aVar, i9.n nVar, i9.q qVar);

    void s0(a aVar, i9.n nVar, i9.q qVar, IOException iOException, boolean z10);

    void t(a aVar);

    void t0(a aVar, m8.e eVar);

    void u(a aVar, Exception exc);

    void u0(a aVar, int i10, boolean z10);

    void v(a aVar, int i10);

    void w(a aVar, x1 x1Var, int i10);

    void x(a aVar, long j10);

    void y(a aVar, Exception exc);

    void z(a aVar, Exception exc);
}
