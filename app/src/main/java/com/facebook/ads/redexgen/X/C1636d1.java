package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.d1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1636d1 extends L8 {
    public final /* synthetic */ C1672dc A00;
    public final /* synthetic */ C06071q A01;
    public final /* synthetic */ FP A02;

    public C1636d1(FP fp, C06071q c06071q, C1672dc c1672dc) {
        this.A02 = fp;
        this.A01 = c06071q;
        this.A00 = c1672dc;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        KH A00 = KH.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
