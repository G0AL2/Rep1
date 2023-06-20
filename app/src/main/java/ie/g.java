package ie;

import ie.e;
import pe.p;
import qe.k;
import qe.l;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        /* renamed from: ie.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0410a extends l implements p<g, b, g> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0410a f31937a = new C0410a();

            C0410a() {
                super(2);
            }

            @Override // pe.p
            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                ie.c cVar;
                k.f(gVar, "acc");
                k.f(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f31938a;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f31935b0;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new ie.c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new ie.c(bVar, eVar);
                    }
                    cVar = new ie.c(new ie.c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            k.f(gVar2, "context");
            return gVar2 == h.f31938a ? gVar : (g) gVar2.fold(gVar, C0410a.f31937a);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes3.dex */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                k.f(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                k.f(cVar, "key");
                if (k.a(bVar.getKey(), cVar)) {
                    k.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                k.f(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? h.f31938a : bVar;
            }

            public static g d(b bVar, g gVar) {
                k.f(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // ie.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
