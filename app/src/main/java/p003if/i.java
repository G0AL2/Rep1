package p003if;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.d;
import okhttp3.internal.platform.h;
import org.conscrypt.Conscrypt;
import p003if.j;
import qe.g;
import qe.k;
import ye.a0;

/* compiled from: ConscryptSocketAdapter.kt */
/* renamed from: if.i  reason: invalid package */
/* loaded from: classes3.dex */
public final class i implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final b f31962b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private static final j.a f31961a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    /* renamed from: if.i$a */
    /* loaded from: classes3.dex */
    public static final class a implements j.a {
        a() {
        }

        @Override // p003if.j.a
        public boolean a(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return d.f35258f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // p003if.j.a
        public k b(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return new i();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    /* renamed from: if.i$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final j.a a() {
            return i.f31961a;
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    @Override // p003if.k
    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p003if.k
    public boolean f() {
        return d.f35258f.c();
    }

    @Override // p003if.k
    public String g(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p003if.k
    public void h(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.f35277c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
