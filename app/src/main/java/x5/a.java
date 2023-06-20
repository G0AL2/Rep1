package x5;

/* compiled from: FrescoInstrumenter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile InterfaceC0537a f38687a;

    /* compiled from: FrescoInstrumenter.java */
    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0537a {
        Runnable a(Runnable runnable, String str);

        void b(Object obj, Throwable th);

        Object c(String str);

        Object d(Object obj, String str);

        void e(Object obj);

        boolean isTracing();
    }

    public static Runnable a(Runnable runnable, String str) {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = "";
        }
        return interfaceC0537a.a(runnable, str);
    }

    public static boolean b() {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null) {
            return false;
        }
        return interfaceC0537a.isTracing();
    }

    public static void c(Object obj, Throwable th) {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null || obj == null) {
            return;
        }
        interfaceC0537a.b(obj, th);
    }

    public static Object d(String str) {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null || str == null) {
            return null;
        }
        return interfaceC0537a.c(str);
    }

    public static Object e(Object obj, String str) {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null || obj == null) {
            return null;
        }
        return interfaceC0537a.d(obj, str);
    }

    public static void f(Object obj) {
        InterfaceC0537a interfaceC0537a = f38687a;
        if (interfaceC0537a == null || obj == null) {
            return;
        }
        interfaceC0537a.e(obj);
    }
}
