package vb;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    static final f f38043c = new f("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f38044a;

    /* renamed from: b  reason: collision with root package name */
    private int f38045b = 4;

    public f(String str) {
        this.f38044a = str;
    }

    private boolean a(int i10) {
        return this.f38045b <= i10 || Log.isLoggable(this.f38044a, i10);
    }

    public static f f() {
        return f38043c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f38044a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f38044a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f38044a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f38044a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f38044a, str, th);
        }
    }
}
