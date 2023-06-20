package ef;

import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import fe.p;
import fe.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.e0;
import ye.f0;
import ye.u;
import ye.v;
import ye.z;

/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes3.dex */
public final class j implements v {

    /* renamed from: a  reason: collision with root package name */
    private final z f29835a;

    /* compiled from: RetryAndFollowUpInterceptor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public j(z zVar) {
        qe.k.f(zVar, "client");
        this.f29835a = zVar;
    }

    private final b0 a(d0 d0Var, String str) {
        String z10;
        u p10;
        if (!this.f29835a.s() || (z10 = d0.z(d0Var, "Location", null, 2, null)) == null || (p10 = d0Var.d0().l().p(z10)) == null) {
            return null;
        }
        if (qe.k.a(p10.q(), d0Var.d0().l().q()) || this.f29835a.t()) {
            b0.a i10 = d0Var.d0().i();
            if (f.b(str)) {
                int h10 = d0Var.h();
                f fVar = f.f29821a;
                boolean z11 = fVar.d(str) || h10 == 308 || h10 == 307;
                if (fVar.c(str) && h10 != 308 && h10 != 307) {
                    i10.g("GET", null);
                } else {
                    i10.g(str, z11 ? d0Var.d0().a() : null);
                }
                if (!z11) {
                    i10.i("Transfer-Encoding");
                    i10.i("Content-Length");
                    i10.i("Content-Type");
                }
            }
            if (!ze.c.g(d0Var.d0().l(), p10)) {
                i10.i("Authorization");
            }
            return i10.n(p10).b();
        }
        return null;
    }

    private final b0 b(d0 d0Var, df.c cVar) throws IOException {
        df.f h10;
        f0 A = (cVar == null || (h10 = cVar.h()) == null) ? null : h10.A();
        int h11 = d0Var.h();
        String h12 = d0Var.d0().h();
        if (h11 != 307 && h11 != 308) {
            if (h11 != 401) {
                if (h11 == 421) {
                    c0 a10 = d0Var.d0().a();
                    if ((a10 == null || !a10.isOneShot()) && cVar != null && cVar.k()) {
                        cVar.h().y();
                        return d0Var.d0();
                    }
                    return null;
                } else if (h11 == 503) {
                    d0 T = d0Var.T();
                    if ((T == null || T.h() != 503) && f(d0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                        return d0Var.d0();
                    }
                    return null;
                } else if (h11 == 407) {
                    qe.k.c(A);
                    if (A.b().type() == Proxy.Type.HTTP) {
                        return this.f29835a.E().a(A, d0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (h11 == 408) {
                    if (this.f29835a.H()) {
                        c0 a11 = d0Var.d0().a();
                        if (a11 == null || !a11.isOneShot()) {
                            d0 T2 = d0Var.T();
                            if ((T2 == null || T2.h() != 408) && f(d0Var, 0) <= 0) {
                                return d0Var.d0();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (h11) {
                        case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
                        case 301:
                        case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f29835a.e().a(A, d0Var);
            }
        }
        return a(d0Var, h12);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, df.e eVar, b0 b0Var, boolean z10) {
        if (this.f29835a.H()) {
            return !(z10 && e(iOException, b0Var)) && c(iOException, z10) && eVar.x();
        }
        return false;
    }

    private final boolean e(IOException iOException, b0 b0Var) {
        c0 a10 = b0Var.a();
        return (a10 != null && a10.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(d0 d0Var, int i10) {
        String z10 = d0.z(d0Var, "Retry-After", null, 2, null);
        if (z10 != null) {
            if (new ve.f("\\d+").a(z10)) {
                Integer valueOf = Integer.valueOf(z10);
                qe.k.e(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return i10;
    }

    @Override // ye.v
    public d0 intercept(v.a aVar) throws IOException {
        List h10;
        df.c p10;
        b0 b10;
        qe.k.f(aVar, "chain");
        g gVar = (g) aVar;
        b0 h11 = gVar.h();
        df.e d10 = gVar.d();
        h10 = p.h();
        d0 d0Var = null;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            d10.i(h11, z10);
            try {
                if (!d10.isCanceled()) {
                    try {
                        d0 a10 = gVar.a(h11);
                        if (d0Var != null) {
                            a10 = a10.O().o(d0Var.O().b(null).c()).c();
                        }
                        d0Var = a10;
                        p10 = d10.p();
                        b10 = b(d0Var, p10);
                    } catch (df.j e10) {
                        if (d(e10.c(), d10, h11, false)) {
                            h10 = x.F(h10, e10.b());
                            d10.j(true);
                            z10 = false;
                        } else {
                            throw ze.c.X(e10.b(), h10);
                        }
                    } catch (IOException e11) {
                        if (d(e11, d10, h11, !(e11 instanceof gf.a))) {
                            h10 = x.F(h10, e11);
                            d10.j(true);
                            z10 = false;
                        } else {
                            throw ze.c.X(e11, h10);
                        }
                    }
                    if (b10 == null) {
                        if (p10 != null && p10.l()) {
                            d10.z();
                        }
                        d10.j(false);
                        return d0Var;
                    }
                    c0 a11 = b10.a();
                    if (a11 != null && a11.isOneShot()) {
                        d10.j(false);
                        return d0Var;
                    }
                    e0 a12 = d0Var.a();
                    if (a12 != null) {
                        ze.c.j(a12);
                    }
                    i10++;
                    if (i10 <= 20) {
                        d10.j(true);
                        h11 = b10;
                        z10 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th) {
                d10.j(true);
                throw th;
            }
        }
    }
}
