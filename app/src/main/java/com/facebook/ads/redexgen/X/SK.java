package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SK extends L8 {
    public static byte[] A02;
    public final /* synthetic */ C8N A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public SK(C8N c8n, AnonymousClass84 anonymousClass84) {
        this.A00 = c8n;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        QK qk;
        QK qk2;
        qk = this.A00.A0B;
        if (qk.getState() == EnumC1217Qt.A02) {
            qk2 = this.A00.A0B;
            if (qk2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
