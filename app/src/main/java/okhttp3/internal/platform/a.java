package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fe.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p003if.i;
import p003if.j;
import p003if.k;
import ye.a0;

/* compiled from: Android10Platform.kt */
/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f35245e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0469a f35246f = new C0469a(null);

    /* renamed from: d  reason: collision with root package name */
    private final List<k> f35247d;

    /* compiled from: Android10Platform.kt */
    /* renamed from: okhttp3.internal.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0469a {
        private C0469a() {
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f35245e;
        }

        public /* synthetic */ C0469a(qe.g gVar) {
            this();
        }
    }

    static {
        f35245e = h.f35277c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List k10;
        k10 = p.k(p003if.a.f31939a.a(), new j(p003if.f.f31948g.d()), new j(i.f31962b.a()), new j(p003if.g.f31956b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : k10) {
            if (((k) obj).f()) {
                arrayList.add(obj);
            }
        }
        this.f35247d = arrayList;
    }

    @Override // okhttp3.internal.platform.h
    public kf.c c(X509TrustManager x509TrustManager) {
        qe.k.f(x509TrustManager, "trustManager");
        p003if.b a10 = p003if.b.f31940d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        Object obj;
        qe.k.f(sSLSocket, "sslSocket");
        qe.k.f(list, "protocols");
        Iterator<T> it = this.f35247d.iterator();
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
    public String h(SSLSocket sSLSocket) {
        Object obj;
        qe.k.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f35247d.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        qe.k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
