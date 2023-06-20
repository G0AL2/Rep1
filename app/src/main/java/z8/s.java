package z8;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import j8.j2;
import j8.p1;
import java.util.Collections;
import l8.a;
import z8.i0;

/* compiled from: LatmReader.java */
/* loaded from: classes2.dex */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f40410a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40411b;

    /* renamed from: c  reason: collision with root package name */
    private final ea.z f40412c;

    /* renamed from: d  reason: collision with root package name */
    private p8.a0 f40413d;

    /* renamed from: e  reason: collision with root package name */
    private String f40414e;

    /* renamed from: f  reason: collision with root package name */
    private p1 f40415f;

    /* renamed from: g  reason: collision with root package name */
    private int f40416g;

    /* renamed from: h  reason: collision with root package name */
    private int f40417h;

    /* renamed from: i  reason: collision with root package name */
    private int f40418i;

    /* renamed from: j  reason: collision with root package name */
    private int f40419j;

    /* renamed from: k  reason: collision with root package name */
    private long f40420k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f40421l;

    /* renamed from: m  reason: collision with root package name */
    private int f40422m;

    /* renamed from: n  reason: collision with root package name */
    private int f40423n;

    /* renamed from: o  reason: collision with root package name */
    private int f40424o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f40425p;

    /* renamed from: q  reason: collision with root package name */
    private long f40426q;

    /* renamed from: r  reason: collision with root package name */
    private int f40427r;

    /* renamed from: s  reason: collision with root package name */
    private long f40428s;

    /* renamed from: t  reason: collision with root package name */
    private int f40429t;

    /* renamed from: u  reason: collision with root package name */
    private String f40430u;

    public s(String str) {
        this.f40410a = str;
        ea.a0 a0Var = new ea.a0((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        this.f40411b = a0Var;
        this.f40412c = new ea.z(a0Var.d());
        this.f40420k = -9223372036854775807L;
    }

    private static long a(ea.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(ea.z zVar) throws j2 {
        if (!zVar.g()) {
            this.f40421l = true;
            l(zVar);
        } else if (!this.f40421l) {
            return;
        }
        if (this.f40422m == 0) {
            if (this.f40423n == 0) {
                k(zVar, j(zVar));
                if (this.f40425p) {
                    zVar.r((int) this.f40426q);
                    return;
                }
                return;
            }
            throw j2.a(null, null);
        }
        throw j2.a(null, null);
    }

    private int h(ea.z zVar) throws j2 {
        int b10 = zVar.b();
        a.b e10 = l8.a.e(zVar, true);
        this.f40430u = e10.f33746c;
        this.f40427r = e10.f33744a;
        this.f40429t = e10.f33745b;
        return b10 - zVar.b();
    }

    private void i(ea.z zVar) {
        int h10 = zVar.h(3);
        this.f40424o = h10;
        if (h10 == 0) {
            zVar.r(8);
        } else if (h10 == 1) {
            zVar.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            zVar.r(6);
        } else if (h10 != 6 && h10 != 7) {
            throw new IllegalStateException();
        } else {
            zVar.r(1);
        }
    }

    private int j(ea.z zVar) throws j2 {
        int h10;
        if (this.f40424o == 0) {
            int i10 = 0;
            do {
                h10 = zVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw j2.a(null, null);
    }

    private void k(ea.z zVar, int i10) {
        int e10 = zVar.e();
        if ((e10 & 7) == 0) {
            this.f40411b.P(e10 >> 3);
        } else {
            zVar.i(this.f40411b.d(), 0, i10 * 8);
            this.f40411b.P(0);
        }
        this.f40413d.a(this.f40411b, i10);
        long j10 = this.f40420k;
        if (j10 != -9223372036854775807L) {
            this.f40413d.e(j10, 1, i10, 0, null);
            this.f40420k += this.f40428s;
        }
    }

    private void l(ea.z zVar) throws j2 {
        boolean g10;
        int h10 = zVar.h(1);
        int h11 = h10 == 1 ? zVar.h(1) : 0;
        this.f40422m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                a(zVar);
            }
            if (zVar.g()) {
                this.f40423n = zVar.h(6);
                int h12 = zVar.h(4);
                int h13 = zVar.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = zVar.e();
                        int h14 = h(zVar);
                        zVar.p(e10);
                        byte[] bArr = new byte[(h14 + 7) / 8];
                        zVar.i(bArr, 0, h14);
                        p1 E = new p1.b().S(this.f40414e).e0(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC).I(this.f40430u).H(this.f40429t).f0(this.f40427r).T(Collections.singletonList(bArr)).V(this.f40410a).E();
                        if (!E.equals(this.f40415f)) {
                            this.f40415f = E;
                            this.f40428s = 1024000000 / E.f32723z;
                            this.f40413d.d(E);
                        }
                    } else {
                        zVar.r(((int) a(zVar)) - h(zVar));
                    }
                    i(zVar);
                    boolean g11 = zVar.g();
                    this.f40425p = g11;
                    this.f40426q = 0L;
                    if (g11) {
                        if (h10 == 1) {
                            this.f40426q = a(zVar);
                        } else {
                            do {
                                g10 = zVar.g();
                                this.f40426q = (this.f40426q << 8) + zVar.h(8);
                            } while (g10);
                        }
                    }
                    if (zVar.g()) {
                        zVar.r(8);
                        return;
                    }
                    return;
                }
                throw j2.a(null, null);
            }
            throw j2.a(null, null);
        }
        throw j2.a(null, null);
    }

    private void m(int i10) {
        this.f40411b.L(i10);
        this.f40412c.n(this.f40411b.d());
    }

    @Override // z8.m
    public void b() {
        this.f40416g = 0;
        this.f40420k = -9223372036854775807L;
        this.f40421l = false;
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) throws j2 {
        ea.a.h(this.f40413d);
        while (a0Var.a() > 0) {
            int i10 = this.f40416g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int D = a0Var.D();
                    if ((D & 224) == 224) {
                        this.f40419j = D;
                        this.f40416g = 2;
                    } else if (D != 86) {
                        this.f40416g = 0;
                    }
                } else if (i10 == 2) {
                    int D2 = ((this.f40419j & (-225)) << 8) | a0Var.D();
                    this.f40418i = D2;
                    if (D2 > this.f40411b.d().length) {
                        m(this.f40418i);
                    }
                    this.f40417h = 0;
                    this.f40416g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(a0Var.a(), this.f40418i - this.f40417h);
                    a0Var.j(this.f40412c.f29788a, this.f40417h, min);
                    int i11 = this.f40417h + min;
                    this.f40417h = i11;
                    if (i11 == this.f40418i) {
                        this.f40412c.p(0);
                        g(this.f40412c);
                        this.f40416g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (a0Var.D() == 86) {
                this.f40416g = 1;
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40413d = kVar.f(dVar.c(), 1);
        this.f40414e = dVar.b();
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40420k = j10;
        }
    }
}
