package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class T4 extends L8 {
    public final /* synthetic */ OE A00;

    public T4(OE oe2) {
        this.A00 = oe2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
