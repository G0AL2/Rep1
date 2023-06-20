package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC07416y {
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-53, -36, -53, -44, -38, -111, -106, -100, -115, -102, -98, -119, -108};
    }

    static {
        A01();
    }
}
