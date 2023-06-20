package i5;

/* compiled from: IntlTextUtils.java */
/* loaded from: classes.dex */
public class b {
    public static boolean a(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean b(char c10) {
        return (c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static boolean c(char c10) {
        return b(c10) || a(c10);
    }

    public static boolean d(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 < charSequence.length() && (i14 = (i11 - i10) + 1) >= i12 && i14 <= i13) {
            while (i10 <= i11) {
                if (!b(charSequence.charAt(i10))) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        return false;
    }

    public static boolean e(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 < charSequence.length() && (i14 = (i11 - i10) + 1) >= i12 && i14 <= i13) {
            while (i10 <= i11) {
                if (!c(charSequence.charAt(i10))) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        return false;
    }

    public static boolean f(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 < charSequence.length() && (i14 = (i11 - i10) + 1) >= i12 && i14 <= i13) {
            while (i10 <= i11) {
                if (!a(charSequence.charAt(i10))) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        return false;
    }

    public static boolean g(CharSequence charSequence, int i10, int i11) {
        return (i11 - i10) + 1 == 4 && b(charSequence.charAt(i10)) && e(charSequence, i10 + 1, i11, 3, 3);
    }

    public static boolean h(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 1, 1);
    }

    public static boolean i(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 2, 8);
    }

    public static boolean j(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 1, 8);
    }

    public static boolean k(CharSequence charSequence, int i10, int i11) {
        return i11 == i10 + 1 && b(charSequence.charAt(i10)) && a(charSequence.charAt(i11));
    }

    public static boolean l(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 3, 8);
    }

    public static boolean m(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 3, 8);
    }

    public static boolean n(CharSequence charSequence, int i10, int i11) {
        return i11 == i10 + 1 && c(charSequence.charAt(i10)) && b(charSequence.charAt(i11));
    }

    public static boolean o(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 3, 8);
    }

    public static boolean p(CharSequence charSequence, int i10, int i11) {
        if (d(charSequence, i10, i11, 2, 3) || d(charSequence, i10, i11, 5, 8)) {
            return true;
        }
        return (i11 - i10) + 1 == 4 && charSequence.charAt(i10) == 'r' && charSequence.charAt(i10 + 1) == 'o' && charSequence.charAt(i10 + 2) == 'o' && charSequence.charAt(i10 + 3) == 't';
    }

    public static boolean q(CharSequence charSequence, int i10, int i11) {
        return d(charSequence, i10, i11, 2, 2) || f(charSequence, i10, i11, 3, 3);
    }

    public static boolean r(CharSequence charSequence, int i10, int i11) {
        return d(charSequence, i10, i11, 4, 4);
    }

    public static boolean s(CharSequence charSequence, int i10, int i11) {
        return e(charSequence, i10, i11, 5, 8) || g(charSequence, i10, i11);
    }
}
