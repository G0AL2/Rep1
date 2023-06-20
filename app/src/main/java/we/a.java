package we;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes3.dex */
public abstract class a<T> extends p1 implements i1, ie.d<T> {

    /* renamed from: b  reason: collision with root package name */
    private final ie.g f38584b;

    /* renamed from: c  reason: collision with root package name */
    protected final ie.g f38585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ie.g gVar, boolean z10) {
        super(z10);
        qe.k.g(gVar, "parentContext");
        this.f38585c = gVar;
        this.f38584b = gVar.plus(this);
    }

    @Override // we.p1
    public final void I(Throwable th) {
        qe.k.g(th, "exception");
        b0.a(this.f38584b, th);
    }

    @Override // we.p1
    public String Q() {
        String b10 = y.b(this.f38584b);
        if (b10 != null) {
            return '\"' + b10 + "\":" + super.Q();
        }
        return super.Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we.p1
    protected final void W(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            p0(rVar.f38650a, rVar.a());
            return;
        }
        q0(obj);
    }

    @Override // we.p1
    public final void X() {
        r0();
    }

    @Override // we.p1, we.i1
    public boolean a() {
        return super.a();
    }

    public ie.g g() {
        return this.f38584b;
    }

    @Override // ie.d
    public final ie.g getContext() {
        return this.f38584b;
    }

    public int n0() {
        return 0;
    }

    public final void o0() {
        J((i1) this.f38585c.get(i1.f38615f0));
    }

    protected void p0(Throwable th, boolean z10) {
        qe.k.g(th, "cause");
    }

    protected void q0(T t10) {
    }

    protected void r0() {
    }

    @Override // ie.d
    public final void resumeWith(Object obj) {
        N(s.a(obj), n0());
    }

    public final <R> void s0(kotlinx.coroutines.a aVar, R r10, pe.p<? super R, ? super ie.d<? super T>, ? extends Object> pVar) {
        qe.k.g(aVar, "start");
        qe.k.g(pVar, "block");
        o0();
        aVar.a(pVar, r10, this);
    }
}
