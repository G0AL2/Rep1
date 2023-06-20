package z3;

import android.util.Log;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: FLogDefaultLoggingDelegate.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f39975c = new b();

    /* renamed from: a  reason: collision with root package name */
    private String f39976a = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private int f39977b = 5;

    private b() {
    }

    public static b j() {
        return f39975c;
    }

    private static String k(String str, Throwable th) {
        return str + '\n' + l(th);
    }

    private static String l(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String m(String str) {
        if (this.f39976a != null) {
            return this.f39976a + ":" + str;
        }
        return str;
    }

    private void n(int i10, String str, String str2) {
        Log.println(i10, m(str), str2);
    }

    private void o(int i10, String str, String str2, Throwable th) {
        Log.println(i10, m(str), k(str2, th));
    }

    @Override // z3.c
    public void a(String str, String str2) {
        n(5, str, str2);
    }

    @Override // z3.c
    public void b(String str, String str2) {
        n(2, str, str2);
    }

    @Override // z3.c
    public void c(String str, String str2) {
        n(6, str, str2);
    }

    @Override // z3.c
    public void d(String str, String str2) {
        n(3, str, str2);
    }

    @Override // z3.c
    public void e(String str, String str2) {
        n(6, str, str2);
    }

    @Override // z3.c
    public void f(String str, String str2, Throwable th) {
        o(5, str, str2, th);
    }

    @Override // z3.c
    public void g(String str, String str2, Throwable th) {
        o(6, str, str2, th);
    }

    @Override // z3.c
    public boolean h(int i10) {
        return this.f39977b <= i10;
    }

    @Override // z3.c
    public void i(String str, String str2) {
        n(4, str, str2);
    }

    @Override // z3.c
    public void d(String str, String str2, Throwable th) {
        o(3, str, str2, th);
    }

    @Override // z3.c
    public void e(String str, String str2, Throwable th) {
        o(6, str, str2, th);
    }
}
