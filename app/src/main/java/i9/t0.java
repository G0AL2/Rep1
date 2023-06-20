package i9;

import android.net.Uri;
import da.l;
import da.p;
import i9.u;
import j8.j3;
import j8.p1;
import j8.x1;

/* compiled from: SingleSampleMediaSource.java */
/* loaded from: classes2.dex */
public final class t0 extends i9.a {

    /* renamed from: h  reason: collision with root package name */
    private final da.p f31819h;

    /* renamed from: i  reason: collision with root package name */
    private final l.a f31820i;

    /* renamed from: j  reason: collision with root package name */
    private final p1 f31821j;

    /* renamed from: k  reason: collision with root package name */
    private final long f31822k;

    /* renamed from: l  reason: collision with root package name */
    private final da.d0 f31823l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f31824m;

    /* renamed from: n  reason: collision with root package name */
    private final j3 f31825n;

    /* renamed from: o  reason: collision with root package name */
    private final x1 f31826o;

    /* renamed from: p  reason: collision with root package name */
    private da.m0 f31827p;

    /* compiled from: SingleSampleMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f31828a;

        /* renamed from: b  reason: collision with root package name */
        private da.d0 f31829b = new da.y();

        /* renamed from: c  reason: collision with root package name */
        private boolean f31830c = true;

        /* renamed from: d  reason: collision with root package name */
        private Object f31831d;

        /* renamed from: e  reason: collision with root package name */
        private String f31832e;

        public b(l.a aVar) {
            this.f31828a = (l.a) ea.a.e(aVar);
        }

        public t0 a(x1.k kVar, long j10) {
            return new t0(this.f31832e, kVar, this.f31828a, j10, this.f31829b, this.f31830c, this.f31831d);
        }
    }

    @Override // i9.a
    protected void C(da.m0 m0Var) {
        this.f31827p = m0Var;
        D(this.f31825n);
    }

    @Override // i9.a
    protected void E() {
    }

    @Override // i9.u
    public x1 d() {
        return this.f31826o;
    }

    @Override // i9.u
    public r f(u.b bVar, da.b bVar2, long j10) {
        return new s0(this.f31819h, this.f31820i, this.f31827p, this.f31821j, this.f31822k, this.f31823l, w(bVar), this.f31824m);
    }

    @Override // i9.u
    public void i(r rVar) {
        ((s0) rVar).r();
    }

    @Override // i9.u
    public void p() {
    }

    private t0(String str, x1.k kVar, l.a aVar, long j10, da.d0 d0Var, boolean z10, Object obj) {
        this.f31820i = aVar;
        this.f31822k = j10;
        this.f31823l = d0Var;
        this.f31824m = z10;
        x1 a10 = new x1.c().f(Uri.EMPTY).c(kVar.f32884a.toString()).d(jb.s.u(kVar)).e(obj).a();
        this.f31826o = a10;
        p1.b U = new p1.b().e0((String) ib.g.a(kVar.f32885b, "text/x-unknown")).V(kVar.f32886c).g0(kVar.f32887d).c0(kVar.f32888e).U(kVar.f32889f);
        String str2 = kVar.f32890g;
        this.f31821j = U.S(str2 == null ? str : str2).E();
        this.f31819h = new p.b().i(kVar.f32884a).b(1).a();
        this.f31825n = new r0(j10, true, false, false, null, a10);
    }
}
