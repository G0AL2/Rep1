package ye;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake.kt */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final a f39744e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ee.h f39745a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f39746b;

    /* renamed from: c  reason: collision with root package name */
    private final i f39747c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f39748d;

    /* compiled from: Handshake.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Handshake.kt */
        /* renamed from: ye.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0556a extends qe.l implements pe.a<List<? extends Certificate>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f39749a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0556a(List list) {
                super(0);
                this.f39749a = list;
            }

            @Override // pe.a
            /* renamed from: a */
            public final List<Certificate> invoke() {
                return this.f39749a;
            }
        }

        /* compiled from: Handshake.kt */
        /* loaded from: classes3.dex */
        static final class b extends qe.l implements pe.a<List<? extends Certificate>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f39750a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f39750a = list;
            }

            @Override // pe.a
            /* renamed from: a */
            public final List<Certificate> invoke() {
                return this.f39750a;
            }
        }

        private a() {
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            List<Certificate> h10;
            if (certificateArr != null) {
                return ze.c.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            h10 = fe.p.h();
            return h10;
        }

        public final s a(SSLSession sSLSession) throws IOException {
            List<Certificate> h10;
            qe.k.f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : !(hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL"))) {
                    i b10 = i.f39695t.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!qe.k.a("NONE", protocol)) {
                            g0 a10 = g0.f39673h.a(protocol);
                            try {
                                h10 = c(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                h10 = fe.p.h();
                            }
                            return new s(a10, b10, c(sSLSession.getLocalCertificates()), new b(h10));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        public final s b(g0 g0Var, i iVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
            qe.k.f(g0Var, "tlsVersion");
            qe.k.f(iVar, "cipherSuite");
            qe.k.f(list, "peerCertificates");
            qe.k.f(list2, "localCertificates");
            return new s(g0Var, iVar, ze.c.R(list2), new C0556a(ze.c.R(list)));
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Handshake.kt */
    /* loaded from: classes3.dex */
    static final class b extends qe.l implements pe.a<List<? extends Certificate>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pe.a f39751a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(pe.a aVar) {
            super(0);
            this.f39751a = aVar;
        }

        @Override // pe.a
        /* renamed from: a */
        public final List<Certificate> invoke() {
            List<Certificate> h10;
            try {
                return (List) this.f39751a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                h10 = fe.p.h();
                return h10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(g0 g0Var, i iVar, List<? extends Certificate> list, pe.a<? extends List<? extends Certificate>> aVar) {
        ee.h a10;
        qe.k.f(g0Var, "tlsVersion");
        qe.k.f(iVar, "cipherSuite");
        qe.k.f(list, "localCertificates");
        qe.k.f(aVar, "peerCertificatesFn");
        this.f39746b = g0Var;
        this.f39747c = iVar;
        this.f39748d = list;
        a10 = ee.j.a(new b(aVar));
        this.f39745a = a10;
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        qe.k.e(type, "type");
        return type;
    }

    public final i a() {
        return this.f39747c;
    }

    public final List<Certificate> c() {
        return this.f39748d;
    }

    public final List<Certificate> d() {
        return (List) this.f39745a.getValue();
    }

    public final g0 e() {
        return this.f39746b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f39746b == this.f39746b && qe.k.a(sVar.f39747c, this.f39747c) && qe.k.a(sVar.d(), d()) && qe.k.a(sVar.f39748d, this.f39748d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f39746b.hashCode()) * 31) + this.f39747c.hashCode()) * 31) + d().hashCode()) * 31) + this.f39748d.hashCode();
    }

    public String toString() {
        int p10;
        int p11;
        List<Certificate> d10 = d();
        p10 = fe.q.p(d10, 10);
        ArrayList arrayList = new ArrayList(p10);
        for (Certificate certificate : d10) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f39746b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f39747c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f39748d;
        p11 = fe.q.p(list, 10);
        ArrayList arrayList2 = new ArrayList(p11);
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
