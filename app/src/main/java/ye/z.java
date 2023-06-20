package ye;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kf.c;
import okhttp3.internal.platform.h;
import ye.e;
import ye.r;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes3.dex */
public class z implements Cloneable, e.a {
    private final int A;
    private final int B;
    private final long C;
    private final df.i D;

    /* renamed from: a  reason: collision with root package name */
    private final p f39798a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39799b;

    /* renamed from: c  reason: collision with root package name */
    private final List<v> f39800c;

    /* renamed from: d  reason: collision with root package name */
    private final List<v> f39801d;

    /* renamed from: e  reason: collision with root package name */
    private final r.c f39802e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39803f;

    /* renamed from: g  reason: collision with root package name */
    private final ye.b f39804g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f39805h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f39806i;

    /* renamed from: j  reason: collision with root package name */
    private final n f39807j;

    /* renamed from: k  reason: collision with root package name */
    private final c f39808k;

    /* renamed from: l  reason: collision with root package name */
    private final q f39809l;

    /* renamed from: m  reason: collision with root package name */
    private final Proxy f39810m;

    /* renamed from: n  reason: collision with root package name */
    private final ProxySelector f39811n;

    /* renamed from: o  reason: collision with root package name */
    private final ye.b f39812o;

    /* renamed from: p  reason: collision with root package name */
    private final SocketFactory f39813p;

    /* renamed from: q  reason: collision with root package name */
    private final SSLSocketFactory f39814q;

    /* renamed from: r  reason: collision with root package name */
    private final X509TrustManager f39815r;

    /* renamed from: s  reason: collision with root package name */
    private final List<l> f39816s;

    /* renamed from: t  reason: collision with root package name */
    private final List<a0> f39817t;

    /* renamed from: u  reason: collision with root package name */
    private final HostnameVerifier f39818u;

    /* renamed from: v  reason: collision with root package name */
    private final g f39819v;

    /* renamed from: w  reason: collision with root package name */
    private final kf.c f39820w;

    /* renamed from: x  reason: collision with root package name */
    private final int f39821x;

    /* renamed from: y  reason: collision with root package name */
    private final int f39822y;

    /* renamed from: z  reason: collision with root package name */
    private final int f39823z;
    public static final b G = new b(null);
    private static final List<a0> E = ze.c.t(a0.HTTP_2, a0.HTTP_1_1);
    private static final List<l> F = ze.c.t(l.f39700g, l.f39702i);

