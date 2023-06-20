package kotlinx.coroutines.internal;

import ie.g;
import we.d2;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final u f33534a = new u("ZERO");

    /* renamed from: b  reason: collision with root package name */
    private static final pe.p<Object, g.b, Object> f33535b = a.f33539a;

    /* renamed from: c  reason: collision with root package name */
    private static final pe.p<d2<?>, g.b, d2<?>> f33536c = b.f33540a;

    /* renamed from: d  reason: collision with root package name */
    private static final pe.p<b0, g.b, b0> f33537d = d.f33542a;

    /* renamed from: e  reason: collision with root package name */
    private static final pe.p<b0, g.b, b0> f33538e = c.f33541a;

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes3.dex */
    static final class a extends qe.l implements pe.p<Object, g.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33539a = new a();

        a() {
            super(2);
        }

        @Override // pe.p
        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            qe.k.g(bVar, "element");
            if (bVar instanceof d2) {
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes3.dex */
    static final class b extends qe.l implements pe.p<d2<?>, g.b, d2<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33540a = new b();

        b() {
            super(2);
        }

        @Override // pe.p
        /* renamed from: a */
        public final d2<?> invoke(d2<?> d2Var, g.b bVar) {
            qe.k.g(bVar, "element");
            if (d2Var != null) {
                return d2Var;
            }
            if (!(bVar instanceof d2)) {
                bVar = null;
            }
            return (d2) bVar;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes3.dex */
    static final class c extends qe.l implements pe.p<b0, g.b, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f33541a = new c();

        c() {
            super(2);
        }

        @Override // pe.p
        /* renamed from: a */
        public final b0 invoke(b0 b0Var, g.b bVar) {
            qe.k.g(b0Var, "state");
            qe.k.g(bVar, "element");
            if (bVar instanceof d2) {
                ((d2) bVar).w(b0Var.b(), b0Var.d());
            }
            return b0Var;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes3.dex */
    static final class d extends qe.l implements pe.p<b0, g.b, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f33542a = new d();

        d() {
            super(2);
        }

        @Override // pe.p
        /* renamed from: a */
        public final b0 invoke(b0 b0Var, g.b bVar) {
            qe.k.g(b0Var, "state");
            qe.k.g(bVar, "element");
            if (bVar instanceof d2) {
                b0Var.a(((d2) bVar).O(b0Var.b()));
            }
            return b0Var;
        }
    }

    public static final void a(ie.g gVar, Object obj) {
        qe.k.g(gVar, "context");
        if (obj == f33534a) {
            return;
        }
        if (obj instanceof b0) {
            ((b0) obj).c();
            gVar.fold(obj, f33538e);
            return;
        }
        Object fold = gVar.fold(null, f33536c);
        if (fold != null) {
            ((d2) fold).w(gVar, obj);
            return;
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final Object b(ie.g gVar) {
        qe.k.g(gVar, "context");
        Object fold = gVar.fold(0, f33535b);
        if (fold == null) {
            qe.k.o();
        }
        return fold;
    }

    public static final Object c(ie.g gVar, Object obj) {
        qe.k.g(gVar, "context");
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f33534a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new b0(gVar, ((Number) obj).intValue()), f33537d);
        }
        if (obj != null) {
            return ((d2) obj).O(gVar);
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
