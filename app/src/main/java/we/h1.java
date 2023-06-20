package we;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class h1 extends o1<i1> {

    /* renamed from: e  reason: collision with root package name */
    private final pe.l<Throwable, ee.u> f38605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(i1 i1Var, pe.l<? super Throwable, ee.u> lVar) {
        super(i1Var);
        qe.k.g(i1Var, "job");
        qe.k.g(lVar, "handler");
        this.f38605e = lVar;
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        y(th);
        return ee.u.f29813a;
    }

    @Override // kotlinx.coroutines.internal.j
    public String toString() {
        return "InvokeOnCompletion[" + j0.a(this) + '@' + j0.b(this) + ']';
    }

    @Override // we.v
    public void y(Throwable th) {
        this.f38605e.b(th);
    }
}
