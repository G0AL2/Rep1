package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1263Sn extends L8 {
    public final /* synthetic */ C1262Sm A00;
    public final /* synthetic */ boolean A01;

    public C1263Sn(C1262Sm c1262Sm, boolean z10) {
        this.A00 = c1262Sm;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1155Oj c1155Oj;
        c1155Oj = this.A00.A0E;
        AbstractC1109Mp A08 = c1155Oj.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A05()) ? false : true);
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
