package we;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
final class f1 extends f {

    /* renamed from: a  reason: collision with root package name */
    private final pe.l<Throwable, ee.u> f38599a;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(pe.l<? super Throwable, ee.u> lVar) {
        qe.k.g(lVar, "handler");
        this.f38599a = lVar;
    }

    @Override // we.g
    public void a(Throwable th) {
        this.f38599a.b(th);
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        a(th);
        return ee.u.f29813a;
    }

    public String toString() {
        return "InvokeOnCancel[" + j0.a(this.f38599a) + '@' + j0.b(this) + ']';
    }
}
