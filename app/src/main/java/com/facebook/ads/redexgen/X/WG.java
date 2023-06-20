package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class WG implements InterfaceC0879Di {
    public static String[] A0C = {"nJiMpwDCR7ZAmhQyp9AOHiC56UVcRx0k", "lCnqxh0y89Em7p481QheNATB6nErTPja", "EOgZonHCFyaPw1rQOdlgFposS9KMweND", "oVFhsCJtzutno5RzvIOwcHRYGNjJYB0M", "4", "S", "C7ZxqwSPJTae6vgKBRSPBAMVUD", "Gg5xSTo0LtnMpcaC7QBiBySoh1"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC0870Co A06;
    public String A07;
    public boolean A08;
    public final C1003Ii A09;
    public final C1004Ij A0A;
    public final String A0B;

    public WG() {
        this(null);
    }

    public WG(String str) {
        this.A09 = new C1003Ii(new byte[128]);
        this.A0A = new C1004Ij(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r1.A05 == r13.A05.A0O) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.Ii r1 = r13.A09
            r0 = 0
            r1.A07(r0)
            com.facebook.ads.redexgen.X.Ii r0 = r13.A09
            com.facebook.ads.redexgen.X.B9 r1 = com.facebook.ads.redexgen.X.BA.A09(r0)
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            if (r0 == 0) goto L47
            int r2 = r1.A00
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            int r0 = r0.A05
            if (r2 != r0) goto L47
            int r5 = r1.A03
            com.facebook.ads.internal.exoplayer2.Format r4 = r13.A05
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.WG.A0C
            r0 = 5
            r2 = r3[r0]
            r0 = 4
            r0 = r3[r0]
            int r2 = r2.length()
            int r0 = r0.length()
            if (r2 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.WG.A0C
            java.lang.String r2 = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq"
            r0 = 2
            r3[r0] = r2
            int r0 = r4.A0C
            if (r5 != r0) goto L47
            java.lang.String r2 = r1.A05
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            java.lang.String r0 = r0.A0O
            if (r2 == r0) goto L64
        L47:
            java.lang.String r2 = r13.A07
            java.lang.String r3 = r1.A05
            r4 = 0
            r5 = -1
            r6 = -1
            int r7 = r1.A00
            int r8 = r1.A03
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = r13.A0B
            com.facebook.ads.internal.exoplayer2.Format r0 = com.facebook.ads.internal.exoplayer2.Format.A07(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A05 = r0
            com.facebook.ads.redexgen.X.Co r2 = r13.A06
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            r2.A5V(r0)
        L64:
            int r0 = r1.A01
            r13.A01 = r0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r1.A02
            long r2 = (long) r0
            long r2 = r2 * r4
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            int r0 = r0.A0C
            long r0 = (long) r0
            long r2 = r2 / r0
            r13.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WG.A00():void");
    }

    private boolean A01(C1004Ij c1004Ij) {
        while (true) {
            if (c1004Ij.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c1004Ij.A0E() == 11;
            } else {
                int A0E = c1004Ij.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
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
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c1004Ij.A04(), this.A01 - this.A00);
                        this.A06.AEG(c1004Ij, min);
                        this.A00 += min;
                        int i11 = this.A00;
                        int i12 = this.A01;
                        if (i11 == i12) {
                            this.A06.AEH(this.A04, 1, i12, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    }
                } else if (A02(c1004Ij, this.A0A.A00, 128)) {
                    A00();
                    this.A0A.A0Y(0);
                    this.A06.AEG(this.A0A, 128);
                    this.A02 = 2;
                }
            } else if (A01(c1004Ij)) {
                this.A02 = 1;
                this.A0A.A00[0] = 11;
                this.A0A.A00[1] = 119;
                this.A00 = 2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A07 = c0893Dw.A04();
        this.A06 = interfaceC0862Ce.AFD(c0893Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A04 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
