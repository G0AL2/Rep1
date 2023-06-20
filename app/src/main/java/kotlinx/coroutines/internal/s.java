package kotlinx.coroutines.internal;

/* compiled from: Scopes.kt */
/* loaded from: classes3.dex */
public final class s {
    public static final Throwable a(we.a<?> aVar, Throwable th) {
        ie.d<T> dVar;
        qe.k.g(aVar, "$this$tryRecover");
        qe.k.g(th, "exception");
        if (!(aVar instanceof r)) {
            aVar = null;
        }
        r rVar = (r) aVar;
        return (rVar == null || (dVar = rVar.f33530d) == 0) ? th : t.j(th, dVar);
    }
}
