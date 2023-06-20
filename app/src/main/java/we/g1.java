package we;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class g1 extends k1<i1> {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38602f = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e  reason: collision with root package name */
    private final pe.l<Throwable, ee.u> f38603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(i1 i1Var, pe.l<? super Throwable, ee.u> lVar) {
        super(i1Var);
        qe.k.g(i1Var, "job");
        qe.k.g(lVar, "handler");
        this.f38603e = lVar;
        this._invoked = 0;
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        y(th);
        return ee.u.f29813a;
    }

    @Override // kotlinx.coroutines.internal.j
    public String toString() {
        return "InvokeOnCancelling[" + j0.a(this) + '@' + j0.b(this) + ']';
    }

    @Override // we.v
    public void y(Throwable th) {
        if (f38602f.compareAndSet(this, 0, 1)) {
            this.f38603e.b(th);
        }
    }
}
