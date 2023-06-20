package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* loaded from: assets/audience_network.dex */
public class QU implements Animator.AnimatorListener {
    public final /* synthetic */ C1001Ig A00;

    public QU(C1001Ig c1001Ig) {
        this.A00 = c1001Ig;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = QS.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
