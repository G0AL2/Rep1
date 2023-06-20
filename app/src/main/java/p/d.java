package p;

import java.util.Arrays;
import java.util.HashMap;
import p.i;
import s.d;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f35313r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f35314s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f35315t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f35316u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f35317v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f35318w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f35319x;

    /* renamed from: y  reason: collision with root package name */
    public static long f35320y;

    /* renamed from: z  reason: collision with root package name */
    public static long f35321z;

    /* renamed from: d  reason: collision with root package name */
    private a f35325d;

    /* renamed from: g  reason: collision with root package name */
    p.b[] f35328g;

    /* renamed from: n  reason: collision with root package name */
    final c f35335n;

    /* renamed from: q  reason: collision with root package name */
    private a f35338q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f35322a = false;

    /* renamed from: b  reason: collision with root package name */
    int f35323b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f35324c = null;

    /* renamed from: e  reason: collision with root package name */
    private int f35326e = 32;

    /* renamed from: f  reason: collision with root package name */
    private int f35327f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f35329h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f35330i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f35331j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    int f35332k = 1;

    /* renamed from: l  reason: collision with root package name */
    int f35333l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f35334m = 32;

    /* renamed from: o  reason: collision with root package name */
    private i[] f35336o = new i[f35318w];

    /* renamed from: p  reason: collision with root package name */
    private int f35337p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        void b(a aVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public class b extends p.b {
        public b(d dVar, c cVar) {
            this.f35307e = new j(this, cVar);
        }
    }

    public d() {
        this.f35328g = null;
        this.f35328g = new p.b[32];
        C();
        c cVar = new c();
        this.f35335n = cVar;
        this.f35325d = new h(cVar);
        if (f35317v) {
            this.f35338q = new b(this, cVar);
        } else {
            this.f35338q = new p.b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f35332k; i10++) {
            this.f35331j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f35332k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f35331j[aVar.getKey().f35351c] = true;
            }
            i c10 = aVar.c(this, this.f35331j);
            if (c10 != null) {
                boolean[] zArr = this.f35331j;
                int i12 = c10.f35351c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f35333l; i14++) {
                    p.b bVar = this.f35328g[i14];
                    if (bVar.f35303a.f35358j != i.a.UNRESTRICTED && !bVar.f35308f && bVar.t(c10)) {
                        float j10 = bVar.f35307e.j(c10);
                        if (j10 < 0.0f) {
                            float f11 = (-bVar.f35304b) / j10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    p.b bVar2 = this.f35328g[i13];
                    bVar2.f35303a.f35352d = -1;
                    bVar2.x(c10);
                    i iVar = bVar2.f35303a;
                    iVar.f35352d = i13;
                    iVar.k(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f35317v) {
            while (i10 < this.f35333l) {
                p.b bVar = this.f35328g[i10];
                if (bVar != null) {
                    this.f35335n.f35309a.a(bVar);
                }
                this.f35328g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f35333l) {
            p.b bVar2 = this.f35328g[i10];
            if (bVar2 != null) {
                this.f35335n.f35310b.a(bVar2);
            }
            this.f35328g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f35335n.f35311c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.j(aVar, str);
        } else {
            b10.h();
            b10.j(aVar, str);
        }
        int i10 = this.f35337p;
        int i11 = f35318w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f35318w = i12;
            this.f35336o = (i[]) Arrays.copyOf(this.f35336o, i12);
        }
        i[] iVarArr = this.f35336o;
        int i13 = this.f35337p;
        this.f35337p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(p.b bVar) {
        int i10;
        if (f35315t && bVar.f35308f) {
            bVar.f35303a.i(this, bVar.f35304b);
        } else {
            p.b[] bVarArr = this.f35328g;
            int i11 = this.f35333l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f35303a;
            iVar.f35352d = i11;
            this.f35333l = i11 + 1;
            iVar.k(this, bVar);
        }
        if (f35315t && this.f35322a) {
            int i12 = 0;
            while (i12 < this.f35333l) {
                if (this.f35328g[i12] == null) {
                    System.out.println("WTF");
                }
                p.b[] bVarArr2 = this.f35328g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f35308f) {
                    p.b bVar2 = bVarArr2[i12];
                    bVar2.f35303a.i(this, bVar2.f35304b);
                    if (f35317v) {
                        this.f35335n.f35309a.a(bVar2);
                    } else {
                        this.f35335n.f35310b.a(bVar2);
                    }
                    this.f35328g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f35333l;
                        if (i13 >= i10) {
                            break;
                        }
                        p.b[] bVarArr3 = this.f35328g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f35303a.f35352d == i13) {
                            bVarArr3[i15].f35303a.f35352d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f35328g[i14] = null;
                    }
                    this.f35333l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f35322a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f35333l; i10++) {
            p.b bVar = this.f35328g[i10];
            bVar.f35303a.f35354f = bVar.f35304b;
        }
    }

    public static p.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f35333l) {
                z10 = false;
                break;
            }
            p.b[] bVarArr = this.f35328g;
            if (bVarArr[i10].f35303a.f35358j != i.a.UNRESTRICTED && bVarArr[i10].f35304b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f35333l; i15++) {
                    p.b bVar = this.f35328g[i15];
                    if (bVar.f35303a.f35358j != i.a.UNRESTRICTED && !bVar.f35308f && bVar.f35304b < 0.0f) {
                        int i16 = 9;
                        if (f35316u) {
                            int g10 = bVar.f35307e.g();
                            int i17 = 0;
                            while (i17 < g10) {
                                i a10 = bVar.f35307e.a(i17);
                                float j10 = bVar.f35307e.j(a10);
                                if (j10 > 0.0f) {
                                    int i18 = 0;
                                    while (i18 < i16) {
                                        float f11 = a10.f35356h[i18] / j10;
                                        if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                            i13 = a10.f35351c;
                                            i14 = i18;
                                            i12 = i15;
                                            f10 = f11;
                                        }
                                        i18++;
                                        i16 = 9;
                                    }
                                }
                                i17++;
                                i16 = 9;
                            }
                        } else {
                            for (int i19 = 1; i19 < this.f35332k; i19++) {
                                i iVar = this.f35335n.f35312d[i19];
                                float j11 = bVar.f35307e.j(iVar);
                                if (j11 > 0.0f) {
                                    for (int i20 = 0; i20 < 9; i20++) {
                                        float f12 = iVar.f35356h[i20] / j11;
                                        if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                            i13 = i19;
                                            i12 = i15;
                                            i14 = i20;
                                            f10 = f12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i12 != -1) {
                    p.b bVar2 = this.f35328g[i12];
                    bVar2.f35303a.f35352d = -1;
                    bVar2.x(this.f35335n.f35312d[i13]);
                    i iVar2 = bVar2.f35303a;
                    iVar2.f35352d = i12;
                    iVar2.k(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i11 > this.f35332k / 2) {
                    z11 = true;
                }
            }
            return i11;
        }
        return 0;
    }

    public static e w() {
        return f35319x;
    }

    private void y() {
        int i10 = this.f35326e * 2;
        this.f35326e = i10;
        this.f35328g = (p.b[]) Arrays.copyOf(this.f35328g, i10);
        c cVar = this.f35335n;
        cVar.f35312d = (i[]) Arrays.copyOf(cVar.f35312d, this.f35326e);
        int i11 = this.f35326e;
        this.f35331j = new boolean[i11];
        this.f35327f = i11;
        this.f35334m = i11;
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f35335n;
            i[] iVarArr = cVar.f35312d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.h();
            }
            i10++;
        }
        cVar.f35311c.c(this.f35336o, this.f35337p);
        this.f35337p = 0;
        Arrays.fill(this.f35335n.f35312d, (Object) null);
        HashMap<String, i> hashMap = this.f35324c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f35323b = 0;
        this.f35325d.clear();
        this.f35332k = 1;
        for (int i11 = 0; i11 < this.f35333l; i11++) {
            p.b[] bVarArr = this.f35328g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f35305c = false;
            }
        }
        C();
        this.f35333l = 0;
        if (f35317v) {
            this.f35338q = new b(this, this.f35335n);
        } else {
            this.f35338q = new p.b(this.f35335n);
        }
    }

    public void b(s.e eVar, s.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        p.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        p.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        p.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(p.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f35333l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f35334m
            if (r0 >= r2) goto L12
            int r0 = r5.f35332k
            int r0 = r0 + r1
            int r2 = r5.f35327f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f35308f
            if (r2 != 0) goto L84
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L7b
            p.i r2 = r5.p()
            r6.f35303a = r2
            int r3 = r5.f35333l
            r5.l(r6)
            int r4 = r5.f35333l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            p.d$a r0 = r5.f35338q
            r0.b(r6)
            p.d$a r0 = r5.f35338q
            r5.B(r0, r1)
            int r0 = r2.f35352d
            r3 = -1
            if (r0 != r3) goto L7c
            p.i r0 = r6.f35303a
            if (r0 != r2) goto L59
            p.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f35308f
            if (r0 != 0) goto L62
            p.i r0 = r6.f35303a
            r0.k(r5, r6)
        L62:
            boolean r0 = p.d.f35317v
            if (r0 == 0) goto L6e
            p.c r0 = r5.f35335n
            p.f<p.b> r0 = r0.f35309a
            r0.a(r6)
            goto L75
        L6e:
            p.c r0 = r5.f35335n
            p.f<p.b> r0 = r0.f35310b
            r0.a(r6)
        L75:
            int r0 = r5.f35333l
            int r0 = r0 - r1
            r5.f35333l = r0
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.d(p.b):void");
    }

    public p.b e(i iVar, i iVar2, int i10, int i11) {
        if (f35314s && i11 == 8 && iVar2.f35355g && iVar.f35352d == -1) {
            iVar.i(this, iVar2.f35354f + i10);
            return null;
        }
        p.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        if (f35314s && iVar.f35352d == -1) {
            float f10 = i10;
            iVar.i(this, f10);
            for (int i11 = 0; i11 < this.f35323b + 1; i11++) {
                i iVar2 = this.f35335n.f35312d[i11];
                if (iVar2 != null && iVar2.f35362n && iVar2.f35363o == iVar.f35351c) {
                    iVar2.i(this, iVar2.f35364p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f35352d;
        if (i12 != -1) {
            p.b bVar = this.f35328g[i12];
            if (bVar.f35308f) {
                bVar.f35304b = i10;
                return;
            } else if (bVar.f35307e.g() == 0) {
                bVar.f35308f = true;
                bVar.f35304b = i10;
                return;
            } else {
                p.b r10 = r();
                r10.m(iVar, i10);
                d(r10);
                return;
            }
        }
        p.b r11 = r();
        r11.i(iVar, i10);
        d(r11);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        p.b r10 = r();
        i t10 = t();
        t10.f35353e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        p.b r10 = r();
        i t10 = t();
        t10.f35353e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f35307e.j(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        p.b r10 = r();
        i t10 = t();
        t10.f35353e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        p.b r10 = r();
        i t10 = t();
        t10.f35353e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f35307e.j(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        p.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(p.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f35332k + 1 >= this.f35327f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f35323b + 1;
        this.f35323b = i11;
        this.f35332k++;
        a10.f35351c = i11;
        a10.f35353e = i10;
        this.f35335n.f35312d[i11] = a10;
        this.f35325d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f35332k + 1 >= this.f35327f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f35323b + 1;
        this.f35323b = i10;
        this.f35332k++;
        a10.f35351c = i10;
        this.f35335n.f35312d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f35332k + 1 >= this.f35327f) {
            y();
        }
        if (obj instanceof s.d) {
            s.d dVar = (s.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f35335n);
                iVar = dVar.h();
            }
            int i10 = iVar.f35351c;
            if (i10 == -1 || i10 > this.f35323b || this.f35335n.f35312d[i10] == null) {
                if (i10 != -1) {
                    iVar.h();
                }
                int i11 = this.f35323b + 1;
                this.f35323b = i11;
                this.f35332k++;
                iVar.f35351c = i11;
                iVar.f35358j = i.a.UNRESTRICTED;
                this.f35335n.f35312d[i11] = iVar;
            }
        }
        return iVar;
    }

    public p.b r() {
        p.b b10;
        if (f35317v) {
            b10 = this.f35335n.f35309a.b();
            if (b10 == null) {
                b10 = new b(this, this.f35335n);
                f35321z++;
            } else {
                b10.y();
            }
        } else {
            b10 = this.f35335n.f35310b.b();
            if (b10 == null) {
                b10 = new p.b(this.f35335n);
                f35320y++;
            } else {
                b10.y();
            }
        }
        i.f();
        return b10;
    }

    public i t() {
        if (this.f35332k + 1 >= this.f35327f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f35323b + 1;
        this.f35323b = i10;
        this.f35332k++;
        a10.f35351c = i10;
        this.f35335n.f35312d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f35335n;
    }

    public int x(Object obj) {
        i h10 = ((s.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f35354f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f35325d.isEmpty()) {
            n();
        } else if (!this.f35329h && !this.f35330i) {
            A(this.f35325d);
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f35333l) {
                    z10 = true;
                    break;
                } else if (!this.f35328g[i10].f35308f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                A(this.f35325d);
            } else {
                n();
            }
        }
    }
}
