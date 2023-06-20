package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import da.d0;
import da.e0;
import da.f0;
import da.g0;
import da.l;
import da.m0;
import da.y;
import ea.n0;
import i9.b0;
import i9.h;
import i9.n;
import i9.q;
import i9.r;
import i9.r0;
import i9.u;
import j8.m1;
import j8.x1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n8.o;
import q9.a;

/* loaded from: classes2.dex */
public final class SsMediaSource extends i9.a implements e0.b<g0<q9.a>> {
    private Handler A;

    /* renamed from: h */
    private final boolean f21564h;

    /* renamed from: i */
    private final Uri f21565i;

    /* renamed from: j */
    private final x1.h f21566j;

    /* renamed from: k */
    private final x1 f21567k;

    /* renamed from: l */
    private final l.a f21568l;

    /* renamed from: m */
    private final b.a f21569m;

    /* renamed from: n */
    private final h f21570n;

    /* renamed from: o */
    private final com.google.android.exoplayer2.drm.l f21571o;

    /* renamed from: p */
    private final d0 f21572p;

    /* renamed from: q */
    private final long f21573q;

    /* renamed from: r */
    private final b0.a f21574r;

    /* renamed from: s */
    private final g0.a<? extends q9.a> f21575s;

    /* renamed from: t */
    private final ArrayList<c> f21576t;

    /* renamed from: u */
    private l f21577u;

    /* renamed from: v */
    private e0 f21578v;

    /* renamed from: w */
    private f0 f21579w;

    /* renamed from: x */
    private m0 f21580x;

    /* renamed from: y */
    private long f21581y;

    /* renamed from: z */
    private q9.a f21582z;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a */
        private final b.a f21583a;

        /* renamed from: b */
        private final l.a f21584b;

        /* renamed from: c */
        private h f21585c;

        /* renamed from: d */
        private o f21586d;

        /* renamed from: e */
        private d0 f21587e;

        /* renamed from: f */
        private long f21588f;

        /* renamed from: g */
        private g0.a<? extends q9.a> f21589g;

        public Factory(l.a aVar) {
            this(new a.C0291a(aVar), aVar);
        }

        public SsMediaSource a(x1 x1Var) {
            ea.a.e(x1Var.f32820b);
            g0.a aVar = this.f21589g;
            if (aVar == null) {
                aVar = new q9.b();
            }
            List<StreamKey> list = x1Var.f32820b.f32880e;
            return new SsMediaSource(x1Var, null, this.f21584b, !list.isEmpty() ? new com.google.android.exoplayer2.offline.a(aVar, list) : aVar, this.f21583a, this.f21585c, this.f21586d.a(x1Var), this.f21587e, this.f21588f);
        }

        public Factory b(o oVar) {
            if (oVar == null) {
                oVar = new i();
            }
            this.f21586d = oVar;
            return this;
        }

        public Factory c(d0 d0Var) {
            if (d0Var == null) {
                d0Var = new y();
            }
            this.f21587e = d0Var;
            return this;
        }