    /* compiled from: OkHttpClient.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final List<l> a() {
            return z.F;
        }

        public final List<a0> b() {
            return z.E;
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    public z(a aVar) {
        ProxySelector I;
        qe.k.f(aVar, "builder");
        this.f39798a = aVar.v();
        this.f39799b = aVar.s();
        this.f39800c = ze.c.R(aVar.B());
        this.f39801d = ze.c.R(aVar.D());
        this.f39802e = aVar.x();
        this.f39803f = aVar.K();
        this.f39804g = aVar.m();
        this.f39805h = aVar.y();
        this.f39806i = aVar.z();
        this.f39807j = aVar.u();
        this.f39808k = aVar.n();
        this.f39809l = aVar.w();
        this.f39810m = aVar.G();
        if (aVar.G() != null) {
            I = jf.a.f33110a;
        } else {
            I = aVar.I();
            I = I == null ? ProxySelector.getDefault() : I;
            if (I == null) {
                I = jf.a.f33110a;
            }
        }
        this.f39811n = I;
        this.f39812o = aVar.H();
        this.f39813p = aVar.M();
        List<l> t10 = aVar.t();
        this.f39816s = t10;
        this.f39817t = aVar.F();
        this.f39818u = aVar.A();
        this.f39821x = aVar.o();
        this.f39822y = aVar.r();
        this.f39823z = aVar.J();
        this.A = aVar.O();
        this.B = aVar.E();
        this.C = aVar.C();
        df.i L = aVar.L();
        this.D = L == null ? new df.i() : L;
        boolean z10 = true;
        if (!(t10 instanceof Collection) || !t10.isEmpty()) {
            Iterator<T> it = t10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            this.f39814q = null;
            this.f39820w = null;
            this.f39815r = null;
            this.f39819v = g.f39656c;
        } else if (aVar.N() != null) {
            this.f39814q = aVar.N();
            kf.c p10 = aVar.p();
            qe.k.c(p10);
            this.f39820w = p10;
            X509TrustManager P = aVar.P();
            qe.k.c(P);
            this.f39815r = P;
            g q10 = aVar.q();
            qe.k.c(p10);
            this.f39819v = q10.e(p10);
        } else {
            h.a aVar2 = okhttp3.internal.platform.h.f35277c;
            X509TrustManager p11 = aVar2.g().p();
            this.f39815r = p11;
            okhttp3.internal.platform.h g10 = aVar2.g();
            qe.k.c(p11);
            this.f39814q = g10.o(p11);
            c.a aVar3 = kf.c.f33466a;
            qe.k.c(p11);
            kf.c a10 = aVar3.a(p11);
            this.f39820w = a10;
            g q11 = aVar.q();
            qe.k.c(a10);
            this.f39819v = q11.e(a10);
        }
        K();
    }

    private final void K() {
        boolean z10;
        List<v> list = this.f39800c;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            List<v> list2 = this.f39801d;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<l> list3 = this.f39816s;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (l lVar : list3) {
                        if (lVar.f()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    if (this.f39814q == null) {
                        if (this.f39820w == null) {
                            if (this.f39815r == null) {
                                if (!qe.k.a(this.f39819v, g.f39656c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.f39814q != null) {
                    if (this.f39820w != null) {
                        if (this.f39815r == null) {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
            }
            throw new IllegalStateException(("Null network interceptor: " + this.f39801d).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + this.f39800c).toString());
    }

    public h0 A(b0 b0Var, i0 i0Var) {
        qe.k.f(b0Var, "request");
        qe.k.f(i0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        lf.d dVar = new lf.d(cf.e.f5513h, b0Var, i0Var, new Random(), this.B, null, this.C);
        dVar.p(this);
        return dVar;
    }

    public final int B() {
        return this.B;
    }

    public final List<a0> C() {
        return this.f39817t;
    }

    public final Proxy D() {
        return this.f39810m;
    }

    public final ye.b E() {
        return this.f39812o;
    }

    public final ProxySelector F() {
        return this.f39811n;
    }

    public final int G() {
        return this.f39823z;
    }

    public final boolean H() {
        return this.f39803f;
    }

    public final SocketFactory I() {
        return this.f39813p;
    }

    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.f39814q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int L() {
        return this.A;
    }

    public final X509TrustManager M() {
        return this.f39815r;
    }

    @Override // ye.e.a
    public e a(b0 b0Var) {
        qe.k.f(b0Var, "request");
        return new df.e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final ye.b e() {
        return this.f39804g;
    }

    public final c f() {
        return this.f39808k;
    }

    public final int g() {
        return this.f39821x;
    }

    public final kf.c i() {
        return this.f39820w;
    }

    public final g j() {
        return this.f39819v;
    }

    public final int k() {
        return this.f39822y;
    }

    public final k m() {
        return this.f39799b;
    }

    public final List<l> n() {
        return this.f39816s;
    }

    public final n o() {
        return this.f39807j;
    }

    public final p p() {
        return this.f39798a;
    }

    public final q q() {
        return this.f39809l;
    }

    public final r.c r() {
        return this.f39802e;
    }

    public final boolean s() {
        return this.f39805h;
    }

    public final boolean t() {
        return this.f39806i;
    }

    public final df.i u() {
        return this.D;
    }

    public final HostnameVerifier v() {
        return this.f39818u;
    }

    public final List<v> w() {
        return this.f39800c;
    }

    public final long x() {
        return this.C;
    }

    public final List<v> y() {
        return this.f39801d;
    }

    public a z() {
        return new a(this);
    }

    /* compiled from: OkHttpClient.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private int A;
        private int B;
        private long C;
        private df.i D;

        /* renamed from: a  reason: collision with root package name */
        private p f39824a;

        /* renamed from: b  reason: collision with root package name */
        private k f39825b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v> f39826c;

        /* renamed from: d  reason: collision with root package name */
        private final List<v> f39827d;

        /* renamed from: e  reason: collision with root package name */
        private r.c f39828e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39829f;

        /* renamed from: g  reason: collision with root package name */
        private ye.b f39830g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f39831h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f39832i;

        /* renamed from: j  reason: collision with root package name */
        private n f39833j;

        /* renamed from: k  reason: collision with root package name */
        private c f39834k;

        /* renamed from: l  reason: collision with root package name */
        private q f39835l;

        /* renamed from: m  reason: collision with root package name */
        private Proxy f39836m;

