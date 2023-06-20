package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class U9 extends AbstractRunnableC1065Kv {
    public final /* synthetic */ BH A00;
    public final /* synthetic */ KH A01;

    public U9(BH bh, KH kh) {
        this.A00 = bh;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1065Kv
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, C1073Ld.A00(this.A01));
    }
}
