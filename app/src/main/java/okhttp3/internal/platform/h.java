package okhttp3.internal.platform;

import fe.q;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import qe.k;
import ye.a0;
import ye.z;

/* compiled from: Platform.kt */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f35275a;

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f35276b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f35277c;

    /* compiled from: Platform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        private final h d() {
            p003if.c.f31945c.b();
            h a10 = okhttp3.internal.platform.a.f35246f.a();
            if (a10 != null) {
                return a10;
            }
            h a11 = b.f35249g.a();
            k.c(a11);
            return a11;
        }

        private final h e() {
            g a10;
            c a11;
            d b10;
            if (!j() || (b10 = d.f35258f.b()) == null) {
                if (!i() || (a11 = c.f35255f.a()) == null) {
                    if (!k() || (a10 = g.f35273f.a()) == null) {
                        f a12 = f.f35271e.a();
                        if (a12 != null) {
                            return a12;
                        }
                        h a13 = e.f35261i.a();
                        return a13 != null ? a13 : new h();
                    }
                    return a10;
                }
                return a11;
            }
            return b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.a("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.a("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.a("OpenJSSE", provider.getName());
        }

        public final List<String> b(List<? extends a0> list) {
            int p10;
            k.f(list, "protocols");
            ArrayList<a0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a0) obj) != a0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            p10 = q.p(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(p10);
            for (a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends a0> list) {
            k.f(list, "protocols");
            mf.f fVar = new mf.f();
            for (String str : b(list)) {
                fVar.writeByte(str.length());
                fVar.M(str);
            }
            return fVar.u0();
        }

        public final h g() {
            return h.f35275a;
        }

        public final boolean h() {
            return k.a("Dalvik", System.getProperty("java.vm.name"));
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f35277c = aVar;
        f35275a = aVar.f();
        f35276b = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void l(h hVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th = null;
            }
            hVar.k(str, i10, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
    }

    public kf.c c(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        return new kf.a(d(x509TrustManager));
    }

    public kf.e d(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        k.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new kf.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        k.f(socket, "socket");
        k.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        k.f(str, "closer");
        if (f35276b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        k.f(str, "hostname");
        return true;
    }

    public void k(String str, int i10, Throwable th) {
        k.f(str, "message");
        f35276b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        k.f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        try {
            SSLContext n10 = n();
            n10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = n10.getSocketFactory();
            k.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        k.e(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        k.e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        k.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
