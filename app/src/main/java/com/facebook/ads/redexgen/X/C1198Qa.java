package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Qa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1198Qa implements Animator.AnimatorListener {
    public final /* synthetic */ IT A00;

    public C1198Qa(IT it) {
        this.A00 = it;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = QS.A03;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
