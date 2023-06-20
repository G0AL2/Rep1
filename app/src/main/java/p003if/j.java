package p003if;

import java.util.List;
import javax.net.ssl.SSLSocket;
import qe.k;
import ye.a0;

/* compiled from: DeferredSocketAdapter.kt */
/* renamed from: if.j  reason: invalid package */
/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    private k f31963a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31964b;

    /* compiled from: DeferredSocketAdapter.kt */
    /* renamed from: if.j$a */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        k.f(aVar, "socketAdapterFactory");
        this.f31964b = aVar;
    }

    private final synchronized k b(SSLSocket sSLSocket) {
        if (this.f31963a == null && this.f31964b.a(sSLSocket)) {
            this.f31963a = this.f31964b.b(sSLSocket);
        }
        return this.f31963a;
    }

    @Override // p003if.k
    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return this.f31964b.a(sSLSocket);
    }

    @Override // p003if.k
    public boolean f() {
        return true;
    }

    @Override // p003if.k
    public String g(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        k b10 = b(sSLSocket);
        if (b10 != null) {
            return b10.g(sSLSocket);
        }
        return null;
    }

    @Override // p003if.k
    public void h(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        k b10 = b(sSLSocket);
        if (b10 != null) {
            b10.h(sSLSocket, str, list);
        }
    }
}
