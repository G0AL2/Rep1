package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Km  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1057Km {
    A04,
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-6, -3, 12, -95, -82, -82, -85, -82, -77, -84, -87, -84, -83, -75, -84};
    }

    static {
        A01();
    }
}
