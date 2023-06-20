package ie;

import ie.g;
import qe.k;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes3.dex */
public interface e extends g.b {

    /* renamed from: b0  reason: collision with root package name */
    public static final b f31935b0 = b.f31936a;

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            k.f(cVar, "key");
            if (cVar instanceof ie.b) {
                ie.b bVar = (ie.b) cVar;
                if (bVar.a(eVar.getKey())) {
                    E e10 = (E) bVar.b(eVar);
                    if (e10 instanceof g.b) {
                        return e10;
                    }
                    return null;
                }
                return null;
            } else if (e.f31935b0 == cVar) {
                k.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            k.f(cVar, "key");
            if (!(cVar instanceof ie.b)) {
                return e.f31935b0 == cVar ? h.f31938a : eVar;
            }
            ie.b bVar = (ie.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f31938a;
        }

        public static void c(e eVar, d<?> dVar) {
            k.f(dVar, "continuation");
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: classes3.dex */
    public static final class b implements g.c<e> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f31936a = new b();

        private b() {
        }
    }

    void A(d<?> dVar);

    <T> d<T> C(d<? super T> dVar);
}
