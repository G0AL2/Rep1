package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Rl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1235Rl extends L8 {
    public final /* synthetic */ QK A00;

    public C1235Rl(QK qk) {
        this.A00 = qk;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        boolean z10;
        C07849b c07849b;
        Handler handler;
        int i10;
        z10 = this.A00.A03;
        if (!z10) {
            c07849b = this.A00.A0B;
            c07849b.A02(new NE(this.A00.getCurrentPositionInMillis()) { // from class: com.facebook.ads.redexgen.X.84
            });
            handler = this.A00.A07;
            i10 = this.A00.A00;
            handler.postDelayed(this, i10);
        }
    }
}
