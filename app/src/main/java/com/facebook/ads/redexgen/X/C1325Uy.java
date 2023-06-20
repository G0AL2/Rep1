package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1325Uy extends C0983Ho {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 82, 68, 71, 88, 89, 68, 82, 23, 84, 88, 83, 82, 13, 23};
    }

    public C1325Uy(int i10, Map<String, List<String>> map, C0979Hi c0979Hi) {
        super(A00(0, 15, 69) + i10, c0979Hi, 1);
        this.A00 = i10;
        this.A01 = map;
    }
}
