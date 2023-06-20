package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1172Pa {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1B A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, 12, 10, 27, 13, 18, 23, 13};
    }

    public C1172Pa(int i10, int i11, C1B c1b) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = c1b;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1B A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A01);
        String A00 = A00(0, 0, 12);
        sb2.append(A00);
        hashMap.put(A00(7, 7, 94), sb2.toString());
        hashMap.put(A00(0, 7, 55), this.A00 + A00);
        return hashMap;
    }
}
