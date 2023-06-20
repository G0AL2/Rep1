package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1639d5 extends L8 {
    public static byte[] A03;
    public final /* synthetic */ C1673dd A00;
    public final /* synthetic */ C06071q A01;
    public final /* synthetic */ FQ A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C1639d5(FQ fq, C06071q c06071q, C1673dd c1673dd) {
        this.A02 = fq;
        this.A01 = c06071q;
        this.A00 = c1673dd;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAi(new KH(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
