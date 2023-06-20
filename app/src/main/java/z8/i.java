package z8;

import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.n0;
import j8.j2;
import j8.p1;
import java.util.Arrays;
import java.util.Collections;
import l8.a;
import z8.i0;

/* compiled from: AdtsReader.java */
/* loaded from: classes2.dex */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f40226v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f40227a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.z f40228b;

    /* renamed from: c  reason: collision with root package name */
    private final ea.a0 f40229c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40230d;

    /* renamed from: e  reason: collision with root package name */
    private String f40231e;

    /* renamed from: f  reason: collision with root package name */
    private p8.a0 f40232f;

    /* renamed from: g  reason: collision with root package name */
    private p8.a0 f40233g;

    /* renamed from: h  reason: collision with root package name */
    private int f40234h;

    /* renamed from: i  reason: collision with root package name */
    private int f40235i;

    /* renamed from: j  reason: collision with root package name */
    private int f40236j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f40237k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f40238l;

    /* renamed from: m  reason: collision with root package name */
    private int f40239m;

    /* renamed from: n  reason: collision with root package name */
    private int f40240n;

    /* renamed from: o  reason: collision with root package name */
    private int f40241o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f40242p;

    /* renamed from: q  reason: collision with root package name */
    private long f40243q;

    /* renamed from: r  reason: collision with root package name */
    private int f40244r;

    /* renamed from: s  reason: collision with root package name */
    private long f40245s;

    /* renamed from: t  reason: collision with root package name */
    private p8.a0 f40246t;

    /* renamed from: u  reason: collision with root package name */
    private long f40247u;

    public i(boolean z10) {
        this(z10, null);
    }

    private void a() {
        ea.a.e(this.f40232f);
        n0.j(this.f40246t);
        n0.j(this.f40233g);
    }

    private void g(ea.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f40228b.f29788a[0] = a0Var.d()[a0Var.e()];
        this.f40228b.p(2);
        int h10 = this.f40228b.h(4);
        int i10 = this.f40240n;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f40238l) {
            this.f40238l = true;
            this.f40239m = this.f40241o;
            this.f40240n = h10;
        }
        t();
    }

    private boolean h(ea.a0 a0Var, int i10) {
        a0Var.P(i10 + 1);
        if (w(a0Var, this.f40228b.f29788a, 1)) {
            this.f40228b.p(4);
            int h10 = this.f40228b.h(1);
            int i11 = this.f40239m;
            if (i11 == -1 || h10 == i11) {
                if (this.f40240n != -1) {
                    if (!w(a0Var, this.f40228b.f29788a, 1)) {
                        return true;
                    }
                    this.f40228b.p(2);
                    if (this.f40228b.h(4) != this.f40240n) {
                        return false;
                    }
                    a0Var.P(i10 + 2);
                }
                if (w(a0Var, this.f40228b.f29788a, 4)) {
                    this.f40228b.p(14);
                    int h11 = this.f40228b.h(13);
                    if (h11 < 7) {
                        return false;
                    }
                    byte[] d10 = a0Var.d();
                    int f10 = a0Var.f();
                    int i12 = i10 + h11;
                    if (i12 >= f10) {
                        return true;
                    }
                    if (d10[i12] == -1) {
                        int i13 = i12 + 1;
                        if (i13 == f10) {
                            return true;
                        }
                        return l((byte) -1, d10[i13]) && ((d10[i13] & 8) >> 3) == h10;
                    } else if (d10[i12] != 73) {
                        return false;
                    } else {
                        int i14 = i12 + 1;
                        if (i14 == f10) {
                            return true;
                        }
                        if (d10[i14] != 68) {
                            return false;
                        }
                        int i15 = i12 + 2;
                        return i15 == f10 || d10[i15] == 51;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean i(ea.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f40235i);
        a0Var.j(bArr, this.f40235i, min);
        int i11 = this.f40235i + min;
        this.f40235i = i11;
        return i11 == i10;
    }

    private void j(ea.a0 a0Var) {
        byte[] d10 = a0Var.d();
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10) {
            int i10 = e10 + 1;
            int i11 = d10[e10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.f40236j == 512 && l((byte) -1, (byte) i11) && (this.f40238l || h(a0Var, i10 - 2))) {
                this.f40241o = (i11 & 8) >> 3;
                this.f40237k = (i11 & 1) == 0;
                if (!this.f40238l) {
                    r();
                } else {
                    t();
                }
                a0Var.P(i10);
                return;
            }
            int i12 = this.f40236j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f40236j = 768;
            } else if (i13 == 511) {
                this.f40236j = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i13 == 836) {
                this.f40236j = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            } else if (i13 == 1075) {
                u();
                a0Var.P(i10);
                return;
            } else if (i12 != 256) {
                this.f40236j = 256;
                i10--;
            }
            e10 = i10;
        }
        a0Var.P(e10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() throws j2 {
        this.f40228b.p(0);
        if (!this.f40242p) {
            int h10 = this.f40228b.h(2) + 1;
            if (h10 != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(h10);
                sb2.append(", but assuming AAC LC.");
                ea.r.h("AdtsReader", sb2.toString());
                h10 = 2;
            }
            this.f40228b.r(5);
            byte[] b10 = l8.a.b(h10, this.f40240n, this.f40228b.h(3));
            a.b f10 = l8.a.f(b10);
            p1 E = new p1.b().S(this.f40231e).e0(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC).I(f10.f33746c).H(f10.f33745b).f0(f10.f33744a).T(Collections.singletonList(b10)).V(this.f40230d).E();
            this.f40243q = 1024000000 / E.f32723z;
            this.f40232f.d(E);
            this.f40242p = true;
        } else {
            this.f40228b.r(10);
        }
        this.f40228b.r(4);
        int h11 = (this.f40228b.h(13) - 2) - 5;
        if (this.f40237k) {
            h11 -= 2;
        }
        v(this.f40232f, this.f40243q, 0, h11);
    }

    private void o() {
        this.f40233g.a(this.f40229c, 10);
        this.f40229c.P(6);
        v(this.f40233g, 0L, 10, this.f40229c.C() + 10);
    }

    private void p(ea.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f40244r - this.f40235i);
        this.f40246t.a(a0Var, min);
        int i10 = this.f40235i + min;
        this.f40235i = i10;
        int i11 = this.f40244r;
        if (i10 == i11) {
            long j10 = this.f40245s;
            if (j10 != -9223372036854775807L) {
                this.f40246t.e(j10, 1, i11, 0, null);
                this.f40245s += this.f40247u;
            }
            s();
        }
    }

    private void q() {
        this.f40238l = false;
        s();
    }

    private void r() {
        this.f40234h = 1;
        this.f40235i = 0;
    }

    private void s() {
        this.f40234h = 0;
        this.f40235i = 0;
        this.f40236j = 256;
    }

    private void t() {
        this.f40234h = 3;
        this.f40235i = 0;
    }

    private void u() {
        this.f40234h = 2;
        this.f40235i = f40226v.length;
        this.f40244r = 0;
        this.f40229c.P(0);
    }

    private void v(p8.a0 a0Var, long j10, int i10, int i11) {
        this.f40234h = 4;
        this.f40235i = i10;
        this.f40246t = a0Var;
        this.f40247u = j10;
        this.f40244r = i11;
    }

    private boolean w(ea.a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.j(bArr, 0, i10);
        return true;
    }

    @Override // z8.m
    public void b() {
        this.f40245s = -9223372036854775807L;
        q();
    }

    @Override // z8.m
    public void c(ea.a0 a0Var) throws j2 {
        a();
        while (a0Var.a() > 0) {
            int i10 = this.f40234h;
            if (i10 == 0) {
                j(a0Var);
            } else if (i10 == 1) {
                g(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(a0Var, this.f40228b.f29788a, this.f40237k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(a0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(a0Var, this.f40229c.d(), 10)) {
                o();
            }
        }
    }

    @Override // z8.m
    public void d() {
    }

    @Override // z8.m
    public void e(p8.k kVar, i0.d dVar) {
        dVar.a();
        this.f40231e = dVar.b();
        p8.a0 f10 = kVar.f(dVar.c(), 1);
        this.f40232f = f10;
        this.f40246t = f10;
        if (this.f40227a) {
            dVar.a();
            p8.a0 f11 = kVar.f(dVar.c(), 5);
            this.f40233g = f11;
            f11.d(new p1.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f40233g = new p8.h();
    }

    @Override // z8.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f40245s = j10;
        }
    }

    public long k() {
        return this.f40243q;
    }

    public i(boolean z10, String str) {
        this.f40228b = new ea.z(new byte[7]);
        this.f40229c = new ea.a0(Arrays.copyOf(f40226v, 10));
        s();
        this.f40239m = -1;
        this.f40240n = -1;
        this.f40243q = -9223372036854775807L;
        this.f40245s = -9223372036854775807L;
        this.f40227a = z10;
        this.f40230d = str;
    }
}
