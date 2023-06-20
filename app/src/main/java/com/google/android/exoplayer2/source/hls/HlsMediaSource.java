package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.offline.StreamKey;
import da.d0;
import da.l;
import da.m0;
import da.y;
import ea.n0;
import i9.b0;
import i9.r;
import i9.r0;
import i9.u;
import j8.m1;
import j8.x1;
import java.io.IOException;
import java.util.List;
import o9.g;
import o9.l;

/* loaded from: classes2.dex */
public final class HlsMediaSource extends i9.a implements l.e {

    /* renamed from: h  reason: collision with root package name */
    private final f f21400h;

    /* renamed from: i  reason: collision with root package name */
    private final x1.h f21401i;

    /* renamed from: j  reason: collision with root package name */
    private final n9.b f21402j;

    /* renamed from: k  reason: collision with root package name */
    private final i9.h f21403k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f21404l;

    /* renamed from: m  reason: collision with root package name */
    private final d0 f21405m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f21406n;

    /* renamed from: o  reason: collision with root package name */
    private final int f21407o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f21408p;

    /* renamed from: q  reason: collision with root package name */
    private final o9.l f21409q;

    /* renamed from: r  reason: collision with root package name */
    private final long f21410r;

    /* renamed from: s  reason: collision with root package name */
    private final x1 f21411s;

    /* renamed from: t  reason: collision with root package name */
    private x1.g f21412t;

    /* renamed from: u  reason: collision with root package name */
    private m0 f21413u;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final n9.b f21414a;

        /* renamed from: b  reason: collision with root package name */
        private f f21415b;

        /* renamed from: c  reason: collision with root package name */
        private o9.k f21416c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f21417d;

        /* renamed from: e  reason: collision with root package name */
        private i9.h f21418e;

        /* renamed from: f  reason: collision with root package name */
        private n8.o f21419f;

        /* renamed from: g  reason: collision with root package name */
        private d0 f21420g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f21421h;

        /* renamed from: i  reason: collision with root package name */
        private int f21422i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f21423j;

        /* renamed from: k  reason: collision with root package name */
        private long f21424k;

        public Factory(l.a aVar) {
            this(new n9.a(aVar));
        }

        public HlsMediaSource a(x1 x1Var) {
            ea.a.e(x1Var.f32820b);
            o9.k kVar = this.f21416c;
            List<StreamKey> list = x1Var.f32820b.f32880e;
            if (!list.isEmpty()) {
                kVar = new o9.e(kVar, list);
            }
            n9.b bVar = this.f21414a;
            f fVar = this.f21415b;
            i9.h hVar = this.f21418e;
            com.google.android.exoplayer2.drm.l a10 = this.f21419f.a(x1Var);
            d0 d0Var = this.f21420g;
            return new HlsMediaSource(x1Var, bVar, fVar, hVar, a10, d0Var, this.f21417d.a(this.f21414a, d0Var, kVar), this.f21424k, this.f21421h, this.f21422i, this.f21423j);
        }

        public Factory b(n8.o oVar) {
            if (oVar == null) {
                oVar = new com.google.android.exoplayer2.drm.i();
            }
            this.f21419f = oVar;
            return this;
        }

        public Factory c(d0 d0Var) {
            if (d0Var == null) {
                d0Var = new y();
            }
            this.f21420g = d0Var;
            return this;
        }

