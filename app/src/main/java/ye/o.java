package ye;

import com.applovin.sdk.AppLovinEventParameters;
import java.nio.charset.Charset;

/* compiled from: Credentials.kt */
/* loaded from: classes3.dex */
public final class o {
    static {
        new o();
    }

    private o() {
    }

    public static final String a(String str, String str2, Charset charset) {
        qe.k.f(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        qe.k.f(str2, "password");
        qe.k.f(charset, "charset");
        String f10 = mf.i.f34462e.c(str + ':' + str2, charset).f();
        return "Basic " + f10;
    }
}
