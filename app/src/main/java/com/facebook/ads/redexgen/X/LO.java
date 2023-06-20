package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class LO implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1400Xy A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public LO(C1400Xy c1400Xy) {
        this.A00 = c1400Xy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(0, 4, 88));
            anonymousClass90.A03(1);
            anonymousClass90.A04(1);
            anonymousClass90.A08(false);
            this.A00.A06().A8z(A00(4, 7, 112), C07828z.A1Y, anonymousClass90);
        } catch (Throwable otsl) {
            L0.A00(otsl, this);
        }
    }
}
