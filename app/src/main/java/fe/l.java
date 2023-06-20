package fe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: _Arrays.kt */
/* loaded from: classes3.dex */
public class l extends k {
    public static final <T, C extends Collection<? super T>> C A(T[] tArr, C c10) {
        qe.k.f(tArr, "<this>");
        qe.k.f(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> B(T[] tArr) {
        List<T> h10;
        List<T> d10;
        List<T> C;
        qe.k.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            h10 = p.h();
            return h10;
        } else if (length != 1) {
            C = C(tArr);
            return C;
        } else {
            d10 = o.d(tArr[0]);
            return d10;
        }
    }

    public static <T> List<T> C(T[] tArr) {
        qe.k.f(tArr, "<this>");
        return new ArrayList(p.e(tArr));
    }

    public static final <T> boolean n(T[] tArr, T t10) {
        qe.k.f(tArr, "<this>");
        return s(tArr, t10) >= 0;
    }

    public static final <T> List<T> o(T[] tArr) {
        qe.k.f(tArr, "<this>");
        return (List) p(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C p(T[] tArr, C c10) {
        qe.k.f(tArr, "<this>");
        qe.k.f(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> se.c q(T[] tArr) {
        int r10;
        qe.k.f(tArr, "<this>");
        r10 = r(tArr);
        return new se.c(0, r10);
    }

    public static <T> int r(T[] tArr) {
        qe.k.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> int s(T[] tArr, T t10) {
        qe.k.f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (qe.k.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A t(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(tArr, "<this>");
        qe.k.f(a10, "buffer");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ve.h.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String u(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(tArr, "<this>");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) t(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qe.k.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String v(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return u(objArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static char w(char[] cArr) {
        qe.k.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T x(T[] tArr) {
        qe.k.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] y(T[] tArr, Comparator<? super T> comparator) {
        qe.k.f(tArr, "<this>");
        qe.k.f(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        qe.k.e(tArr2, "copyOf(this, size)");
        k.m(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> z(T[] tArr, Comparator<? super T> comparator) {
        List<T> b10;
        qe.k.f(tArr, "<this>");
        qe.k.f(comparator, "comparator");
        b10 = k.b(y(tArr, comparator));
        return b10;
    }
}
