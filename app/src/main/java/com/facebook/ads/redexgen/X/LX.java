package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LX extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-44, -4, -4, -12, -7, -14, -83, -35, -7, -18, 6, -83, -10, 0, -83, -5, -4, 1, -83, -10, -5, 0, 1, -18, -7, -7, -14, -15};
    }

    public LX() {
        super(A00(0, 28, 37));
    }
}
