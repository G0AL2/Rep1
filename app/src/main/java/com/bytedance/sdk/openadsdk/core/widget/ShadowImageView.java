package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class ShadowImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f13025a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f13026b;

    public ShadowImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f13025a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f13025a.setColor(Color.parseColor("#99333333"));
        this.f13025a.setAntiAlias(true);
        this.f13025a.setStrokeWidth(0.0f);
        this.f13026b = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f13026b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.f13025a);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f13026b.right == getMeasuredWidth() && this.f13026b.bottom == getMeasuredHeight()) {
            return;
        }
        this.f13026b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
