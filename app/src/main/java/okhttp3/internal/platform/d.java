package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import qe.k;
import ye.a0;

/* compiled from: ConscryptPlatform.kt */
/* loaded from: classes3.dex */
public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f35257e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f35258f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f35259d;

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final d b() {
            if (c()) {
                return new d(null);
            }
            return null;
        }

        public final boolean c() {
            return d.f35257e;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35260a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f35258f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f35257e = z10;
    }

    private d() {
        Provider newProvider = Conscrypt.newProvider();
        k.e(newProvider, "Conscrypt.newProvider()");
        this.f35259d = newProvider;
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.f35277c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.h
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.h(sSLSocket);
    }

    @Override // okhttp3.internal.platform.h
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f35259d);
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.h
    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        SSLContext n10 = n();
        n10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = n10.getSocketFactory();
        k.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.h
    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        k.e(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f35260a);
            return x509TrustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        k.e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public /* synthetic */ d(qe.g gVar) {
        this();
    }
}
