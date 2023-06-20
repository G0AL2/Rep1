package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import qe.k;
import ye.a0;

/* compiled from: BouncyCastlePlatform.kt */
/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f35254e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f35255f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f35256d;

    /* compiled from: BouncyCastlePlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final c a() {
            if (b()) {
                return new c(null);
            }
            return null;
        }

        public final boolean b() {
            return c.f35254e;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f35255f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f35254e = z10;
    }

    private c() {
        this.f35256d = new BouncyCastleJsseProvider();
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b10 = h.f35277c.b(list);
            k.e(parameters, "sslParameters");
            Object[] array = b10.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.h
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.h(sSLSocket);
    }

    @Override // okhttp3.internal.platform.h
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f35256d);
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.h
    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    public /* synthetic */ c(qe.g gVar) {
        this();
    }
}
