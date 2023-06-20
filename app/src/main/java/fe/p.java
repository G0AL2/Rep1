package fe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Collections.kt */
/* loaded from: classes3.dex */
public class p extends o {
    public static final <T> Collection<T> e(T[] tArr) {
        qe.k.f(tArr, "<this>");
        return new f(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int f(List<? extends T> list, T t10, int i10, int i11) {
        int a10;
        qe.k.f(list, "<this>");
        n(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            a10 = he.b.a(list.get(i13), t10);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else if (a10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int g(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return f(list, comparable, i10, i11);
    }

    public static <T> List<T> h() {
        return z.f30331a;
    }

    public static <T> int i(List<? extends T> list) {
        qe.k.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> j(T... tArr) {
        List<T> h10;
        List<T> b10;
        qe.k.f(tArr, "elements");
        if (tArr.length > 0) {
            b10 = k.b(tArr);
            return b10;
        }
        h10 = h();
        return h10;
    }

    public static <T> List<T> k(T... tArr) {
        qe.k.f(tArr, "elements");
        return l.o(tArr);
    }

    public static <T> List<T> l(T... tArr) {
        qe.k.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new f(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> m(List<? extends T> list) {
        List<T> h10;
        List<T> d10;
        qe.k.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            h10 = h();
            return h10;
        } else if (size != 1) {
            return list;
        } else {
            d10 = o.d(list.get(0));
            return d10;
        }
    }

    private static final void n(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 <= i10) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static void o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
