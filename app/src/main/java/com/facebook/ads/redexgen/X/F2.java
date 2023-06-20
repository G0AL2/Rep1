package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class F2 extends AbstractC1079Lj {
    public final /* synthetic */ C5L A00;

    public F2(C5L c5l) {
        this.A00 = c5l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(C1092Ly c1092Ly) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            UB.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
