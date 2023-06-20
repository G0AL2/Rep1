package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class n extends k1<p1> implements m {

    /* renamed from: e  reason: collision with root package name */
    public final o f38624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p1 p1Var, o oVar) {
        super(p1Var);
        qe.k.g(p1Var, "parent");
        qe.k.g(oVar, "childJob");
        this.f38624e = oVar;
    }

    @Override // pe.l
    public /* bridge */ /* synthetic */ ee.u b(Throwable th) {
        y(th);
        return ee.u.f29813a;
    }

    @Override // we.m
    public boolean c(Throwable th) {
        qe.k.g(th, "cause");
        return ((p1) this.f38630d).q(th);
    }

    @Override // kotlinx.coroutines.internal.j
    public String toString() {
        return "ChildHandle[" + this.f38624e + ']';
    }

    @Override // we.v
    public void y(Throwable th) {
        this.f38624e.T((x1) this.f38630d);
    }
}
