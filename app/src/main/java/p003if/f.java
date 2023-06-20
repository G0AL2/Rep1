package p003if;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.b;
import okhttp3.internal.platform.h;
import p003if.j;
import qe.g;
import qe.k;
import ve.p;
import ye.a0;

/* compiled from: AndroidSocketAdapter.kt */
/* renamed from: if.f  reason: invalid package */
/* loaded from: classes3.dex */
public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    private static final j.a f31947f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f31948g;

    /* renamed from: a  reason: collision with root package name */
    private final Method f31949a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f31950b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f31951c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f31952d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<? super SSLSocket> f31953e;

    /* compiled from: AndroidSocketAdapter.kt */
    /* renamed from: if.f$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AndroidSocketAdapter.kt */
        /* renamed from: if.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0412a implements j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f31954a;

            C0412a(String str) {
                this.f31954a = str;
            }

            @Override // p003if.j.a
            public boolean a(SSLSocket sSLSocket) {
                boolean y10;
                k.f(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                k.e(name, "sslSocket.javaClass.name");
                y10 = p.y(name, this.f31954a + '.', false, 2, null);
                return y10;
            }

            @Override // p003if.j.a
            public k b(SSLSocket sSLSocket) {
                k.f(sSLSocket, "sslSocket");
                return f.f31948g.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!k.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            k.c(cls2);
            return new f(cls2);
        }

        public final j.a c(String str) {
            k.f(str, "packageName");
            return new C0412a(str);
        }

        public final j.a d() {
            return f.f31947f;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f31948g = aVar;
        f31947f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) {
        k.f(cls, "sslSocketClass");
        this.f31953e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        k.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f31949a = declaredMethod;
        this.f31950b = cls.getMethod("setHostname", String.class);
        this.f31951c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f31952d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p003if.k
    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return this.f31953e.isInstance(sSLSocket);
    }

    @Override // p003if.k
    public boolean f() {
        return b.f35249g.b();
    }

    @Override // p003if.k
    public String g(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f31951c.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    k.e(charset, "StandardCharsets.UTF_8");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (NullPointerException e11) {
                if (k.a(e11.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e11;
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }
        return null;
    }

    @Override // p003if.k
    public void h(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f31949a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f31950b.invoke(sSLSocket, str);
                }
                this.f31952d.invoke(sSLSocket, h.f35277c.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
