package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07879e {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static InterfaceC07899g A00(C1399Xx c1399Xx) {
        try {
            return new XO(c1399Xx);
        } catch (IOException e10) {
            c1399Xx.A06().A8y(A02(0, 15, 89), C07828z.A2J, new AnonymousClass90(e10));
            return new XR();
        }
    }

    public static E5 A01(C1399Xx c1399Xx) {
        return new E5(c1399Xx);
    }
}
