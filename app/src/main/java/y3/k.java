package y3;

import java.util.Objects;

/* compiled from: Preconditions.java */
/* loaded from: classes.dex */
public final class k {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return k("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    public static void b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(k(str, objArr));
        }
    }

    public static int e(int i10, int i11) {
        return f(i10, i11, "index");
    }

    public static int f(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static <T> T g(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T h(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    static String k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb2.append(valueOf.substring(i11, indexOf));
            sb2.append(objArr[i10]);
            i11 = indexOf + 2;
            i10++;
        }
        sb2.append(valueOf.substring(i11));
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
