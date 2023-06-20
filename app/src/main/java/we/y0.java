package we;

import java.util.concurrent.locks.LockSupport;
import we.x0;

/* compiled from: EventLoop.kt */
/* loaded from: classes3.dex */
public abstract class y0 extends w0 {
    protected abstract Thread N0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q0(long j10, x0.b bVar) {
        qe.k.g(bVar, "delayedTask");
        if (i0.a()) {
            if (!(this != k0.f38620g)) {
                throw new AssertionError();
            }
        }
        k0.f38620g.k1(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T0() {
        Thread N0 = N0();
        if (Thread.currentThread() != N0) {
            f2 a10 = g2.a();
            if (a10 != null) {
                a10.b(N0);
            } else {
                LockSupport.unpark(N0);
            }
        }
    }
}
