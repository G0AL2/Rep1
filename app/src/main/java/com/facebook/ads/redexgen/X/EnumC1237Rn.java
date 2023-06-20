package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1237Rn {
    A03(A00(10, 4, 24)),
    A04(A00(14, 6, 108));
    
    public static byte[] A01;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -19, -16, -16, -70, -75, -87, -90, -71, -86, -35, -32, -29, -29, 64, 59, 47, 44, 63, 48};
    }

    static {
        A01();
    }

    EnumC1237Rn(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
