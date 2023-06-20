package z8;

import java.util.Arrays;
import z8.i0;

/* compiled from: H262Reader.java */
/* loaded from: classes2.dex */
public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f40280q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f40281a;

    /* renamed from: b  reason: collision with root package name */
    private p8.a0 f40282b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f40283c;

    /* renamed from: d  reason: collision with root package name */
    private final ea.a0 f40284d;

    /* renamed from: e  reason: collision with root package name */
    private final u f40285e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f40286f;

    /* renamed from: g  reason: collision with root package name */
    private final a f40287g;

    /* renamed from: h  reason: collision with root package name */
    private long f40288h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40289i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40290j;

    /* renamed from: k  reason: collision with root package name */
    private long f40291k;

    /* renamed from: l  reason: collision with root package name */
    private long f40292l;

    /* renamed from: m  reason: collision with root package name */
    private long f40293m;

    /* renamed from: n  reason: collision with root package name */
    private long f40294n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f40295o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f40296p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H262Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f40297e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f40298a;

        /* renamed from: b  reason: collision with root package name */
        public int f40299b;

        /* renamed from: c  reason: collision with root package name */
        public int f40300c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f40301d;

        public a(int i10) {
            this.f40301d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f40298a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f40301d;
                int length = bArr2.length;
                int i13 = this.f40299b;
                if (length < i13 + i12) {
                    this.f40301d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f40301d, this.f40299b, i12);
                this.f40299b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f40298a) {
                int i12 = this.f40299b - i11;
                this.f40299b = i12;
                if (this.f40300c == 0 && i10 == 181) {
                    this.f40300c = i12;
                } else {
                    this.f40298a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f40298a = true;
            }
            byte[] bArr = f40297e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f40298a = false;
            this.f40299b = 0;
            this.f40300c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<j8.p1, java.lang.Long> a(z8.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f40301d
            int r1 = r8.f40299b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            j8.p1$b r6 = new j8.p1$b
            r6.<init>()
            j8.p1$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            j8.p1$b r9 = r9.e0(r6)
            j8.p1$b r9 = r9.j0(r2)
            j8.p1$b r9 = r9.Q(r4)
            j8.p1$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            j8.p1$b r9 = r9.T(r1)
            j8.p1 r9 = r9.E()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9d
            double[] r5 = z8.n.f40280q
            int r6 = r5.length
            if (r4 >= r6) goto L9d
            r1 = r5[r4]
            int r8 = r8.f40300c
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L96
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L96:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.n.a(z8.n$a, java.lang.String):android.util.Pair");
    }

    @Override // z8.m
    public void b() {
        ea.w.a(this.f40286f);
        this.f40287g.c();
        u uVar = this.f40285e;
        if (uVar != null) {
            uVar.d();
        }
        this.f40288h = 0L;
        this.f40289i = false;
        this.f40292l = -9223372036854775807L;
        this.f40294n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // z8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(ea.a0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.n.c(ea.a0):void");
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40281a = dVar.b();
        this.f40282b = kVar.f(dVar.c(), 2);
        k0 k0Var = this.f40283c;
        if (k0Var != null) {
            k0Var.b(kVar, dVar);
        }
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        this.f40292l = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k0 k0Var) {
        this.f40283c = k0Var;
        this.f40286f = new boolean[4];
        this.f40287g = new a(128);
        if (k0Var != null) {
            this.f40285e = new u(178, 128);
            this.f40284d = new ea.a0();
        } else {
            this.f40285e = null;
            this.f40284d = null;
        }
        this.f40292l = -9223372036854775807L;
        this.f40294n = -9223372036854775807L;
    }
}
