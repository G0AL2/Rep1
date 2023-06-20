package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fe.p;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p003if.i;
import p003if.j;
import p003if.k;
import p003if.l;
import ye.a0;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f35248f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f35249g = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private final List<k> f35250d;

    /* renamed from: e  reason: collision with root package name */
    private final p003if.h f35251e;

    /* compiled from: AndroidPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f35248f;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    /* renamed from: okhttp3.internal.platform.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0470b implements kf.e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f35252a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f35253b;

        public C0470b(X509TrustManager x509TrustManager, Method method) {
            qe.k.f(x509TrustManager, "trustManager");
            qe.k.f(method, "findByIssuerAndSignatureMethod");
            this.f35252a = x509TrustManager;
            this.f35253b = method;
        }

        @Override // kf.e
        public X509Certificate a(X509Certificate x509Certificate) {
            qe.k.f(x509Certificate, "cert");
            try {
                Object invoke = this.f35253b.invoke(this.f35252a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C0470b) {
                    C0470b c0470b = (C0470b) obj;
                    return qe.k.a(this.f35252a, c0470b.f35252a) && qe.k.a(this.f35253b, c0470b.f35253b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f35252a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f35253b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f35252a + ", findByIssuerAndSignatureMethod=" + this.f35253b + ")";
        }
    }

    static {
        int i10;
        boolean z10 = true;
        if (h.f35277c.h() && (i10 = Build.VERSION.SDK_INT) < 30) {
            if (!(i10 >= 21)) {
                throw new IllegalStateException(("Expected Android API level 21+ but was " + i10).toString());
            }
        } else {
            z10 = false;
        }
        f35248f = z10;
    }

    public b() {
        List k10;
        k10 = p.k(l.a.b(l.f31965h, null, 1, null), new j(p003if.f.f31948g.d()), new j(i.f31962b.a()), new j(p003if.g.f31956b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : k10) {
            if (((k) obj).f()) {
                arrayList.add(obj);
            }
        }
        this.f35250d = arrayList;
        this.f35251e = p003if.h.f31957d.a();
    }

    @Override // okhttp3.internal.platform.h
    public kf.c c(X509TrustManager x509TrustManager) {
        qe.k.f(x509TrustManager, "trustManager");
        p003if.b a10 = p003if.b.f31940d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.h
    public kf.e d(X509TrustManager x509TrustManager) {
        qe.k.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            qe.k.e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0470b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        Object obj;
        qe.k.f(sSLSocket, "sslSocket");
        qe.k.f(list, "protocols");
        Iterator<T> it = this.f35250d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.h(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.h
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        qe.k.f(socket, "socket");
        qe.k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // okhttp3.internal.platform.h
    public String h(SSLSocket sSLSocket) {
        Object obj;
        qe.k.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f35250d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.g(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.h
    public Object i(String str) {
        qe.k.f(str, "closer");
        return this.f35251e.a(str);
    }

    @Override // okhttp3.internal.platform.h
    public boolean j(String str) {
        qe.k.f(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i10 >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            qe.k.e(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            return networkSecurityPolicy.isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // okhttp3.internal.platform.h
    public void m(String str, Object obj) {
        qe.k.f(str, "message");
        if (this.f35251e.b(obj)) {
            return;
        }
        h.l(this, str, 5, null, 4, null);
    }
}
