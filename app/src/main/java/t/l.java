package t;

import s.d;
import s.e;
import t.f;
import t.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f37045k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37046a;

        static {
            int[] iArr = new int[p.b.values().length];
            f37046a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37046a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37046a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(s.e eVar) {
        super(eVar);
        this.f37066h.f37024e = f.a.LEFT;
        this.f37067i.f37024e = f.a.RIGHT;
        this.f37064f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bc, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // t.p, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(t.d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.l.a(t.d):void");
    }

    @Override // t.p
    void d() {
        s.e I;
        s.e I2;
        s.e eVar = this.f37060b;
        if (eVar.f36611a) {
            this.f37063e.d(eVar.U());
        }
        if (!this.f37063e.f37029j) {
            e.b y10 = this.f37060b.y();
            this.f37062d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (I2 = this.f37060b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar)) {
                    int U = (I2.U() - this.f37060b.L.e()) - this.f37060b.N.e();
                    b(this.f37066h, I2.f36617d.f37066h, this.f37060b.L.e());
                    b(this.f37067i, I2.f36617d.f37067i, -this.f37060b.N.e());
                    this.f37063e.d(U);
                    return;
                } else if (this.f37062d == e.b.FIXED) {
                    this.f37063e.d(this.f37060b.U());
                }
            }
        } else {
            e.b bVar2 = this.f37062d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f37060b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar3)) {
                b(this.f37066h, I.f36617d.f37066h, this.f37060b.L.e());
                b(this.f37067i, I.f36617d.f37067i, -this.f37060b.N.e());
                return;
            }
        }
        g gVar = this.f37063e;
        if (gVar.f37029j) {
            s.e eVar2 = this.f37060b;
            if (eVar2.f36611a) {
                s.d[] dVarArr = eVar2.T;
                if (dVarArr[0].f36595f != null && dVarArr[1].f36595f != null) {
                    if (eVar2.g0()) {
                        this.f37066h.f37025f = this.f37060b.T[0].e();
                        this.f37067i.f37025f = -this.f37060b.T[1].e();
                        return;
                    }
                    f h10 = h(this.f37060b.T[0]);
                    if (h10 != null) {
                        b(this.f37066h, h10, this.f37060b.T[0].e());
                    }
                    f h11 = h(this.f37060b.T[1]);
                    if (h11 != null) {
                        b(this.f37067i, h11, -this.f37060b.T[1].e());
                    }
                    this.f37066h.f37021b = true;
                    this.f37067i.f37021b = true;
                    return;
                } else if (dVarArr[0].f36595f != null) {
                    f h12 = h(dVarArr[0]);
                    if (h12 != null) {
                        b(this.f37066h, h12, this.f37060b.T[0].e());
                        b(this.f37067i, this.f37066h, this.f37063e.f37026g);
                        return;
                    }
                    return;
                } else if (dVarArr[1].f36595f != null) {
                    f h13 = h(dVarArr[1]);
                    if (h13 != null) {
                        b(this.f37067i, h13, -this.f37060b.T[1].e());
                        b(this.f37066h, this.f37067i, -this.f37063e.f37026g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof s.h) || eVar2.I() == null || this.f37060b.m(d.b.CENTER).f36595f != null) {
                    return;
                } else {
                    b(this.f37066h, this.f37060b.I().f36617d.f37066h, this.f37060b.V());
                    b(this.f37067i, this.f37066h, this.f37063e.f37026g);
                    return;
                }
            }
        }
        if (this.f37062d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f37060b;
            int i10 = eVar3.f36649t;
            if (i10 == 2) {
                s.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f36619e.f37063e;
                    this.f37063e.f37031l.add(gVar2);
                    gVar2.f37030k.add(this.f37063e);
                    g gVar3 = this.f37063e;
                    gVar3.f37021b = true;
                    gVar3.f37030k.add(this.f37066h);
                    this.f37063e.f37030k.add(this.f37067i);
                }
            } else if (i10 == 3) {
                if (eVar3.f36651u == 3) {
                    this.f37066h.f37020a = this;
                    this.f37067i.f37020a = this;
                    n nVar = eVar3.f36619e;
                    nVar.f37066h.f37020a = this;
                    nVar.f37067i.f37020a = this;
                    gVar.f37020a = this;
                    if (eVar3.i0()) {
                        this.f37063e.f37031l.add(this.f37060b.f36619e.f37063e);
                        this.f37060b.f36619e.f37063e.f37030k.add(this.f37063e);
                        n nVar2 = this.f37060b.f36619e;
                        nVar2.f37063e.f37020a = this;
                        this.f37063e.f37031l.add(nVar2.f37066h);
                        this.f37063e.f37031l.add(this.f37060b.f36619e.f37067i);
                        this.f37060b.f36619e.f37066h.f37030k.add(this.f37063e);
                        this.f37060b.f36619e.f37067i.f37030k.add(this.f37063e);
                    } else if (this.f37060b.g0()) {
                        this.f37060b.f36619e.f37063e.f37031l.add(this.f37063e);
                        this.f37063e.f37030k.add(this.f37060b.f36619e.f37063e);
                    } else {
                        this.f37060b.f36619e.f37063e.f37031l.add(this.f37063e);
                    }
                } else {
                    g gVar4 = eVar3.f36619e.f37063e;
                    gVar.f37031l.add(gVar4);
                    gVar4.f37030k.add(this.f37063e);
                    this.f37060b.f36619e.f37066h.f37030k.add(this.f37063e);
                    this.f37060b.f36619e.f37067i.f37030k.add(this.f37063e);
                    g gVar5 = this.f37063e;
                    gVar5.f37021b = true;
                    gVar5.f37030k.add(this.f37066h);
                    this.f37063e.f37030k.add(this.f37067i);
                    this.f37066h.f37031l.add(this.f37063e);
                    this.f37067i.f37031l.add(this.f37063e);
                }
            }
        }
        s.e eVar4 = this.f37060b;
        s.d[] dVarArr2 = eVar4.T;
        if (dVarArr2[0].f36595f != null && dVarArr2[1].f36595f != null) {
            if (eVar4.g0()) {
                this.f37066h.f37025f = this.f37060b.T[0].e();
                this.f37067i.f37025f = -this.f37060b.T[1].e();
                return;
            }
            f h14 = h(this.f37060b.T[0]);
            f h15 = h(this.f37060b.T[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f37068j = p.b.CENTER;
        } else if (dVarArr2[0].f36595f != null) {
            f h16 = h(dVarArr2[0]);
            if (h16 != null) {
                b(this.f37066h, h16, this.f37060b.T[0].e());
                c(this.f37067i, this.f37066h, 1, this.f37063e);
            }
        } else if (dVarArr2[1].f36595f != null) {
            f h17 = h(dVarArr2[1]);
            if (h17 != null) {
                b(this.f37067i, h17, -this.f37060b.T[1].e());
                c(this.f37066h, this.f37067i, -1, this.f37063e);
            }
        } else if ((eVar4 instanceof s.h) || eVar4.I() == null) {
        } else {
            b(this.f37066h, this.f37060b.I().f36617d.f37066h, this.f37060b.V());
            c(this.f37067i, this.f37066h, 1, this.f37063e);
        }
    }

    @Override // t.p
    public void e() {
        f fVar = this.f37066h;
        if (fVar.f37029j) {
            this.f37060b.j1(fVar.f37026g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f37061c = null;
        this.f37066h.c();
        this.f37067i.c();
        this.f37063e.c();
        this.f37065g = false;
    }

    @Override // t.p
    boolean m() {
        return this.f37062d != e.b.MATCH_CONSTRAINT || this.f37060b.f36649t == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f37065g = false;
        this.f37066h.c();
        this.f37066h.f37029j = false;
        this.f37067i.c();
        this.f37067i.f37029j = false;
        this.f37063e.f37029j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f37060b.r();
    }
}
