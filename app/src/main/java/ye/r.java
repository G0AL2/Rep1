package ye;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* compiled from: EventListener.kt */
/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f39743a;

    /* compiled from: EventListener.kt */
    /* loaded from: classes3.dex */
    public static final class a extends r {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    /* loaded from: classes3.dex */
    public interface c {
        r a(e eVar);
    }

    static {
        new b(null);
        f39743a = new a();
    }

    public void A(e eVar, d0 d0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(d0Var, "response");
    }

    public void B(e eVar, s sVar) {
        qe.k.f(eVar, "call");
    }

    public void C(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void a(e eVar, d0 d0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(d0Var, "cachedResponse");
    }

    public void b(e eVar, d0 d0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(d0Var, "response");
    }

    public void c(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void d(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void e(e eVar, IOException iOException) {
        qe.k.f(eVar, "call");
        qe.k.f(iOException, "ioe");
    }

    public void f(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void g(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(inetSocketAddress, "inetSocketAddress");
        qe.k.f(proxy, "proxy");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var, IOException iOException) {
        qe.k.f(eVar, "call");
        qe.k.f(inetSocketAddress, "inetSocketAddress");
        qe.k.f(proxy, "proxy");
        qe.k.f(iOException, "ioe");
    }

    public void j(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        qe.k.f(eVar, "call");
        qe.k.f(inetSocketAddress, "inetSocketAddress");
        qe.k.f(proxy, "proxy");
    }

    public void k(e eVar, j jVar) {
        qe.k.f(eVar, "call");
        qe.k.f(jVar, "connection");
    }

    public void l(e eVar, j jVar) {
        qe.k.f(eVar, "call");
        qe.k.f(jVar, "connection");
    }

    public void m(e eVar, String str, List<InetAddress> list) {
        qe.k.f(eVar, "call");
        qe.k.f(str, "domainName");
        qe.k.f(list, "inetAddressList");
    }

    public void n(e eVar, String str) {
        qe.k.f(eVar, "call");
        qe.k.f(str, "domainName");
    }

    public void o(e eVar, u uVar, List<Proxy> list) {
        qe.k.f(eVar, "call");
        qe.k.f(uVar, ImagesContract.URL);
        qe.k.f(list, "proxies");
    }

    public void p(e eVar, u uVar) {
        qe.k.f(eVar, "call");
        qe.k.f(uVar, ImagesContract.URL);
    }

    public void q(e eVar, long j10) {
        qe.k.f(eVar, "call");
    }

    public void r(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void s(e eVar, IOException iOException) {
        qe.k.f(eVar, "call");
        qe.k.f(iOException, "ioe");
    }

    public void t(e eVar, b0 b0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(b0Var, "request");
    }

    public void u(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void v(e eVar, long j10) {
        qe.k.f(eVar, "call");
    }

    public void w(e eVar) {
        qe.k.f(eVar, "call");
    }

    public void x(e eVar, IOException iOException) {
        qe.k.f(eVar, "call");
        qe.k.f(iOException, "ioe");
    }

    public void y(e eVar, d0 d0Var) {
        qe.k.f(eVar, "call");
        qe.k.f(d0Var, "response");
    }

    public void z(e eVar) {
        qe.k.f(eVar, "call");
    }
}
