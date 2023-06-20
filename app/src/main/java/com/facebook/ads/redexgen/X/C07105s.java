package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07105s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C07085q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C07085q A00() {
        C07085q c07085q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C07085q c07085q2 = c07085q;
            if (c07085q2 == null) {
                C07085q A002 = C07085q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c07085q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C07085q A01(com.facebook.ads.redexgen.X.C8U r5, com.facebook.ads.redexgen.X.C07085q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.X.C07155y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8y r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.X.C07828z.A1Q
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8y(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C07105s.A01(com.facebook.ads.redexgen.X.8U, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C07085q A02(C8U c8u, C07085q c07085q, C07095r c07095r) {
        C07115t c07115t = null;
        try {
            if (JQ.A06(c8u) && (c07085q == null || TextUtils.isEmpty(c07085q.A03()))) {
                c07115t = C07125u.A00(c8u.getContentResolver());
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C07828z.A1S, new AnonymousClass90(th));
        }
        if (c07115t != null && c07115t.A01 != null) {
            A03.set(c07115t.A01);
            c07095r.A05(c07115t.A01);
        }
        if (c07085q == null && c07115t != null && !TextUtils.isEmpty(c07115t.A00)) {
            return new C07085q(c07115t.A00, c07115t.A02, EnumC07075p.A05);
        }
        return c07085q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C07095r c07095r) {
        A02.set(c07095r.A02());
        A03.set(c07095r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C8U c8u) {
        long j10;
        C07085q upToDateAdInfo;
        try {
            C07095r c07095r = new C07095r(c8u);
            A06(c07095r);
            if (A08()) {
                return;
            }
            C07085q c07085q = A02.get();
            if (c07085q != null && !TextUtils.isEmpty(c07085q.A03())) {
                j10 = c07085q.A01();
            } else {
                j10 = -1;
            }
            if (j10 > 0 && System.currentTimeMillis() - j10 < JQ.A00(c8u)) {
                return;
            }
            if (JQ.A07(c8u)) {
                upToDateAdInfo = A01(c8u, A02(c8u, null, c07095r));
            } else {
                upToDateAdInfo = A02(c8u, A01(c8u, null), c07095r);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c07095r.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C07828z.A1R, new AnonymousClass90(th));
        }
    }

    public static boolean A08() {
        boolean updated = false;
        if (C1072Lc.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            if (C1072Lc.A05(A04)) {
                A03.set(C1072Lc.A01(A04));
                updated = true;
            }
        }
        boolean A042 = C1072Lc.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return updated;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return updated;
            }
        }
        String A043 = A04(19, 13, 79);
        if (C1072Lc.A05(A043)) {
            String A012 = C1072Lc.A01(A043);
            AtomicReference<C07085q> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C07085q(A012, false, EnumC07075p.A04));
            return true;
        }
        return updated;
    }
}
