package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UL extends AbstractC05790o {
    public static byte[] A01;
    public final /* synthetic */ UB A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UL(UB ub2) {
        this.A00 = ub2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0B(C1670da c1670da) {
        this.A00.A1T(c1670da);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0C() {
        UA ua2;
        UA ua3;
        ua2 = this.A00.A0G;
        if (ua2 != null) {
            ua3 = this.A00.A0G;
            ua3.A9s();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0F(InterfaceC05780n interfaceC05780n) {
        FO fo;
        FO fo2;
        fo = this.A00.A0A;
        if (fo != null) {
            fo2 = this.A00.A0A;
            fo2.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0G(KH kh) {
        long j10;
        UA ua2;
        UA ua3;
        C0R A0D = this.A00.A11().A0D();
        j10 = this.A00.A00;
        A0D.A2a(MJ.A01(j10), kh.A03().getErrorCode(), kh.A04());
        ua2 = this.A00.A0G;
        if (ua2 != null) {
            ua3 = this.A00.A0G;
            ua3.AAi(kh);
        }
    }
}
