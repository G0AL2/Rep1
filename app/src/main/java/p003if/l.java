package p003if;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.h;
import qe.g;
import qe.k;

/* compiled from: StandardAndroidSocketAdapter.kt */
/* renamed from: if.l  reason: invalid package */
/* loaded from: classes3.dex */
public final class l extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final a f31965h = new a(null);

    /* compiled from: StandardAndroidSocketAdapter.kt */
    /* renamed from: if.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String str) {
            k.f(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                k.e(cls3, "paramsClass");
                return new l(cls, cls2, cls3);
            } catch (Exception e10) {
                h.f35277c.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        k.f(cls, "sslSocketClass");
        k.f(cls2, "sslSocketFactoryClass");
        k.f(cls3, "paramClass");
    }
}
