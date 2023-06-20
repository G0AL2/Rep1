package ye;

import java.io.IOException;

/* compiled from: Interceptor.kt */
/* loaded from: classes3.dex */
public interface v {

    /* compiled from: Interceptor.kt */
    /* loaded from: classes3.dex */
    public interface a {
        d0 a(b0 b0Var) throws IOException;

        e call();

        b0 l();
    }

    d0 intercept(a aVar) throws IOException;
}
