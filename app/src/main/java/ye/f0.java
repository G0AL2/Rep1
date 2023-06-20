package ye;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.kt */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f39653a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f39654b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f39655c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        qe.k.f(aVar, "address");
        qe.k.f(proxy, "proxy");
        qe.k.f(inetSocketAddress, "socketAddress");
        this.f39653a = aVar;
        this.f39654b = proxy;
        this.f39655c = inetSocketAddress;
    }

    public final a a() {
        return this.f39653a;
    }

    public final Proxy b() {
        return this.f39654b;
    }

    public final boolean c() {
        return this.f39653a.k() != null && this.f39654b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f39655c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (qe.k.a(f0Var.f39653a, this.f39653a) && qe.k.a(f0Var.f39654b, this.f39654b) && qe.k.a(f0Var.f39655c, this.f39655c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f39653a.hashCode()) * 31) + this.f39654b.hashCode()) * 31) + this.f39655c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f39655c + '}';
    }
}
