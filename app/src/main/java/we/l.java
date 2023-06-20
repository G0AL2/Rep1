package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class l extends k1<i1> {

    /* renamed from: e  reason: collision with root package name */
    public final i<?> f38621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1 i1Var, i<?> iVar) {
        super(i1Var);
        qe.k.g(i1Var, "parent");
        qe.k.g(iVar, "child");
        this.f38621e = iVar;
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        y(th);
        return ee.u.f29813a;
    }

    @Override // kotlinx.coroutines.internal.j
    public String toString() {
        return "ChildContinuation[" + this.f38621e + ']';
    }

    @Override // we.v
    public void y(Throwable th) {
        i<?> iVar = this.f38621e;
        iVar.m(iVar.p(this.f38630d));
    }
}
