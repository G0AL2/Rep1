package we;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
class a2 extends a<ee.u> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(ie.g gVar, boolean z10) {
        super(gVar, z10);
        qe.k.g(gVar, "parentContext");
    }

    @Override // we.p1
    protected boolean H(Throwable th) {
        qe.k.g(th, "exception");
        b0.a(getContext(), th);
        return true;
    }
}
