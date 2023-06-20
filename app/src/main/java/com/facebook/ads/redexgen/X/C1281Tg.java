package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1281Tg implements AnonymousClass57 {
    public final /* synthetic */ C1278Td A00;

    public C1281Tg(C1278Td c1278Td) {
        this.A00 = c1278Td;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8M() {
        TE te2;
        TE te3;
        te2 = this.A00.A0B;
        if (te2.canGoBack()) {
            te3 = this.A00.A0B;
            te3.goBack();
            return true;
        }
        return false;
    }
}
