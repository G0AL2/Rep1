package we;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes3.dex */
public final class k0 extends x0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: f  reason: collision with root package name */
    private static final long f38619f;

    /* renamed from: g  reason: collision with root package name */
    public static final k0 f38620g;

    static {
        Long l10;
        k0 k0Var = new k0();
        f38620g = k0Var;
        w0.C0(k0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        qe.k.b(l10, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f38619f = timeUnit.toNanos(l10.longValue());
    }

    private k0() {
    }

    private final synchronized void n1() {
        if (p1()) {
            debugStatus = 3;
            j1();
            notifyAll();
        }
    }

    private final synchronized Thread o1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean p1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean q1() {
        if (p1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // we.y0
    protected Thread N0() {
        Thread thread = _thread;
        return thread != null ? thread : o1();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean c12;
        e2.f38598b.c(this);
        f2 a10 = g2.a();
        if (a10 != null) {
            a10.g();
        }
        try {
            if (!q1()) {
                if (c12) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long d12 = d1();
                if (d12 == Long.MAX_VALUE) {
                    int i10 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
                    if (i10 == 0) {
                        f2 a11 = g2.a();
                        long nanoTime = a11 != null ? a11.nanoTime() : System.nanoTime();
                        if (i10 == 0) {
                            j10 = f38619f + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            n1();
                            f2 a12 = g2.a();
                            if (a12 != null) {
                                a12.d();
                            }
                            if (c1()) {
                                return;
                            }
                            N0();
                            return;
                        }
                        d12 = se.f.e(d12, j11);
                    } else {
                        d12 = se.f.e(d12, f38619f);
                    }
                }
                if (d12 > 0) {
                    if (p1()) {
                        _thread = null;
                        n1();
                        f2 a13 = g2.a();
                        if (a13 != null) {
                            a13.d();
                        }
                        if (c1()) {
                            return;
                        }
                        N0();
                        return;
                    }
                    f2 a14 = g2.a();
                    if (a14 != null) {
                        a14.c(this, d12);
                    } else {
                        LockSupport.parkNanos(this, d12);
                    }
                }
            }
        } finally {
            _thread = null;
            n1();
            f2 a15 = g2.a();
            if (a15 != null) {
                a15.d();
            }
            if (!c1()) {
                N0();
            }
        }
    }
}