        public Factory(b.a aVar, l.a aVar2) {
            this.f21583a = (b.a) ea.a.e(aVar);
            this.f21584b = aVar2;
            this.f21586d = new i();
            this.f21587e = new y();
            this.f21588f = 30000L;
            this.f21585c = new i9.i();
        }
    }

    static {
        m1.a("goog.exo.smoothstreaming");
    }

    public static /* synthetic */ void F(SsMediaSource ssMediaSource) {
        ssMediaSource.L();
    }

    private void J() {
        a.b[] bVarArr;
        r0 r0Var;
        for (int i10 = 0; i10 < this.f21576t.size(); i10++) {
            this.f21576t.get(i10).v(this.f21582z);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.f21582z.f36000f) {
            if (bVar.f36016k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f36016k - 1) + bVar.c(bVar.f36016k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.f21582z.f35998d ? -9223372036854775807L : 0L;
            q9.a aVar = this.f21582z;
            boolean z10 = aVar.f35998d;
            r0Var = new r0(j12, 0L, 0L, 0L, true, z10, z10, aVar, this.f21567k);
        } else {
            q9.a aVar2 = this.f21582z;
            if (aVar2.f35998d) {
                long j13 = aVar2.f36002h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long C0 = j15 - n0.C0(this.f21573q);
                if (C0 < 5000000) {
                    C0 = Math.min(5000000L, j15 / 2);
                }
                r0Var = new r0(-9223372036854775807L, j15, j14, C0, true, true, true, this.f21582z, this.f21567k);
            } else {
                long j16 = aVar2.f36001g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                r0Var = new r0(j11 + j17, j17, j11, 0L, true, false, false, this.f21582z, this.f21567k);
            }
        }
        D(r0Var);
    }

    private void K() {
        if (this.f21582z.f35998d) {
            this.A.postDelayed(new Runnable() { // from class: p9.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.F(SsMediaSource.this);
                }
            }, Math.max(0L, (this.f21581y + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public void L() {
        if (this.f21578v.i()) {
            return;
        }
        g0 g0Var = new g0(this.f21577u, this.f21565i, 4, this.f21575s);
        this.f21574r.z(new n(g0Var.f29170a, g0Var.f29171b, this.f21578v.n(g0Var, this, this.f21572p.c(g0Var.f29172c))), g0Var.f29172c);
    }

    @Override // i9.a
    protected void C(m0 m0Var) {
        this.f21580x = m0Var;
        this.f21571o.a();
        this.f21571o.c(Looper.myLooper(), A());
        if (this.f21564h) {
            this.f21579w = new f0.a();
            J();
            return;
        }
        this.f21577u = this.f21568l.a();
        e0 e0Var = new e0("SsMediaSource");
        this.f21578v = e0Var;
        this.f21579w = e0Var;
        this.A = n0.w();
        L();
    }

    @Override // i9.a
    protected void E() {
        this.f21582z = this.f21564h ? this.f21582z : null;
        this.f21577u = null;
        this.f21581y = 0L;
        e0 e0Var = this.f21578v;
        if (e0Var != null) {
            e0Var.l();
            this.f21578v = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.f21571o.release();
    }

    @Override // da.e0.b
    /* renamed from: G */
    public void j(g0<q9.a> g0Var, long j10, long j11, boolean z10) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        this.f21572p.d(g0Var.f29170a);
        this.f21574r.q(nVar, g0Var.f29172c);
    }

    @Override // da.e0.b
    /* renamed from: H */
    public void m(g0<q9.a> g0Var, long j10, long j11) {
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        this.f21572p.d(g0Var.f29170a);
        this.f21574r.t(nVar, g0Var.f29172c);
        this.f21582z = g0Var.d();
        this.f21581y = j10 - j11;
        J();
        K();
    }

    @Override // da.e0.b
    /* renamed from: I */
    public e0.c s(g0<q9.a> g0Var, long j10, long j11, IOException iOException, int i10) {
        e0.c h10;
        n nVar = new n(g0Var.f29170a, g0Var.f29171b, g0Var.e(), g0Var.c(), j10, j11, g0Var.a());
        long b10 = this.f21572p.b(new d0.c(nVar, new q(g0Var.f29172c), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = e0.f29145f;
        } else {
            h10 = e0.h(false, b10);
        }
        boolean z10 = !h10.c();
        this.f21574r.x(nVar, g0Var.f29172c, iOException, z10);
        if (z10) {
            this.f21572p.d(g0Var.f29170a);
        }
        return h10;
    }

    @Override // i9.u
    public x1 d() {
        return this.f21567k;
    }

    @Override // i9.u
    public r f(u.b bVar, da.b bVar2, long j10) {
        b0.a w10 = w(bVar);
        c cVar = new c(this.f21582z, this.f21569m, this.f21580x, this.f21570n, this.f21571o, u(bVar), this.f21572p, w10, this.f21579w, bVar2);
        this.f21576t.add(cVar);
        return cVar;
    }

    @Override // i9.u
    public void i(r rVar) {
        ((c) rVar).s();
        this.f21576t.remove(rVar);
    }

    @Override // i9.u
    public void p() throws IOException {
        this.f21579w.a();
    }

    private SsMediaSource(x1 x1Var, q9.a aVar, l.a aVar2, g0.a<? extends q9.a> aVar3, b.a aVar4, h hVar, com.google.android.exoplayer2.drm.l lVar, d0 d0Var, long j10) {
        ea.a.f(aVar == null || !aVar.f35998d);
        this.f21567k = x1Var;
        x1.h hVar2 = (x1.h) ea.a.e(x1Var.f32820b);
        this.f21566j = hVar2;
        this.f21582z = aVar;
        this.f21565i = hVar2.f32876a.equals(Uri.EMPTY) ? null : n0.B(hVar2.f32876a);
        this.f21568l = aVar2;
        this.f21575s = aVar3;
        this.f21569m = aVar4;
        this.f21570n = hVar;
        this.f21571o = lVar;
        this.f21572p = d0Var;
        this.f21573q = j10;
        this.f21574r = w(null);
        this.f21564h = aVar != null;
        this.f21576t = new ArrayList<>();
    }
}