        public Factory(n9.b bVar) {
            this.f21414a = (n9.b) ea.a.e(bVar);
            this.f21419f = new com.google.android.exoplayer2.drm.i();
            this.f21416c = new o9.a();
            this.f21417d = o9.c.f35037p;
            this.f21415b = f.f21477a;
            this.f21420g = new y();
            this.f21418e = new i9.i();
            this.f21422i = 1;
            this.f21424k = -9223372036854775807L;
            this.f21421h = true;
        }
    }

    static {
        m1.a("goog.exo.hls");
    }

    private r0 F(o9.g gVar, long j10, long j11, g gVar2) {
        long L;
        long b10 = gVar.f35073h - this.f21409q.b();
        long j12 = gVar.f35080o ? b10 + gVar.f35086u : -9223372036854775807L;
        long J = J(gVar);
        long j13 = this.f21412t.f32866a;
        if (j13 != -9223372036854775807L) {
            L = n0.C0(j13);
        } else {
            L = L(gVar, J);
        }
        M(gVar, n0.r(L, J, gVar.f35086u + J));
        return new r0(j10, j11, -9223372036854775807L, j12, gVar.f35086u, b10, K(gVar, J), true, !gVar.f35080o, gVar.f35069d == 2 && gVar.f35071f, gVar2, this.f21411s, this.f21412t);
    }

    private r0 G(o9.g gVar, long j10, long j11, g gVar2) {
        long j12;
        if (gVar.f35070e == -9223372036854775807L || gVar.f35083r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar.f35072g) {
                long j13 = gVar.f35070e;
                if (j13 != gVar.f35086u) {
                    j12 = I(gVar.f35083r, j13).f35099e;
                }
            }
            j12 = gVar.f35070e;
        }
        long j14 = gVar.f35086u;
        return new r0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, gVar2, this.f21411s, null);
    }

    private static g.b H(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f35099e;
            if (j11 <= j10 && bVar2.f35088l) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j10) {
        return list.get(n0.g(list, Long.valueOf(j10), true, true));
    }

    private long J(o9.g gVar) {
        if (gVar.f35081p) {
            return n0.C0(n0.c0(this.f21410r)) - gVar.e();
        }
        return 0L;
    }

    private long K(o9.g gVar, long j10) {
        long j11 = gVar.f35070e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f35086u + j10) - n0.C0(this.f21412t.f32866a);
        }
        if (gVar.f35072g) {
            return j11;
        }
        g.b H = H(gVar.f35084s, j11);
        if (H != null) {
            return H.f35099e;
        }
        if (gVar.f35083r.isEmpty()) {
            return 0L;
        }
        g.d I = I(gVar.f35083r, j11);
        g.b H2 = H(I.f35094m, j11);
        if (H2 != null) {
            return H2.f35099e;
        }
        return I.f35099e;
    }

    private static long L(o9.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f35087v;
        long j12 = gVar.f35070e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f35086u - j12;
        } else {
            long j13 = fVar.f35109d;
            if (j13 == -9223372036854775807L || gVar.f35079n == -9223372036854775807L) {
                long j14 = fVar.f35108c;
                j11 = j14 != -9223372036854775807L ? j14 : gVar.f35078m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M(o9.g r6, long r7) {
        /*
            r5 = this;
            j8.x1 r0 = r5.f21411s
            j8.x1$g r0 = r0.f32821c
            float r1 = r0.f32869d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f32870e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            o9.g$f r6 = r6.f35087v
            long r0 = r6.f35108c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            long r0 = r6.f35109d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            j8.x1$g$a r0 = new j8.x1$g$a
            r0.<init>()
            long r7 = ea.n0.Z0(r7)
            j8.x1$g$a r7 = r0.k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L3d:
            j8.x1$g r0 = r5.f21412t
            float r0 = r0.f32869d
        L41:
            j8.x1$g$a r7 = r7.j(r0)
            if (r6 == 0) goto L48
            goto L4c
        L48:
            j8.x1$g r6 = r5.f21412t
            float r8 = r6.f32870e
        L4c:
            j8.x1$g$a r6 = r7.h(r8)
            j8.x1$g r6 = r6.f()
            r5.f21412t = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(o9.g, long):void");
    }

    @Override // i9.a
    protected void C(m0 m0Var) {
        this.f21413u = m0Var;
        this.f21404l.a();
        this.f21404l.c((Looper) ea.a.e(Looper.myLooper()), A());
        this.f21409q.g(this.f21401i.f32876a, w(null), this);
    }

    @Override // i9.a
    protected void E() {
        this.f21409q.stop();
        this.f21404l.release();
    }

    @Override // i9.u
    public x1 d() {
        return this.f21411s;
    }

    @Override // o9.l.e
    public void e(o9.g gVar) {
        r0 G;
        long Z0 = gVar.f35081p ? n0.Z0(gVar.f35073h) : -9223372036854775807L;
        int i10 = gVar.f35069d;
        long j10 = (i10 == 2 || i10 == 1) ? Z0 : -9223372036854775807L;
        g gVar2 = new g((o9.h) ea.a.e(this.f21409q.c()), gVar);
        if (this.f21409q.i()) {
            G = F(gVar, j10, Z0, gVar2);
        } else {
            G = G(gVar, j10, Z0, gVar2);
        }
        D(G);
    }

    @Override // i9.u
    public r f(u.b bVar, da.b bVar2, long j10) {
        b0.a w10 = w(bVar);
        return new j(this.f21400h, this.f21409q, this.f21402j, this.f21413u, this.f21404l, u(bVar), this.f21405m, w10, bVar2, this.f21403k, this.f21406n, this.f21407o, this.f21408p, A());
    }

    @Override // i9.u
    public void i(r rVar) {
        ((j) rVar).A();
    }

    @Override // i9.u
    public void p() throws IOException {
        this.f21409q.l();
    }

    private HlsMediaSource(x1 x1Var, n9.b bVar, f fVar, i9.h hVar, com.google.android.exoplayer2.drm.l lVar, d0 d0Var, o9.l lVar2, long j10, boolean z10, int i10, boolean z11) {
        this.f21401i = (x1.h) ea.a.e(x1Var.f32820b);
        this.f21411s = x1Var;
        this.f21412t = x1Var.f32821c;
        this.f21402j = bVar;
        this.f21400h = fVar;
        this.f21403k = hVar;
        this.f21404l = lVar;
        this.f21405m = d0Var;
        this.f21409q = lVar2;
        this.f21410r = j10;
        this.f21406n = z10;
        this.f21407o = i10;
        this.f21408p = z11;
    }
}
