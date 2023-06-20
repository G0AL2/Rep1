package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class WR implements InterfaceC0867Cl {
    public final /* synthetic */ WQ A00;

    public WR(WQ wq) {
        this.A00 = wq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        DY dy;
        long j10;
        dy = this.A00.A0B;
        j10 = this.A00.A07;
        return dy.A03(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long granule) {
        DY dy;
        long j10;
        long A00;
        long j11;
        if (granule == 0) {
            j11 = this.A00.A09;
            return new C0866Ck(new C0868Cm(0L, j11));
        }
        dy = this.A00.A0B;
        long A04 = dy.A04(granule);
        WQ wq = this.A00;
        j10 = wq.A09;
        A00 = wq.A00(j10, A04, 30000L);
        return new C0866Ck(new C0868Cm(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return true;
    }
}
