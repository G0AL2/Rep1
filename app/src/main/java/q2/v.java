package q2;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzajn;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static String f35852a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f35853b = Log.isLoggable(zzajn.zza, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f35854c = v.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VolleyLog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f35855c = v.f35853b;

        /* renamed from: a  reason: collision with root package name */
        private final List<C0478a> f35856a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f35857b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: VolleyLog.java */
        /* renamed from: q2.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0478a {

            /* renamed from: a  reason: collision with root package name */
            public final String f35858a;

            /* renamed from: b  reason: collision with root package name */
            public final long f35859b;

            /* renamed from: c  reason: collision with root package name */
            public final long f35860c;

            public C0478a(String str, long j10, long j11) {
                this.f35858a = str;
                this.f35859b = j10;
                this.f35860c = j11;
            }
        }

        private long c() {
            if (this.f35856a.size() == 0) {
                return 0L;
            }
            long j10 = this.f35856a.get(0).f35860c;
            List<C0478a> list = this.f35856a;
            return list.get(list.size() - 1).f35860c - j10;
        }

        public synchronized void a(String str, long j10) {
            if (!this.f35857b) {
                this.f35856a.add(new C0478a(str, j10, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.f35857b = true;
            long c10 = c();
            if (c10 <= 0) {
                return;
            }
            long j10 = this.f35856a.get(0).f35860c;
            v.b("(%-4d ms) %s", Long.valueOf(c10), str);
            for (C0478a c0478a : this.f35856a) {
                long j11 = c0478a.f35860c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0478a.f35859b), c0478a.f35858a);
                j10 = j11;
            }
        }

        protected void finalize() throws Throwable {
            if (this.f35857b) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i10].getClassName().equals(f35854c)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            } else {
                i10++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f35852a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f35852a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f35852a, a(str, objArr), th);
    }

    public static void e(String str, Object... objArr) {
        if (f35853b) {
            Log.v(f35852a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f35852a, a(str, objArr));
    }
}
