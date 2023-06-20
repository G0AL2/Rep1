package ea;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: Log.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static int f29738a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f29739b = true;

    private static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e10.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace);
        sb2.append('\n');
        return sb2.toString();
    }

    public static void b(String str, String str2) {
        if (f29738a == 0) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f29738a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (g(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f29739b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void f(String str, String str2) {
        if (f29738a <= 1) {
            Log.i(str, str2);
        }
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        if (f29738a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        h(str, a(str2, th));
    }
}