        /* renamed from: n  reason: collision with root package name */
        private ProxySelector f39837n;

        /* renamed from: o  reason: collision with root package name */
        private ye.b f39838o;

        /* renamed from: p  reason: collision with root package name */
        private SocketFactory f39839p;

        /* renamed from: q  reason: collision with root package name */
        private SSLSocketFactory f39840q;

        /* renamed from: r  reason: collision with root package name */
        private X509TrustManager f39841r;

        /* renamed from: s  reason: collision with root package name */
        private List<l> f39842s;

        /* renamed from: t  reason: collision with root package name */
        private List<? extends a0> f39843t;

        /* renamed from: u  reason: collision with root package name */
        private HostnameVerifier f39844u;

        /* renamed from: v  reason: collision with root package name */
        private g f39845v;

        /* renamed from: w  reason: collision with root package name */
        private kf.c f39846w;

        /* renamed from: x  reason: collision with root package name */
        private int f39847x;

        /* renamed from: y  reason: collision with root package name */
        private int f39848y;

        /* renamed from: z  reason: collision with root package name */
        private int f39849z;

        public a() {
            this.f39824a = new p();
            this.f39825b = new k();
            this.f39826c = new ArrayList();
            this.f39827d = new ArrayList();
            this.f39828e = ze.c.e(r.f39743a);
            this.f39829f = true;
            ye.b bVar = ye.b.f39548a;
            this.f39830g = bVar;
            this.f39831h = true;
            this.f39832i = true;
            this.f39833j = n.f39734a;
            this.f39835l = q.f39742a;
            this.f39838o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            qe.k.e(socketFactory, "SocketFactory.getDefault()");
            this.f39839p = socketFactory;
            b bVar2 = z.G;
            this.f39842s = bVar2.a();
            this.f39843t = bVar2.b();
            this.f39844u = kf.d.f33467a;
            this.f39845v = g.f39656c;
            this.f39848y = 10000;
            this.f39849z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final HostnameVerifier A() {
            return this.f39844u;
        }

        public final List<v> B() {
            return this.f39826c;
        }

        public final long C() {
            return this.C;
        }

        public final List<v> D() {
            return this.f39827d;
        }

        public final int E() {
            return this.B;
        }

        public final List<a0> F() {
            return this.f39843t;
        }

        public final Proxy G() {
            return this.f39836m;
        }

        public final ye.b H() {
            return this.f39838o;
        }

        public final ProxySelector I() {
            return this.f39837n;
        }

        public final int J() {
            return this.f39849z;
        }

        public final boolean K() {
            return this.f39829f;
        }

        public final df.i L() {
            return this.D;
        }

        public final SocketFactory M() {
            return this.f39839p;
        }

        public final SSLSocketFactory N() {
            return this.f39840q;
        }

        public final int O() {
            return this.A;
        }

        public final X509TrustManager P() {
            return this.f39841r;
        }

        public final a Q(HostnameVerifier hostnameVerifier) {
            qe.k.f(hostnameVerifier, "hostnameVerifier");
            if (!qe.k.a(hostnameVerifier, this.f39844u)) {
                this.D = null;
            }
            this.f39844u = hostnameVerifier;
            return this;
        }

        public final a R(List<? extends a0> list) {
            List P;
            qe.k.f(list, "protocols");
            P = fe.x.P(list);
            a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
            boolean z10 = false;
            if (P.contains(a0Var) || P.contains(a0.HTTP_1_1)) {
                if ((!P.contains(a0Var) || P.size() <= 1) ? true : true) {
                    if (!P.contains(a0.HTTP_1_0)) {
                        if (!P.contains(null)) {
                            P.remove(a0.SPDY_3);
                            if (!qe.k.a(P, this.f39843t)) {
                                this.D = null;
                            }
                            List<? extends a0> unmodifiableList = Collections.unmodifiableList(P);
                            qe.k.e(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                            this.f39843t = unmodifiableList;
                            return this;
                        }
                        throw new IllegalArgumentException("protocols must not contain null".toString());
                    }
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + P).toString());
                }
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + P).toString());
            }
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + P).toString());
        }

        public final a S(Proxy proxy) {
            if (!qe.k.a(proxy, this.f39836m)) {
                this.D = null;
            }
            this.f39836m = proxy;
            return this;
        }

        public final a T(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "unit");
            this.f39849z = ze.c.h("timeout", j10, timeUnit);
            return this;
        }

        public final a U(boolean z10) {
            this.f39829f = z10;
            return this;
        }

        public final a V(SocketFactory socketFactory) {
            qe.k.f(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!qe.k.a(socketFactory, this.f39839p)) {
                    this.D = null;
                }
                this.f39839p = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        public final a W(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            qe.k.f(sSLSocketFactory, "sslSocketFactory");
            qe.k.f(x509TrustManager, "trustManager");
            if ((!qe.k.a(sSLSocketFactory, this.f39840q)) || (!qe.k.a(x509TrustManager, this.f39841r))) {
                this.D = null;
            }
            this.f39840q = sSLSocketFactory;
            this.f39846w = kf.c.f33466a.a(x509TrustManager);
            this.f39841r = x509TrustManager;
            return this;
        }

        public final a X(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "unit");
            this.A = ze.c.h("timeout", j10, timeUnit);
            return this;
        }

        public final a a(v vVar) {
            qe.k.f(vVar, "interceptor");
            this.f39826c.add(vVar);
            return this;
        }

        public final a b(v vVar) {
            qe.k.f(vVar, "interceptor");
            this.f39827d.add(vVar);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(c cVar) {
            this.f39834k = cVar;
            return this;
        }

        public final a e(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "unit");
            this.f39847x = ze.c.h("timeout", j10, timeUnit);
            return this;
        }

        public final a f(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "unit");
            this.f39848y = ze.c.h("timeout", j10, timeUnit);
            return this;
        }

        public final a g(k kVar) {
            qe.k.f(kVar, "connectionPool");
            this.f39825b = kVar;
            return this;
        }

        public final a h(List<l> list) {
            qe.k.f(list, "connectionSpecs");
            if (!qe.k.a(list, this.f39842s)) {
                this.D = null;
            }
            this.f39842s = ze.c.R(list);
            return this;
        }

        public final a i(n nVar) {
            qe.k.f(nVar, "cookieJar");
            this.f39833j = nVar;
            return this;
        }

        public final a j(r rVar) {
            qe.k.f(rVar, "eventListener");
            this.f39828e = ze.c.e(rVar);
            return this;
        }

        public final a k(boolean z10) {
            this.f39831h = z10;
            return this;
        }

        public final a l(boolean z10) {
            this.f39832i = z10;
            return this;
        }

        public final ye.b m() {
            return this.f39830g;
        }

        public final c n() {
            return this.f39834k;
        }

        public final int o() {
            return this.f39847x;
        }

        public final kf.c p() {
            return this.f39846w;
        }

        public final g q() {
            return this.f39845v;
        }

        public final int r() {
            return this.f39848y;
        }

        public final k s() {
            return this.f39825b;
        }

        public final List<l> t() {
            return this.f39842s;
        }

        public final n u() {
            return this.f39833j;
        }

        public final p v() {
            return this.f39824a;
        }

        public final q w() {
            return this.f39835l;
        }

        public final r.c x() {
            return this.f39828e;
        }

        public final boolean y() {
            return this.f39831h;
        }

        public final boolean z() {
            return this.f39832i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(z zVar) {
            this();
            qe.k.f(zVar, "okHttpClient");
            this.f39824a = zVar.p();
            this.f39825b = zVar.m();
            fe.u.s(this.f39826c, zVar.w());
            fe.u.s(this.f39827d, zVar.y());
            this.f39828e = zVar.r();
            this.f39829f = zVar.H();
            this.f39830g = zVar.e();
            this.f39831h = zVar.s();
            this.f39832i = zVar.t();
            this.f39833j = zVar.o();
            this.f39834k = zVar.f();
            this.f39835l = zVar.q();
            this.f39836m = zVar.D();
            this.f39837n = zVar.F();
            this.f39838o = zVar.E();
            this.f39839p = zVar.I();
            this.f39840q = zVar.f39814q;
            this.f39841r = zVar.M();
            this.f39842s = zVar.n();
            this.f39843t = zVar.C();
            this.f39844u = zVar.v();
            this.f39845v = zVar.j();
            this.f39846w = zVar.i();
            this.f39847x = zVar.g();
            this.f39848y = zVar.k();
            this.f39849z = zVar.G();
            this.A = zVar.L();
            this.B = zVar.B();
            this.C = zVar.x();
            this.D = zVar.u();
        }
    }

    public z() {
        this(new a());
    }
}
