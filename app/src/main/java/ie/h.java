package ie;

import ie.g;
import java.io.Serializable;
import pe.p;
import qe.k;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public final class h implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f31938a = new h();

    private h() {
    }

    @Override // ie.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        k.f(pVar, "operation");
        return r10;
    }

    @Override // ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        k.f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // ie.g
    public g minusKey(g.c<?> cVar) {
        k.f(cVar, "key");
        return this;
    }

    @Override // ie.g
    public g plus(g gVar) {
        k.f(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
