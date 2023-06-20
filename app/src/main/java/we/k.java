package we;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletedExceptionally.kt */
/* loaded from: classes3.dex */
public final class k extends r {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38618c = AtomicIntegerFieldUpdater.newUpdater(k.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(ie.d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "continuation"
            qe.k.g(r3, r0)
            if (r4 == 0) goto L8
            goto L23
        L8:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L23:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.k.<init>(ie.d, java.lang.Throwable, boolean):void");
    }

    public final boolean c() {
        return f38618c.compareAndSet(this, 0, 1);
    }
}
