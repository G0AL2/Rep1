package com.facebook.soloader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: NativeDeps.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int f16547a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static final int f16548b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static final int f16549c = 3 + 3;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f16550d = false;

    /* renamed from: e  reason: collision with root package name */
    private static byte[] f16551e;

    /* renamed from: f  reason: collision with root package name */
    private static List<Integer> f16552f;

    /* renamed from: g  reason: collision with root package name */
    private static Map<Integer, List<Integer>> f16553g;

    public static String[] a(String str, f fVar) throws IOException {
        String[] g10;
        return (f16553g == null || (g10 = g(str)) == null) ? m.a(fVar) : g10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] b(int r6, int r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r6 + r7
            int r7 = com.facebook.soloader.n.f16549c
            int r6 = r6 - r7
            r7 = 0
            r1 = 0
            r2 = 0
        Lc:
            byte[] r3 = com.facebook.soloader.n.f16551e
            int r4 = r3.length
            r5 = 0
            if (r6 >= r4) goto L3e
            r3 = r3[r6]
            r4 = 10
            if (r3 == r4) goto L3e
            r4 = 32
            if (r3 != r4) goto L2b
            if (r2 == 0) goto L3a
            java.lang.String r1 = c(r1)
            if (r1 != 0) goto L25
            return r5
        L25:
            r0.add(r1)
            r1 = 0
            r2 = 0
            goto L3a
        L2b:
            r2 = 48
            if (r3 < r2) goto L3d
            r2 = 57
            if (r3 <= r2) goto L34
            goto L3d
        L34:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            r2 = 1
        L3a:
            int r6 = r6 + 1
            goto Lc
        L3d:
            return r5
        L3e:
            if (r2 == 0) goto L4a
            java.lang.String r6 = c(r1)
            if (r6 != 0) goto L47
            return r5
        L47:
            r0.add(r6)
        L4a:
            int r6 = r0.size()
            if (r6 != 0) goto L51
            return r5
        L51:
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.n.b(int, int):java.lang.String[]");
    }

    private static String c(int i10) {
        if (i10 >= f16552f.size()) {
            return null;
        }
        int intValue = f16552f.get(i10).intValue();
        int i11 = intValue;
        while (true) {
            byte[] bArr = f16551e;
            if (i11 >= bArr.length || bArr[i11] <= 32) {
                break;
            }
            i11++;
        }
        int i12 = (i11 - intValue) + f16549c;
        char[] cArr = new char[i12];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i13 = 0; i13 < i12 - f16549c; i13++) {
            cArr[f16547a + i13] = (char) f16551e[intValue + i13];
        }
        cArr[i12 - 3] = '.';
        cArr[i12 - 2] = 's';
        cArr[i12 - 1] = 'o';
        return new String(cArr);
    }

    private static int d(String str) {
        List<Integer> list = f16553g.get(Integer.valueOf(e(str)));
        if (list == null) {
            return -1;
        }
        for (Integer num : list) {
            int intValue = num.intValue();
            if (f(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    private static int e(String str) {
        int i10 = 5381;
        for (int i11 = f16547a; i11 < str.length() - f16548b; i11++) {
            i10 = str.codePointAt(i11) + (i10 << 5) + i10;
        }
        return i10;
    }

    private static boolean f(String str, int i10) {
        int i11;
        int i12 = f16547a;
        while (true) {
            int length = str.length();
            i11 = f16548b;
            if (i12 >= length - i11 || i10 >= f16551e.length || (str.codePointAt(i12) & 255) != f16551e[i10]) {
                break;
            }
            i12++;
            i10++;
        }
        return i12 == str.length() - i11;
    }

    static String[] g(String str) {
        int d10;
        if (f16550d && str.length() > f16549c && (d10 = d(str)) != -1) {
            return b(d10, str.length());
        }
        return null;
    }
}
