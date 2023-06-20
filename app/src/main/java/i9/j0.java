package i9;

import android.os.Looper;
import da.l;
import i9.e0;
import i9.i0;
import i9.j0;
import i9.u;
import j8.j3;
import j8.x1;
import k8.o1;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes2.dex */
public final class j0 extends i9.a implements i0.b {

    /* renamed from: h */
    private final x1 f31676h;

    /* renamed from: i */
    private final x1.h f31677i;

    /* renamed from: j */
    private final l.a f31678j;

    /* renamed from: k */
    private final e0.a f31679k;

    /* renamed from: l */
    private final com.google.android.exoplayer2.drm.l f31680l;

    /* renamed from: m */
    private final da.d0 f31681m;

    /* renamed from: n */
    private final int f31682n;

    /* renamed from: o */
    private boolean f31683o;

    /* renamed from: p */
    private long f31684p;

    /* renamed from: q */
    private boolean f31685q;

    /* renamed from: r */
    private boolean f31686r;

    /* renamed from: s */
    private da.m0 f31687s;

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes2.dex */
    public class a extends l {
        a(j0 j0Var, j3 j3Var) {
            super(j3Var);
        }

        @Override // i9.l, j8.j3
        public j3.b g(int i10, j3.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f32513f = true;
            return bVar;
        }

        @Override // i9.l, j8.j3
        public j3.c o(int i10, j3.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f32530l = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b implements u.a {

        /* renamed from: a */
        private final l.a f31688a;

        /* renamed from: b */
        private e0.a f31689b;

        /* renamed from: c */
        private n8.o f31690c;

        /* renamed from: d */
        private da.d0 f31691d;

        /* renamed from: e */
        private int f31692e;

        /* renamed from: f */
        private String f31693f;

        /* renamed from: g */
        private Object f31694g;

        public b(l.a aVar) {
            this(aVar, new p8.g());
        }

        public static /* synthetic */ e0 a(p8.n nVar, o1 o1Var) {
            return c(nVar, o1Var);
        }

        public static /* synthetic */ e0 c(p8.n nVar, o1 o1Var) {
            return new c(nVar);
        }

        public j0 b(x1 x1Var) {
            ea.a.e(x1Var.f32820b);
            x1.h hVar = x1Var.f32820b;
            boolean z10 = true;
            boolean z11 = hVar.f32883h == null && this.f31694g != null;
            z10 = (hVar.f32881f != null || this.f31693f == null) ? false : false;
            if (z11 && z10) {
                x1Var = x1Var.b().e(this.f31694g).b(this.f31693f).a();
            } else if (z11) {
                x1Var = x1Var.b().e(this.f31694g).a();
            } else if (z10) {
                x1Var = x1Var.b().b(this.f31693f).a();
            }
            x1 x1Var2 = x1Var;
            return new j0(x1Var2, this.f31688a, this.f31689b, this.f31690c.a(x1Var2), this.f31691d, this.f31692e, null);
        }

        public b d(n8.o oVar) {
            if (oVar == null) {
                oVar = new com.google.android.exoplayer2.drm.i();
            }
            this.f31690c = oVar;
            return this;
        }

        public b e(da.d0 d0Var) {
            if (d0Var == null) {
                d0Var = new da.y();
            }
            this.f31691d = d0Var;
            return this;
        }

        public b(l.a aVar, final p8.n nVar) {
            this(aVar, new e0.a() { // from class: i9.k0
                @Override // i9.e0.a
                public final e0 a(o1 o1Var) {
                    return j0.b.a(p8.n.this, o1Var);
                }
            });
        }

        public b(l.a aVar, e0.a aVar2) {
            this(aVar, aVar2, new com.google.android.exoplayer2.drm.i(), new da.y(), 1048576);
        }

        public b(l.a aVar, e0.a aVar2, n8.o oVar, da.d0 d0Var, int i10) {
            this.f31688a = aVar;
            this.f31689b = aVar2;
            this.f31690c = oVar;
            this.f31691d = d0Var;
            this.f31692e = i10;
        }
    }

    /* synthetic */ j0(x1 x1Var, l.a aVar, e0.a aVar2, com.google.android.exoplayer2.drm.l lVar, da.d0 d0Var, int i10, a aVar3) {
        this(x1Var, aVar, aVar2, lVar, d0Var, i10);
    }

    private void F() {
        j3 r0Var = new r0(this.f31684p, this.f31685q, false, this.f31686r, null, this.f31676h);
        if (this.f31683o) {
            r0Var = new a(this, r0Var);
        }
        D(r0Var);
    }

    @Override // i9.a
    protected void C(da.m0 m0Var) {
        this.f31687s = m0Var;
        this.f31680l.a();
        this.f31680l.c((Looper) ea.a.e(Looper.myLooper()), A());
        F();
    }

    @Override // i9.a
    protected void E() {
        this.f31680l.release();
    }

    @Override // i9.u
    public x1 d() {
        return this.f31676h;
    }

    @Override // i9.u
    public r f(u.b bVar, da.b bVar2, long j10) {
        da.l a10 = this.f31678j.a();
        da.m0 m0Var = this.f31687s;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        return new i0(this.f31677i.f32876a, a10, this.f31679k.a(A()), this.f31680l, u(bVar), this.f31681m, w(bVar), this, bVar2, this.f31677i.f32881f, this.f31682n);
    }

    @Override // i9.u
    public void i(r rVar) {
        ((i0) rVar).c0();
    }

    @Override // i9.i0.b
    public void l(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f31684p;
        }
        if (!this.f31683o && this.f31684p == j10 && this.f31685q == z10 && this.f31686r == z11) {
            return;
        }
        this.f31684p = j10;
        this.f31685q = z10;
        this.f31686r = z11;
        this.f31683o = false;
        F();
    }

    @Override // i9.u
    public void p() {
    }

    private j0(x1 x1Var, l.a aVar, e0.a aVar2, com.google.android.exoplayer2.drm.l lVar, da.d0 d0Var, int i10) {
        this.f31677i = (x1.h) ea.a.e(x1Var.f32820b);
        this.f31676h = x1Var;
        this.f31678j = aVar;
        this.f31679k = aVar2;
        this.f31680l = lVar;
        this.f31681m = d0Var;
        this.f31682n = i10;
        this.f31683o = true;
        this.f31684p = -9223372036854775807L;
    }
}
