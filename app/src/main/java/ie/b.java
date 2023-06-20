package ie;

import ie.g;
import ie.g.b;
import pe.l;
import qe.k;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final l<g.b, E> f31930a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c<?> f31931b;

    public final boolean a(g.c<?> cVar) {
        k.f(cVar, "key");
        return cVar == this || this.f31931b == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lie/g$b;)TE; */
    public final g.b b(g.b bVar) {
        k.f(bVar, "element");
        return (g.b) this.f31930a.b(bVar);
    }
}
