package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Om  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1158Om implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1262Sm A00;

    public C1158Om(C1262Sm c1262Sm) {
        this.A00 = c1262Sm;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A06;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A06;
        view2.requestLayout();
    }
}
