package z8;

import ea.n0;
import j8.p1;
import l8.b;
import z8.i0;

/* compiled from: Ac3Reader.java */
/* loaded from: classes2.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ea.z f40136a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40137b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40138c;

    /* renamed from: d  reason: collision with root package name */
    private String f40139d;

    /* renamed from: e  reason: collision with root package name */
    private p8.a0 f40140e;

    /* renamed from: f  reason: collision with root package name */
    private int f40141f;

    /* renamed from: g  reason: collision with root package name */
    private int f40142g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40143h;

    /* renamed from: i  reason: collision with root package name */
    private long f40144i;

    /* renamed from: j  reason: collision with root package name */
    private p1 f40145j;

    /* renamed from: k  reason: collision with root package name */
    private int f40146k;

    /* renamed from: l  reason: collision with root package name */
    private long f40147l;

    public c() {
        this(null);
    }

    private boolean a(ea.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f40142g);
        a0Var.j(bArr, this.f40142g, min);
        int i11 = this.f40142g + min;
        this.f40142g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f40136a.p(0);
        b.C0440b e10 = l8.b.e(this.f40136a);
        p1 p1Var = this.f40145j;
        if (p1Var == null || e10.f33767c != p1Var.f32722y || e10.f33766b != p1Var.f32723z || !n0.c(e10.f33765a, p1Var.f32709l)) {
            p1 E = new p1.b().S(this.f40139d).e0(e10.f33765a).H(e10.f33767c).f0(e10.f33766b).V(this.f40138c).E();
            this.f40145j = E;
            this.f40140e.d(E);
        }
        this.f40146k = e10.f33768d;
        this.f40144i = (e10.f33769e * 1000000) / this.f40145j.f32723z;
    }

    private boolean h(ea.a0 a0Var) {
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (!this.f40143h) {
                this.f40143h = a0Var.D() == 11;
            } else {
                int D = a0Var.D();
                if (D == 119) {
                    this.f40143h = false;
                    return true;
                }
                this.f40143h = D == 11;
            }
        }
    }

    @Override // z8.m
    public void b() {
        this.f40141f = 0;
        this.f40142g = 0;
        this.f40143h = false;
        this.f40147l = -9223372036854775807L;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) {
        ea.a.h(this.f40140e);
        while (a0Var.a() > 0) {
            int i10 = this.f40141f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f40146k - this.f40142g);
                        this.f40140e.a(a0Var, min);
                        int i11 = this.f40142g + min;
                        this.f40142g = i11;
                        int i12 = this.f40146k;
                        if (i11 == i12) {
                            long j10 = this.f40147l;
                            if (j10 != -9223372036854775807L) {
                                this.f40140e.e(j10, 1, i12, 0, null);
                                this.f40147l += this.f40144i;
                            }
                            this.f40141f = 0;
                        }
                    }
                } else if (a(a0Var, this.f40137b.d(), 128)) {
                    g();
                    this.f40137b.P(0);
                    this.f40140e.a(this.f40137b, 128);
                    this.f40141f = 2;
                }
            } else if (h(a0Var)) {
                this.f40141f = 1;
                this.f40137b.d()[0] = 11;
                this.f40137b.d()[1] = 119;
                this.f40142g = 2;
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40139d = dVar.b();
        this.f40140e = kVar.f(dVar.c(), 1);
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40147l = j10;
        }
    }

    public c(String str) {
        ea.z zVar = new ea.z(new byte[128]);
        this.f40136a = zVar;
        this.f40137b = new ea.a0(zVar.f29788a);
        this.f40141f = 0;
        this.f40147l = -9223372036854775807L;
        this.f40138c = str;
    }
}
