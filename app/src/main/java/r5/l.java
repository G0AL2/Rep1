package r5;

import android.content.Context;
import android.os.Build;
import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.v;
import com.facebook.imagepipeline.producers.z0;
import p5.q;
import p5.s;

/* compiled from: ImagePipelineFactory.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: t  reason: collision with root package name */
    private static final Class<?> f36361t = l.class;

    /* renamed from: u  reason: collision with root package name */
    private static l f36362u;

    /* renamed from: v  reason: collision with root package name */
    private static boolean f36363v;

    /* renamed from: w  reason: collision with root package name */
    private static h f36364w;

    /* renamed from: a  reason: collision with root package name */
    private final z0 f36365a;

    /* renamed from: b  reason: collision with root package name */
    private final j f36366b;

    /* renamed from: c  reason: collision with root package name */
    private final a f36367c;

    /* renamed from: d  reason: collision with root package name */
    private p5.i<t3.d, w5.c> f36368d;

    /* renamed from: e  reason: collision with root package name */
    private p5.p<t3.d, w5.c> f36369e;

    /* renamed from: f  reason: collision with root package name */
    private p5.i<t3.d, b4.g> f36370f;

    /* renamed from: g  reason: collision with root package name */
    private p5.p<t3.d, b4.g> f36371g;

    /* renamed from: h  reason: collision with root package name */
    private p5.e f36372h;

    /* renamed from: i  reason: collision with root package name */
    private u3.i f36373i;

    /* renamed from: j  reason: collision with root package name */
    private u5.c f36374j;

    /* renamed from: k  reason: collision with root package name */
    private h f36375k;

    /* renamed from: l  reason: collision with root package name */
    private d6.d f36376l;

    /* renamed from: m  reason: collision with root package name */
    private o f36377m;

    /* renamed from: n  reason: collision with root package name */
    private p f36378n;

    /* renamed from: o  reason: collision with root package name */
    private p5.e f36379o;

    /* renamed from: p  reason: collision with root package name */
    private u3.i f36380p;

    /* renamed from: q  reason: collision with root package name */
    private o5.f f36381q;

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.imagepipeline.platform.d f36382r;

    /* renamed from: s  reason: collision with root package name */
    private l5.a f36383s;

    public l(j jVar) {
        z0 a1Var;
        if (c6.b.d()) {
            c6.b.a("ImagePipelineConfig()");
        }
        j jVar2 = (j) y3.k.g(jVar);
        this.f36366b = jVar2;
        if (jVar2.D().t()) {
            a1Var = new v(jVar.E().a());
        } else {
            a1Var = new a1(jVar.E().a());
        }
        this.f36365a = a1Var;
        c4.a.d0(jVar.D().b());
        this.f36367c = new a(jVar.w());
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    private h a() {
        return new h(r(), this.f36366b.f(), this.f36366b.a(), this.f36366b.b(), e(), h(), m(), s(), this.f36366b.y(), this.f36365a, this.f36366b.D().i(), this.f36366b.D().v(), this.f36366b.C(), this.f36366b);
    }

    private l5.a c() {
        if (this.f36383s == null) {
            this.f36383s = l5.b.a(o(), this.f36366b.E(), d(), this.f36366b.D().A(), this.f36366b.l());
        }
        return this.f36383s;
    }

    private u5.c i() {
        u5.c cVar;
        if (this.f36374j == null) {
            if (this.f36366b.r() != null) {
                this.f36374j = this.f36366b.r();
            } else {
                l5.a c10 = c();
                u5.c cVar2 = null;
                if (c10 != null) {
                    cVar2 = c10.c();
                    cVar = c10.b();
                } else {
                    cVar = null;
                }
                this.f36366b.o();
                this.f36374j = new u5.b(cVar2, cVar, p());
            }
        }
        return this.f36374j;
    }

    private d6.d k() {
        if (this.f36376l == null) {
            if (this.f36366b.n() == null && this.f36366b.m() == null && this.f36366b.D().w()) {
                this.f36376l = new d6.h(this.f36366b.D().f());
            } else {
                this.f36376l = new d6.f(this.f36366b.D().f(), this.f36366b.D().l(), this.f36366b.n(), this.f36366b.m(), this.f36366b.D().s());
            }
        }
        return this.f36376l;
    }

    public static l l() {
        return (l) y3.k.h(f36362u, "ImagePipelineFactory was not initialized!");
    }

    private o q() {
        if (this.f36377m == null) {
            this.f36377m = this.f36366b.D().h().a(this.f36366b.getContext(), this.f36366b.t().k(), i(), this.f36366b.h(), this.f36366b.k(), this.f36366b.z(), this.f36366b.D().o(), this.f36366b.E(), this.f36366b.t().i(this.f36366b.u()), this.f36366b.t().j(), e(), h(), m(), s(), this.f36366b.y(), o(), this.f36366b.D().e(), this.f36366b.D().d(), this.f36366b.D().c(), this.f36366b.D().f(), f(), this.f36366b.D().B(), this.f36366b.D().j());
        }
        return this.f36377m;
    }

    private p r() {
        boolean z10 = Build.VERSION.SDK_INT >= 24 && this.f36366b.D().k();
        if (this.f36378n == null) {
            this.f36378n = new p(this.f36366b.getContext().getApplicationContext().getContentResolver(), q(), this.f36366b.c(), this.f36366b.z(), this.f36366b.D().y(), this.f36365a, this.f36366b.k(), z10, this.f36366b.D().x(), this.f36366b.p(), k(), this.f36366b.D().r(), this.f36366b.D().p(), this.f36366b.D().C(), this.f36366b.D().a());
        }
        return this.f36378n;
    }

    private p5.e s() {
        if (this.f36379o == null) {
            this.f36379o = new p5.e(t(), this.f36366b.t().i(this.f36366b.u()), this.f36366b.t().j(), this.f36366b.E().f(), this.f36366b.E().b(), this.f36366b.A());
        }
        return this.f36379o;
    }

    public static synchronized void u(Context context) {
        synchronized (l.class) {
            if (c6.b.d()) {
                c6.b.a("ImagePipelineFactory#initialize");
            }
            v(i.J(context).K());
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    public static synchronized void v(j jVar) {
        synchronized (l.class) {
            if (f36362u != null) {
                z3.a.C(f36361t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f36362u = new l(jVar);
        }
    }

    public v5.a b(Context context) {
        l5.a c10 = c();
        if (c10 == null) {
            return null;
        }
        return c10.a(context);
    }

    public p5.i<t3.d, w5.c> d() {
        if (this.f36368d == null) {
            this.f36368d = this.f36366b.x().a(this.f36366b.q(), this.f36366b.B(), this.f36366b.g(), this.f36366b.j());
        }
        return this.f36368d;
    }

    public p5.p<t3.d, w5.c> e() {
        if (this.f36369e == null) {
            this.f36369e = q.a(d(), this.f36366b.A());
        }
        return this.f36369e;
    }

    public a f() {
        return this.f36367c;
    }

    public p5.i<t3.d, b4.g> g() {
        if (this.f36370f == null) {
            this.f36370f = p5.m.a(this.f36366b.s(), this.f36366b.B());
        }
        return this.f36370f;
    }

    public p5.p<t3.d, b4.g> h() {
        s<t3.d, b4.g> g10;
        if (this.f36371g == null) {
            if (this.f36366b.d() != null) {
                g10 = this.f36366b.d();
            } else {
                g10 = g();
            }
            this.f36371g = p5.n.a(g10, this.f36366b.A());
        }
        return this.f36371g;
    }

    public h j() {
        if (f36363v) {
            if (f36364w == null) {
                h a10 = a();
                f36364w = a10;
                this.f36375k = a10;
            }
            return f36364w;
        }
        if (this.f36375k == null) {
            this.f36375k = a();
        }
        return this.f36375k;
    }

    public p5.e m() {
        if (this.f36372h == null) {
            this.f36372h = new p5.e(n(), this.f36366b.t().i(this.f36366b.u()), this.f36366b.t().j(), this.f36366b.E().f(), this.f36366b.E().b(), this.f36366b.A());
        }
        return this.f36372h;
    }

    public u3.i n() {
        if (this.f36373i == null) {
            this.f36373i = this.f36366b.v().a(this.f36366b.e());
        }
        return this.f36373i;
    }

    public o5.f o() {
        if (this.f36381q == null) {
            this.f36381q = o5.g.a(this.f36366b.t(), p(), f());
        }
        return this.f36381q;
    }

    public com.facebook.imagepipeline.platform.d p() {
        if (this.f36382r == null) {
            this.f36382r = com.facebook.imagepipeline.platform.e.a(this.f36366b.t(), this.f36366b.D().u());
        }
        return this.f36382r;
    }

    public u3.i t() {
        if (this.f36380p == null) {
            this.f36380p = this.f36366b.v().a(this.f36366b.i());
        }
        return this.f36380p;
    }
}
