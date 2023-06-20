package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.e;
import t.b;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private s.f f37012a;

    /* renamed from: d  reason: collision with root package name */
    private s.f f37015d;

    /* renamed from: f  reason: collision with root package name */
    private b.InterfaceC0502b f37017f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f37018g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<m> f37019h;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37013b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37014c = true;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f37016e = new ArrayList<>();

    public e(s.f fVar) {
        new ArrayList();
        this.f37017f = null;
        this.f37018g = new b.a();
        this.f37019h = new ArrayList<>();
        this.f37012a = fVar;
        this.f37015d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f37023d;
        if (pVar.f37061c == null) {
            s.f fVar3 = this.f37012a;
            if (pVar == fVar3.f36617d || pVar == fVar3.f36619e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f37061c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f37066h.f37030k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f37067i.f37030k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f37050k.f37030k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f37066h.f37031l) {
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f37067i.f37031l) {
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (f fVar6 : ((n) pVar).f37050k.f37031l) {
                    a(fVar6, i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(s.f fVar) {
        int i10;
        e.b bVar;
        int i11;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<s.e> it = fVar.f36677w0.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            e.b[] bVarArr = next.W;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.T() == 8) {
                next.f36611a = true;
            } else {
                if (next.f36656y < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f36649t = 2;
                }
                if (next.B < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f36651u = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f36649t = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f36651u = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f36649t == 0) {
                            next.f36649t = 3;
                        }
                        if (next.f36651u == 0) {
                            next.f36651u = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f36649t == 1 && (next.L.f36595f == null || next.N.f36595f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f36651u == 1 && (next.M.f36595f == null || next.O.f36595f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f36617d;
                lVar.f37062d = bVar9;
                int i12 = next.f36649t;
                lVar.f37059a = i12;
                n nVar = next.f36619e;
                nVar.f37062d = bVar10;
                int i13 = next.f36651u;
                nVar.f37059a = i13;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int U = next.U();
                    if (bVar9 == bVar11) {
                        i10 = (fVar.U() - next.L.f36596g) - next.N.f36596g;
                        bVar = e.b.FIXED;
                    } else {
                        i10 = U;
                        bVar = bVar9;
                    }
                    int v10 = next.v();
                    if (bVar10 == bVar11) {
                        i11 = (fVar.v() - next.M.f36596g) - next.O.f36596g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i11 = v10;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i10, bVar2, i11);
                    next.f36617d.f37063e.d(next.U());
                    next.f36619e.f37063e.d(next.v());
                    next.f36611a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v11 = next.v();
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, (int) ((v11 * next.f36612a0) + 0.5f), bVar12, v11);
                            next.f36617d.f37063e.d(next.U());
                            next.f36619e.f37063e.d(next.v());
                            next.f36611a = true;
                        } else if (i12 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f36617d.f37063e.f37041m = next.U();
                        } else if (i12 == 2) {
                            e.b[] bVarArr2 = fVar.W;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.f36656y * fVar.U()) + 0.5f), bVar10, next.v());
                                next.f36617d.f37063e.d(next.U());
                                next.f36619e.f37063e.d(next.v());
                                next.f36611a = true;
                            }
                        } else {
                            s.d[] dVarArr = next.T;
                            if (dVarArr[0].f36595f == null || dVarArr[1].f36595f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f36617d.f37063e.d(next.U());
                                next.f36619e.f37063e.d(next.v());
                                next.f36611a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int U2 = next.U();
                            float f10 = next.f36612a0;
                            if (next.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, U2, bVar15, (int) ((U2 * f10) + 0.5f));
                            next.f36617d.f37063e.d(next.U());
                            next.f36619e.f37063e.d(next.v());
                            next.f36611a = true;
                        } else if (i13 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f36619e.f37063e.f37041m = next.v();
                        } else if (i13 == 2) {
                            e.b[] bVarArr3 = fVar.W;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.U(), bVar17, (int) ((next.B * fVar.v()) + 0.5f));
                                next.f36617d.f37063e.d(next.U());
                                next.f36619e.f37063e.d(next.v());
                                next.f36611a = true;
                            }
                        } else {
                            s.d[] dVarArr2 = next.T;
                            if (dVarArr2[2].f36595f == null || dVarArr2[3].f36595f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f36617d.f37063e.d(next.U());
                                next.f36619e.f37063e.d(next.v());
                                next.f36611a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i12 == 1 || i13 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f36617d.f37063e.f37041m = next.U();
                            next.f36619e.f37063e.f37041m = next.v();
                        } else if (i13 == 2 && i12 == 2) {
                            e.b[] bVarArr4 = fVar.W;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr4[1] == bVar20) {
                                l(next, bVar20, (int) ((next.f36656y * fVar.U()) + 0.5f), bVar20, (int) ((next.B * fVar.v()) + 0.5f));
                                next.f36617d.f37063e.d(next.U());
                                next.f36619e.f37063e.d(next.v());
                                next.f36611a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(s.f fVar, int i10) {
        int size = this.f37019h.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f37019h.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f37066h.f37030k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f37067i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f37066h, i10, 0, pVar.f37067i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f37067i.f37030k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f37066h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f37067i, i10, 1, pVar.f37066h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f37050k.f37030k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(s.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f37018g;
        aVar.f37000a = bVar;
        aVar.f37001b = bVar2;
        aVar.f37002c = i10;
        aVar.f37003d = i11;
        this.f37017f.b(eVar, aVar);
        eVar.h1(this.f37018g.f37004e);
        eVar.I0(this.f37018g.f37005f);
        eVar.H0(this.f37018g.f37007h);
        eVar.x0(this.f37018g.f37006g);
    }

    public void c() {
        d(this.f37016e);
        this.f37019h.clear();
        m.f37047c = 0;
        i(this.f37012a.f36617d, 0, this.f37019h);
        i(this.f37012a.f36619e, 1, this.f37019h);
        this.f37013b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f37015d.f36617d.f();
        this.f37015d.f36619e.f();
        arrayList.add(this.f37015d.f36617d);
        arrayList.add(this.f37015d.f36619e);
        Iterator<s.e> it = this.f37015d.f36677w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.e next = it.next();
            if (next instanceof s.g) {
                arrayList.add(new j(next));
            } else {
                if (next.g0()) {
                    if (next.f36613b == null) {
                        next.f36613b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f36613b);
                } else {
                    arrayList.add(next.f36617d);
                }
                if (next.i0()) {
                    if (next.f36615c == null) {
                        next.f36615c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f36615c);
                } else {
                    arrayList.add(next.f36619e);
                }
                if (next instanceof s.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f37060b != this.f37015d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f37013b || this.f37014c) {
            Iterator<s.e> it = this.f37012a.f36677w0.iterator();
            while (it.hasNext()) {
                s.e next = it.next();
                next.l();
                next.f36611a = false;
                next.f36617d.r();
                next.f36619e.q();
            }
            this.f37012a.l();
            s.f fVar = this.f37012a;
            fVar.f36611a = false;
            fVar.f36617d.r();
            this.f37012a.f36619e.q();
            this.f37014c = false;
        }
        if (b(this.f37015d)) {
            return false;
        }
        this.f37012a.j1(0);
        this.f37012a.k1(0);
        e.b s10 = this.f37012a.s(0);
        e.b s11 = this.f37012a.s(1);
        if (this.f37013b) {
            c();
        }
        int V = this.f37012a.V();
        int W = this.f37012a.W();
        this.f37012a.f36617d.f37066h.d(V);
        this.f37012a.f36619e.f37066h.d(W);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f37016e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f37012a.M0(e.b.FIXED);
                s.f fVar2 = this.f37012a;
                fVar2.h1(e(fVar2, 0));
                s.f fVar3 = this.f37012a;
                fVar3.f36617d.f37063e.d(fVar3.U());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f37012a.d1(e.b.FIXED);
                s.f fVar4 = this.f37012a;
                fVar4.I0(e(fVar4, 1));
                s.f fVar5 = this.f37012a;
                fVar5.f36619e.f37063e.d(fVar5.v());
            }
        }
        s.f fVar6 = this.f37012a;
        e.b[] bVarArr = fVar6.W;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int U = fVar6.U() + V;
            this.f37012a.f36617d.f37067i.d(U);
            this.f37012a.f36617d.f37063e.d(U - V);
            m();
            s.f fVar7 = this.f37012a;
            e.b[] bVarArr2 = fVar7.W;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + W;
                this.f37012a.f36619e.f37067i.d(v10);
                this.f37012a.f36619e.f37063e.d(v10 - W);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f37016e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f37060b != this.f37012a || next2.f37065g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f37016e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z11 || next3.f37060b != this.f37012a) {
                if (!next3.f37066h.f37029j || ((!next3.f37067i.f37029j && !(next3 instanceof j)) || (!next3.f37063e.f37029j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f37012a.M0(s10);
        this.f37012a.d1(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f37013b) {
            Iterator<s.e> it = this.f37012a.f36677w0.iterator();
            while (it.hasNext()) {
                s.e next = it.next();
                next.l();
                next.f36611a = false;
                l lVar = next.f36617d;
                lVar.f37063e.f37029j = false;
                lVar.f37065g = false;
                lVar.r();
                n nVar = next.f36619e;
                nVar.f37063e.f37029j = false;
                nVar.f37065g = false;
                nVar.q();
            }
            this.f37012a.l();
            s.f fVar = this.f37012a;
            fVar.f36611a = false;
            l lVar2 = fVar.f36617d;
            lVar2.f37063e.f37029j = false;
            lVar2.f37065g = false;
            lVar2.r();
            n nVar2 = this.f37012a.f36619e;
            nVar2.f37063e.f37029j = false;
            nVar2.f37065g = false;
            nVar2.q();
            c();
        }
        if (b(this.f37015d)) {
            return false;
        }
        this.f37012a.j1(0);
        this.f37012a.k1(0);
        this.f37012a.f36617d.f37066h.d(0);
        this.f37012a.f36619e.f37066h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f37012a.s(0);
        e.b s11 = this.f37012a.s(1);
        int V = this.f37012a.V();
        int W = this.f37012a.W();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<p> it = this.f37016e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f37064f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f37012a.M0(e.b.FIXED);
                    s.f fVar = this.f37012a;
                    fVar.h1(e(fVar, 0));
                    s.f fVar2 = this.f37012a;
                    fVar2.f36617d.f37063e.d(fVar2.U());
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f37012a.d1(e.b.FIXED);
                s.f fVar3 = this.f37012a;
                fVar3.I0(e(fVar3, 1));
                s.f fVar4 = this.f37012a;
                fVar4.f36619e.f37063e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            s.f fVar5 = this.f37012a;
            e.b[] bVarArr = fVar5.W;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int U = fVar5.U() + V;
                this.f37012a.f36617d.f37067i.d(U);
                this.f37012a.f36617d.f37063e.d(U - V);
                z11 = true;
            }
            z11 = false;
        } else {
            s.f fVar6 = this.f37012a;
            e.b[] bVarArr2 = fVar6.W;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar6.v() + W;
                this.f37012a.f36619e.f37067i.d(v10);
                this.f37012a.f36619e.f37063e.d(v10 - W);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f37016e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f37064f == i10 && (next2.f37060b != this.f37012a || next2.f37065g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f37016e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f37064f == i10 && (z11 || next3.f37060b != this.f37012a)) {
                if (!next3.f37066h.f37029j || !next3.f37067i.f37029j || (!(next3 instanceof c) && !next3.f37063e.f37029j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f37012a.M0(s10);
        this.f37012a.d1(s11);
        return z12;
    }

    public void j() {
        this.f37013b = true;
    }

    public void k() {
        this.f37014c = true;
    }

    public void m() {
        g gVar;
        Iterator<s.e> it = this.f37012a.f36677w0.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            if (!next.f36611a) {
                e.b[] bVarArr = next.W;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f36649t;
                int i11 = next.f36651u;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f36617d.f37063e;
                boolean z12 = gVar2.f37029j;
                g gVar3 = next.f36619e.f37063e;
                boolean z13 = gVar3.f37029j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f37026g, bVar4, gVar3.f37026g);
                    next.f36611a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f37026g, bVar3, gVar3.f37026g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f36619e.f37063e.f37041m = next.v();
                    } else {
                        next.f36619e.f37063e.d(next.v());
                        next.f36611a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f37026g, e.b.FIXED, gVar3.f37026g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f36617d.f37063e.f37041m = next.U();
                    } else {
                        next.f36617d.f37063e.d(next.U());
                        next.f36611a = true;
                    }
                }
                if (next.f36611a && (gVar = next.f36619e.f37051l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0502b interfaceC0502b) {
        this.f37017f = interfaceC0502b;
    }
}
