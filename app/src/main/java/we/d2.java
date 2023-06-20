package we;

import ie.g;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes3.dex */
public interface d2<S> extends g.b {

    /* compiled from: ThreadContextElement.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(d2<S> d2Var, R r10, pe.p<? super R, ? super g.b, ? extends R> pVar) {
            qe.k.g(pVar, "operation");
            return (R) g.b.a.a(d2Var, r10, pVar);
        }

        public static <S, E extends g.b> E b(d2<S> d2Var, g.c<E> cVar) {
            qe.k.g(cVar, "key");
            return (E) g.b.a.b(d2Var, cVar);
        }

        public static <S> ie.g c(d2<S> d2Var, g.c<?> cVar) {
            qe.k.g(cVar, "key");
            return g.b.a.c(d2Var, cVar);
        }

        public static <S> ie.g d(d2<S> d2Var, ie.g gVar) {
            qe.k.g(gVar, "context");
            return g.b.a.d(d2Var, gVar);
        }
    }

    S O(ie.g gVar);

    void w(ie.g gVar, S s10);
}
