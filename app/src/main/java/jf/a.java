package jf;

import fe.o;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: NullProxySelector.kt */
/* loaded from: classes3.dex */
public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33110a = new a();

    private a() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> d10;
        if (uri != null) {
            d10 = o.d(Proxy.NO_PROXY);
            return d10;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
