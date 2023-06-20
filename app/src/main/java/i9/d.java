package i9;

import i9.r;
import j8.b3;
import j8.p1;
import j8.q1;
import java.io.IOException;

/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes2.dex */
public final class d implements r, r.a {

    /* renamed from: a  reason: collision with root package name */
    public final r f31585a;

    /* renamed from: b  reason: collision with root package name */
    private r.a f31586b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f31587c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f31588d;

    /* renamed from: e  reason: collision with root package name */
    long f31589e;

    /* renamed from: f  reason: collision with root package name */
    long f31590f;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: classes2.dex */
    private final class a implements o0 {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f31591a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31592b;

        public a(o0 o0Var) {
            this.f31591a = o0Var;
        }

        @Override // i9.o0
        public void a() throws IOException {
            this.f31591a.a();
        }

        public void b() {
            this.f31592b = false;
        }

        @Override // i9.o0
        public int f(q1 q1Var, m8.g gVar, int i10) {
            if (d.this.j()) {
                return -3;
            }
            if (this.f31592b) {
                gVar.n(4);
                return -4;
            }
            int f10 = this.f31591a.f(q1Var, gVar, i10);
            if (f10 == -5) {
                p1 p1Var = (p1) ea.a.e(q1Var.f32770b);
                int i11 = p1Var.B;
                if (i11 != 0 || p1Var.C != 0) {
                    d dVar = d.this;
                    if (dVar.f31589e != 0) {
                        i11 = 0;
                    }
                    q1Var.f32770b = p1Var.b().N(i11).O(dVar.f31590f == Long.MIN_VALUE ? p1Var.C : 0).E();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f31590f;
            if (j10 == Long.MIN_VALUE || ((f10 != -4 || gVar.f34292e < j10) && !(f10 == -3 && dVar2.g() == Long.MIN_VALUE && !gVar.f34291d))) {
                return f10;
            }
            gVar.g();
            gVar.n(4);
            this.f31592b = true;
            return -4;
        }

        @Override // i9.o0
        public boolean isReady() {
            return !d.this.j() && this.f31591a.isReady();
        }

        @Override // i9.o0
        public int n(long j10) {
            if (d.this.j()) {
                return -3;
            }
            return this.f31591a.n(j10);
        }
    }

    public d(r rVar, boolean z10, long j10, long j11) {
        this.f31585a = rVar;
        this.f31588d = z10 ? j10 : -9223372036854775807L;
        this.f31589e = j10;
        this.f31590f = j11;
    }

    private b3 a(long j10, b3 b3Var) {
        long r10 = ea.n0.r(b3Var.f32330a, 0L, j10 - this.f31589e);
        long j11 = b3Var.f32331b;
        long j12 = this.f31590f;
        long r11 = ea.n0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (r10 == b3Var.f32330a && r11 == b3Var.f32331b) ? b3Var : new b3(r10, r11);
    }

    private static boolean r(long j10, ba.q[] qVarArr) {
        if (j10 != 0) {
            for (ba.q qVar : qVarArr) {
                if (qVar != null) {
                    p1 p10 = qVar.p();
                    if (!ea.v.a(p10.f32709l, p10.f32706i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // i9.r, i9.p0
    public long b() {
        long b10 = this.f31585a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f31590f;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f31585a.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        return this.f31585a.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        long j11 = this.f31589e;
        if (j10 == j11) {
            return j11;
        }
        return this.f31585a.e(j10, a(j10, b3Var));
    }

    @Override // i9.r.a
    public void f(r rVar) {
        ((r.a) ea.a.e(this.f31586b)).f(this);
    }

    @Override // i9.r, i9.p0
    public long g() {
        long g10 = this.f31585a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f31590f;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        this.f31585a.h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f31586b = aVar;
        this.f31585a.i(this, j10);
    }

    boolean j() {
        return this.f31588d != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // i9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long k(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f31588d = r0
            i9.d$a[] r0 = r6.f31587c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            i9.r r0 = r6.f31585a
            long r0 = r0.k(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f31589e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f31590f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            ea.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.d.k(long):long");
    }

    @Override // i9.r
    public long l() {
        if (j()) {
            long j10 = this.f31588d;
            this.f31588d = -9223372036854775807L;
            long l10 = l();
            return l10 != -9223372036854775807L ? l10 : j10;
        }
        long l11 = this.f31585a.l();
        if (l11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        ea.a.f(l11 >= this.f31589e);
        long j11 = this.f31590f;
        if (j11 != Long.MIN_VALUE && l11 > j11) {
            z10 = false;
        }
        ea.a.f(z10);
        return l11;
    }

    @Override // i9.p0.a
    /* renamed from: o */
    public void m(r rVar) {
        ((r.a) ea.a.e(this.f31586b)).m(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // i9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long p(ba.q[] r13, boolean[] r14, i9.o0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            i9.d$a[] r2 = new i9.d.a[r2]
            r0.f31587c = r2
            int r2 = r1.length
            i9.o0[] r9 = new i9.o0[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            i9.d$a[] r3 = r0.f31587c
            r4 = r1[r2]
            i9.d$a r4 = (i9.d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            i9.o0 r11 = r3.f31591a
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            i9.r r2 = r0.f31585a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.p(r3, r4, r5, r6, r7)
            boolean r4 = r12.j()
            if (r4 == 0) goto L47
            long r4 = r0.f31589e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = r(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f31588d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f31589e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.f31590f
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            ea.a.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            i9.d$a[] r4 = r0.f31587c
            r4[r10] = r11
            goto L8e
        L77:
            i9.d$a[] r4 = r0.f31587c
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            i9.o0 r5 = r5.f31591a
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            i9.d$a r5 = new i9.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            i9.d$a[] r4 = r0.f31587c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.d.p(ba.q[], boolean[], i9.o0[], boolean[], long):long");
    }

    @Override // i9.r
    public void q() throws IOException {
        this.f31585a.q();
    }

    public void s(long j10, long j11) {
        this.f31589e = j10;
        this.f31590f = j11;
    }

    @Override // i9.r
    public y0 t() {
        return this.f31585a.t();
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        this.f31585a.u(j10, z10);
    }
}
