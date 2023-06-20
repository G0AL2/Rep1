package okhttp3.internal.platform;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import qe.k;
import ye.a0;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final b f35261i = new b(null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f35262d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f35263e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f35264f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f35265g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f35266h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* loaded from: classes3.dex */
    private static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f35267a;

        /* renamed from: b  reason: collision with root package name */
        private String f35268b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f35269c;

        public a(List<String> list) {
            k.f(list, "protocols");
            this.f35269c = list;
        }

        public final String a() {
            return this.f35268b;
        }

        public final boolean b() {
            return this.f35267a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            k.f(obj, "proxy");
            k.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.a(name, "supports") && k.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (k.a(name, "unsupported") && k.a(Void.TYPE, returnType)) {
                this.f35267a = true;
                return null;
            }
            if (k.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f35269c;
                }
            }
            if ((k.a(name, "selectProtocol") || k.a(name, "select")) && k.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list.get(i10);
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!this.f35269c.contains(str)) {
                            if (i10 == size) {
                                break;
                            }
                            i10++;
                        } else {
                            this.f35268b = str;
                            return str;
                        }
                    }
                }
                String str2 = this.f35269c.get(0);
                this.f35268b = str2;
                return str2;
            } else if ((k.a(name, "protocolSelected") || k.a(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f35268b = (String) obj4;
                return null;
            } else {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            try {
                k.e(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                k.e(method, "putMethod");
                k.e(method2, "getMethod");
                k.e(method3, "removeMethod");
                k.e(cls3, "clientProviderClass");
                k.e(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        k.f(method, "putMethod");
        k.f(method2, "getMethod");
        k.f(method3, "removeMethod");
        k.f(cls, "clientProviderClass");
        k.f(cls2, "serverProviderClass");
        this.f35262d = method;
        this.f35263e = method2;
        this.f35264f = method3;
        this.f35265g = cls;
        this.f35266h = cls2;
    }

    @Override // okhttp3.internal.platform.h
    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            this.f35264f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        try {
            this.f35262d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f35265g, this.f35266h}, new a(h.f35277c.b(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.h
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f35263e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
