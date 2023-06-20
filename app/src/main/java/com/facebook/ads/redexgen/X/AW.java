package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: assets/audience_network.dex */
public final class AW {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, -3, -3, -11, -68, -13, 6, -3, -68, -15, -3, 0, -13};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 125);
    }

    public static synchronized String A00() {
        String str;
        synchronized (AW.class) {
            str = A00;
        }
        return str;
    }
}
