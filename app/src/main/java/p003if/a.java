package p003if;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.h;
import qe.g;
import qe.k;
import ye.a0;

/* compiled from: Android10SocketAdapter.kt */
@SuppressLint({"NewApi"})
/* renamed from: if.a  reason: invalid package */
/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final C0411a f31939a = new C0411a(null);

    /* compiled from: Android10SocketAdapter.kt */
    /* renamed from: if.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0411a {
        private C0411a() {
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return h.f35277c.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ C0411a(g gVar) {
            this();
        }
    }

    @Override // p003if.k
    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p003if.k
    public boolean f() {
        return f31939a.b();
    }

    @Override // p003if.k
    @SuppressLint({"NewApi"})
    public String g(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p003if.k
    @SuppressLint({"NewApi"})
    public void h(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            k.e(sSLParameters, "sslParameters");
            Object[] array = h.f35277c.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
