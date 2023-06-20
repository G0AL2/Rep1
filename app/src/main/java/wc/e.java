package wc;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f38566d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f38567e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f38568a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f38569b;

    /* renamed from: c  reason: collision with root package name */
    private int f38570c;

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f38566d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f38570c) + this.f38568a.e(), f38567e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f38570c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f38570c != 0) {
            z10 = this.f38568a.a() > this.f38569b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f38570c++;
        this.f38569b = this.f38568a.a() + a(i10);
    }
}
