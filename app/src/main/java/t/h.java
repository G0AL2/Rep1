package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.d;
import s.e;
import t.b;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f37042a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f37043b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f37044c = 0;

    private static boolean a(int i10, s.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y10 = eVar.y();
        e.b R = eVar.R();
        s.f fVar = eVar.I() != null ? (s.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = y10 == bVar5 || eVar.l0() || y10 == e.b.WRAP_CONTENT || (y10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f36649t == 0 && eVar.f36612a0 == 0.0f && eVar.Y(0)) || (y10 == bVar2 && eVar.f36649t == 1 && eVar.b0(0, eVar.U()));
        boolean z11 = R == bVar5 || eVar.m0() || R == e.b.WRAP_CONTENT || (R == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f36651u == 0 && eVar.f36612a0 == 0.0f && eVar.Y(1)) || (R == bVar && eVar.f36651u == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f36612a0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, s.e eVar, b.InterfaceC0502b interfaceC0502b, boolean z10) {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        if (eVar.e0()) {
            return;
        }
        f37043b++;
        if (!(eVar instanceof s.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                s.f.O1(i11, eVar, interfaceC0502b, new b.a(), b.a.f36997k);
            }
        }
        s.d m10 = eVar.m(d.b.LEFT);
        s.d m11 = eVar.m(d.b.RIGHT);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator<s.d> it = m10.c().iterator();
            while (it.hasNext()) {
                s.d next = it.next();
                s.e eVar2 = next.f36593d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    s.f.O1(i12, eVar2, interfaceC0502b, new b.a(), b.a.f36997k);
                }
                boolean z11 = (next == eVar2.L && (dVar4 = eVar2.N.f36595f) != null && dVar4.m()) || (next == eVar2.N && (dVar3 = eVar2.L.f36595f) != null && dVar3.m());
                e.b y10 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y10 == bVar && !a10) {
                    if (eVar2.y() == bVar && eVar2.f36655x >= 0 && eVar2.f36654w >= 0 && ((eVar2.T() == 8 || (eVar2.f36649t == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z11 && !eVar2.g0())) {
                        e(i12, eVar, interfaceC0502b, eVar2, z10);
                    }
                } else if (!eVar2.k0()) {
                    s.d dVar5 = eVar2.L;
                    if (next == dVar5 && eVar2.N.f36595f == null) {
                        int e10 = dVar5.e() + d10;
                        eVar2.C0(e10, eVar2.U() + e10);
                        b(i12, eVar2, interfaceC0502b, z10);
                    } else {
                        s.d dVar6 = eVar2.N;
                        if (next == dVar6 && dVar5.f36595f == null) {
                            int e11 = d10 - dVar6.e();
                            eVar2.C0(e11 - eVar2.U(), e11);
                            b(i12, eVar2, interfaceC0502b, z10);
                        } else if (z11 && !eVar2.g0()) {
                            d(i12, interfaceC0502b, eVar2, z10);
                        }
                    }
                }
            }
        }
        if (eVar instanceof s.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator<s.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                s.d next2 = it2.next();
                s.e eVar3 = next2.f36593d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    s.f.O1(i13, eVar3, interfaceC0502b, new b.a(), b.a.f36997k);
                }
                boolean z12 = (next2 == eVar3.L && (dVar2 = eVar3.N.f36595f) != null && dVar2.m()) || (next2 == eVar3.N && (dVar = eVar3.L.f36595f) != null && dVar.m());
                e.b y11 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y11 == bVar2 && !a11) {
                    if (eVar3.y() == bVar2 && eVar3.f36655x >= 0 && eVar3.f36654w >= 0 && (eVar3.T() == 8 || (eVar3.f36649t == 0 && eVar3.t() == 0.0f))) {
                        if (!eVar3.g0() && !eVar3.j0() && z12 && !eVar3.g0()) {
                            e(i13, eVar, interfaceC0502b, eVar3, z10);
                        }
                    }
                } else if (!eVar3.k0()) {
                    s.d dVar7 = eVar3.L;
                    if (next2 == dVar7 && eVar3.N.f36595f == null) {
                        int e12 = dVar7.e() + d11;
                        eVar3.C0(e12, eVar3.U() + e12);
                        b(i13, eVar3, interfaceC0502b, z10);
                    } else {
                        s.d dVar8 = eVar3.N;
                        if (next2 == dVar8 && dVar7.f36595f == null) {
                            int e13 = d11 - dVar8.e();
                            eVar3.C0(e13 - eVar3.U(), e13);
                            b(i13, eVar3, interfaceC0502b, z10);
                        } else if (z12 && !eVar3.g0()) {
                            d(i13, interfaceC0502b, eVar3, z10);
                        }
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i10, s.a aVar, b.InterfaceC0502b interfaceC0502b, int i11, boolean z10) {
        if (aVar.q1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0502b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0502b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0502b interfaceC0502b, s.e eVar, boolean z10) {
        float w10 = eVar.w();
        int d10 = eVar.L.f36595f.d();
        int d11 = eVar.N.f36595f.d();
        int e10 = eVar.L.e() + d10;
        int e11 = d11 - eVar.N.e();
        if (d10 == d11) {
            w10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int U = eVar.U();
        int i11 = (d11 - d10) - U;
        if (d10 > d11) {
            i11 = (d10 - d11) - U;
        }
        int i12 = ((int) (i11 > 0 ? (w10 * i11) + 0.5f : w10 * i11)) + d10;
        int i13 = i12 + U;
        if (d10 > d11) {
            i13 = i12 - U;
        }
        eVar.C0(i12, i13);
        b(i10 + 1, eVar, interfaceC0502b, z10);
    }

    private static void e(int i10, s.e eVar, b.InterfaceC0502b interfaceC0502b, s.e eVar2, boolean z10) {
        int U;
        float w10 = eVar2.w();
        int d10 = eVar2.L.f36595f.d() + eVar2.L.e();
        int d11 = eVar2.N.f36595f.d() - eVar2.N.e();
        if (d11 >= d10) {
            int U2 = eVar2.U();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f36649t;
                if (i11 == 2) {
                    if (eVar instanceof s.f) {
                        U = eVar.U();
                    } else {
                        U = eVar.I().U();
                    }
                    U2 = (int) (eVar2.w() * 0.5f * U);
                } else if (i11 == 0) {
                    U2 = d11 - d10;
                }
                U2 = Math.max(eVar2.f36654w, U2);
                int i12 = eVar2.f36655x;
                if (i12 > 0) {
                    U2 = Math.min(i12, U2);
                }
            }
            int i13 = d10 + ((int) ((w10 * ((d11 - d10) - U2)) + 0.5f));
            eVar2.C0(i13, U2 + i13);
            b(i10 + 1, eVar2, interfaceC0502b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0502b interfaceC0502b, s.e eVar) {
        float P = eVar.P();
        int d10 = eVar.M.f36595f.d();
        int d11 = eVar.O.f36595f.d();
        int e10 = eVar.M.e() + d10;
        int e11 = d11 - eVar.O.e();
        if (d10 == d11) {
            P = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int v10 = eVar.v();
        int i11 = (d11 - d10) - v10;
        if (d10 > d11) {
            i11 = (d10 - d11) - v10;
        }
        int i12 = (int) (i11 > 0 ? (P * i11) + 0.5f : P * i11);
        int i13 = d10 + i12;
        int i14 = i13 + v10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - v10;
        }
        eVar.F0(i13, i14);
        i(i10 + 1, eVar, interfaceC0502b);
    }

    private static void g(int i10, s.e eVar, b.InterfaceC0502b interfaceC0502b, s.e eVar2) {
        int v10;
        float P = eVar2.P();
        int d10 = eVar2.M.f36595f.d() + eVar2.M.e();
        int d11 = eVar2.O.f36595f.d() - eVar2.O.e();
        if (d11 >= d10) {
            int v11 = eVar2.v();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f36651u;
                if (i11 == 2) {
                    if (eVar instanceof s.f) {
                        v10 = eVar.v();
                    } else {
                        v10 = eVar.I().v();
                    }
                    v11 = (int) (P * 0.5f * v10);
                } else if (i11 == 0) {
                    v11 = d11 - d10;
                }
                v11 = Math.max(eVar2.f36657z, v11);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    v11 = Math.min(i12, v11);
                }
            }
            int i13 = d10 + ((int) ((P * ((d11 - d10) - v11)) + 0.5f));
            eVar2.F0(i13, v11 + i13);
            i(i10 + 1, eVar2, interfaceC0502b);
        }
    }

    public static void h(s.f fVar, b.InterfaceC0502b interfaceC0502b) {
        e.b y10 = fVar.y();
        e.b R = fVar.R();
        f37043b = 0;
        f37044c = 0;
        fVar.s0();
        ArrayList<s.e> o12 = fVar.o1();
        int size = o12.size();
        for (int i10 = 0; i10 < size; i10++) {
            o12.get(i10).s0();
        }
        boolean L1 = fVar.L1();
        if (y10 == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            s.e eVar = o12.get(i11);
            if (eVar instanceof s.g) {
                s.g gVar = (s.g) eVar;
                if (gVar.p1() == 1) {
                    if (gVar.q1() != -1) {
                        gVar.t1(gVar.q1());
                    } else if (gVar.r1() != -1 && fVar.l0()) {
                        gVar.t1(fVar.U() - gVar.r1());
                    } else if (fVar.l0()) {
                        gVar.t1((int) ((gVar.s1() * fVar.U()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof s.a) && ((s.a) eVar).u1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                s.e eVar2 = o12.get(i12);
                if (eVar2 instanceof s.g) {
                    s.g gVar2 = (s.g) eVar2;
                    if (gVar2.p1() == 1) {
                        b(0, gVar2, interfaceC0502b, L1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0502b, L1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                s.e eVar3 = o12.get(i13);
                if (eVar3 instanceof s.a) {
                    s.a aVar = (s.a) eVar3;
                    if (aVar.u1() == 0) {
                        c(0, aVar, interfaceC0502b, 0, L1);
                    }
                }
            }
        }
        if (R == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            s.e eVar4 = o12.get(i14);
            if (eVar4 instanceof s.g) {
                s.g gVar3 = (s.g) eVar4;
                if (gVar3.p1() == 0) {
                    if (gVar3.q1() != -1) {
                        gVar3.t1(gVar3.q1());
                    } else if (gVar3.r1() != -1 && fVar.m0()) {
                        gVar3.t1(fVar.v() - gVar3.r1());
                    } else if (fVar.m0()) {
                        gVar3.t1((int) ((gVar3.s1() * fVar.v()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof s.a) && ((s.a) eVar4).u1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                s.e eVar5 = o12.get(i15);
                if (eVar5 instanceof s.g) {
                    s.g gVar4 = (s.g) eVar5;
                    if (gVar4.p1() == 0) {
                        i(1, gVar4, interfaceC0502b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0502b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                s.e eVar6 = o12.get(i16);
                if (eVar6 instanceof s.a) {
                    s.a aVar2 = (s.a) eVar6;
                    if (aVar2.u1() == 1) {
                        c(0, aVar2, interfaceC0502b, 1, L1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            s.e eVar7 = o12.get(i17);
            if (eVar7.k0() && a(0, eVar7)) {
                s.f.O1(0, eVar7, interfaceC0502b, f37042a, b.a.f36997k);
                if (eVar7 instanceof s.g) {
                    if (((s.g) eVar7).p1() == 0) {
                        i(0, eVar7, interfaceC0502b);
                    } else {
                        b(0, eVar7, interfaceC0502b, L1);
                    }
                } else {
                    b(0, eVar7, interfaceC0502b, L1);
                    i(0, eVar7, interfaceC0502b);
                }
            }
        }
    }

    private static void i(int i10, s.e eVar, b.InterfaceC0502b interfaceC0502b) {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f37044c++;
        if (!(eVar instanceof s.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                s.f.O1(i11, eVar, interfaceC0502b, new b.a(), b.a.f36997k);
            }
        }
        s.d m10 = eVar.m(d.b.TOP);
        s.d m11 = eVar.m(d.b.BOTTOM);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator<s.d> it = m10.c().iterator();
            while (it.hasNext()) {
                s.d next = it.next();
                s.e eVar2 = next.f36593d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    s.f.O1(i12, eVar2, interfaceC0502b, new b.a(), b.a.f36997k);
                }
                boolean z10 = (next == eVar2.M && (dVar4 = eVar2.O.f36595f) != null && dVar4.m()) || (next == eVar2.O && (dVar3 = eVar2.M.f36595f) != null && dVar3.m());
                e.b R = eVar2.R();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (R == bVar && !a10) {
                    if (eVar2.R() == bVar && eVar2.A >= 0 && eVar2.f36657z >= 0 && (eVar2.T() == 8 || (eVar2.f36651u == 0 && eVar2.t() == 0.0f))) {
                        if (!eVar2.i0() && !eVar2.j0() && z10 && !eVar2.i0()) {
                            g(i12, eVar, interfaceC0502b, eVar2);
                        }
                    }
                } else if (!eVar2.k0()) {
                    s.d dVar5 = eVar2.M;
                    if (next == dVar5 && eVar2.O.f36595f == null) {
                        int e10 = dVar5.e() + d10;
                        eVar2.F0(e10, eVar2.v() + e10);
                        i(i12, eVar2, interfaceC0502b);
                    } else {
                        s.d dVar6 = eVar2.O;
                        if (next == dVar6 && dVar5.f36595f == null) {
                            int e11 = d10 - dVar6.e();
                            eVar2.F0(e11 - eVar2.v(), e11);
                            i(i12, eVar2, interfaceC0502b);
                        } else if (z10 && !eVar2.i0()) {
                            f(i12, interfaceC0502b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof s.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator<s.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                s.d next2 = it2.next();
                s.e eVar3 = next2.f36593d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    s.f.O1(i13, eVar3, interfaceC0502b, new b.a(), b.a.f36997k);
                }
                boolean z11 = (next2 == eVar3.M && (dVar2 = eVar3.O.f36595f) != null && dVar2.m()) || (next2 == eVar3.O && (dVar = eVar3.M.f36595f) != null && dVar.m());
                e.b R2 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (R2 == bVar2 && !a11) {
                    if (eVar3.R() == bVar2 && eVar3.A >= 0 && eVar3.f36657z >= 0 && (eVar3.T() == 8 || (eVar3.f36651u == 0 && eVar3.t() == 0.0f))) {
                        if (!eVar3.i0() && !eVar3.j0() && z11 && !eVar3.i0()) {
                            g(i13, eVar, interfaceC0502b, eVar3);
                        }
                    }
                } else if (!eVar3.k0()) {
                    s.d dVar7 = eVar3.M;
                    if (next2 == dVar7 && eVar3.O.f36595f == null) {
                        int e12 = dVar7.e() + d11;
                        eVar3.F0(e12, eVar3.v() + e12);
                        i(i13, eVar3, interfaceC0502b);
                    } else {
                        s.d dVar8 = eVar3.O;
                        if (next2 == dVar8 && dVar7.f36595f == null) {
                            int e13 = d11 - dVar8.e();
                            eVar3.F0(e13 - eVar3.v(), e13);
                            i(i13, eVar3, interfaceC0502b);
                        } else if (z11 && !eVar3.i0()) {
                            f(i13, interfaceC0502b, eVar3);
                        }
                    }
                }
            }
        }
        s.d m12 = eVar.m(d.b.BASELINE);
        if (m12.c() != null && m12.m()) {
            int d12 = m12.d();
            Iterator<s.d> it3 = m12.c().iterator();
            while (it3.hasNext()) {
                s.d next3 = it3.next();
                s.e eVar4 = next3.f36593d;
                int i14 = i10 + 1;
                boolean a12 = a(i14, eVar4);
                if (eVar4.k0() && a12) {
                    s.f.O1(i14, eVar4, interfaceC0502b, new b.a(), b.a.f36997k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || a12) {
                    if (!eVar4.k0() && next3 == eVar4.P) {
                        eVar4.B0(next3.e() + d12);
                        i(i14, eVar4, interfaceC0502b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
