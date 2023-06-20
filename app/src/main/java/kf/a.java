package kf;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import qe.g;
import qe.k;

/* compiled from: BasicCertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private final e f33464b;

    /* compiled from: BasicCertificateChainCleaner.kt */
    /* renamed from: kf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0432a {
        private C0432a() {
        }

        public /* synthetic */ C0432a(g gVar) {
            this();
        }
    }

    static {
        new C0432a(null);
    }

    public a(e eVar) {
        k.f(eVar, "trustRootIndex");
        this.f33464b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!k.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // kf.c
    public List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        k.f(list, "chain");
        k.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        k.e(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a10 = this.f33464b.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || (!k.a(x509Certificate, a10))) {
                    arrayList.add(a10);
                }
                if (b(a10, a10)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                k.e(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && k.a(((a) obj).f33464b, this.f33464b);
    }

    public int hashCode() {
        return this.f33464b.hashCode();
    }
}
