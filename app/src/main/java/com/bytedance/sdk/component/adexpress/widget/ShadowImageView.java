package com.bytedance.sdk.component.adexpress.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class ShadowImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f9896a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f9897b;

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f9897b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.f9896a);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f9897b.right == getMeasuredWidth() && this.f9897b.bottom == getMeasuredHeight()) {
            return;
        }
        this.f9897b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
