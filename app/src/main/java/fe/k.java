package fe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes3.dex */
public class k extends j {
    public static <T> List<T> b(T[] tArr) {
        qe.k.f(tArr, "<this>");
        List<T> a10 = m.a(tArr);
        qe.k.e(a10, "asList(this)");
        return a10;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        qe.k.f(bArr, "<this>");
        qe.k.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static <T> T[] d(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        qe.k.f(tArr, "<this>");
        qe.k.f(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] e(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        byte[] c10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        c10 = c(bArr, bArr2, i10, i11, i12);
        return c10;
    }

    public static /* synthetic */ Object[] f(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return h.d(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        qe.k.f(bArr, "<this>");
        i.a(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        qe.k.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> T[] h(T[] tArr, int i10, int i11) {
        qe.k.f(tArr, "<this>");
        i.a(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        qe.k.e(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static void i(int[] iArr, int i10, int i11, int i12) {
        qe.k.f(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static <T> void j(T[] tArr, T t10, int i10, int i11) {
        qe.k.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void k(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        j(objArr, obj, i10, i11);
    }

    public static final <T> void l(T[] tArr) {
        qe.k.f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void m(T[] tArr, Comparator<? super T> comparator) {
        qe.k.f(tArr, "<this>");
        qe.k.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
