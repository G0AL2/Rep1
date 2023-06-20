package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1239Rp extends L8 {
    public final /* synthetic */ C1195Px A00;

    public C1239Rp(C1195Px c1195Px) {
        this.A00 = c1195Px;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        QK qk;
        N3 n32;
        AbstractC1093Lz abstractC1093Lz;
        N6 n62;
        qk = this.A00.A02;
        C07849b<AbstractC07859c, C07839a> eventBus = qk.getEventBus();
        n32 = this.A00.A04;
        abstractC1093Lz = this.A00.A05;
        n62 = this.A00.A03;
        eventBus.A04(n32, abstractC1093Lz, n62);
    }
}
