package ye;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a */
    private final String f39780a;

    /* renamed from: b */
    private final String f39781b;

    /* renamed from: c */
    private final String[] f39782c;

    /* renamed from: f */
    public static final a f39779f = new a(null);

    /* renamed from: d */
    private static final Pattern f39777d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f39778e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: MediaType.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final x a(String str) {
            boolean y10;
            boolean k10;
            qe.k.f(str, "$this$toMediaType");
            Matcher matcher = x.f39777d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                qe.k.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                qe.k.e(locale, "Locale.US");
                Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = group.toLowerCase(locale);
                qe.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                qe.k.e(group2, "typeSubtype.group(2)");
                qe.k.e(locale, "Locale.US");
                Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = group2.toLowerCase(locale);
                qe.k.e(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = x.f39778e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else {
                                y10 = ve.p.y(group4, "'", false, 2, null);
                                if (y10) {
                                    k10 = ve.p.k(group4, "'", false, 2, null);
                                    if (k10 && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        qe.k.e(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                }
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        qe.k.e(substring, "(this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new x(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final x b(String str) {
            qe.k.f(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f39780a = str;
        this.f39781b = str2;
        this.f39782c = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x f(String str) {
        return f39779f.b(str);
    }

    public final Charset c(Charset charset) {
        String e10 = e("charset");
        if (e10 != null) {
            try {
                return Charset.forName(e10);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            qe.k.f(r6, r0)
            java.lang.String[] r0 = r5.f39782c
            se.c r0 = fe.h.q(r0)
            r1 = 2
            se.a r0 = se.d.h(r0, r1)
            int r1 = r0.e()
            int r2 = r0.f()
            int r0 = r0.g()
            if (r0 < 0) goto L21
            if (r1 > r2) goto L38
            goto L23
        L21:
            if (r1 < r2) goto L38
        L23:
            java.lang.String[] r3 = r5.f39782c
            r3 = r3[r1]
            r4 = 1
            boolean r3 = ve.g.l(r3, r6, r4)
            if (r3 == 0) goto L34
            java.lang.String[] r6 = r5.f39782c
            int r1 = r1 + r4
            r6 = r6[r1]
            return r6
        L34:
            if (r1 == r2) goto L38
            int r1 = r1 + r0
            goto L23
        L38:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.x.e(java.lang.String):java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && qe.k.a(((x) obj).f39780a, this.f39780a);
    }

    public final String g() {
        return this.f39781b;
    }

    public int hashCode() {
        return this.f39780a.hashCode();
    }

    public String toString() {
        return this.f39780a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, qe.g gVar) {
        this(str, str2, str3, strArr);
    }
}
