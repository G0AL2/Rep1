package kf;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.h;
import qe.g;
import qe.k;

/* compiled from: CertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33466a = new a(null);

    /* compiled from: CertificateChainCleaner.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final c a(X509TrustManager x509TrustManager) {
            k.f(x509TrustManager, "trustManager");
            return h.f35277c.g().c(x509TrustManager);
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
