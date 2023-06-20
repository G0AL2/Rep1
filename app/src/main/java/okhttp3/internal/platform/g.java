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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import qe.k;
import ye.a0;

/* compiled from: OpenJSSEPlatform.kt */
/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f35272e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f35273f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f35274d;

    /* compiled from: OpenJSSEPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final g a() {
            if (b()) {
                return new g(null);
            }
            return null;
        }

        public final boolean b() {
            return g.f35272e;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f35273f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f35272e = z10;
    }

    private g() {
        this.f35274d = new OpenJSSE();
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = h.f35277c.b(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.h
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.h(sSLSocket);
    }

    @Override // okhttp3.internal.platform.h
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f35274d);
        k.e(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.h
    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f35274d);
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

    public /* synthetic */ g(qe.g gVar) {
        this();
    }
}
