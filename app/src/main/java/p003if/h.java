package p003if;

import java.lang.reflect.Method;
import qe.g;
import qe.k;

/* compiled from: CloseGuard.kt */
/* renamed from: if.h  reason: invalid package */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31957d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Method f31958a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f31959b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f31960c;

    /* compiled from: CloseGuard.kt */
    /* renamed from: if.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final h a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f31958a = method;
        this.f31959b = method2;
        this.f31960c = method3;
    }

    public final Object a(String str) {
        k.f(str, "closer");
        Method method = this.f31958a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f31959b;
                k.c(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f31960c;
                k.c(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
