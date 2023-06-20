package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class SM extends MR {
    public final /* synthetic */ SL A00;

    public SM(SL sl) {
        this.A00 = sl;
    }

    @Override // com.facebook.ads.redexgen.X.MR, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        MS.A0H(this.A00.A01);
        this.A00.A00.ABA();
    }
}
