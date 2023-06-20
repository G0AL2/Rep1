package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DM {
    public static byte[] A00;
    public static String[] A01 = {"3vAPqkZTJ1VSon", "QUTM7SdDWyFumvZa4ixbAFeRkcyJbQtu", "xie3JnTyZ8PkMdNBWExCsKsV5Mn", "WzqQT7JP0s6wyXASN6VfDx7AAKIr1zQR", "8xy", "R913nsbqijjrVtiNLSpVoV0rL8armwI", "xGv", "6Jbm"};
    public static final int[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 31, 74, 25, 123, 47, 122, 42, 111, 59, 57, 106, 17, 69, 69, 20, 58, 110, 121, 26, 78, 91, 31, 10, 94, 74, 15, 125, 4, 113, 16, 69, 60, 94, 40, 54, 79, 45, 43, 101, 123, 102, 126, 80, 71, 82, 0, 116, 38, 100, 50, 70, 75, 88, 31, 88, 70, 83, 1, 102, 124, 96, 61, 20, 14, 18, 78, 63, 37, 57, 98, 112, 106, 118, 44, 94, 68, 88, 1, 83, 73, 85, 87, 60, 51, 51, 62, 111, 114, 54, 51, 18, 15, 75, 77, 112, 117, 33, 33};
        if (A01[3].charAt(26) != 'I') {
            throw new RuntimeException();
        }
        A01[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
    }

    static {
        A01();
        A02 = new int[]{C1020Iz.A08(A00(79, 4, 5)), C1020Iz.A08(A00(59, 4, 48)), C1020Iz.A08(A00(63, 4, 66)), C1020Iz.A08(A00(67, 4, 105)), C1020Iz.A08(A00(71, 4, 38)), C1020Iz.A08(A00(75, 4, 8)), C1020Iz.A08(A00(43, 4, 14)), C1020Iz.A08(A00(55, 4, 15)), C1020Iz.A08(A00(51, 4, 17)), C1020Iz.A08(A00(87, 4, 61)), C1020Iz.A08(A00(91, 4, 64)), C1020Iz.A08(A00(0, 4, 71)), C1020Iz.A08(A00(4, 4, 119)), C1020Iz.A08(A00(19, 4, 22)), C1020Iz.A08(A00(23, 4, 6)), C1020Iz.A08(A00(8, 4, 99)), C1020Iz.A08(A00(12, 4, 29)), C1020Iz.A08(A00(31, 4, 55)), C1020Iz.A08(A00(27, 4, 15)), C1020Iz.A08(A00(47, 4, 45)), C1020Iz.A08(A00(83, 4, 104)), C1020Iz.A08(A00(35, 4, 68)), C1020Iz.A08(A00(95, 4, 62)), C1020Iz.A08(A00(39, 4, 23))};
    }

    public static boolean A02(int i10) {
        if ((i10 >>> 8) == C1020Iz.A08(A00(16, 3, 54))) {
            return true;
        }
        int[] iArr = A02;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A01[5] = "EPRlEFMBD24k0biyd";
        for (int compatibleBrand : iArr) {
            if (compatibleBrand == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return A05(interfaceC0861Cd, true);
    }

    public static boolean A04(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return A05(interfaceC0861Cd, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r13 = r13 - r17.A7F();
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (com.facebook.ads.redexgen.X.DM.A01[7].length() == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r4 = r13 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r4 = com.facebook.ads.redexgen.X.DM.A01;
        r4[6] = "BrR";
        r4[4] = "QIT";
        r4 = r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.ads.redexgen.X.InterfaceC0861Cd r17, boolean r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DM.A05(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }
}
