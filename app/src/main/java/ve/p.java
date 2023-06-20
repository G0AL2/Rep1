package ve;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import fe.c0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import qe.v;

/* compiled from: StringsJVM.kt */
/* loaded from: classes3.dex */
public class p extends o {
    public static final boolean j(String str, String str2, boolean z10) {
        qe.k.f(str, "<this>");
        qe.k.f(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }

    public static boolean l(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static Comparator<String> m(v vVar) {
        qe.k.f(vVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        qe.k.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean n(CharSequence charSequence) {
        boolean z10;
        qe.k.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            se.c H = q.H(charSequence);
            if (!(H instanceof Collection) || !((Collection) H).isEmpty()) {
                Iterator<Integer> it = H.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((c0) it).c()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(String str, int i10, String str2, int i11, int i12, boolean z10) {
        qe.k.f(str, "<this>");
        qe.k.f(str2, InneractiveMediationNameConsts.OTHER);
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean p(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        return o(str, i10, str2, i11, i12, (i13 & 16) != 0 ? false : z10);
    }

    public static String q(CharSequence charSequence, int i10) {
        qe.k.f(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 != 0) {
            if (i10 != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                        c0 it = new se.c(1, i10).iterator();
                        while (it.hasNext()) {
                            it.c();
                            sb2.append(charSequence);
                        }
                        String sb3 = sb2.toString();
                        qe.k.e(sb3, "{\n                    va…tring()\n                }");
                        return sb3;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        cArr[i11] = charAt;
                    }
                    return new String(cArr);
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    public static final String r(String str, char c10, char c11, boolean z10) {
        qe.k.f(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            qe.k.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (c.d(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String s(String str, String str2, String str3, boolean z10) {
        int b10;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "oldValue");
        qe.k.f(str3, "newValue");
        int i10 = 0;
        int K = q.K(str, str2, 0, z10);
        if (K < 0) {
            return str;
        }
        int length = str2.length();
        b10 = se.f.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, K);
                sb2.append(str3);
                i10 = K + length;
                if (K >= str.length()) {
                    break;
                }
                K = q.K(str, str2, K + b10, z10);
            } while (K > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            qe.k.e(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String t(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return r(str, c10, c11, z10);
    }

    public static /* synthetic */ String u(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return s(str, str2, str3, z10);
    }

    public static boolean v(String str, String str2, int i10, boolean z10) {
        qe.k.f(str, "<this>");
        qe.k.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return o(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean w(String str, String str2, boolean z10) {
        qe.k.f(str, "<this>");
        qe.k.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return o(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean x(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        boolean v10;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        v10 = v(str, str2, i10, z10);
        return v10;
    }

    public static /* synthetic */ boolean y(String str, String str2, boolean z10, int i10, Object obj) {
        boolean w10;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        w10 = w(str, str2, z10);
        return w10;
    }
}
