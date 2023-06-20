package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class WY implements D5 {
    public final int A00;
    public final int A01;
    public final C1004Ij A02;

    public WY(WZ wz) {
        this.A02 = wz.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int A7J() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final boolean A8U() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int ADd() {
        int i10 = this.A00;
        return i10 == 0 ? this.A02.A0H() : i10;
    }
}
