package ve;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import fe.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Strings.kt */
/* loaded from: classes3.dex */
public class q extends p {

    /* compiled from: Strings.kt */
    /* loaded from: classes3.dex */
    public static final class a extends qe.l implements pe.p<CharSequence, Integer, ee.m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f38096a;

        /* renamed from: b */
        final /* synthetic */ boolean f38097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f38096a = cArr;
            this.f38097b = z10;
        }

        public final ee.m<Integer, Integer> a(CharSequence charSequence, int i10) {
            qe.k.f(charSequence, "$this$$receiver");
            int P = q.P(charSequence, this.f38096a, i10, this.f38097b);
            if (P < 0) {
                return null;
            }
            return ee.q.a(Integer.valueOf(P), 1);
        }

        @Override // pe.p
        public /* bridge */ /* synthetic */ ee.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* loaded from: classes3.dex */
    public static final class b extends qe.l implements pe.p<CharSequence, Integer, ee.m<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f38098a;

        /* renamed from: b */
        final /* synthetic */ boolean f38099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f38098a = list;
            this.f38099b = z10;
        }

        public final ee.m<Integer, Integer> a(CharSequence charSequence, int i10) {
            qe.k.f(charSequence, "$this$$receiver");
            ee.m G = q.G(charSequence, this.f38098a, i10, this.f38099b, false);
            if (G != null) {
                return ee.q.a(G.c(), Integer.valueOf(((String) G.d()).length()));
            }
            return null;
        }

        @Override // pe.p
        public /* bridge */ /* synthetic */ ee.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* loaded from: classes3.dex */
    public static final class c extends qe.l implements pe.l<se.c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f38100a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f38100a = charSequence;
        }

        @Override // pe.l
        /* renamed from: a */
        public final String b(se.c cVar) {
            qe.k.f(cVar, "it");
            return q.o0(this.f38100a, cVar);
        }
    }

    public static final boolean A(CharSequence charSequence, char c10, boolean z10) {
        int N;
        qe.k.f(charSequence, "<this>");
        N = N(charSequence, c10, 0, z10, 2, null);
        return N >= 0;
    }

    public static final boolean B(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int O;
        qe.k.f(charSequence, "<this>");
        qe.k.f(charSequence2, InneractiveMediationNameConsts.OTHER);
        if (charSequence2 instanceof String) {
            O = O(charSequence, (String) charSequence2, 0, z10, 2, null);
            if (O >= 0) {
                return true;
            }
        } else if (M(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean C(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B(charSequence, charSequence2, z10);
    }

    public static final boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean k10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            k10 = p.k((String) charSequence, (String) charSequence2, false, 2, null);
            return k10;
        }
        return b0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(charSequence, charSequence2, z10);
    }

    public static final ee.m<Integer, String> G(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int d10;
        se.a g10;
        Object obj;
        Object obj2;
        int b10;
        if (!z10 && collection.size() == 1) {
            String str = (String) fe.n.G(collection);
            int O = !z11 ? O(charSequence, str, i10, false, 4, null) : T(charSequence, str, i10, false, 4, null);
            if (O < 0) {
                return null;
            }
            return ee.q.a(Integer.valueOf(O), str);
        }
        if (z11) {
            d10 = se.f.d(i10, I(charSequence));
            g10 = se.f.g(d10, 0);
        } else {
            b10 = se.f.b(i10, 0);
            g10 = new se.c(b10, charSequence.length());
        }
        if (charSequence instanceof String) {
            int e10 = g10.e();
            int f10 = g10.f();
            int g11 = g10.g();
            if ((g11 > 0 && e10 <= f10) || (g11 < 0 && f10 <= e10)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (p.o(str2, 0, (String) charSequence, e10, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (e10 == f10) {
                            break;
                        }
                        e10 += g11;
                    } else {
                        return ee.q.a(Integer.valueOf(e10), str3);
                    }
                }
            }
        } else {
            int e11 = g10.e();
            int f11 = g10.f();
            int g12 = g10.g();
            if ((g12 > 0 && e11 <= f11) || (g12 < 0 && f11 <= e11)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (b0(str4, 0, charSequence, e11, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (e11 == f11) {
                            break;
                        }
                        e11 += g12;
                    } else {
                        return ee.q.a(Integer.valueOf(e11), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final se.c H(CharSequence charSequence) {
        qe.k.f(charSequence, "<this>");
        return new se.c(0, charSequence.length() - 1);
    }

    public static final int I(CharSequence charSequence) {
        qe.k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int J(CharSequence charSequence, char c10, int i10, boolean z10) {
        qe.k.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return P(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int K(CharSequence charSequence, String str, int i10, boolean z10) {
        qe.k.f(charSequence, "<this>");
        qe.k.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return M(charSequence, str, i10, charSequence.length(), z10, false, 16, null);
    }

    private static final int L(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int d10;
        int b10;
        se.a g10;
        int b11;
        int d11;
        if (!z11) {
            b11 = se.f.b(i10, 0);
            d11 = se.f.d(i11, charSequence.length());
            g10 = new se.c(b11, d11);
        } else {
            d10 = se.f.d(i10, I(charSequence));
            b10 = se.f.b(i11, 0);
            g10 = se.f.g(d10, b10);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int e10 = g10.e();
            int f10 = g10.f();
            int g11 = g10.g();
            if ((g11 <= 0 || e10 > f10) && (g11 >= 0 || f10 > e10)) {
                return -1;
            }
            while (!p.o((String) charSequence2, 0, (String) charSequence, e10, charSequence2.length(), z10)) {
                if (e10 == f10) {
                    return -1;
                }
                e10 += g11;
            }
            return e10;
        }
        int e11 = g10.e();
        int f11 = g10.f();
        int g12 = g10.g();
        if ((g12 <= 0 || e11 > f11) && (g12 >= 0 || f11 > e11)) {
            return -1;
        }
        while (!b0(charSequence2, 0, charSequence, e11, charSequence2.length(), z10)) {
            if (e11 == f11) {
                return -1;
            }
            e11 += g12;
        }
        return e11;
    }

    static /* synthetic */ int M(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return L(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static /* synthetic */ int N(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return J(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int O(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return K(charSequence, str, i10, z10);
    }

    public static final int P(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int b10;
        boolean z11;
        char w10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            w10 = fe.l.w(cArr);
            return ((String) charSequence).indexOf(w10, i10);
        }
        b10 = se.f.b(i10, 0);
        c0 it = new se.c(b10, I(charSequence)).iterator();
        while (it.hasNext()) {
            int c10 = it.c();
            char charAt = charSequence.charAt(c10);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (ve.c.d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return c10;
            }
        }
        return -1;
    }

    public static final int Q(CharSequence charSequence, char c10, int i10, boolean z10) {
        qe.k.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return U(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int R(CharSequence charSequence, String str, int i10, boolean z10) {
        qe.k.f(charSequence, "<this>");
        qe.k.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i10);
        }
        return L(charSequence, str, i10, 0, z10, true);
    }

    public static /* synthetic */ int S(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = I(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Q(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = I(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return R(charSequence, str, i10, z10);
    }

    public static final int U(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int d10;
        char w10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            w10 = fe.l.w(cArr);
            return ((String) charSequence).lastIndexOf(w10, i10);
        }
        for (d10 = se.f.d(i10, I(charSequence)); -1 < d10; d10--) {
            char charAt = charSequence.charAt(d10);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (ve.c.d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return d10;
            }
        }
        return -1;
    }

    public static final ue.d<String> V(CharSequence charSequence) {
        qe.k.f(charSequence, "<this>");
        return l0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> W(CharSequence charSequence) {
        List<String> j10;
        qe.k.f(charSequence, "<this>");
        j10 = ue.j.j(V(charSequence));
        return j10;
    }

    private static final ue.d<se.c> X(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        g0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final ue.d<se.c> Y(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List b10;
        g0(i11);
        b10 = fe.k.b(strArr);
        return new e(charSequence, i10, i11, new b(b10, z10));
    }

    static /* synthetic */ ue.d Z(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return X(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ ue.d a0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return Y(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean b0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        qe.k.f(charSequence, "<this>");
        qe.k.f(charSequence2, InneractiveMediationNameConsts.OTHER);
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!ve.c.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String c0(String str, CharSequence charSequence) {
        qe.k.f(str, "<this>");
        qe.k.f(charSequence, "prefix");
        if (n0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            qe.k.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static String d0(String str, CharSequence charSequence) {
        qe.k.f(str, "<this>");
        qe.k.f(charSequence, "suffix");
        if (F(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String e0(String str, CharSequence charSequence) {
        qe.k.f(str, "<this>");
        qe.k.f(charSequence, "delimiter");
        return f0(str, charSequence, charSequence);
    }

    public static final String f0(String str, CharSequence charSequence, CharSequence charSequence2) {
        qe.k.f(str, "<this>");
        qe.k.f(charSequence, "prefix");
        qe.k.f(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length() && n0(str, charSequence, false, 2, null) && F(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final void g0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> h0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        Iterable<se.c> c10;
        int p10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return i0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        c10 = ue.j.c(Z(charSequence, cArr, 0, z10, i10, 2, null));
        p10 = fe.q.p(c10, 10);
        ArrayList arrayList = new ArrayList(p10);
        for (se.c cVar : c10) {
            arrayList.add(o0(charSequence, cVar));
        }
        return arrayList;
    }

    private static final List<String> i0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> d10;
        g0(i10);
        int i11 = 0;
        int K = K(charSequence, str, 0, z10);
        if (K != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            ArrayList arrayList = new ArrayList(z11 ? se.f.d(i10, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i11, K).toString());
                i11 = str.length() + K;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                K = K(charSequence, str, i11, z10);
            } while (K != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        d10 = fe.o.d(charSequence.toString());
        return d10;
    }

    public static /* synthetic */ List j0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h0(charSequence, cArr, z10, i10);
    }

    public static final ue.d<String> k0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        ue.d<String> h10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(strArr, "delimiters");
        h10 = ue.j.h(a0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
        return h10;
    }

    public static /* synthetic */ ue.d l0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return k0(charSequence, strArr, z10, i10);
    }

    public static final boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean y10;
        qe.k.f(charSequence, "<this>");
        qe.k.f(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            y10 = p.y((String) charSequence, (String) charSequence2, false, 2, null);
            return y10;
        }
        return b0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean n0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m0(charSequence, charSequence2, z10);
    }

    public static final String o0(CharSequence charSequence, se.c cVar) {
        qe.k.f(charSequence, "<this>");
        qe.k.f(cVar, "range");
        return charSequence.subSequence(cVar.l().intValue(), cVar.k().intValue() + 1).toString();
    }

    public static final String p0(String str, String str2, String str3) {
        int O;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "delimiter");
        qe.k.f(str3, "missingDelimiterValue");
        O = O(str, str2, 0, false, 6, null);
        if (O == -1) {
            return str3;
        }
        String substring = str.substring(O + str2.length(), str.length());
        qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String q0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return p0(str, str2, str3);
    }

    public static final String r0(String str, char c10, String str2) {
        int S;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "missingDelimiterValue");
        S = S(str, c10, 0, false, 6, null);
        if (S == -1) {
            return str2;
        }
        String substring = str.substring(S + 1, str.length());
        qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String s0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return r0(str, c10, str2);
    }

    public static final String t0(String str, char c10, String str2) {
        int N;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "missingDelimiterValue");
        N = N(str, c10, 0, false, 6, null);
        if (N == -1) {
            return str2;
        }
        String substring = str.substring(0, N);
        qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String u0(String str, String str2, String str3) {
        int O;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "delimiter");
        qe.k.f(str3, "missingDelimiterValue");
        O = O(str, str2, 0, false, 6, null);
        if (O == -1) {
            return str3;
        }
        String substring = str.substring(0, O);
        qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String v0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return t0(str, c10, str2);
    }

    public static /* synthetic */ String w0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return u0(str, str2, str3);
    }

    public static CharSequence x0(CharSequence charSequence) {
        qe.k.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = ve.b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
