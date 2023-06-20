package z3;

/* compiled from: FLog.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f39974a = b.j();

    public static void A(Class<?> cls, String str, Object... objArr) {
        if (f39974a.h(2)) {
            f39974a.b(n(cls), m(str, objArr));
        }
    }

    public static void B(String str, String str2, Object... objArr) {
        if (f39974a.h(2)) {
            f39974a.b(str, m(str2, objArr));
        }
    }

    public static void C(Class<?> cls, String str) {
        if (f39974a.h(5)) {
            f39974a.a(n(cls), str);
        }
    }

    public static void D(Class<?> cls, String str, Throwable th) {
        if (f39974a.h(5)) {
            f39974a.f(n(cls), str, th);
        }
    }

    public static void E(Class<?> cls, String str, Object... objArr) {
        if (f39974a.h(5)) {
            f39974a.a(n(cls), m(str, objArr));
        }
    }

    public static void F(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (u(5)) {
            D(cls, m(str, objArr), th);
        }
    }

    public static void G(String str, String str2) {
        if (f39974a.h(5)) {
            f39974a.a(str, str2);
        }
    }

    public static void H(String str, String str2, Throwable th) {
        if (f39974a.h(5)) {
            f39974a.f(str, str2, th);
        }
    }

    public static void I(String str, String str2, Object... objArr) {
        if (f39974a.h(5)) {
            f39974a.a(str, m(str2, objArr));
        }
    }

    public static void J(Class<?> cls, String str, Throwable th) {
        if (f39974a.h(6)) {
            f39974a.e(n(cls), str, th);
        }
    }

    public static void K(String str, String str2) {
        if (f39974a.h(6)) {
            f39974a.c(str, str2);
        }
    }

    public static void L(String str, String str2, Throwable th) {
        if (f39974a.h(6)) {
            f39974a.e(str, str2, th);
        }
    }

    public static void M(String str, String str2, Object... objArr) {
        if (f39974a.h(6)) {
            f39974a.c(str, m(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (f39974a.h(3)) {
            f39974a.d(n(cls), m(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f39974a.h(3)) {
            f39974a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f39974a.h(3)) {
            f39974a.d(str, m(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f39974a.h(3)) {
            f39974a.d(str, m(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f39974a.h(3)) {
            f39974a.d(str, str2, th);
        }
    }

    public static void f(Class<?> cls, String str) {
        if (f39974a.h(6)) {
            f39974a.e(n(cls), str);
        }
    }

    public static void g(Class<?> cls, String str, Throwable th) {
        if (f39974a.h(6)) {
            f39974a.g(n(cls), str, th);
        }
    }

    public static void h(Class<?> cls, String str, Object... objArr) {
        if (f39974a.h(6)) {
            f39974a.e(n(cls), m(str, objArr));
        }
    }

    public static void i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (f39974a.h(6)) {
            f39974a.g(n(cls), m(str, objArr), th);
        }
    }

    public static void j(String str, String str2) {
        if (f39974a.h(6)) {
            f39974a.e(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        if (f39974a.h(6)) {
            f39974a.g(str, str2, th);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        if (f39974a.h(6)) {
            f39974a.e(str, m(str2, objArr));
        }
    }

    private static String m(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String n(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static void o(String str, String str2) {
        if (f39974a.h(4)) {
            f39974a.i(str, str2);
        }
    }

    public static void p(String str, String str2, Object obj) {
        if (f39974a.h(4)) {
            f39974a.i(str, m(str2, obj));
        }
    }

    public static void q(String str, String str2, Object obj, Object obj2) {
        if (f39974a.h(4)) {
            f39974a.i(str, m(str2, obj, obj2));
        }
    }

    public static void r(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f39974a.h(4)) {
            f39974a.i(str, m(str2, obj, obj2, obj3));
        }
    }

    public static void s(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f39974a.h(4)) {
            f39974a.i(str, m(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void t(String str, String str2, Object... objArr) {
        if (f39974a.h(4)) {
            f39974a.i(str, m(str2, objArr));
        }
    }

    public static boolean u(int i10) {
        return f39974a.h(i10);
    }

    public static void v(Class<?> cls, String str) {
        if (f39974a.h(2)) {
            f39974a.b(n(cls), str);
        }
    }

    public static void w(Class<?> cls, String str, Object obj) {
        if (f39974a.h(2)) {
            f39974a.b(n(cls), m(str, obj));
        }
    }

    public static void x(Class<?> cls, String str, Object obj, Object obj2) {
        if (f39974a.h(2)) {
            f39974a.b(n(cls), m(str, obj, obj2));
        }
    }

    public static void y(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (u(2)) {
            v(cls, m(str, obj, obj2, obj3));
        }
    }

    public static void z(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f39974a.h(2)) {
            f39974a.b(n(cls), m(str, obj, obj2, obj3, obj4));
        }
    }
}
