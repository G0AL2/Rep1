package l2;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Random;
import m2.b;
import m2.c;

/* compiled from: APSAnalytics.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f33657a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f33658b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f33659c;

    /* renamed from: d  reason: collision with root package name */
    private static String f33660d;

    /* renamed from: e  reason: collision with root package name */
    private static String f33661e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f33662f = 0;

    public static String a() {
        return f33661e;
    }

    public static String b() {
        return f33659c;
    }

    public static String c(String str, String str2) {
        return (str == null || str.trim().isEmpty()) ? str2 : str;
    }

    public static String d() {
        return f33660d;
    }

    public static void e(Context context) {
        f(context, 1, "e9026ffd475a1a3691e6b2ce637a9b92aab1073ebf53a67c5f2583be8a804ecb");
    }

    public static void f(Context context, int i10, String str) {
        f33657a = context;
        l(str);
        n(i10);
        m("https://prod.cm.publishers.advertising.a2z.com/logrecord/putlog");
        f33661e = "";
        new HashMap();
    }

    public static boolean g() {
        return f33657a != null && f33658b;
    }

    public static void h(b bVar, c cVar, String str) {
        i(bVar, cVar, str, null);
    }

    public static void i(b bVar, c cVar, String str, Exception exc) {
        try {
            if (g()) {
                k(new m2.a(f33657a, bVar, cVar.name()).f(exc).c(str).a());
            } else {
                Log.d("APSAnalytics", "Analytics not initialized, and ignoring the event");
            }
        } catch (RuntimeException e10) {
            Log.e("APSAnalytics", "Error in processing the event: ", e10);
        }
    }

    private static void j(m2.a aVar) {
        n2.b.g(f33657a).l(aVar);
    }

    private static void k(m2.a aVar) {
        if (aVar.b() == b.FATAL) {
            j(aVar);
        }
    }

    public static void l(String str) {
        f33659c = c(str, "e9026ffd475a1a3691e6b2ce637a9b92aab1073ebf53a67c5f2583be8a804ecb");
    }

    public static void m(String str) {
        f33660d = c(str, "https://prod.cm.publishers.advertising.a2z.com/logrecord/putlog");
    }

    public static void n(int i10) {
        boolean z10 = true;
        if (i10 < 0 || i10 > 100) {
            Log.e("APSAnalytics", "Invalid sampling rate - setting the default one");
            i10 = 1;
        }
        try {
            if (new Random().nextInt(100) + 1 > i10) {
                z10 = false;
            }
            f33658b = z10;
        } catch (RuntimeException e10) {
            Log.e("APSAnalytics", "Unable to set the sampling rate", e10);
        }
    }
}
