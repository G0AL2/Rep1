package s;

import java.util.ArrayList;
import s.e;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f36570a;

    /* renamed from: b  reason: collision with root package name */
    protected e f36571b;

    /* renamed from: c  reason: collision with root package name */
    protected e f36572c;

    /* renamed from: d  reason: collision with root package name */
    protected e f36573d;

    /* renamed from: e  reason: collision with root package name */
    protected e f36574e;

    /* renamed from: f  reason: collision with root package name */
    protected e f36575f;

    /* renamed from: g  reason: collision with root package name */
    protected e f36576g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f36577h;

    /* renamed from: i  reason: collision with root package name */
    protected int f36578i;

    /* renamed from: j  reason: collision with root package name */
    protected int f36579j;

    /* renamed from: k  reason: collision with root package name */
    protected float f36580k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f36581l;

    /* renamed from: m  reason: collision with root package name */
    int f36582m;

    /* renamed from: n  reason: collision with root package name */
    int f36583n;

    /* renamed from: o  reason: collision with root package name */
    private int f36584o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f36585p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f36586q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f36587r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f36588s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f36589t;

    public c(e eVar, int i10, boolean z10) {
        this.f36585p = false;
        this.f36570a = eVar;
        this.f36584o = i10;
        this.f36585p = z10;
    }

    private void b() {
        int i10 = this.f36584o * 2;
        e eVar = this.f36570a;
        boolean z10 = false;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f36578i++;
            e[] eVarArr = eVar.f36648s0;
            int i11 = this.f36584o;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f36646r0[i11] = null;
            if (eVar.T() != 8) {
                this.f36581l++;
                e.b s10 = eVar.s(this.f36584o);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f36582m += eVar.C(this.f36584o);
                }
                int e10 = this.f36582m + eVar.T[i10].e();
                this.f36582m = e10;
                int i12 = i10 + 1;
                this.f36582m = e10 + eVar.T[i12].e();
                int e11 = this.f36583n + eVar.T[i10].e();
                this.f36583n = e11;
                this.f36583n = e11 + eVar.T[i12].e();
                if (this.f36571b == null) {
                    this.f36571b = eVar;
                }
                this.f36573d = eVar;
                e.b[] bVarArr = eVar.W;
                int i13 = this.f36584o;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f36653v;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f36579j++;
                        float[] fArr = eVar.f36644q0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f36580k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f36586q = true;
                            } else {
                                this.f36587r = true;
                            }
                            if (this.f36577h == null) {
                                this.f36577h = new ArrayList<>();
                            }
                            this.f36577h.add(eVar);
                        }
                        if (this.f36575f == null) {
                            this.f36575f = eVar;
                        }
                        e eVar4 = this.f36576g;
                        if (eVar4 != null) {
                            eVar4.f36646r0[this.f36584o] = eVar;
                        }
                        this.f36576g = eVar;
                    }
                    if (this.f36584o == 0) {
                        if (eVar.f36649t == 0 && eVar.f36654w == 0) {
                            int i14 = eVar.f36655x;
                        }
                    } else if (eVar.f36651u == 0 && eVar.f36657z == 0) {
                        int i15 = eVar.A;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f36648s0[this.f36584o] = eVar;
            }
            d dVar = eVar.T[i10 + 1].f36595f;
            if (dVar != null) {
                e eVar5 = dVar.f36593d;
                d[] dVarArr = eVar5.T;
                if (dVarArr[i10].f36595f != null && dVarArr[i10].f36595f.f36593d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f36571b;
        if (eVar6 != null) {
            this.f36582m -= eVar6.T[i10].e();
        }
        e eVar7 = this.f36573d;
        if (eVar7 != null) {
            this.f36582m -= eVar7.T[i10 + 1].e();
        }
        this.f36572c = eVar;
        if (this.f36584o == 0 && this.f36585p) {
            this.f36574e = eVar;
        } else {
            this.f36574e = this.f36570a;
        }
        if (this.f36587r && this.f36586q) {
            z10 = true;
        }
        this.f36588s = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.T() != 8 && eVar.W[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f36653v;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f36589t) {
            b();
        }
        this.f36589t = true;
    }
}
