package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class RippleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f9885a;

    /* renamed from: b  reason: collision with root package name */
    private float f9886b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f9887c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f9888d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f9889e;

    /* renamed from: f  reason: collision with root package name */
    private long f9890f;

    /* renamed from: g  reason: collision with root package name */
    private float f9891g;

    /* renamed from: h  reason: collision with root package name */
    private float f9892h;

    /* renamed from: i  reason: collision with root package name */
    private Animator.AnimatorListener f9893i;

    public RippleView(Context context) {
        super(context);
        this.f9890f = 300L;
        this.f9891g = 0.0f;
        a();
    }

    public void b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f9892h);
        this.f9887c = ofFloat;
        ofFloat.setDuration(this.f9890f);
        this.f9887c.setInterpolator(new LinearInterpolator());
        this.f9887c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.f9891g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f9887c.start();
    }

    public void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9892h, 0.0f);
        this.f9888d = ofFloat;
        ofFloat.setDuration(this.f9890f);
        this.f9888d.setInterpolator(new LinearInterpolator());
        this.f9888d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.f9891g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f9893i;
        if (animatorListener != null) {
            this.f9888d.addListener(animatorListener);
        }
        this.f9888d.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f9885a, this.f9886b, this.f9891g, this.f9889e);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9885a = i10 / 2.0f;
        this.f9886b = i11 / 2.0f;
        this.f9892h = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f9893i = animatorListener;
    }

    public void a() {
        Paint paint = new Paint(1);
        this.f9889e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f9889e.setColor(Color.parseColor("#99000000"));
    }
}
