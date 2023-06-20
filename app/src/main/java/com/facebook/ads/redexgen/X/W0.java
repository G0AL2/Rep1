package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class W0 implements InterfaceC0894Dx {
    public static String[] A06 = {"kFQyFzcAtW9h", "T9w", "fQaNjl3SJX3d9bVQ", "oZJ95vdSt2TTHBWCj0JXn5a7ndpZ8Bju", "u9yp8kydrxa7", "6VdIrZzllDHdfU7GHzHok5zrzcn9yZKG", "C5", "TRfT7Vv0"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC0887Dq A04;
    public final C1004Ij A05 = new C1004Ij(32);

    public W0(InterfaceC0887Dq interfaceC0887Dq) {
        this.A04 = interfaceC0887Dq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0894Dx
    public final void A49(C1004Ij c1004Ij, boolean z10) {
        int i10 = -1;
        if (z10) {
            i10 = c1004Ij.A06() + c1004Ij.A0E();
        }
        boolean z11 = this.A03;
        if (A06[1].length() == 27) {
            throw new RuntimeException();
        }
        A06[7] = "Nc9T8xtu";
        if (z11) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c1004Ij.A0Y(i10);
            this.A00 = 0;
        }
        while (c1004Ij.A04() > 0) {
            int i11 = this.A00;
            if (i11 < 3) {
                if (i11 == 0) {
                    int A0E = c1004Ij.A0E();
                    c1004Ij.A0Y(c1004Ij.A06() - 1);
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[2] = "aJNwIS78aN3JetqFlJ8G";
                    if (A0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int min = Math.min(c1004Ij.A04(), 3 - this.A00);
                c1004Ij.A0c(this.A05.A00, this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int A0E2 = this.A05.A0E();
                    int A0E3 = this.A05.A0E();
                    this.A02 = (A0E2 & 128) != 0;
                    this.A01 = (((A0E2 & 15) << 8) | A0E3) + 3;
                    if (this.A05.A05() < this.A01) {
                        byte[] bytes = this.A05.A00;
                        this.A05.A0W(Math.min(4098, Math.max(this.A01, bytes.length * 2)));
                        System.arraycopy(bytes, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(c1004Ij.A04(), this.A01 - this.A00);
                c1004Ij.A0c(this.A05.A00, this.A00, min2);
                this.A00 += min2;
                int i12 = this.A00;
                int i13 = this.A01;
                if (i12 == i13) {
                    boolean z12 = this.A02;
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[1] = "WscUDiyP9zB";
                    if (z12) {
                        if (C1020Iz.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        C1004Ij c1004Ij2 = this.A05;
                        if (A06[2].length() != 29) {
                            String[] strArr = A06;
                            strArr[3] = "nNiCCranccCPI0NRpeExr6ylwZyZykwG";
                            strArr[5] = "pfAdcnCCuWORkUPhfNuwqkYYK2fT2IOL";
                            c1004Ij2.A0W(i13);
                        } else {
                            A06[2] = "0kjAgxStX";
                            c1004Ij2.A0W(i13);
                        }
                    }
                    this.A04.A48(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0894Dx
    public final void A8K(C1016Iv c1016Iv, InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        this.A04.A8K(c1016Iv, interfaceC0862Ce, c0893Dw);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0894Dx
    public final void AEK() {
        this.A03 = true;
    }
}
