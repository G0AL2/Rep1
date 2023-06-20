package kotlinx.coroutines;

import ee.l;
import ie.d;
import ie.f;
import pe.p;
import qe.k;
import we.g0;
import xe.b;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes3.dex */
public enum a {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        k.g(pVar, "block");
        k.g(dVar, "completion");
        int i10 = g0.f38601b[ordinal()];
        if (i10 == 1) {
            xe.a.a(pVar, r10, dVar);
        } else if (i10 == 2) {
            f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new l();
        }
    }

    public final boolean f() {
        return this == LAZY;
    }
}
