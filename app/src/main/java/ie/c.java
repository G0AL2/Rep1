package ie;

import ie.g;
import java.io.Serializable;
import pe.p;
import qe.k;
import qe.l;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public final class c implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final g f31932a;

    /* renamed from: b  reason: collision with root package name */
    private final g.b f31933b;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes3.dex */
    static final class a extends l implements p<String, g.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31934a = new a();

        a() {
            super(2);
        }

        @Override // pe.p
        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            k.f(str, "acc");
            k.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        k.f(gVar, "left");
        k.f(bVar, "element");
        this.f31932a = gVar;
        this.f31933b = bVar;
    }

    private final boolean b(g.b bVar) {
        return k.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f31933b)) {
            g gVar = cVar.f31932a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                k.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f31932a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // ie.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        k.f(pVar, "operation");
        return pVar.invoke((Object) this.f31932a.fold(r10, pVar), this.f31933b);
    }

    @Override // ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        k.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f31933b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f31932a;
            if (gVar instanceof c) {
                cVar2 = (c) gVar;
            } else {
                return (E) gVar.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.f31932a.hashCode() + this.f31933b.hashCode();
    }

    @Override // ie.g
    public g minusKey(g.c<?> cVar) {
        k.f(cVar, "key");
        if (this.f31933b.get(cVar) != null) {
            return this.f31932a;
        }
        g minusKey = this.f31932a.minusKey(cVar);
        return minusKey == this.f31932a ? this : minusKey == h.f31938a ? this.f31933b : new c(minusKey, this.f31933b);
    }

    @Override // ie.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f31934a)) + ']';
    }
}
