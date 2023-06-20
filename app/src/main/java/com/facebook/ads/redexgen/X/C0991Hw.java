package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0991Hw extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -105, -47, -22, -31, -12, -20, -31, -33, -16, -31, -32, -100};
    }

    public C0991Hw(Throwable th) {
        super(A00(2, 11, 78) + th.getClass().getSimpleName() + A00(0, 2, 73) + th.getMessage(), th);
    }
}
