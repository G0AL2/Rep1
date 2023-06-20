package androidx.work;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4714a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile l f4715b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final int f4716c = 20;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends l {

        /* renamed from: d  reason: collision with root package name */
        private final int f4717d;

        public a(int i10) {
            super(i10);
            this.f4717d = i10;
        }

        @Override // androidx.work.l
        public void a(String str, String str2) {
            if (this.f4717d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.l
        public void b(String str, String str2, Throwable th) {
            if (this.f4717d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.l
        public void c(String str, String str2) {
            if (this.f4717d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.l
        public void d(String str, String str2, Throwable th) {
            if (this.f4717d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.l
        public void f(String str, String str2) {
            if (this.f4717d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.l
        public void g(String str, String str2, Throwable th) {
            if (this.f4717d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // androidx.work.l
        public void j(String str, String str2) {
            if (this.f4717d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.l
        public void k(String str, String str2) {
            if (this.f4717d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.l
        public void l(String str, String str2, Throwable th) {
            if (this.f4717d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public l(int i10) {
    }

    public static l e() {
        l lVar;
        synchronized (f4714a) {
            if (f4715b == null) {
                f4715b = new a(3);
            }
            lVar = f4715b;
        }
        return lVar;
    }

    public static void h(l lVar) {
        synchronized (f4714a) {
            f4715b = lVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f4716c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
