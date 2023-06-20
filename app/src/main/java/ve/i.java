package ve;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
/* loaded from: classes3.dex */
public class i extends h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends qe.l implements pe.l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38094a = new a();

        a() {
            super(1);
        }

        @Override // pe.l
        /* renamed from: a */
        public final String b(String str) {
            qe.k.f(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends qe.l implements pe.l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f38095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f38095a = str;
        }

        @Override // pe.l
        /* renamed from: a */
        public final String b(String str) {
            qe.k.f(str, "line");
            return this.f38095a + str;
        }
    }

    private static final pe.l<String, String> b(String str) {
        return str.length() == 0 ? a.f38094a : new b(str);
    }

    public static final String c(String str, String str2, String str3) {
        int i10;
        String b10;
        qe.k.f(str, "<this>");
        qe.k.f(str2, "newIndent");
        qe.k.f(str3, "marginPrefix");
        if (!g.n(str3)) {
            List<String> W = q.W(str);
            int length = str.length() + (str2.length() * W.size());
            pe.l<String, String> b11 = b(str2);
            int i11 = fe.n.i(W);
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : W) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    fe.n.o();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i12 == 0 || i12 == i11) && g.n(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!ve.b.c(str4.charAt(i14))) {
                            i10 = i14;
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i10 != -1) {
                        int i15 = i10;
                        if (g.x(str4, str3, i10, false, 4, null)) {
                            qe.k.d(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i15 + str3.length());
                            qe.k.e(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (b10 = b11.b(str5)) != null) {
                        str4 = b10;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i12 = i13;
            }
            String sb2 = ((StringBuilder) fe.n.A(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            qe.k.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String d(String str, String str2) {
        qe.k.f(str, "<this>");
        qe.k.f(str2, "marginPrefix");
        return c(str, "", str2);
    }

    public static /* synthetic */ String e(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return d(str, str2);
    }
}
