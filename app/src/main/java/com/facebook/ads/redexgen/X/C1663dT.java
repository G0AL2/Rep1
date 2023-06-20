package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1663dT extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C1662dS A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1663dT(C1662dS c1662dS) {
        this.A00 = c1662dS;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1400Xy c1400Xy;
        O6 o62;
        C1664dU c1664dU;
        c1400Xy = this.A00.A02;
        c1400Xy.A0D().AFY();
        o62 = this.A00.A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(0, 11, 35));
        c1664dU = this.A00.A00;
        sb2.append(c1664dU.A03());
        o62.loadUrl(sb2.toString());
    }
}
