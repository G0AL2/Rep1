package af;

import fe.n;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import qe.g;
import qe.k;
import ve.p;
import ye.b0;
import ye.d0;
import ye.f0;
import ye.h;
import ye.o;
import ye.q;
import ye.u;

/* compiled from: JavaNetAuthenticator.kt */
/* loaded from: classes3.dex */
public final class b implements ye.b {

    /* renamed from: b  reason: collision with root package name */
    private final q f607b;

    public b(q qVar) {
        k.f(qVar, "defaultDns");
        this.f607b = qVar;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type == null || a.f606a[type.ordinal()] != 1) {
            SocketAddress address = proxy.address();
            Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            k.e(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        return (InetAddress) n.y(qVar.a(uVar.h()));
    }

    @Override // ye.b
    public b0 a(f0 f0Var, d0 d0Var) throws IOException {
        Proxy proxy;
        boolean l10;
        q qVar;
        PasswordAuthentication requestPasswordAuthentication;
        ye.a a10;
        k.f(d0Var, "response");
        List<h> e10 = d0Var.e();
        b0 d02 = d0Var.d0();
        u l11 = d02.l();
        boolean z10 = d0Var.h() == 407;
        if (f0Var == null || (proxy = f0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : e10) {
            l10 = p.l("Basic", hVar.c(), true);
            if (l10) {
                if (f0Var == null || (a10 = f0Var.a()) == null || (qVar = a10.c()) == null) {
                    qVar = this.f607b;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    k.e(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, l11, qVar), inetSocketAddress.getPort(), l11.q(), hVar.b(), hVar.c(), l11.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String h10 = l11.h();
                    k.e(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(h10, b(proxy, l11, qVar), l11.m(), l11.q(), hVar.b(), hVar.c(), l11.s(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    k.e(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    k.e(password, "auth.password");
                    return d02.i().e(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ b(q qVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? q.f39742a : qVar);
    }
}
