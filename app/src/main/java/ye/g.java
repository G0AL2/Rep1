package ye;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import mf.i;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f39658a;

    /* renamed from: b  reason: collision with root package name */
    private final kf.c f39659b;

    /* renamed from: d  reason: collision with root package name */
    public static final b f39657d = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public static final g f39656c = new a().a();

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f39660a = new ArrayList();

        public final g a() {
            Set Q;
            Q = fe.x.Q(this.f39660a);
            return new g(Q, null, 2, null);
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final String a(Certificate certificate) {
            qe.k.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).f();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final mf.i b(X509Certificate x509Certificate) {
            qe.k.f(x509Certificate, "$this$sha1Hash");
            i.a aVar = mf.i.f34462e;
            PublicKey publicKey = x509Certificate.getPublicKey();
            qe.k.e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            qe.k.e(encoded, "publicKey.encoded");
            return i.a.g(aVar, encoded, 0, 0, 3, null).y();
        }

        public final mf.i c(X509Certificate x509Certificate) {
            qe.k.f(x509Certificate, "$this$sha256Hash");
            i.a aVar = mf.i.f34462e;
            PublicKey publicKey = x509Certificate.getPublicKey();
            qe.k.e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            qe.k.e(encoded, "publicKey.encoded");
            return i.a.g(aVar, encoded, 0, 0, 3, null).z();
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f39661a;

        /* renamed from: b  reason: collision with root package name */
        private final String f39662b;

        /* renamed from: c  reason: collision with root package name */
        private final mf.i f39663c;

        public final mf.i a() {
            return this.f39663c;
        }

        public final String b() {
            return this.f39662b;
        }

        public final boolean c(String str) {
            boolean y10;
            boolean y11;
            boolean p10;
            int S;
            boolean p11;
            qe.k.f(str, "hostname");
            y10 = ve.p.y(this.f39661a, "**.", false, 2, null);
            if (y10) {
                int length = this.f39661a.length() - 3;
                int length2 = str.length() - length;
                p11 = ve.p.p(str, str.length() - length, this.f39661a, 3, length, false, 16, null);
                if (!p11) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                y11 = ve.p.y(this.f39661a, "*.", false, 2, null);
                if (y11) {
                    int length3 = this.f39661a.length() - 1;
                    int length4 = str.length() - length3;
                    p10 = ve.p.p(str, str.length() - length3, this.f39661a, 1, length3, false, 16, null);
                    if (!p10) {
                        return false;
                    }
                    S = ve.q.S(str, '.', length4 - 1, false, 4, null);
                    if (S != -1) {
                        return false;
                    }
                } else {
                    return qe.k.a(str, this.f39661a);
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return ((qe.k.a(this.f39661a, cVar.f39661a) ^ true) || (qe.k.a(this.f39662b, cVar.f39662b) ^ true) || (qe.k.a(this.f39663c, cVar.f39663c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f39661a.hashCode() * 31) + this.f39662b.hashCode()) * 31) + this.f39663c.hashCode();
        }

        public String toString() {
            return this.f39662b + '/' + this.f39663c.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class d extends qe.l implements pe.a<List<? extends X509Certificate>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, String str) {
            super(0);
            this.f39665b = list;
            this.f39666c = str;
        }

        @Override // pe.a
        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            List<Certificate> list;
            int p10;
            kf.c d10 = g.this.d();
            if (d10 == null || (list = d10.a(this.f39665b, this.f39666c)) == null) {
                list = this.f39665b;
            }
            p10 = fe.q.p(list, 10);
            ArrayList arrayList = new ArrayList(p10);
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set<c> set, kf.c cVar) {
        qe.k.f(set, "pins");
        this.f39658a = set;
        this.f39659b = cVar;
    }

    public final void a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        qe.k.f(str, "hostname");
        qe.k.f(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, pe.a<? extends List<? extends X509Certificate>> aVar) {
        qe.k.f(str, "hostname");
        qe.k.f(aVar, "cleanedPeerCertificatesFn");
        List<c> c10 = c(str);
        if (c10.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            mf.i iVar = null;
            mf.i iVar2 = null;
            for (c cVar : c10) {
                String b10 = cVar.b();
                int hashCode = b10.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && b10.equals("sha1")) {
                        if (iVar2 == null) {
                            iVar2 = f39657d.b(x509Certificate);
                        }
                        if (qe.k.a(cVar.a(), iVar2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                } else if (b10.equals("sha256")) {
                    if (iVar == null) {
                        iVar = f39657d.c(x509Certificate);
                    }
                    if (qe.k.a(cVar.a(), iVar)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(f39657d.a(x509Certificate2));
            sb2.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            qe.k.e(subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (c cVar2 : c10) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final List<c> c(String str) {
        List<c> h10;
        qe.k.f(str, "hostname");
        Set<c> set = this.f39658a;
        h10 = fe.p.h();
        for (Object obj : set) {
            if (((c) obj).c(str)) {
                if (h10.isEmpty()) {
                    h10 = new ArrayList<>();
                }
                qe.w.a(h10).add(obj);
            }
        }
        return h10;
    }

    public final kf.c d() {
        return this.f39659b;
    }

    public final g e(kf.c cVar) {
        qe.k.f(cVar, "certificateChainCleaner");
        return qe.k.a(this.f39659b, cVar) ? this : new g(this.f39658a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (qe.k.a(gVar.f39658a, this.f39658a) && qe.k.a(gVar.f39659b, this.f39659b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f39658a.hashCode()) * 41;
        kf.c cVar = this.f39659b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ g(Set set, kf.c cVar, int i10, qe.g gVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
