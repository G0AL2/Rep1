package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class WX implements D5 {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C1004Ij A04;

    public WX(WZ wz) {
        this.A04 = wz.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & 255;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int A7J() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final boolean A8U() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int ADd() {
        int i10 = this.A02;
        if (i10 == 8) {
            return this.A04.A0E();
        }
        if (i10 == 16) {
            return this.A04.A0I();
        }
        int i11 = this.A01;
        this.A01 = i11 + 1;
        if (i11 % 2 == 0) {
            this.A00 = this.A04.A0E();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
