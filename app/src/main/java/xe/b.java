package xe;

import ee.n;
import ee.o;
import ie.d;
import ie.g;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.y;
import pe.p;
import qe.k;
import qe.w;
import we.q1;
import we.r;

/* compiled from: Undispatched.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        k.g(pVar, "$this$startCoroutineUndispatched");
        k.g(dVar, "completion");
        d a10 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c10 = y.c(context, null);
            Object invoke = ((p) w.b(pVar, 2)).invoke(r10, a10);
            y.a(context, c10);
            if (invoke != je.b.c()) {
                n.a aVar = n.f29807a;
                a10.resumeWith(n.a(invoke));
            }
        } catch (Throwable th) {
            n.a aVar2 = n.f29807a;
            a10.resumeWith(n.a(o.a(th)));
        }
    }

    public static final <T, R> Object b(we.a<? super T> aVar, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object rVar;
        k.g(aVar, "$this$startUndispatchedOrReturn");
        k.g(pVar, "block");
        aVar.o0();
        try {
            rVar = ((p) w.b(pVar, 2)).invoke(r10, aVar);
        } catch (Throwable th) {
            rVar = new r(th, false, 2, null);
        }
        if (rVar == je.b.c()) {
            return je.b.c();
        }
        if (aVar.N(rVar, 4)) {
            Object G = aVar.G();
            if (!(G instanceof r)) {
                return q1.e(G);
            }
            throw s.a(aVar, ((r) G).f38650a);
        }
        return je.b.c();
    }
}
