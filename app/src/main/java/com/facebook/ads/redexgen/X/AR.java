package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AR implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ E1 A00;
    public final /* synthetic */ C0826As A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-20, 31, 22, -9, 19, 8, 32, 12, 25, -16, 20, 23, 19, -16, 21, 27, 12, 25, 21, 8, 19, -30, -5, -14, 5, -3, -14, -16, 1, -14, -15, -83, -14, -1, -1, -4, -1, -83, -15, -14, -7, -10, 3, -14, -1, -10, -5, -12, -83, -6, -14, 0, 0, -18, -12, -14, -83, -4, -5, -83, -14, 5, 1, -14, -1, -5, -18, -7, -83, 1, -11, -1, -14, -18, -15, -69};
    }

    public AR(E1 e12, C0826As c0826As) {
        this.A00 = e12;
        this.A01 = c0826As;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A0X(this.A01);
            } catch (AM e10) {
                Log.e(A00(0, 21, 48), A00(21, 55, 22), e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable e11) {
            L0.A00(e11, this);
        }
    }
}
