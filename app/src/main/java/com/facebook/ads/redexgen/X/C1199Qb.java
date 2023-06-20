package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1199Qb implements Animator.AnimatorListener {
    public final /* synthetic */ IT A00;

    public C1199Qb(IT it) {
        this.A00 = it;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = QS.A05;
        view = this.A00.A05;
        MS.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
