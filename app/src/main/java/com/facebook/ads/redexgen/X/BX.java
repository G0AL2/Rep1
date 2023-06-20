package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BX extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 108, 125, 112, 118, 77, 107, 120, 122, 114, 57, 110, 107, 112, 109, 124, 57, Byte.MAX_VALUE, 120, 112, 117, 124, 125, 35, 57};
    }

    public BX(int i10) {
        super(A00(0, 25, 85) + i10);
        this.A00 = i10;
    }
}
