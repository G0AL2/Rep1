package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class c1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final t1 f38593a;

    public c1(t1 t1Var) {
        qe.k.g(t1Var, "list");
        this.f38593a = t1Var;
    }

    @Override // we.d1
    public boolean a() {
        return false;
    }

    @Override // we.d1
    public t1 d() {
        return this.f38593a;
    }

    public String toString() {
        return i0.c() ? d().z("New") : super.toString();
    }
}
