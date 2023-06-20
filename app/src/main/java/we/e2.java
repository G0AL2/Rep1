package we;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: b  reason: collision with root package name */
    public static final e2 f38598b = new e2();

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<w0> f38597a = new ThreadLocal<>();

    private e2() {
    }

    public final w0 a() {
        ThreadLocal<w0> threadLocal = f38597a;
        w0 w0Var = threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        w0 a10 = z0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void b() {
        f38597a.set(null);
    }

    public final void c(w0 w0Var) {
        qe.k.g(w0Var, "eventLoop");
        f38597a.set(w0Var);
    }
}
