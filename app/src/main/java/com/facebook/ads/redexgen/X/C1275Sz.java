package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Sz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1275Sz extends L8 {
    public final /* synthetic */ OQ A00;

    public C1275Sz(OQ oq) {
        this.A00 = oq;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        OQ oq = this.A00;
        runnable = oq.A08;
        i10 = this.A00.A07;
        oq.postOnAnimationDelayed(runnable, i10);
    }
}
