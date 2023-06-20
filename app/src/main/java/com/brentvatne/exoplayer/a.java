package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: AspectRatioFrameLayout.java */
/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f9099a;

    /* renamed from: b  reason: collision with root package name */
    private int f9100b;

    public a(Context context) {
        this(context, null);
    }

    public void a() {
        this.f9099a = 0.0f;
    }

    public float getAspectRatio() {
        return this.f9099a;
    }

    public int getResizeMode() {
        return this.f9100b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f9099a == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f9099a / (f12 / f13)) - 1.0f;
        if (Math.abs(f14) <= 0.01f) {
            return;
        }
        int i12 = this.f9100b;
        if (i12 == 1) {
            f10 = this.f9099a;
        } else {
            if (i12 == 2) {
                f11 = this.f9099a;
            } else {
                if (i12 != 3) {
                    if (i12 == 4) {
                        int i13 = (int) (this.f9099a * f13);
                        if (i13 < measuredWidth) {
                            float f15 = i13;
                            float f16 = f12 / f15;
                            measuredWidth = (int) (f15 * f16);
                            measuredHeight = (int) (f13 * f16);
                        } else {
                            measuredWidth = i13;
                        }
                    } else if (f14 > 0.0f) {
                        f10 = this.f9099a;
                    } else {
                        f11 = this.f9099a;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            measuredWidth = (int) (f13 * f11);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        measuredHeight = (int) (f12 / f10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f9099a != f10) {
            this.f9099a = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f9100b != i10) {
            this.f9100b = i10;
            requestLayout();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9100b = 0;
    }
}
