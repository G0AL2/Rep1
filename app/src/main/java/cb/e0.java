package cb;

/* loaded from: classes3.dex */
public final class e0<T> implements g0<T> {

    /* renamed from: a  reason: collision with root package name */
    private g0<T> f5431a;

    public static <T> void b(g0<T> g0Var, g0<T> g0Var2) {
        r.c(g0Var2);
        e0 e0Var = (e0) g0Var;
        if (e0Var.f5431a != null) {
            throw new IllegalStateException();
        }
        e0Var.f5431a = g0Var2;
    }

    @Override // cb.g0
    public final T a() {
        g0<T> g0Var = this.f5431a;
        if (g0Var != null) {
            return g0Var.a();
        }
        throw new IllegalStateException();
    }
}
