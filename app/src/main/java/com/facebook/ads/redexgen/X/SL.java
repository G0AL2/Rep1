package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network.dex */
public class SL extends L8 {
    public final /* synthetic */ PQ A00;
    public final /* synthetic */ PR A01;

    public SL(PR pr, PQ pq) {
        this.A01 = pr;
        this.A00 = pq;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new SM(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
