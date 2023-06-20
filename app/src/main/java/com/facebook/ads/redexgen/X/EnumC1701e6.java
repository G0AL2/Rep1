package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.e6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1701e6 {
    A02,
    A05,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, 113, 106, 124, 100, 110, 21, 25, 1, 26, 29, 116, Byte.MAX_VALUE, 108, Byte.MAX_VALUE, 104, 116, 111, 106, 111, 110, 118, 111};
    }

    static {
        A01();
    }
}
