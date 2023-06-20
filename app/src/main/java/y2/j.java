package y2;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: SkipProxySelector.java */
/* loaded from: classes.dex */
class j extends ProxySelector {

    /* renamed from: d  reason: collision with root package name */
    private static final List<Proxy> f39245d = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: a  reason: collision with root package name */
    private final ProxySelector f39246a = ProxySelector.getDefault();

    /* renamed from: b  reason: collision with root package name */
    private final String f39247b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39248c;

    private j(String str, int i10) {
        this.f39247b = str;
        this.f39248c = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, int i10) {
        ProxySelector.setDefault(new j(str, i10));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f39246a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (this.f39247b.equalsIgnoreCase(uri.getHost()) && this.f39248c == uri.getPort()) ? f39245d : this.f39246a.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
