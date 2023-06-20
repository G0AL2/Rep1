package androidx.lifecycle;

import androidx.lifecycle.i;
import we.n1;
import we.s0;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends k implements m {

    /* renamed from: a  reason: collision with root package name */
    private final i f3317a;

    /* renamed from: b  reason: collision with root package name */
    private final ie.g f3318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycle.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements pe.p<we.e0, ie.d<? super ee.u>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private we.e0 f3319a;

        /* renamed from: b  reason: collision with root package name */
        int f3320b;

        a(ie.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final ie.d<ee.u> create(Object obj, ie.d<?> dVar) {
            qe.k.g(dVar, "completion");
            a aVar = new a(dVar);
            aVar.f3319a = (we.e0) obj;
            return aVar;
        }

        @Override // pe.p
        public final Object invoke(we.e0 e0Var, ie.d<? super ee.u> dVar) {
            return ((a) create(e0Var, dVar)).invokeSuspend(ee.u.f29813a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            je.d.c();
            if (this.f3320b == 0) {
                ee.o.b(obj);
                we.e0 e0Var = this.f3319a;
                if (LifecycleCoroutineScopeImpl.this.i().b().compareTo(i.c.INITIALIZED) < 0) {
                    n1.d(e0Var.g(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.i().a(LifecycleCoroutineScopeImpl.this);
                }
                return ee.u.f29813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(i iVar, ie.g gVar) {
        qe.k.g(iVar, "lifecycle");
        qe.k.g(gVar, "coroutineContext");
        this.f3317a = iVar;
        this.f3318b = gVar;
        if (i().b() == i.c.DESTROYED) {
            n1.d(g(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        qe.k.g(pVar, "source");
        qe.k.g(bVar, "event");
        if (i().b().compareTo(i.c.DESTROYED) <= 0) {
            i().c(this);
            n1.d(g(), null, 1, null);
        }
    }

    @Override // we.e0
    public ie.g g() {
        return this.f3318b;
    }

    public i i() {
        return this.f3317a;
    }

    public final void j() {
        we.e.b(this, s0.c().m0(), null, new a(null), 2, null);
    }
}
