package t8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.a0;
import j8.p1;
import java.io.IOException;
import p8.i;
import p8.j;
import p8.k;
import p8.w;
import p8.x;

/* compiled from: JpegExtractor.java */
/* loaded from: classes2.dex */
public final class a implements i {

    /* renamed from: b  reason: collision with root package name */
    private k f37164b;

    /* renamed from: c  reason: collision with root package name */
    private int f37165c;

    /* renamed from: d  reason: collision with root package name */
    private int f37166d;

    /* renamed from: e  reason: collision with root package name */
    private int f37167e;

    /* renamed from: g  reason: collision with root package name */
    private MotionPhotoMetadata f37169g;

    /* renamed from: h  reason: collision with root package name */
    private j f37170h;

    /* renamed from: i  reason: collision with root package name */
    private c f37171i;

    /* renamed from: j  reason: collision with root package name */
    private w8.k f37172j;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f37163a = new a0(6);

    /* renamed from: f  reason: collision with root package name */
    private long f37168f = -1;

    private void b(j jVar) throws IOException {
        this.f37163a.L(2);
        jVar.p(this.f37163a.d(), 0, 2);
        jVar.j(this.f37163a.J() - 2);
    }

    private void d() {
        f(new Metadata.Entry[0]);
        ((k) ea.a.e(this.f37164b)).r();
        this.f37164b.n(new x.b(-9223372036854775807L));
        this.f37165c = 6;
    }

    private static MotionPhotoMetadata e(String str, long j10) throws IOException {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void f(Metadata.Entry... entryArr) {
        ((k) ea.a.e(this.f37164b)).f(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 4).d(new p1.b().K("image/jpeg").X(new Metadata(entryArr)).E());
    }

    private int i(j jVar) throws IOException {
        this.f37163a.L(2);
        jVar.p(this.f37163a.d(), 0, 2);
        return this.f37163a.J();
    }

    private void j(j jVar) throws IOException {
        this.f37163a.L(2);
        jVar.readFully(this.f37163a.d(), 0, 2);
        int J = this.f37163a.J();
        this.f37166d = J;
        if (J == 65498) {
            if (this.f37168f != -1) {
                this.f37165c = 4;
            } else {
                d();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f37165c = 1;
        }
    }

    private void k(j jVar) throws IOException {
        String x10;
        if (this.f37166d == 65505) {
            a0 a0Var = new a0(this.f37167e);
            jVar.readFully(a0Var.d(), 0, this.f37167e);
            if (this.f37169g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.x()) && (x10 = a0Var.x()) != null) {
                MotionPhotoMetadata e10 = e(x10, jVar.b());
                this.f37169g = e10;
                if (e10 != null) {
                    this.f37168f = e10.f21225d;
                }
            }
        } else {
            jVar.m(this.f37167e);
        }
        this.f37165c = 0;
    }

    private void l(j jVar) throws IOException {
        this.f37163a.L(2);
        jVar.readFully(this.f37163a.d(), 0, 2);
        this.f37167e = this.f37163a.J() - 2;
        this.f37165c = 2;
    }

    private void m(j jVar) throws IOException {
        if (!jVar.d(this.f37163a.d(), 0, 1, true)) {
            d();
            return;
        }
        jVar.f();
        if (this.f37172j == null) {
            this.f37172j = new w8.k();
        }
        c cVar = new c(jVar, this.f37168f);
        this.f37171i = cVar;
        if (this.f37172j.h(cVar)) {
            this.f37172j.c(new d(this.f37168f, (k) ea.a.e(this.f37164b)));
            n();
            return;
        }
        d();
    }

    private void n() {
        f((Metadata.Entry) ea.a.e(this.f37169g));
        this.f37165c = 5;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f37165c = 0;
            this.f37172j = null;
        } else if (this.f37165c == 5) {
            ((w8.k) ea.a.e(this.f37172j)).a(j10, j11);
        }
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f37164b = kVar;
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        int i10 = this.f37165c;
        if (i10 == 0) {
            j(jVar);
            return 0;
        } else if (i10 == 1) {
            l(jVar);
            return 0;
        } else if (i10 == 2) {
            k(jVar);
            return 0;
        } else if (i10 == 4) {
            long position = jVar.getPosition();
            long j10 = this.f37168f;
            if (position != j10) {
                wVar.f35701a = j10;
                return 1;
            }
            m(jVar);
            return 0;
        } else if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        } else {
            if (this.f37171i == null || jVar != this.f37170h) {
                this.f37170h = jVar;
                this.f37171i = new c(jVar, this.f37168f);
            }
            int g10 = ((w8.k) ea.a.e(this.f37172j)).g(this.f37171i, wVar);
            if (g10 == 1) {
                wVar.f35701a += this.f37168f;
            }
            return g10;
        }
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        if (i(jVar) != 65496) {
            return false;
        }
        int i10 = i(jVar);
        this.f37166d = i10;
        if (i10 == 65504) {
            b(jVar);
            this.f37166d = i(jVar);
        }
        if (this.f37166d != 65505) {
            return false;
        }
        jVar.j(2);
        this.f37163a.L(6);
        jVar.p(this.f37163a.d(), 0, 6);
        return this.f37163a.F() == 1165519206 && this.f37163a.J() == 0;
    }

    @Override // p8.i
    public void release() {
        w8.k kVar = this.f37172j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
