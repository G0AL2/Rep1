package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class RingProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Context f9877a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f9878b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f9879c;

    /* renamed from: d  reason: collision with root package name */
    private float f9880d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f9881e;

    /* renamed from: f  reason: collision with root package name */
    private int f9882f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9883g;

    public RingProgressView(Context context) {
        super(context);
        this.f9882f = 1500;
        this.f9877a = context;
        Paint paint = new Paint();
        this.f9878b = paint;
        paint.setAntiAlias(true);
        this.f9878b.setStyle(Paint.Style.STROKE);
        this.f9878b.setStrokeWidth(10.0f);
        this.f9878b.setColor(Color.parseColor("#80FFFFFF"));
        this.f9879c = new RectF();
    }

    public void b() {
        ValueAnimator valueAnimator = this.f9881e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void c() {
        this.f9883g = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9883g) {
            return;
        }
        canvas.drawArc(this.f9879c, 270.0f, this.f9880d, false, this.f9878b);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9879c.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.f9882f = i10;
    }

    public void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f9881e = ofFloat;
        ofFloat.setDuration(this.f9882f);
        this.f9881e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.f9880d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f9881e.start();
    }
}
