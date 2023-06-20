package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P0 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C9E A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-44, -25, -30, -29, -19, -50, -22, -33, -9, -32, -33, -31, -23, -61, -16, -16, -19, -16};
    }

    public P0(C9E c9e) {
        this.A00 = c9e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 82));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
