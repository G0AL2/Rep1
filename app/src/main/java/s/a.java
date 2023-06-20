package s;

import s.d;
import s.e;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: y0  reason: collision with root package name */
    private int f36568y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f36569z0 = true;
    private int A0 = 0;
    boolean B0 = false;

    @Override // s.e
    public void g(p.d dVar, boolean z10) {
        Object[] objArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr = this.T;
        dVarArr[0] = this.L;
        dVarArr[2] = this.M;
        dVarArr[1] = this.N;
        dVarArr[3] = this.O;
        int i13 = 0;
        while (true) {
            objArr = this.T;
            if (i13 >= objArr.length) {
                break;
            }
            objArr[i13].f36598i = dVar.q(objArr[i13]);
            i13++;
        }
        int i14 = this.f36568y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar2 = objArr[i14];
        if (!this.B0) {
            q1();
        }
        if (this.B0) {
            this.B0 = false;
            int i15 = this.f36568y0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.L.f36598i, this.f36616c0);
                dVar.f(this.N.f36598i, this.f36616c0);
                return;
            } else if (i15 == 2 || i15 == 3) {
                dVar.f(this.M.f36598i, this.f36618d0);
                dVar.f(this.O.f36598i, this.f36618d0);
                return;
            } else {
                return;
            }
        }
        for (int i16 = 0; i16 < this.f36674x0; i16++) {
            e eVar = this.f36673w0[i16];
            if ((this.f36569z0 || eVar.h()) && ((((i11 = this.f36568y0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.L.f36595f != null && eVar.N.f36595f != null) || (((i12 = this.f36568y0) == 2 || i12 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.M.f36595f != null && eVar.O.f36595f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.L.k() || this.N.k();
        boolean z13 = this.M.k() || this.O.k();
        int i17 = !z11 && (((i10 = this.f36568y0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.f36674x0; i18++) {
            e eVar2 = this.f36673w0[i18];
            if (this.f36569z0 || eVar2.h()) {
                p.i q10 = dVar.q(eVar2.T[this.f36568y0]);
                d[] dVarArr2 = eVar2.T;
                int i19 = this.f36568y0;
                dVarArr2[i19].f36598i = q10;
                int i20 = (dVarArr2[i19].f36595f == null || dVarArr2[i19].f36595f.f36593d != this) ? 0 : dVarArr2[i19].f36596g + 0;
                if (i19 != 0 && i19 != 2) {
                    dVar.g(dVar2.f36598i, q10, this.A0 + i20, z11);
                } else {
                    dVar.i(dVar2.f36598i, q10, this.A0 - i20, z11);
                }
                dVar.e(dVar2.f36598i, q10, this.A0 + i20, i17);
            }
        }
        int i21 = this.f36568y0;
        if (i21 == 0) {
            dVar.e(this.N.f36598i, this.L.f36598i, 0, 8);
            dVar.e(this.L.f36598i, this.X.N.f36598i, 0, 4);
            dVar.e(this.L.f36598i, this.X.L.f36598i, 0, 0);
        } else if (i21 == 1) {
            dVar.e(this.L.f36598i, this.N.f36598i, 0, 8);
            dVar.e(this.L.f36598i, this.X.L.f36598i, 0, 4);
            dVar.e(this.L.f36598i, this.X.N.f36598i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.O.f36598i, this.M.f36598i, 0, 8);
            dVar.e(this.M.f36598i, this.X.O.f36598i, 0, 4);
            dVar.e(this.M.f36598i, this.X.M.f36598i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.M.f36598i, this.O.f36598i, 0, 8);
            dVar.e(this.M.f36598i, this.X.M.f36598i, 0, 4);
            dVar.e(this.M.f36598i, this.X.O.f36598i, 0, 0);
        }
    }

    @Override // s.e
    public boolean h() {
        return true;
    }

    @Override // s.e
    public boolean l0() {
        return this.B0;
    }

    @Override // s.e
    public boolean m0() {
        return this.B0;
    }

    public boolean q1() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f36674x0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f36673w0[i13];
            if ((this.f36569z0 || eVar.h()) && ((((i11 = this.f36568y0) == 0 || i11 == 1) && !eVar.l0()) || (((i12 = this.f36568y0) == 2 || i12 == 3) && !eVar.m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f36674x0; i15++) {
            e eVar2 = this.f36673w0[i15];
            if (this.f36569z0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f36568y0;
                    if (i16 == 0) {
                        i14 = eVar2.m(d.b.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(d.b.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(d.b.TOP).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.f36568y0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(d.b.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(d.b.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(d.b.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.A0;
        int i19 = this.f36568y0;
        if (i19 != 0 && i19 != 1) {
            F0(i18, i18);
        } else {
            C0(i18, i18);
        }
        this.B0 = true;
        return true;
    }

    public boolean r1() {
        return this.f36569z0;
    }

    public int s1() {
        return this.f36568y0;
    }

    public int t1() {
        return this.A0;
    }

    @Override // s.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f36674x0; i10++) {
            e eVar = this.f36673w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    public int u1() {
        int i10 = this.f36568y0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v1() {
        for (int i10 = 0; i10 < this.f36674x0; i10++) {
            e eVar = this.f36673w0[i10];
            if (this.f36569z0 || eVar.h()) {
                int i11 = this.f36568y0;
                if (i11 == 0 || i11 == 1) {
                    eVar.P0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void w1(boolean z10) {
        this.f36569z0 = z10;
    }

    public void x1(int i10) {
        this.f36568y0 = i10;
    }

    public void y1(int i10) {
        this.A0 = i10;
    }
}
