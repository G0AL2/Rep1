package t;

import s.d;
import s.e;
import t.f;
import t.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f37050k;

    /* renamed from: l  reason: collision with root package name */
    g f37051l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37052a;

        static {
            int[] iArr = new int[p.b.values().length];
            f37052a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37052a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37052a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(s.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f37050k = fVar;
        this.f37051l = null;
        this.f37066h.f37024e = f.a.TOP;
        this.f37067i.f37024e = f.a.BOTTOM;
        fVar.f37024e = f.a.BASELINE;
        this.f37064f = 1;
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        g gVar;
        float f10;
        float t10;
        float f11;
        int i10;
        s.e eVar;
        int i11 = a.f37052a[this.f37068j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            s.e eVar2 = this.f37060b;
            n(dVar, eVar2.M, eVar2.O, 1);
            return;
        }
        g gVar2 = this.f37063e;
        if (gVar2.f37022c && !gVar2.f37029j && this.f37062d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f37060b;
            int i12 = eVar3.f36651u;
            if (i12 != 2) {
                if (i12 == 3 && eVar3.f36617d.f37063e.f37029j) {
                    int u10 = eVar3.u();
                    if (u10 == -1) {
                        s.e eVar4 = this.f37060b;
                        f10 = eVar4.f36617d.f37063e.f37026g;
                        t10 = eVar4.t();
                    } else if (u10 == 0) {
                        f11 = eVar.f36617d.f37063e.f37026g * this.f37060b.t();
                        i10 = (int) (f11 + 0.5f);
                        this.f37063e.d(i10);
                    } else if (u10 == 1) {
                        s.e eVar5 = this.f37060b;
                        f10 = eVar5.f36617d.f37063e.f37026g;
                        t10 = eVar5.t();
                    } else {
                        i10 = 0;
                        this.f37063e.d(i10);
                    }
                    f11 = f10 / t10;
                    i10 = (int) (f11 + 0.5f);
                    this.f37063e.d(i10);
                }
            } else {
                s.e I = eVar3.I();
                if (I != null) {
                    if (I.f36619e.f37063e.f37029j) {
                        this.f37063e.d((int) ((gVar.f37026g * this.f37060b.B) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f37066h;
        if (fVar.f37022c) {
            f fVar2 = this.f37067i;
            if (fVar2.f37022c) {
                if (fVar.f37029j && fVar2.f37029j && this.f37063e.f37029j) {
                    return;
                }
                if (!this.f37063e.f37029j && this.f37062d == e.b.MATCH_CONSTRAINT) {
                    s.e eVar6 = this.f37060b;
                    if (eVar6.f36649t == 0 && !eVar6.i0()) {
                        int i13 = this.f37066h.f37031l.get(0).f37026g;
                        f fVar3 = this.f37066h;
                        int i14 = i13 + fVar3.f37025f;
                        int i15 = this.f37067i.f37031l.get(0).f37026g + this.f37067i.f37025f;
                        fVar3.d(i14);
                        this.f37067i.d(i15);
                        this.f37063e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f37063e.f37029j && this.f37062d == e.b.MATCH_CONSTRAINT && this.f37059a == 1 && this.f37066h.f37031l.size() > 0 && this.f37067i.f37031l.size() > 0) {
                    int i16 = (this.f37067i.f37031l.get(0).f37026g + this.f37067i.f37025f) - (this.f37066h.f37031l.get(0).f37026g + this.f37066h.f37025f);
                    g gVar3 = this.f37063e;
                    int i17 = gVar3.f37041m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f37063e.f37029j && this.f37066h.f37031l.size() > 0 && this.f37067i.f37031l.size() > 0) {
                    f fVar4 = this.f37066h.f37031l.get(0);
                    f fVar5 = this.f37067i.f37031l.get(0);
                    int i18 = fVar4.f37026g + this.f37066h.f37025f;
                    int i19 = fVar5.f37026g + this.f37067i.f37025f;
                    float P = this.f37060b.P();
                    if (fVar4 == fVar5) {
                        i18 = fVar4.f37026g;
                        i19 = fVar5.f37026g;
                        P = 0.5f;
                    }
                    this.f37066h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f37063e.f37026g) * P)));
                    this.f37067i.d(this.f37066h.f37026g + this.f37063e.f37026g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.e I;
        s.e I2;
        s.e eVar = this.f37060b;
        if (eVar.f36611a) {
            this.f37063e.d(eVar.v());
        }
        if (!this.f37063e.f37029j) {
            this.f37062d = this.f37060b.R();
            if (this.f37060b.X()) {
                this.f37051l = new t.a(this);
            }
            e.b bVar = this.f37062d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f37060b.I()) != null && I2.R() == e.b.FIXED) {
                    int v10 = (I2.v() - this.f37060b.M.e()) - this.f37060b.O.e();
                    b(this.f37066h, I2.f36619e.f37066h, this.f37060b.M.e());
                    b(this.f37067i, I2.f36619e.f37067i, -this.f37060b.O.e());
                    this.f37063e.d(v10);
                    return;
                } else if (this.f37062d == e.b.FIXED) {
                    this.f37063e.d(this.f37060b.v());
                }
            }
        } else if (this.f37062d == e.b.MATCH_PARENT && (I = this.f37060b.I()) != null && I.R() == e.b.FIXED) {
            b(this.f37066h, I.f36619e.f37066h, this.f37060b.M.e());
            b(this.f37067i, I.f36619e.f37067i, -this.f37060b.O.e());
            return;
        }
        g gVar = this.f37063e;
        boolean z10 = gVar.f37029j;
        if (z10) {
            s.e eVar2 = this.f37060b;
            if (eVar2.f36611a) {
                s.d[] dVarArr = eVar2.T;
                if (dVarArr[2].f36595f != null && dVarArr[3].f36595f != null) {
                    if (eVar2.i0()) {
                        this.f37066h.f37025f = this.f37060b.T[2].e();
                        this.f37067i.f37025f = -this.f37060b.T[3].e();
                    } else {
                        f h10 = h(this.f37060b.T[2]);
                        if (h10 != null) {
                            b(this.f37066h, h10, this.f37060b.T[2].e());
                        }
                        f h11 = h(this.f37060b.T[3]);
                        if (h11 != null) {
                            b(this.f37067i, h11, -this.f37060b.T[3].e());
                        }
                        this.f37066h.f37021b = true;
                        this.f37067i.f37021b = true;
                    }
                    if (this.f37060b.X()) {
                        b(this.f37050k, this.f37066h, this.f37060b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f36595f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        b(this.f37066h, h12, this.f37060b.T[2].e());
                        b(this.f37067i, this.f37066h, this.f37063e.f37026g);
                        if (this.f37060b.X()) {
                            b(this.f37050k, this.f37066h, this.f37060b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f36595f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        b(this.f37067i, h13, -this.f37060b.T[3].e());
                        b(this.f37066h, this.f37067i, -this.f37063e.f37026g);
                    }
                    if (this.f37060b.X()) {
                        b(this.f37050k, this.f37066h, this.f37060b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f36595f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        b(this.f37050k, h14, 0);
                        b(this.f37066h, this.f37050k, -this.f37060b.n());
                        b(this.f37067i, this.f37066h, this.f37063e.f37026g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof s.h) || eVar2.I() == null || this.f37060b.m(d.b.CENTER).f36595f != null) {
                    return;
                } else {
                    b(this.f37066h, this.f37060b.I().f36619e.f37066h, this.f37060b.W());
                    b(this.f37067i, this.f37066h, this.f37063e.f37026g);
                    if (this.f37060b.X()) {
                        b(this.f37050k, this.f37066h, this.f37060b.n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z10 && this.f37062d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f37060b;
            int i10 = eVar3.f36651u;
            if (i10 != 2) {
                if (i10 == 3 && !eVar3.i0()) {
                    s.e eVar4 = this.f37060b;
                    if (eVar4.f36649t != 3) {
                        g gVar2 = eVar4.f36617d.f37063e;
                        this.f37063e.f37031l.add(gVar2);
                        gVar2.f37030k.add(this.f37063e);
                        g gVar3 = this.f37063e;
                        gVar3.f37021b = true;
                        gVar3.f37030k.add(this.f37066h);
                        this.f37063e.f37030k.add(this.f37067i);
                    }
                }
            } else {
                s.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar4 = I3.f36619e.f37063e;
                    this.f37063e.f37031l.add(gVar4);
                    gVar4.f37030k.add(this.f37063e);
                    g gVar5 = this.f37063e;
                    gVar5.f37021b = true;
                    gVar5.f37030k.add(this.f37066h);
                    this.f37063e.f37030k.add(this.f37067i);
                }
            }
        } else {
            gVar.b(this);
        }
        s.e eVar5 = this.f37060b;
        s.d[] dVarArr2 = eVar5.T;
        if (dVarArr2[2].f36595f != null && dVarArr2[3].f36595f != null) {
            if (eVar5.i0()) {
                this.f37066h.f37025f = this.f37060b.T[2].e();
                this.f37067i.f37025f = -this.f37060b.T[3].e();
            } else {
                f h15 = h(this.f37060b.T[2]);
                f h16 = h(this.f37060b.T[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f37068j = p.b.CENTER;
            }
            if (this.f37060b.X()) {
                c(this.f37050k, this.f37066h, 1, this.f37051l);
            }
        } else if (dVarArr2[2].f36595f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                b(this.f37066h, h17, this.f37060b.T[2].e());
                c(this.f37067i, this.f37066h, 1, this.f37063e);
                if (this.f37060b.X()) {
                    c(this.f37050k, this.f37066h, 1, this.f37051l);
                }
                e.b bVar2 = this.f37062d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f37060b.t() > 0.0f) {
                    l lVar = this.f37060b.f36617d;
                    if (lVar.f37062d == bVar3) {
                        lVar.f37063e.f37030k.add(this.f37063e);
                        this.f37063e.f37031l.add(this.f37060b.f36617d.f37063e);
                        this.f37063e.f37020a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f36595f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                b(this.f37067i, h18, -this.f37060b.T[3].e());
                c(this.f37066h, this.f37067i, -1, this.f37063e);
                if (this.f37060b.X()) {
                    c(this.f37050k, this.f37066h, 1, this.f37051l);
                }
            }
        } else if (dVarArr2[4].f36595f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                b(this.f37050k, h19, 0);
                c(this.f37066h, this.f37050k, -1, this.f37051l);
                c(this.f37067i, this.f37066h, 1, this.f37063e);
            }
        } else if (!(eVar5 instanceof s.h) && eVar5.I() != null) {
            b(this.f37066h, this.f37060b.I().f36619e.f37066h, this.f37060b.W());
            c(this.f37067i, this.f37066h, 1, this.f37063e);
            if (this.f37060b.X()) {
                c(this.f37050k, this.f37066h, 1, this.f37051l);
            }
            e.b bVar4 = this.f37062d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f37060b.t() > 0.0f) {
                l lVar2 = this.f37060b.f36617d;
                if (lVar2.f37062d == bVar5) {
                    lVar2.f37063e.f37030k.add(this.f37063e);
                    this.f37063e.f37031l.add(this.f37060b.f36617d.f37063e);
                    this.f37063e.f37020a = this;
                }
            }
        }
        if (this.f37063e.f37031l.size() == 0) {
            this.f37063e.f37022c = true;
        }
    }

    @Override // t.p
    public void e() {
        f fVar = this.f37066h;
        if (fVar.f37029j) {
            this.f37060b.k1(fVar.f37026g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f37061c = null;
        this.f37066h.c();
        this.f37067i.c();
        this.f37050k.c();
        this.f37063e.c();
        this.f37065g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return this.f37062d != e.b.MATCH_CONSTRAINT || this.f37060b.f36651u == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f37065g = false;
        this.f37066h.c();
        this.f37066h.f37029j = false;
        this.f37067i.c();
        this.f37067i.f37029j = false;
        this.f37050k.c();
        this.f37050k.f37029j = false;
        this.f37063e.f37029j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f37060b.r();
    }
}
