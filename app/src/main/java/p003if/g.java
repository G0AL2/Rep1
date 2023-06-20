package p003if;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.c;
import okhttp3.internal.platform.h;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p003if.j;
import qe.k;
import ye.a0;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* renamed from: if.g  reason: invalid package */
/* loaded from: classes3.dex */
public final class g implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final b f31956b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private static final j.a f31955a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* renamed from: if.g$a */
    /* loaded from: classes3.dex */
    public static final class a implements j.a {
        a() {
        }

        @Override // p003if.j.a
        public boolean a(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return c.f35255f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // p003if.j.a
        public k b(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return new g();
        }
    }

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* renamed from: if.g$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final j.a a() {
            return g.f31955a;
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    @Override // p003if.k
    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // p003if.k
    public boolean f() {
        return c.f35255f.b();
    }

    @Override // p003if.k
    public String g(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p003if.k
    public void h(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            k.e(parameters, "sslParameters");
            Object[] array = h.f35277c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
