package ye;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.util.List;
import ye.t;

/* compiled from: Response.kt */
/* loaded from: classes3.dex */
public final class d0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private d f39622a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f39623b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f39624c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39625d;

    /* renamed from: e  reason: collision with root package name */
    private final int f39626e;

    /* renamed from: f  reason: collision with root package name */
    private final s f39627f;

    /* renamed from: g  reason: collision with root package name */
    private final t f39628g;

    /* renamed from: h  reason: collision with root package name */
    private final e0 f39629h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f39630i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f39631j;

    /* renamed from: k  reason: collision with root package name */
    private final d0 f39632k;

    /* renamed from: l  reason: collision with root package name */
    private final long f39633l;

    /* renamed from: m  reason: collision with root package name */
    private final long f39634m;

    /* renamed from: n  reason: collision with root package name */
    private final df.c f39635n;

    public d0(b0 b0Var, a0 a0Var, String str, int i10, s sVar, t tVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, df.c cVar) {
        qe.k.f(b0Var, "request");
        qe.k.f(a0Var, "protocol");
        qe.k.f(str, "message");
        qe.k.f(tVar, "headers");
        this.f39623b = b0Var;
        this.f39624c = a0Var;
        this.f39625d = str;
        this.f39626e = i10;
        this.f39627f = sVar;
        this.f39628g = tVar;
        this.f39629h = e0Var;
        this.f39630i = d0Var;
        this.f39631j = d0Var2;
        this.f39632k = d0Var3;
        this.f39633l = j10;
        this.f39634m = j11;
        this.f39635n = cVar;
    }

    public static /* synthetic */ String z(d0 d0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d0Var.y(str, str2);
    }

    public final t A() {
        return this.f39628g;
    }

    public final String C() {
        return this.f39625d;
    }

    public final d0 L() {
        return this.f39630i;
    }

    public final a O() {
        return new a(this);
    }

    public final d0 T() {
        return this.f39632k;
    }

    public final a0 U() {
        return this.f39624c;
    }

    public final long Z() {
        return this.f39634m;
    }

    public final e0 a() {
        return this.f39629h;
    }

    public final d b() {
        d dVar = this.f39622a;
        if (dVar == null) {
            d b10 = d.f39600o.b(this.f39628g);
            this.f39622a = b10;
            return b10;
        }
        return dVar;
    }

    public final boolean c0() {
        int i10 = this.f39626e;
        return 200 <= i10 && 299 >= i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.f39629h;
        if (e0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        e0Var.close();
    }

    public final d0 d() {
        return this.f39631j;
    }

    public final b0 d0() {
        return this.f39623b;
    }

    public final List<h> e() {
        String str;
        t tVar = this.f39628g;
        int i10 = this.f39626e;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return fe.n.h();
        } else {
            str = "Proxy-Authenticate";
        }
        return ef.e.a(tVar, str);
    }

    public final long g0() {
        return this.f39633l;
    }

    public final int h() {
        return this.f39626e;
    }

    public final df.c l() {
        return this.f39635n;
    }

    public final s q() {
        return this.f39627f;
    }

    public String toString() {
        return "Response{protocol=" + this.f39624c + ", code=" + this.f39626e + ", message=" + this.f39625d + ", url=" + this.f39623b.l() + '}';
    }

    public final String w(String str) {
        return z(this, str, null, 2, null);
    }

    public final String y(String str, String str2) {
        qe.k.f(str, "name");
        String a10 = this.f39628g.a(str);
        return a10 != null ? a10 : str2;
    }

    /* compiled from: Response.kt */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private b0 f39636a;

        /* renamed from: b  reason: collision with root package name */
        private a0 f39637b;

        /* renamed from: c  reason: collision with root package name */
        private int f39638c;

        /* renamed from: d  reason: collision with root package name */
        private String f39639d;

        /* renamed from: e  reason: collision with root package name */
        private s f39640e;

        /* renamed from: f  reason: collision with root package name */
        private t.a f39641f;

        /* renamed from: g  reason: collision with root package name */
        private e0 f39642g;

        /* renamed from: h  reason: collision with root package name */
        private d0 f39643h;

        /* renamed from: i  reason: collision with root package name */
        private d0 f39644i;

        /* renamed from: j  reason: collision with root package name */
        private d0 f39645j;

        /* renamed from: k  reason: collision with root package name */
        private long f39646k;

        /* renamed from: l  reason: collision with root package name */
        private long f39647l;

        /* renamed from: m  reason: collision with root package name */
        private df.c f39648m;

        public a() {
            this.f39638c = -1;
            this.f39641f = new t.a();
        }

        private final void e(d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, d0 d0Var) {
            if (d0Var != null) {
                if (d0Var.a() == null) {
                    if (d0Var.L() == null) {
                        if (d0Var.d() == null) {
                            if (d0Var.T() == null) {
                                return;
                            }
                            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public a a(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f39641f.a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.f39642g = e0Var;
            return this;
        }

        public d0 c() {
            int i10 = this.f39638c;
            if (i10 >= 0) {
                b0 b0Var = this.f39636a;
                if (b0Var != null) {
                    a0 a0Var = this.f39637b;
                    if (a0Var != null) {
                        String str = this.f39639d;
                        if (str != null) {
                            return new d0(b0Var, a0Var, str, i10, this.f39640e, this.f39641f.d(), this.f39642g, this.f39643h, this.f39644i, this.f39645j, this.f39646k, this.f39647l, this.f39648m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f39638c).toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            this.f39644i = d0Var;
            return this;
        }

        public a g(int i10) {
            this.f39638c = i10;
            return this;
        }

        public final int h() {
            return this.f39638c;
        }

        public a i(s sVar) {
            this.f39640e = sVar;
            return this;
        }

        public a j(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f39641f.h(str, str2);
            return this;
        }

        public a k(t tVar) {
            qe.k.f(tVar, "headers");
            this.f39641f = tVar.e();
            return this;
        }

        public final void l(df.c cVar) {
            qe.k.f(cVar, "deferredTrailers");
            this.f39648m = cVar;
        }

        public a m(String str) {
            qe.k.f(str, "message");
            this.f39639d = str;
            return this;
        }

        public a n(d0 d0Var) {
            f("networkResponse", d0Var);
            this.f39643h = d0Var;
            return this;
        }

        public a o(d0 d0Var) {
            e(d0Var);
            this.f39645j = d0Var;
            return this;
        }

        public a p(a0 a0Var) {
            qe.k.f(a0Var, "protocol");
            this.f39637b = a0Var;
            return this;
        }

        public a q(long j10) {
            this.f39647l = j10;
            return this;
        }

        public a r(b0 b0Var) {
            qe.k.f(b0Var, "request");
            this.f39636a = b0Var;
            return this;
        }

        public a s(long j10) {
            this.f39646k = j10;
            return this;
        }

        public a(d0 d0Var) {
            qe.k.f(d0Var, "response");
            this.f39638c = -1;
            this.f39636a = d0Var.d0();
            this.f39637b = d0Var.U();
            this.f39638c = d0Var.h();
            this.f39639d = d0Var.C();
            this.f39640e = d0Var.q();
            this.f39641f = d0Var.A().e();
            this.f39642g = d0Var.a();
            this.f39643h = d0Var.L();
            this.f39644i = d0Var.d();
            this.f39645j = d0Var.T();
            this.f39646k = d0Var.g0();
            this.f39647l = d0Var.Z();
            this.f39648m = d0Var.l();
        }
    }
}
