package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network.dex */
public class QY extends AnimatorListenerAdapter {
    public final /* synthetic */ IY A00;

    public QY(IY iy) {
        this.A00 = iy;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z10;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z10 = this.A00.A04;
        if (z10) {
            view2 = this.A00.A03;
            MS.A0L(view2);
        }
        view = this.A00.A03;
        view.setAlpha(1.0f);
        this.A00.A01 = QS.A03;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view;
        z10 = this.A00.A04;
        if (z10) {
            view = this.A00.A03;
            MS.A0H(view);
        }
        this.A00.A01 = QS.A05;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
