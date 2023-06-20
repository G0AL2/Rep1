package bf;

import bf.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import mf.c0;
import mf.e0;
import mf.f;
import mf.f0;
import mf.h;
import mf.r;
import qe.g;
import qe.k;
import ve.p;
import ye.a0;
import ye.b0;
import ye.d0;
import ye.t;
import ye.v;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: b  reason: collision with root package name */
    public static final C0095a f5216b = new C0095a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ye.c f5217a;

    /* compiled from: CacheInterceptor.kt */
    /* renamed from: bf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0095a {
        private C0095a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            int i10;
            boolean l10;
            boolean y10;
            t.a aVar = new t.a();
            int size = tVar.size();
            while (i10 < size) {
                String c10 = tVar.c(i10);
                String h10 = tVar.h(i10);
                l10 = p.l("Warning", c10, true);
                if (l10) {
                    y10 = p.y(h10, "1", false, 2, null);
                    i10 = y10 ? i10 + 1 : 0;
                }
                if (d(c10) || !e(c10) || tVar2.a(c10) == null) {
                    aVar.c(c10, h10);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String c11 = tVar2.c(i11);
                if (!d(c11) && e(c11)) {
                    aVar.c(c11, tVar2.h(i11));
                }
            }
            return aVar.d();
        }

        private final boolean d(String str) {
            boolean l10;
            boolean l11;
            boolean l12;
            l10 = p.l("Content-Length", str, true);
            if (l10) {
                return true;
            }
            l11 = p.l("Content-Encoding", str, true);
            if (l11) {
                return true;
            }
            l12 = p.l("Content-Type", str, true);
            return l12;
        }

        private final boolean e(String str) {
            boolean l10;
            boolean l11;
            boolean l12;
            boolean l13;
            boolean l14;
            boolean l15;
            boolean l16;
            boolean l17;
            l10 = p.l("Connection", str, true);
            if (!l10) {
                l11 = p.l("Keep-Alive", str, true);
                if (!l11) {
                    l12 = p.l("Proxy-Authenticate", str, true);
                    if (!l12) {
                        l13 = p.l("Proxy-Authorization", str, true);
                        if (!l13) {
                            l14 = p.l("TE", str, true);
                            if (!l14) {
                                l15 = p.l("Trailers", str, true);
                                if (!l15) {
                                    l16 = p.l("Transfer-Encoding", str, true);
                                    if (!l16) {
                                        l17 = p.l("Upgrade", str, true);
                                        if (!l17) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d0 f(d0 d0Var) {
            return (d0Var != null ? d0Var.a() : null) != null ? d0Var.O().b(null).c() : d0Var;
        }

        public /* synthetic */ C0095a(g gVar) {
            this();
        }
    }

    /* compiled from: CacheInterceptor.kt */
    /* loaded from: classes3.dex */
    public static final class b implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f5219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bf.b f5220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ mf.g f5221d;

        b(h hVar, bf.b bVar, mf.g gVar) {
            this.f5219b = hVar;
            this.f5220c = bVar;
            this.f5221d = gVar;
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f5218a && !ze.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f5218a = true;
                this.f5220c.abort();
            }
            this.f5219b.close();
        }

        @Override // mf.e0
        public long e0(f fVar, long j10) throws IOException {
            k.f(fVar, "sink");
            try {
                long e02 = this.f5219b.e0(fVar, j10);
                if (e02 == -1) {
                    if (!this.f5218a) {
                        this.f5218a = true;
                        this.f5221d.close();
                    }
                    return -1L;
                }
                fVar.w(this.f5221d.j(), fVar.C0() - e02, e02);
                this.f5221d.D();
                return e02;
            } catch (IOException e10) {
                if (!this.f5218a) {
                    this.f5218a = true;
                    this.f5220c.abort();
                }
                throw e10;
            }
        }

        @Override // mf.e0
        public f0 k() {
            return this.f5219b.k();
        }
    }

    public a(ye.c cVar) {
        this.f5217a = cVar;
    }

    private final d0 a(bf.b bVar, d0 d0Var) throws IOException {
        if (bVar == null) {
            return d0Var;
        }
        c0 a10 = bVar.a();
        ye.e0 a11 = d0Var.a();
        k.c(a11);
        b bVar2 = new b(a11.q(), bVar, r.c(a10));
        return d0Var.O().b(new ef.h(d0.z(d0Var, "Content-Type", null, 2, null), d0Var.a().e(), r.d(bVar2))).c();
    }

    @Override // ye.v
    public d0 intercept(v.a aVar) throws IOException {
        ye.r rVar;
        ye.e0 a10;
        ye.e0 a11;
        k.f(aVar, "chain");
        ye.e call = aVar.call();
        ye.c cVar = this.f5217a;
        d0 b10 = cVar != null ? cVar.b(aVar.l()) : null;
        c b11 = new c.b(System.currentTimeMillis(), aVar.l(), b10).b();
        b0 b12 = b11.b();
        d0 a12 = b11.a();
        ye.c cVar2 = this.f5217a;
        if (cVar2 != null) {
            cVar2.z(b11);
        }
        df.e eVar = call instanceof df.e ? call : null;
        if (eVar == null || (rVar = eVar.n()) == null) {
            rVar = ye.r.f39743a;
        }
        if (b10 != null && a12 == null && (a11 = b10.a()) != null) {
            ze.c.j(a11);
        }
        if (b12 == null && a12 == null) {
            d0 c10 = new d0.a().r(aVar.l()).p(a0.HTTP_1_1).g(ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST).m("Unsatisfiable Request (only-if-cached)").b(ze.c.f40521c).s(-1L).q(System.currentTimeMillis()).c();
            rVar.A(call, c10);
            return c10;
        } else if (b12 == null) {
            k.c(a12);
            d0 c11 = a12.O().d(f5216b.f(a12)).c();
            rVar.b(call, c11);
            return c11;
        } else {
            if (a12 != null) {
                rVar.a(call, a12);
            } else if (this.f5217a != null) {
                rVar.c(call);
            }
            try {
                d0 a13 = aVar.a(b12);
                if (a13 == null && b10 != null && a10 != null) {
                }
                if (a12 != null) {
                    if (a13 != null && a13.h() == 304) {
                        d0.a O = a12.O();
                        C0095a c0095a = f5216b;
                        d0 c12 = O.k(c0095a.c(a12.A(), a13.A())).s(a13.g0()).q(a13.Z()).d(c0095a.f(a12)).n(c0095a.f(a13)).c();
                        ye.e0 a14 = a13.a();
                        k.c(a14);
                        a14.close();
                        ye.c cVar3 = this.f5217a;
                        k.c(cVar3);
                        cVar3.y();
                        this.f5217a.A(a12, c12);
                        rVar.b(call, c12);
                        return c12;
                    }
                    ye.e0 a15 = a12.a();
                    if (a15 != null) {
                        ze.c.j(a15);
                    }
                }
                k.c(a13);
                d0.a O2 = a13.O();
                C0095a c0095a2 = f5216b;
                d0 c13 = O2.d(c0095a2.f(a12)).n(c0095a2.f(a13)).c();
                if (this.f5217a != null) {
                    if (ef.e.b(c13) && c.f5222c.a(c13, b12)) {
                        d0 a16 = a(this.f5217a.h(c13), c13);
                        if (a12 != null) {
                            rVar.c(call);
                        }
                        return a16;
                    } else if (ef.f.f29821a.a(b12.h())) {
                        try {
                            this.f5217a.l(b12);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c13;
            } finally {
                if (b10 != null && (a10 = b10.a()) != null) {
                    ze.c.j(a10);
                }
            }
        }
    }
}
