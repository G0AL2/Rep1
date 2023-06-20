package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BV extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 15, 3, 124, 112, 19, 63, 62, 54, 57, 55, 120, 110, 90, 75, 70, 64, 123, 93, 78, 76, 68, 15, 70, 65, 70, 91, 15, 73, 78, 70, 67, 74, 75, 21, 15};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BV(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 12
            r1 = 24
            r0 = 79
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
            r3.append(r5)
            r2 = 3
            r1 = 9
            r0 = 48
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
            r3.append(r6)
            r2 = 1
            r1 = 2
            r0 = 67
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
            r3.append(r7)
            r3.append(r0)
            r3.append(r8)
            r2 = 0
            r1 = 1
            r0 = 96
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BV.<init>(int, int, int, int):void");
    }
}
