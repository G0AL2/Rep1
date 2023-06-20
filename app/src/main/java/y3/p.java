package y3;

/* compiled from: Throwables.java */
/* loaded from: classes.dex */
public final class p {
    public static RuntimeException a(Throwable th) {
        c((Throwable) k.g(th));
        throw new RuntimeException(th);
    }

    public static <X extends Throwable> void b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void c(Throwable th) {
        b(th, Error.class);
        b(th, RuntimeException.class);
    }
}
