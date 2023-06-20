package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Tl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1286Tl extends MR {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C1286Tl(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.X.MR, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
