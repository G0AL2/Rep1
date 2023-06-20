package o3;

import android.util.Log;

/* compiled from: VLogger.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f34954a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f34955b = 4;

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }

    public static void b() {
        f34954a = true;
        c(3);
    }

    public static void c(int i10) {
        f34955b = i10;
    }

    public static void d(String str) {
        if (f34954a) {
            h("Logger", str);
        }
    }

    public static void e(String str, String str2) {
        if (f34954a && str2 != null && f34955b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        if (f34954a) {
            if (!(str2 == null && th == null) && f34955b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void g(String str, Object... objArr) {
        if (f34954a && objArr != null && f34955b <= 3) {
            Log.v(str, a(objArr));
        }
    }

    public static void h(String str, String str2) {
        if (f34954a && str2 != null && f34955b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (f34954a) {
            if (!(str2 == null && th == null) && f34955b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    public static void j(String str, Object... objArr) {
        if (f34954a && objArr != null && f34955b <= 4) {
            Log.v(str, a(objArr));
        }
    }

    public static boolean k() {
        return f34954a;
    }

    public static void l(String str, String str2) {
        if (f34954a && str2 != null && f34955b <= 6) {
            Log.e(str, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        if (f34954a) {
            if (!(str2 == null && th == null) && f34955b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }
}
