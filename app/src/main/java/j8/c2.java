package j8;

import i9.u;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes2.dex */
final class c2 {

    /* renamed from: a  reason: collision with root package name */
    public final i9.r f32336a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f32337b;

    /* renamed from: c  reason: collision with root package name */
    public final i9.o0[] f32338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32339d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32340e;

    /* renamed from: f  reason: collision with root package name */
    public d2 f32341f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f32342g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f32343h;

    /* renamed from: i  reason: collision with root package name */
    private final y2[] f32344i;

    /* renamed from: j  reason: collision with root package name */
    private final ba.a0 f32345j;

    /* renamed from: k  reason: collision with root package name */
    private final i2 f32346k;

    /* renamed from: l  reason: collision with root package name */
    private c2 f32347l;

    /* renamed from: m  reason: collision with root package name */
    private i9.y0 f32348m;

    /* renamed from: n  reason: collision with root package name */
    private ba.b0 f32349n;

    /* renamed from: o  reason: collision with root package name */
    private long f32350o;

    public c2(y2[] y2VarArr, long j10, ba.a0 a0Var, da.b bVar, i2 i2Var, d2 d2Var, ba.b0 b0Var) {
        this.f32344i = y2VarArr;
        this.f32350o = j10;
        this.f32345j = a0Var;
        this.f32346k = i2Var;
        u.b bVar2 = d2Var.f32367a;
        this.f32337b = bVar2.f31793a;
        this.f32341f = d2Var;
        this.f32348m = i9.y0.f31861d;
        this.f32349n = b0Var;
        this.f32338c = new i9.o0[y2VarArr.length];
        this.f32343h = new boolean[y2VarArr.length];
        this.f32336a = e(bVar2, i2Var, bVar, d2Var.f32368b, d2Var.f32370d);
    }

    private void c(i9.o0[] o0VarArr) {
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.f32344i;
            if (i10 >= y2VarArr.length) {
                return;
            }
            if (y2VarArr[i10].e() == -2 && this.f32349n.c(i10)) {
                o0VarArr[i10] = new i9.k();
            }
            i10++;
        }
    }

    private static i9.r e(u.b bVar, i2 i2Var, da.b bVar2, long j10, long j11) {
        i9.r h10 = i2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new i9.d(h10, true, 0L, j11) : h10;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ba.b0 b0Var = this.f32349n;
            if (i10 >= b0Var.f5043a) {
                return;
            }
            boolean c10 = b0Var.c(i10);
            ba.q qVar = this.f32349n.f5045c[i10];
            if (c10 && qVar != null) {
                qVar.disable();
            }
            i10++;
        }
    }

    private void g(i9.o0[] o0VarArr) {
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.f32344i;
            if (i10 >= y2VarArr.length) {
                return;
            }
            if (y2VarArr[i10].e() == -2) {
                o0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ba.b0 b0Var = this.f32349n;
            if (i10 >= b0Var.f5043a) {
                return;
            }
            boolean c10 = b0Var.c(i10);
            ba.q qVar = this.f32349n.f5045c[i10];
            if (c10 && qVar != null) {
                qVar.enable();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f32347l == null;
    }

    private static void u(i2 i2Var, i9.r rVar) {
        try {
            if (rVar instanceof i9.d) {
                i2Var.z(((i9.d) rVar).f31585a);
            } else {
                i2Var.z(rVar);
            }
        } catch (RuntimeException e10) {
            ea.r.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        i9.r rVar = this.f32336a;
        if (rVar instanceof i9.d) {
            long j10 = this.f32341f.f32370d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((i9.d) rVar).s(0L, j10);
        }
    }

    public long a(ba.b0 b0Var, long j10, boolean z10) {
        return b(b0Var, j10, z10, new boolean[this.f32344i.length]);
    }

    public long b(ba.b0 b0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= b0Var.f5043a) {
                break;
            }
            boolean[] zArr2 = this.f32343h;
            if (z10 || !b0Var.b(this.f32349n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f32338c);
        f();
        this.f32349n = b0Var;
        h();
        long p10 = this.f32336a.p(b0Var.f5045c, this.f32343h, this.f32338c, zArr, j10);
        c(this.f32338c);
        this.f32340e = false;
        int i11 = 0;
        while (true) {
            i9.o0[] o0VarArr = this.f32338c;
            if (i11 >= o0VarArr.length) {
                return p10;
            }
            if (o0VarArr[i11] != null) {
                ea.a.f(b0Var.c(i11));
                if (this.f32344i[i11].e() != -2) {
                    this.f32340e = true;
                }
            } else {
                ea.a.f(b0Var.f5045c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        ea.a.f(r());
        this.f32336a.d(y(j10));
    }

    public long i() {
        if (!this.f32339d) {
            return this.f32341f.f32368b;
        }
        long g10 = this.f32340e ? this.f32336a.g() : Long.MIN_VALUE;
        return g10 == Long.MIN_VALUE ? this.f32341f.f32371e : g10;
    }

    public c2 j() {
        return this.f32347l;
    }

    public long k() {
        if (this.f32339d) {
            return this.f32336a.b();
        }
        return 0L;
    }

    public long l() {
        return this.f32350o;
    }

    public long m() {
        return this.f32341f.f32368b + this.f32350o;
    }

    public i9.y0 n() {
        return this.f32348m;
    }

    public ba.b0 o() {
        return this.f32349n;
    }

    public void p(float f10, j3 j3Var) throws n {
        this.f32339d = true;
        this.f32348m = this.f32336a.t();
        ba.b0 v10 = v(f10, j3Var);
        d2 d2Var = this.f32341f;
        long j10 = d2Var.f32368b;
        long j11 = d2Var.f32371e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f32350o;
        d2 d2Var2 = this.f32341f;
        this.f32350o = j12 + (d2Var2.f32368b - a10);
        this.f32341f = d2Var2.b(a10);
    }

    public boolean q() {
        return this.f32339d && (!this.f32340e || this.f32336a.g() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        ea.a.f(r());
        if (this.f32339d) {
            this.f32336a.h(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f32346k, this.f32336a);
    }

    public ba.b0 v(float f10, j3 j3Var) throws n {
        ba.q[] qVarArr;
        ba.b0 f11 = this.f32345j.f(this.f32344i, n(), this.f32341f.f32367a, j3Var);
        for (ba.q qVar : f11.f5045c) {
            if (qVar != null) {
                qVar.f(f10);
            }
        }
        return f11;
    }

    public void w(c2 c2Var) {
        if (c2Var == this.f32347l) {
            return;
        }
        f();
        this.f32347l = c2Var;
        h();
    }

    public void x(long j10) {
        this.f32350o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
