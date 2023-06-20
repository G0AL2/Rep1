package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class VZ implements InterfaceC0940Fv {
    public final int A00;
    public final /* synthetic */ CE A01;

    public VZ(CE ce2, int i10) {
        this.A01 = ce2;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0940Fv
    public final boolean A8c() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0940Fv
    public final void A9X() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0940Fv
    public final int ADa(AZ az, X2 x22, boolean z10) {
        return this.A01.A0P(this.A00, az, x22, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0940Fv
    public final int AEs(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
