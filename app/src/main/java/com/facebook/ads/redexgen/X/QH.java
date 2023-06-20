package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* loaded from: assets/audience_network.dex */
public class QH extends AnimatorListenerAdapter {
    public final /* synthetic */ C07537o A00;

    public QH(C07537o c07537o) {
        this.A00 = c07537o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new KU(this), Constants.MIN_PROGRESS_TIME);
    }
}
