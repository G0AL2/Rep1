package f6;

/* compiled from: Assertions.java */
/* loaded from: classes.dex */
public class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new AssertionError(str);
        }
    }

    public static <T> T c(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new AssertionError();
    }

    public static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new AssertionError(str);
    }

    public static AssertionError e() {
        throw new AssertionError();
    }

    public static <T> T f(T t10) {
        return t10;
    }
}
