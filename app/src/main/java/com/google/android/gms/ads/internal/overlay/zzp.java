package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzp extends AnimatorListenerAdapter {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzr zzrVar) {
        this.zza = zzrVar;
    }

    private final void zza(boolean z10) {
        ImageButton imageButton;
        this.zza.setClickable(z10);
        imageButton = this.zza.zza;
        imageButton.setClickable(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
