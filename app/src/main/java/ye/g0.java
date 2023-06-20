package ye;

/* compiled from: TlsVersion.kt */
/* loaded from: classes3.dex */
public enum g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: h  reason: collision with root package name */
    public static final a f39673h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39674a;

    /* compiled from: TlsVersion.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final g0 a(String str) {
            qe.k.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return g0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    g0(String str) {
        this.f39674a = str;
    }

    public final String f() {
        return this.f39674a;
    }
}
