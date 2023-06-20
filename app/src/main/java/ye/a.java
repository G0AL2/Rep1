package ye;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ye.u;

/* compiled from: Address.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final u f39528a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a0> f39529b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l> f39530c;

    /* renamed from: d  reason: collision with root package name */
    private final q f39531d;

    /* renamed from: e  reason: collision with root package name */
    private final SocketFactory f39532e;

    /* renamed from: f  reason: collision with root package name */
    private final SSLSocketFactory f39533f;

    /* renamed from: g  reason: collision with root package name */
    private final HostnameVerifier f39534g;

    /* renamed from: h  reason: collision with root package name */
    private final g f39535h;

    /* renamed from: i  reason: collision with root package name */
    private final b f39536i;

    /* renamed from: j  reason: collision with root package name */
    private final Proxy f39537j;

    /* renamed from: k  reason: collision with root package name */
    private final ProxySelector f39538k;

    public a(String str, int i10, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        qe.k.f(str, "uriHost");
        qe.k.f(qVar, "dns");
        qe.k.f(socketFactory, "socketFactory");
        qe.k.f(bVar, "proxyAuthenticator");
        qe.k.f(list, "protocols");
        qe.k.f(list2, "connectionSpecs");
        qe.k.f(proxySelector, "proxySelector");
        this.f39531d = qVar;
        this.f39532e = socketFactory;
        this.f39533f = sSLSocketFactory;
        this.f39534g = hostnameVerifier;
        this.f39535h = gVar;
        this.f39536i = bVar;
        this.f39537j = proxy;
        this.f39538k = proxySelector;
        this.f39528a = new u.a().o(sSLSocketFactory != null ? "https" : "http").e(str).k(i10).a();
        this.f39529b = ze.c.R(list);
        this.f39530c = ze.c.R(list2);
    }

    public final g a() {
        return this.f39535h;
    }

    public final List<l> b() {
        return this.f39530c;
    }

    public final q c() {
        return this.f39531d;
    }

    public final boolean d(a aVar) {
        qe.k.f(aVar, "that");
        return qe.k.a(this.f39531d, aVar.f39531d) && qe.k.a(this.f39536i, aVar.f39536i) && qe.k.a(this.f39529b, aVar.f39529b) && qe.k.a(this.f39530c, aVar.f39530c) && qe.k.a(this.f39538k, aVar.f39538k) && qe.k.a(this.f39537j, aVar.f39537j) && qe.k.a(this.f39533f, aVar.f39533f) && qe.k.a(this.f39534g, aVar.f39534g) && qe.k.a(this.f39535h, aVar.f39535h) && this.f39528a.m() == aVar.f39528a.m();
    }

    public final HostnameVerifier e() {
        return this.f39534g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (qe.k.a(this.f39528a, aVar.f39528a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<a0> f() {
        return this.f39529b;
    }

    public final Proxy g() {
        return this.f39537j;
    }

    public final b h() {
        return this.f39536i;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f39528a.hashCode()) * 31) + this.f39531d.hashCode()) * 31) + this.f39536i.hashCode()) * 31) + this.f39529b.hashCode()) * 31) + this.f39530c.hashCode()) * 31) + this.f39538k.hashCode()) * 31) + Objects.hashCode(this.f39537j)) * 31) + Objects.hashCode(this.f39533f)) * 31) + Objects.hashCode(this.f39534g)) * 31) + Objects.hashCode(this.f39535h);
    }

    public final ProxySelector i() {
        return this.f39538k;
    }

    public final SocketFactory j() {
        return this.f39532e;
    }

    public final SSLSocketFactory k() {
        return this.f39533f;
    }

    public final u l() {
        return this.f39528a;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f39528a.h());
        sb3.append(':');
        sb3.append(this.f39528a.m());
        sb3.append(", ");
        if (this.f39537j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f39537j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f39538k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
