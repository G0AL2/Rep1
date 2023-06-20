package kf;

import fe.p;
import fe.x;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import mf.g0;
import qe.k;
import ve.q;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f33467a = new d();

    private d() {
    }

    private final String b(String str) {
        if (d(str)) {
            Locale locale = Locale.US;
            k.e(locale, "Locale.US");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        List<String> h10;
        List<String> h11;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!k.a(list.get(0), Integer.valueOf(i10))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            h11 = p.h();
            return h11;
        } catch (CertificateParsingException unused) {
            h10 = p.h();
            return h10;
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) g0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        boolean y10;
        boolean k10;
        boolean y11;
        boolean k11;
        boolean k12;
        boolean k13;
        boolean D;
        boolean y12;
        int N;
        boolean k14;
        int S;
        if (!(str == null || str.length() == 0)) {
            y10 = ve.p.y(str, ".", false, 2, null);
            if (!y10) {
                k10 = ve.p.k(str, "..", false, 2, null);
                if (!k10) {
                    if (!(str2 == null || str2.length() == 0)) {
                        y11 = ve.p.y(str2, ".", false, 2, null);
                        if (!y11) {
                            k11 = ve.p.k(str2, "..", false, 2, null);
                            if (!k11) {
                                k12 = ve.p.k(str, ".", false, 2, null);
                                if (!k12) {
                                    str = str + ".";
                                }
                                String str3 = str;
                                k13 = ve.p.k(str2, ".", false, 2, null);
                                if (!k13) {
                                    str2 = str2 + ".";
                                }
                                String b10 = b(str2);
                                D = q.D(b10, "*", false, 2, null);
                                if (!D) {
                                    return k.a(str3, b10);
                                }
                                y12 = ve.p.y(b10, "*.", false, 2, null);
                                if (y12) {
                                    N = q.N(b10, '*', 1, false, 4, null);
                                    if (N == -1 && str3.length() >= b10.length() && !k.a("*.", b10)) {
                                        String substring = b10.substring(1);
                                        k.e(substring, "(this as java.lang.String).substring(startIndex)");
                                        k14 = ve.p.k(str3, substring, false, 2, null);
                                        if (k14) {
                                            int length = str3.length() - substring.length();
                                            if (length > 0) {
                                                S = q.S(str3, '.', length - 1, false, 4, null);
                                                if (S != -1) {
                                                    return false;
                                                }
                                            }
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (f33467a.f(b10, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = ze.a.e(str);
        List<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (k.a(e10, ze.a.e(str2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        List<String> E;
        k.f(x509Certificate, "certificate");
        E = x.E(c(x509Certificate, 7), c(x509Certificate, 2));
        return E;
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        k.f(str, "host");
        k.f(x509Certificate, "certificate");
        return ze.c.f(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        k.f(str, "host");
        k.f(sSLSession, "session");
        if (d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(str, (X509Certificate) certificate);
    }
}
