package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AN extends AbstractC1093Lz {
    public static byte[] A01;
    public final /* synthetic */ TM A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public AN(TM tm) {
        this.A00 = tm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A02 */
    public final void A03(AnonymousClass85 anonymousClass85) {
        InterfaceC1110Mq interfaceC1110Mq;
        interfaceC1110Mq = this.A00.A05;
        interfaceC1110Mq.A3t(A00(0, 21, 1), anonymousClass85);
    }
}
