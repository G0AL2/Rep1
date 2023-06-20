package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XB implements InterfaceC0840Bh {
    public final X5 A00 = new X5();
    public final X4 A01 = new X4();
    public final BL[] A02;

    public XB(BL... blArr) {
        this.A02 = (BL[]) Arrays.copyOf(blArr, blArr.length + 2);
        BL[] blArr2 = this.A02;
        blArr2[blArr.length] = this.A00;
        blArr2[blArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0840Bh
    public final C0815Ah A3Q(C0815Ah c0815Ah) {
        this.A00.A0B(c0815Ah.A02);
        return new C0815Ah(this.A01.A01(c0815Ah.A01), this.A01.A00(c0815Ah.A00), c0815Ah.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0840Bh
    public final BL[] A5l() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0840Bh
    public final long A6y(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0840Bh
    public final long A7V() {
        return this.A00.A0A();
    }
}
