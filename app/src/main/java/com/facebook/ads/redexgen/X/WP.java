package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class WP implements DV, InterfaceC0867Cl {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ WO A04;

    public WP(WO wo) {
        this.A04 = wo;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(C1004Ij c1004Ij) {
        c1004Ij.A0Z(1);
        int A0G = c1004Ij.A0G() / 18;
        this.A02 = new long[A0G];
        this.A03 = new long[A0G];
        for (int i10 = 0; i10 < A0G; i10++) {
            this.A02[i10] = c1004Ij.A0L();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i10] = c1004Ij.A0L();
            c1004Ij.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final InterfaceC0867Cl A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        IW iw;
        iw = this.A04.A01;
        return iw.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long j10) {
        int A0B = C1020Iz.A0B(this.A02, this.A04.A04(j10), true, true);
        long seekTimeUs = this.A04.A03(this.A02[A0B]);
        C0868Cm c0868Cm = new C0868Cm(seekTimeUs, this.A00 + this.A03[A0B]);
        if (seekTimeUs < j10) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                long A03 = this.A04.A03(jArr[A0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new C0866Ck(c0868Cm, new C0868Cm(A03, secondSeekTimeUs + this.A03[A0B + 1]));
            }
        }
        return new C0866Ck(c0868Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long ADY(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        long j10 = this.A01;
        if (j10 >= 0) {
            long j11 = -(j10 + 2);
            this.A01 = -1L;
            return j11;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long AF1(long j10) {
        long A04 = this.A04.A04(j10);
        this.A01 = this.A02[C1020Iz.A0B(this.A02, A04, true, true)];
        return A04;
    }
}
