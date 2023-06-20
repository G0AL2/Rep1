package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public class l1 extends p1 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38623b;

    public l1(i1 i1Var) {
        super(true);
        J(i1Var);
        this.f38623b = n0();
    }

    private final boolean n0() {
        p1 p1Var;
        m mVar = this.parentHandle;
        if (!(mVar instanceof n)) {
            mVar = null;
        }
        n nVar = (n) mVar;
        if (nVar != null && (p1Var = (p1) nVar.f38630d) != null) {
            while (!p1Var.D()) {
                m mVar2 = p1Var.parentHandle;
                if (!(mVar2 instanceof n)) {
                    mVar2 = null;
                }
                n nVar2 = (n) mVar2;
                if (nVar2 != null) {
                    p1Var = (p1) nVar2.f38630d;
                    if (p1Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // we.p1
    public boolean D() {
        return this.f38623b;
    }

    @Override // we.p1
    public boolean E() {
        return true;
    }
}
