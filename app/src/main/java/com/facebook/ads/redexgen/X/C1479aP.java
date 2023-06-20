package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1479aP implements InterfaceC07386v {
    public static byte[] A01;
    public final /* synthetic */ C1467aD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{64, 49, 47, 52, 58, 59, 56, 59, 51, 69};
    }

    public C1479aP(C1467aD c1467aD) {
        this.A00 = c1467aD;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A09(A00(0, 10, 77));
    }
}
