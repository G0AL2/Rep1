package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Im  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1007Im extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33, 45, 101, 100, 106, 101, 104, 126, 121, 48, 61, 31, 4, 2, 31, 4, 25, 20, 77, 25, 2, 2, 77, 1, 2, 26, 77, 54, 29, 31, 4, 2, 31, 4, 25, 20, 80, 65};
    }

    public C1007Im(int i10, int i11) {
        super(A00(10, 27, 94) + i10 + A00(0, 10, 62) + i11 + A00(37, 1, 47));
    }
}
