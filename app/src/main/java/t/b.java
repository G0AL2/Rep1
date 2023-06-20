package t;

import java.util.ArrayList;
import s.d;
import s.e;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<s.e> f36994a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f36995b = new a();

    /* renamed from: c  reason: collision with root package name */
    private s.f f36996c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f36997k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f36998l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f36999m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f37000a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f37001b;

        /* renamed from: c  reason: collision with root package name */
        public int f37002c;

        /* renamed from: d  reason: collision with root package name */
        public int f37003d;

        /* renamed from: e  reason: collision with root package name */
        public int f37004e;

        /* renamed from: f  reason: collision with root package name */
        public int f37005f;

        /* renamed from: g  reason: collision with root package name */
        public int f37006g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f37007h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f37008i;

        /* renamed from: j  reason: collision with root package name */
        public int f37009j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0502b {
        void a();

        void b(s.e eVar, a aVar);
    }

    public b(s.f fVar) {
        this.f36996c = fVar;
    }

    private boolean a(InterfaceC0502b interfaceC0502b, s.e eVar, int i10) {
        this.f36995b.f37000a = eVar.y();
        this.f36995b.f37001b = eVar.R();
        this.f36995b.f37002c = eVar.U();
        this.f36995b.f37003d = eVar.v();
        a aVar = this.f36995b;
        aVar.f37008i = false;
        aVar.f37009j = i10;
        e.b bVar = aVar.f37000a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f37001b == bVar2;
        boolean z12 = z10 && eVar.f36612a0 > 0.0f;
        boolean z13 = z11 && eVar.f36612a0 > 0.0f;
        if (z12 && eVar.f36653v[0] == 4) {
            aVar.f37000a = e.b.FIXED;
        }
        if (z13 && eVar.f36653v[1] == 4) {
            aVar.f37001b = e.b.FIXED;
        }
        interfaceC0502b.b(eVar, aVar);
        eVar.h1(this.f36995b.f37004e);
        eVar.I0(this.f36995b.f37005f);
        eVar.H0(this.f36995b.f37007h);
        eVar.x0(this.f36995b.f37006g);
        a aVar2 = this.f36995b;
        aVar2.f37009j = a.f36997k;
        return aVar2.f37008i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
        if (r8 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r5.f36612a0 <= 0.0f) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(s.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<s.e> r0 = r13.f36677w0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            t.b$b r2 = r13.F1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<s.e> r5 = r13.f36677w0
            java.lang.Object r5 = r5.get(r4)
            s.e r5 = (s.e) r5
            boolean r6 = r5 instanceof s.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof s.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            t.l r6 = r5.f36617d
            if (r6 == 0) goto L47
            t.n r7 = r5.f36619e
            if (r7 == 0) goto L47
            t.g r6 = r6.f37063e
            boolean r6 = r6.f37029j
            if (r6 == 0) goto L47
            t.g r6 = r7.f37063e
            boolean r6 = r6.f37029j
            if (r6 == 0) goto L47
            goto La0
        L47:
            s.e$b r6 = r5.s(r3)
            r7 = 1
            s.e$b r8 = r5.s(r7)
            s.e$b r9 = s.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f36649t
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f36651u
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof s.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f36649t
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f36651u
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f36612a0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = t.b.a.f36997k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.b(s.f):void");
    }

    private void c(s.f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i11);
        fVar.I0(i12);
        fVar.X0(G);
        fVar.W0(F);
        this.f36996c.T1(i10);
        this.f36996c.p1();
    }

    public long d(s.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        s.f fVar2;
        int i20;
        boolean z11;
        int i21;
        int i22;
        boolean z12;
        b bVar = this;
        InterfaceC0502b F1 = fVar.F1();
        int size = fVar.f36677w0.size();
        int U = fVar.U();
        int v10 = fVar.v();
        boolean b10 = s.j.b(i10, 128);
        boolean z13 = b10 || s.j.b(i10, 64);
        if (z13) {
            for (int i23 = 0; i23 < size; i23++) {
                s.e eVar = fVar.f36677w0.get(i23);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z14) || ((eVar.i0() && z14) || (eVar instanceof s.k) || eVar.g0() || eVar.i0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            p.e eVar2 = p.d.f35319x;
        }
        boolean z15 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        if (z15) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.U() != min) {
                fVar.h1(min);
                fVar.I1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.I0(min2);
                fVar.I1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.C1(b10);
                i19 = 2;
            } else {
                boolean D1 = fVar.D1(b10);
                if (i13 == 1073741824) {
                    D1 &= fVar.E1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.E1(b10, 1) & D1;
                    i19++;
                } else {
                    z10 = D1;
                }
            }
            if (z10) {
                fVar.m1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int G1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f36994a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, U, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z16 = y11 == bVar3;
            boolean z17 = fVar.R() == bVar3;
            int max = Math.max(fVar.U(), bVar.f36996c.G());
            int max2 = Math.max(fVar.v(), bVar.f36996c.F());
            int i24 = 0;
            boolean z18 = false;
            while (i24 < size2) {
                s.e eVar3 = bVar.f36994a.get(i24);
                if (eVar3 instanceof s.k) {
                    int U2 = eVar3.U();
                    int v11 = eVar3.v();
                    i22 = G1;
                    boolean a10 = bVar.a(F1, eVar3, a.f36998l) | z18;
                    int U3 = eVar3.U();
                    int v12 = eVar3.v();
                    if (U3 != U2) {
                        eVar3.h1(U3);
                        if (z16 && eVar3.K() > max) {
                            max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                        }
                        z12 = true;
                    } else {
                        z12 = a10;
                    }
                    if (v12 != v11) {
                        eVar3.I0(v12);
                        if (z17 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z12 = true;
                    }
                    z18 = z12 | ((s.k) eVar3).s1();
                } else {
                    i22 = G1;
                }
                i24++;
                G1 = i22;
            }
            int i25 = G1;
            int i26 = 0;
            int i27 = 2;
            while (i26 < i27) {
                int i28 = 0;
                while (i28 < size2) {
                    s.e eVar4 = bVar.f36994a.get(i28);
                    if (((eVar4 instanceof s.h) && !(eVar4 instanceof s.k)) || (eVar4 instanceof s.g) || eVar4.T() == 8 || ((z15 && eVar4.f36617d.f37063e.f37029j && eVar4.f36619e.f37063e.f37029j) || (eVar4 instanceof s.k))) {
                        z11 = z15;
                        i21 = size2;
                    } else {
                        int U4 = eVar4.U();
                        int v13 = eVar4.v();
                        z11 = z15;
                        int n10 = eVar4.n();
                        int i29 = a.f36998l;
                        i21 = size2;
                        if (i26 == 1) {
                            i29 = a.f36999m;
                        }
                        boolean a11 = bVar.a(F1, eVar4, i29) | z18;
                        int U5 = eVar4.U();
                        int v14 = eVar4.v();
                        if (U5 != U4) {
                            eVar4.h1(U5);
                            if (z16 && eVar4.K() > max) {
                                max = Math.max(max, eVar4.K() + eVar4.m(d.b.RIGHT).e());
                            }
                            a11 = true;
                        }
                        if (v14 != v13) {
                            eVar4.I0(v14);
                            if (z17 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            a11 = true;
                        }
                        z18 = (!eVar4.X() || n10 == eVar4.n()) ? a11 : true;
                    }
                    i28++;
                    bVar = this;
                    z15 = z11;
                    size2 = i21;
                }
                boolean z19 = z15;
                int i30 = size2;
                if (!z18) {
                    break;
                }
                i26++;
                c(fVar, "intermediate pass", i26, U, v10);
                bVar = this;
                z15 = z19;
                size2 = i30;
                i27 = 2;
                z18 = false;
            }
            fVar2 = fVar;
            i20 = i25;
        } else {
            fVar2 = fVar;
            i20 = G1;
        }
        fVar2.S1(i20);
        return 0L;
    }

    public void e(s.f fVar) {
        this.f36994a.clear();
        int size = fVar.f36677w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            s.e eVar = fVar.f36677w0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f36994a.add(eVar);
            }
        }
        fVar.I1();
    }
}
