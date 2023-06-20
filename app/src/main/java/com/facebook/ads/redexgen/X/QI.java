package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QI extends AnimatorListenerAdapter {
    public final /* synthetic */ KT A00;

    public QI(KT kt) {
        this.A00 = kt;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
