package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.60  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass60 {
    public static byte[] A06;
    public int A00;
    public long A01;
    public long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-83, -112};
    }

    public final synchronized String toString() {
        return this.A05 + A00(1, 1, 70) + this.A04 + this.A03 + A00(0, 1, 113) + this.A00 + A00(0, 1, 113) + this.A01 + A00(0, 1, 113) + this.A02;
    }
}
