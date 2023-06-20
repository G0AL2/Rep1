package we;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
final class y1 extends f {

    /* renamed from: a  reason: collision with root package name */
    private final kotlinx.coroutines.internal.j f38676a;

    public y1(kotlinx.coroutines.internal.j jVar) {
        qe.k.g(jVar, "node");
        this.f38676a = jVar;
    }

    @Override // we.g
    public void a(Throwable th) {
        this.f38676a.u();
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        a(th);
        return ee.u.f29813a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f38676a + ']';
    }
}
