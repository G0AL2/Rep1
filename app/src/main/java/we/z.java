package we;

import ie.e;
import ie.g;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes3.dex */
public abstract class z extends ie.a implements ie.e {
    public z() {
        super(ie.e.f31935b0);
    }

    @Override // ie.e
    public void A(ie.d<?> dVar) {
        qe.k.g(dVar, "continuation");
        e.a.c(this, dVar);
    }

    @Override // ie.e
    public final <T> ie.d<T> C(ie.d<? super T> dVar) {
        qe.k.g(dVar, "continuation");
        return new o0(this, dVar);
    }

    public abstract void g0(ie.g gVar, Runnable runnable);

    @Override // ie.a, ie.g.b, ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        qe.k.g(cVar, "key");
        return (E) e.a.a(this, cVar);
    }

    public boolean h0(ie.g gVar) {
        qe.k.g(gVar, "context");
        return true;
    }

    @Override // ie.a, ie.g
    public ie.g minusKey(g.c<?> cVar) {
        qe.k.g(cVar, "key");
        return e.a.b(this, cVar);
    }

    public String toString() {
        return j0.a(this) + '@' + j0.b(this);
    }
}
