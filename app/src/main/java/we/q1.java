package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.u f38646a = new kotlinx.coroutines.internal.u("SEALED");

    /* renamed from: b  reason: collision with root package name */
    private static final v0 f38647b = new v0(false);

    /* renamed from: c  reason: collision with root package name */
    private static final v0 f38648c = new v0(true);

    public static final Object d(Object obj) {
        return obj instanceof d1 ? new e1((d1) obj) : obj;
    }

    public static final Object e(Object obj) {
        d1 d1Var;
        e1 e1Var = (e1) (!(obj instanceof e1) ? null : obj);
        return (e1Var == null || (d1Var = e1Var.f38596a) == null) ? obj : d1Var;
    }
}
