package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SY extends L8 {
    public static byte[] A02;
    public final /* synthetic */ P2 A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public SY(P2 p22, AnonymousClass84 anonymousClass84) {
        this.A00 = p22;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        QK qk;
        QK qk2;
        qk = this.A00.A0D;
        if (qk.getState() == EnumC1217Qt.A02) {
            qk2 = this.A00.A0D;
            if (qk2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
