package ee;

import ee.n;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class o {
    public static final Object a(Throwable th) {
        qe.k.f(th, "exception");
        return new n.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof n.b) {
            throw ((n.b) obj).f29808a;
        }
    }
}
