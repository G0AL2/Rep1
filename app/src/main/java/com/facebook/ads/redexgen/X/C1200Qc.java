package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1200Qc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IT A01;

    public C1200Qc(IT it, View view) {
        this.A01 = it;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
