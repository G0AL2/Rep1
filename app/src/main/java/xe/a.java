package xe;

import ee.n;
import ee.o;
import ee.u;
import ie.d;
import pe.p;
import qe.k;
import we.q0;

/* compiled from: Cancellable.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        k.g(pVar, "$this$startCoroutineCancellable");
        k.g(dVar, "completion");
        try {
            q0.d(je.b.b(je.b.a(pVar, r10, dVar)), u.f29813a);
        } catch (Throwable th) {
            n.a aVar = n.f29807a;
            dVar.resumeWith(n.a(o.a(th)));
        }
    }
}
