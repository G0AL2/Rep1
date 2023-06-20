package ye;

import java.io.IOException;

/* compiled from: Protocol.kt */
/* loaded from: classes3.dex */
public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: i  reason: collision with root package name */
    public static final a f39546i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39547a;

    /* compiled from: Protocol.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final a0 a(String str) throws IOException {
            qe.k.f(str, "protocol");
            a0 a0Var = a0.HTTP_1_0;
            if (!qe.k.a(str, a0Var.f39547a)) {
                a0Var = a0.HTTP_1_1;
                if (!qe.k.a(str, a0Var.f39547a)) {
                    a0Var = a0.H2_PRIOR_KNOWLEDGE;
                    if (!qe.k.a(str, a0Var.f39547a)) {
                        a0Var = a0.HTTP_2;
                        if (!qe.k.a(str, a0Var.f39547a)) {
                            a0Var = a0.SPDY_3;
                            if (!qe.k.a(str, a0Var.f39547a)) {
                                a0Var = a0.QUIC;
                                if (!qe.k.a(str, a0Var.f39547a)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    a0(String str) {
        this.f39547a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f39547a;
    }
}
