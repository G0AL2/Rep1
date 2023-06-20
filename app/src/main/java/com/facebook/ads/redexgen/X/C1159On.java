package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.On  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1159On extends AnimatorListenerAdapter {
    public static String[] A02 = {"R9x3aA0CxKnsz3as3yTNo", "wj3", "QXJ1VvuxLHED1mtMWLYdqrUglWa9lzRq", "lkNOeAB6Ljcfoc1GYo9neKrfDLaf7fDy", "DjE9g1oV3RhQW9", "kuoJdNjNcIUcz8fbOu7oHrt", "PXWkVVH6OcZLxwrP3oXHVUdgM2dUbdjZ", "8PrLrYluZp2AIaWhf9UgS"};
    public final /* synthetic */ C1262Sm A00;
    public final /* synthetic */ boolean A01;

    public C1159On(C1262Sm c1262Sm, boolean z10) {
        this.A00 = c1262Sm;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1162Oq c1162Oq;
        TE te2;
        TE te3;
        super.onAnimationEnd(animator);
        c1162Oq = this.A00.A0F;
        c1162Oq.setTranslationY(0.0f);
        this.A00.A0H();
        if (this.A01) {
            return;
        }
        te2 = this.A00.A0D;
        if (te2 != null) {
            C1262Sm c1262Sm = this.A00;
            String[] strArr = A02;
            if (strArr[2].charAt(23) != strArr[6].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "czZD1KZ4paLzcRsa7FTotpjgHmPZqDaL";
            strArr2[6] = "ekjCDFK0XFV5sAsD0BjD76lgNibQF4SI";
            te3 = c1262Sm.A0D;
            te3.destroy();
        }
    }
}
