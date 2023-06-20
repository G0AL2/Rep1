package we;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
final class u0 extends f {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f38660a;

    public u0(t0 t0Var) {
        qe.k.g(t0Var, "handle");
        this.f38660a = t0Var;
    }

    @Override // we.g
    public void a(Throwable th) {
        this.f38660a.f();
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        a(th);
        return ee.u.f29813a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f38660a + ']';
    }
}
