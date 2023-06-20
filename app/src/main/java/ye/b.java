package ye;

import java.io.IOException;

/* compiled from: Authenticator.kt */
/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39548a;

    /* compiled from: Authenticator.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Authenticator.kt */
        /* renamed from: ye.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0549a implements b {
            @Override // ye.b
            public b0 a(f0 f0Var, d0 d0Var) {
                qe.k.f(d0Var, "response");
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        f39548a = new a.C0549a();
        new af.b(null, 1, null);
    }

    b0 a(f0 f0Var, d0 d0Var) throws IOException;
}
