package we;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
final class r1 extends a2 {

    /* renamed from: d  reason: collision with root package name */
    private pe.p<? super e0, ? super ie.d<? super ee.u>, ? extends Object> f38652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(ie.g gVar, pe.p<? super e0, ? super ie.d<? super ee.u>, ? extends Object> pVar) {
        super(gVar, false);
        qe.k.g(gVar, "parentContext");
        qe.k.g(pVar, "block");
        this.f38652d = pVar;
    }

    @Override // we.a
    protected void r0() {
        pe.p<? super e0, ? super ie.d<? super ee.u>, ? extends Object> pVar = this.f38652d;
        if (pVar != null) {
            this.f38652d = null;
            xe.a.a(pVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }
}
