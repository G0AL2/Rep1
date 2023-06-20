package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC0879Di {
    public static String[] A0B = {"Egp8wbctYg3AnrLoFsY0muWOBg0DV21X", "e5h8xZQ9y742", "HWojDw1vanmhl7F", "V39ipiog0D", "u2piqSS4vuQoaStDwbY0GoBR5fBlfuuM", "rfNh4mzWhxdgTcwc6CqJaoU4clFtHzcH", "1g0ZSxhEfC", "eBXSmpY9RuNSQ1O4XZ5t"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0870Co A07;
    public String A08;
    public final String A0A;
    public final C1004Ij A09 = new C1004Ij(new byte[18]);
    public int A02 = 0;

    public WB(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = C0844Bl.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5V(this.A06);
        }
        this.A01 = C0844Bl.A01(bArr);
        this.A04 = (int) ((C0844Bl.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(C1004Ij c1004Ij) {
        do {
            int A04 = c1004Ij.A04();
            String[] strArr = A0B;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "u2vG9yItOjfrtL1HZZufPW";
            if (A04 <= 0) {
                return false;
            }
            this.A03 <<= 8;
            this.A03 |= c1004Ij.A0E();
        } while (!C0844Bl.A07(this.A03));
        this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
        this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
        this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
        this.A09.A00[3] = (byte) (this.A03 & 255);
        this.A00 = 4;
        this.A03 = 0;
        return true;
    }

    private boolean A02(C1004Ij c1004Ij, byte[] bArr, int i10) {
        int min = Math.min(c1004Ij.A04(), i10 - this.A00);
        c1004Ij.A0c(bArr, this.A00, min);
        this.A00 += min;
        return this.A00 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) {
        while (c1004Ij.A04() > 0) {
            int i10 = this.A02;
            if (i10 != 0) {
                if (i10 == 1) {
                    byte[] bArr = this.A09.A00;
                    String[] strArr = A0B;
                    if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[7] = "fRWG3CzCM1nyuvAzq7jz";
                    strArr2[0] = "3KzD1A3zkNrKwQoZtzGyJPl8BSj940od";
                    if (A02(c1004Ij, bArr, 18)) {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AEG(this.A09, 18);
                        this.A02 = 2;
                    }
                } else if (i10 == 2) {
                    int min = Math.min(c1004Ij.A04(), this.A01 - this.A00);
                    this.A07.AEG(c1004Ij, min);
                    this.A00 += min;
                    int i11 = this.A00;
                    int i12 = this.A01;
                    if (i11 == i12) {
                        this.A07.AEH(this.A05, 1, i12, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A01(c1004Ij)) {
                this.A02 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A08 = c0893Dw.A04();
        this.A07 = interfaceC0862Ce.AFD(c0893Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
