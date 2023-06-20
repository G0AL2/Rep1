package ie;

import ie.g;
import pe.p;
import qe.k;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        k.f(cVar, "key");
        this.key = cVar;
    }

    @Override // ie.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // ie.g.b, ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // ie.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // ie.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // ie.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
