package p003if;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kf.c;
import qe.g;
import qe.k;

/* compiled from: AndroidCertificateChainCleaner.kt */
/* renamed from: if.b  reason: invalid package */
/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31940d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final X509TrustManager f31941b;

    /* renamed from: c  reason: collision with root package name */
    private final X509TrustManagerExtensions f31942c;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    /* renamed from: if.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final b a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            k.f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        k.f(x509TrustManager, "trustManager");
        k.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f31941b = x509TrustManager;
        this.f31942c = x509TrustManagerExtensions;
    }

    @Override // kf.c
    public List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        k.f(list, "chain");
        k.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f31942c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            k.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f31941b == this.f31941b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f31941b);
    }
}
