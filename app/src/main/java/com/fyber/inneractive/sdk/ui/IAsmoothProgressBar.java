package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

@TargetApi(11)
/* loaded from: classes2.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c  reason: collision with root package name */
    public static final Interpolator f20217c = new AccelerateDecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f20218a;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f20219b;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f20218a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20219b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f20218a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20218a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f20218a = ofInt;
            ofInt.setInterpolator(f20217c);
            this.f20218a.addUpdateListener(new a());
        } else {
            valueAnimator2.setIntValues(getProgress(), i10);
        }
        this.f20218a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i10) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setSecondaryProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f20219b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20219b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f20219b = ofInt;
            ofInt.setInterpolator(f20217c);
            this.f20219b.addUpdateListener(new b());
        } else {
            valueAnimator2.setIntValues(getProgress(), i10);
        }
        this.f20219b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
