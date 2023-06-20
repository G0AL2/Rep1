package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.y;

/* compiled from: ReactSlider.java */
/* loaded from: classes.dex */
public class a extends y {

    /* renamed from: g  reason: collision with root package name */
    private static int f16169g = 128;

    /* renamed from: b  reason: collision with root package name */
    private double f16170b;

    /* renamed from: c  reason: collision with root package name */
    private double f16171c;

    /* renamed from: d  reason: collision with root package name */
    private double f16172d;

    /* renamed from: e  reason: collision with root package name */
    private double f16173e;

    /* renamed from: f  reason: collision with root package name */
    private double f16174f;

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16170b = 0.0d;
        this.f16171c = 0.0d;
        this.f16172d = 0.0d;
        this.f16173e = 0.0d;
        this.f16174f = 0.0d;
        a();
    }

    private void c() {
        if (this.f16173e == 0.0d) {
            this.f16174f = (this.f16171c - this.f16170b) / f16169g;
        }
        setMax(getTotalSteps());
        d();
    }

    private void d() {
        double d10 = this.f16172d;
        double d11 = this.f16170b;
        setProgress((int) Math.round(((d10 - d11) / (this.f16171c - d11)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d10 = this.f16173e;
        return d10 > 0.0d ? d10 : this.f16174f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f16171c - this.f16170b) / getStepValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || i10 >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    public double b(int i10) {
        if (i10 == getMax()) {
            return this.f16171c;
        }
        return (i10 * getStepValue()) + this.f16170b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d10) {
        this.f16171c = d10;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d10) {
        this.f16170b = d10;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d10) {
        this.f16173e = d10;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d10) {
        this.f16172d = d10;
        d();
    }
}
