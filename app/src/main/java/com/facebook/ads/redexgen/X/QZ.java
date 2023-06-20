package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class QZ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IV A02;

    public QZ(IV iv, int i10, int i11) {
        this.A02 = iv;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        QS qs;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        IV iv = this.A02;
        int i11 = this.A01;
        i10 = iv.A04;
        if (i11 == i10) {
            qs = QS.A03;
        } else {
            qs = QS.A05;
        }
        iv.A01 = qs;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
