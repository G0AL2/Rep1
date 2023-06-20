package com.facebook.hermes.intl;

import com.facebook.hermes.intl.f;
import com.facebook.hermes.intl.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/* compiled from: LocaleIdentifier.java */
/* loaded from: classes.dex */
public class g {
    private static void a(String str, n.a aVar) throws i5.d {
        ArrayList<String> arrayList = aVar.f14743d;
        if (arrayList != null) {
            int binarySearch = Collections.binarySearch(arrayList, str);
            if (binarySearch < 0) {
                aVar.f14743d.add((binarySearch * (-1)) - 1, str);
                return;
            }
            throw new i5.d("Duplicate variant");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        aVar.f14743d = arrayList2;
        arrayList2.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) throws i5.d {
        return i.b(str).g();
    }

    static boolean c(CharSequence charSequence, f fVar, f.a aVar, boolean z10, n nVar) throws i5.d, f.b {
        if (z10 && aVar.d()) {
            j(charSequence, fVar, aVar, nVar);
            return true;
        } else if (aVar.a()) {
            if (!z10) {
                d(charSequence, aVar, fVar, nVar);
                return true;
            }
            throw new i5.d(String.format("Extension singletons in transformed extension language tag: %s", charSequence));
        } else {
            return false;
        }
    }

    static void d(CharSequence charSequence, f.a aVar, f fVar, n nVar) throws i5.d, f.b {
        if (fVar.a()) {
            char charAt = aVar.toString().charAt(0);
            if (charAt == 'u') {
                l(charSequence, fVar, nVar);
                return;
            } else if (charAt == 't') {
                k(charSequence, fVar, nVar);
                return;
            } else if (charAt == 'x') {
                i(charSequence, fVar, nVar);
                return;
            } else {
                h(charSequence, fVar, nVar, charAt);
                return;
            }
        }
        throw new i5.d("Extension sequence expected.");
    }

    static void e(CharSequence charSequence, f fVar, f.a aVar, boolean z10, n nVar) throws i5.d, f.b {
        n.a aVar2 = new n.a();
        if (z10) {
            nVar.f14736d = aVar2;
        } else {
            nVar.f14733a = aVar2;
        }
        try {
            if (aVar.i()) {
                aVar2.f14740a = aVar.m();
                if (fVar.a()) {
                    f.a c10 = fVar.c();
                    if (c(charSequence, fVar, c10, z10, nVar)) {
                        return;
                    }
                    if (c10.k()) {
                        aVar2.f14741b = c10.n();
                        if (!fVar.a()) {
                            return;
                        }
                        c10 = fVar.c();
                    }
                    if (c10.j()) {
                        aVar2.f14742c = c10.o();
                        if (!fVar.a()) {
                            return;
                        }
                        c10 = fVar.c();
                    }
                    while (!c(charSequence, fVar, c10, z10, nVar)) {
                        if (c10.l()) {
                            a(c10.toString(), aVar2);
                            if (!fVar.a()) {
                                return;
                            }
                            c10 = fVar.c();
                        } else {
                            throw new i5.d(String.format("Unknown token [%s] found in locale id: %s", c10.toString(), charSequence));
                        }
                    }
                    return;
                }
                return;
            }
            throw new i5.d(String.format("Language subtag expected at %s: %s", aVar.toString(), charSequence));
        } catch (f.b unused) {
            throw new i5.d(String.format("Locale Identifier subtag iteration failed: %s", charSequence));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n f(String str) throws i5.d {
        int binarySearch;
        String[] strArr = e.f14698a;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = e.f14699b[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return g(lowerCase, new f(lowerCase));
    }

    static n g(String str, f fVar) throws i5.d {
        n nVar = new n();
        try {
            if (fVar.a()) {
                e(str, fVar, fVar.c(), false, nVar);
                return nVar;
            }
            throw new i5.d(String.format("Language subtag not found: %s", str));
        } catch (f.b unused) {
            throw new i5.d(String.format("Locale Identifier subtag iteration failed: %s", str));
        }
    }

    static void h(CharSequence charSequence, f fVar, n nVar, char c10) throws i5.d, f.b {
        if (fVar.a()) {
            f.a c11 = fVar.c();
            if (nVar.f14738f == null) {
                nVar.f14738f = new TreeMap<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            nVar.f14738f.put(new Character(c10), arrayList);
            while (c11.b()) {
                arrayList.add(c11.toString());
                if (!fVar.a()) {
                    return;
                }
                c11 = fVar.c();
            }
            if (c11.a()) {
                d(charSequence, c11, fVar, nVar);
                return;
            }
            throw new i5.d("Malformed sequence expected.");
        }
        throw new i5.d("Extension sequence expected.");
    }

    static void i(CharSequence charSequence, f fVar, n nVar) throws i5.d, f.b {
        if (fVar.a()) {
            f.a c10 = fVar.c();
            if (nVar.f14739g == null) {
                nVar.f14739g = new ArrayList<>();
            }
            while (c10.c()) {
                nVar.f14739g.add(c10.toString());
                if (!fVar.a()) {
                    return;
                }
                c10 = fVar.c();
            }
            throw new i5.d("Tokens are not expected after pu extension.");
        }
        throw new i5.d("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(java.lang.CharSequence r4, com.facebook.hermes.intl.f r5, com.facebook.hermes.intl.f.a r6, com.facebook.hermes.intl.n r7) throws i5.d, com.facebook.hermes.intl.f.b {
        /*
            boolean r0 = r6.d()
            if (r0 == 0) goto L6d
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r7.f14737e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5d
            if (r0 != 0) goto L15
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r7.f14737e = r0
        L15:
            java.lang.String r6 = r6.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = r7.f14737e
            r3.put(r6, r0)
            boolean r6 = r5.a()
            if (r6 == 0) goto L4d
            com.facebook.hermes.intl.f$a r6 = r5.c()
        L2d:
            boolean r3 = r6.e()
            if (r3 == 0) goto L46
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            boolean r6 = r5.a()
            if (r6 != 0) goto L41
            return
        L41:
            com.facebook.hermes.intl.f$a r6 = r5.c()
            goto L2d
        L46:
            boolean r0 = r6.d()
            if (r0 != 0) goto L15
            goto L6d
        L4d:
            i5.d r5 = new i5.d
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Malformated transformed key in : %s"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L5d:
            i5.d r5 = new i5.d
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Duplicate transformed extension sequence in [%s]"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L6d:
            boolean r0 = r6.a()
            if (r0 == 0) goto L77
            d(r4, r6, r5, r7)
            return
        L77:
            i5.d r4 = new i5.d
            java.lang.String r5 = "Malformed extension sequence."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.g.j(java.lang.CharSequence, com.facebook.hermes.intl.f, com.facebook.hermes.intl.f$a, com.facebook.hermes.intl.n):void");
    }

    static void k(CharSequence charSequence, f fVar, n nVar) throws i5.d, f.b {
        if (fVar.a()) {
            f.a c10 = fVar.c();
            if (c10.i()) {
                e(charSequence, fVar, c10, true, nVar);
                return;
            } else if (c10.d()) {
                j(charSequence, fVar, c10, nVar);
                return;
            } else {
                throw new i5.d(String.format("Unexpected token [%s] in transformed extension sequence [%s]", c10.toString(), charSequence));
            }
        }
        throw new i5.d("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void l(java.lang.CharSequence r3, com.facebook.hermes.intl.f r4, com.facebook.hermes.intl.n r5) throws i5.d, com.facebook.hermes.intl.f.b {
        /*
            boolean r0 = r4.a()
            if (r0 == 0) goto La5
            com.facebook.hermes.intl.f$a r0 = r4.c()
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f14734b
            if (r1 != 0) goto L93
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f14735c
            if (r1 != 0) goto L93
        L12:
            boolean r1 = r0.f()
            if (r1 == 0) goto L38
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f14734b
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f14734b = r1
        L23:
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f14734b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.a()
            if (r0 != 0) goto L33
            return
        L33:
            com.facebook.hermes.intl.f$a r0 = r4.c()
            goto L12
        L38:
            boolean r1 = r0.g()
            if (r1 == 0) goto L81
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f14735c
            if (r1 != 0) goto L49
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r5.f14735c = r1
        L49:
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r2 = r5.f14735c
            r2.put(r0, r1)
            boolean r0 = r4.a()
            if (r0 != 0) goto L5e
            return
        L5e:
            com.facebook.hermes.intl.f$a r0 = r4.c()
        L62:
            boolean r2 = r0.h()
            if (r2 == 0) goto L7b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.a()
            if (r0 != 0) goto L76
            return
        L76:
            com.facebook.hermes.intl.f$a r0 = r4.c()
            goto L62
        L7b:
            boolean r1 = r0.g()
            if (r1 != 0) goto L49
        L81:
            boolean r1 = r0.a()
            if (r1 == 0) goto L8b
            d(r3, r0, r4, r5)
            return
        L8b:
            i5.d r3 = new i5.d
            java.lang.String r4 = "Malformed sequence expected."
            r3.<init>(r4)
            throw r3
        L93:
            i5.d r4 = new i5.d
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            java.lang.String r3 = "Duplicate unicode extension sequence in [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
        La5:
            i5.d r3 = new i5.d
            java.lang.String r4 = "Extension sequence expected."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.g.l(java.lang.CharSequence, com.facebook.hermes.intl.f, com.facebook.hermes.intl.n):void");
    }

    public static void m(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (e.f14700c == null) {
            return;
        }
        if (stringBuffer.length() == 2) {
            strArr = e.f14700c;
            strArr2 = e.f14701d;
            strArr3 = e.f14704g;
            strArr4 = e.f14705h;
            strArr5 = e.f14706i;
            strArr6 = e.f14707j;
        } else {
            strArr = e.f14702e;
            strArr2 = e.f14703f;
            strArr3 = e.f14708k;
            strArr4 = e.f14709l;
            strArr5 = e.f14710m;
            strArr6 = e.f14711n;
        }
        int binarySearch = Arrays.binarySearch(strArr, stringBuffer.toString());
        if (binarySearch >= 0) {
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(strArr2[binarySearch]);
            return;
        }
        int binarySearch2 = Arrays.binarySearch(strArr3, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            String str = strArr4[binarySearch2];
            String str2 = strArr5[binarySearch2];
            String str3 = strArr6[binarySearch2];
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(str);
            if (stringBuffer2.length() == 0 && str2 != null) {
                stringBuffer2.append(str2);
            }
            if (stringBuffer3.length() != 0 || str3 == null) {
                return;
            }
            stringBuffer3.append(str3);
        }
    }

    public static String n(StringBuffer stringBuffer) {
        if (e.f14712o == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(e.f14712o, stringBuffer.toString());
            if (binarySearch >= 0) {
                return e.f14713p[binarySearch];
            }
            return stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(e.f14714q, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            return e.f14715r[binarySearch2];
        }
        return stringBuffer.toString();
    }
}
