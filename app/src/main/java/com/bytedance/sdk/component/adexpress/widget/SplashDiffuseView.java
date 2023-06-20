package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class SplashDiffuseView extends View {

    /* renamed from: c  reason: collision with root package name */
    private static int f9935c = 50;

    /* renamed from: a  reason: collision with root package name */
    private Paint f9936a;

    /* renamed from: b  reason: collision with root package name */
    private int f9937b;

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f9938d;

    public SplashDiffuseView(Context context) {
        this(context, null);
    }

    private void b() {
        Paint paint = new Paint();
        this.f9936a = paint;
        paint.setAntiAlias(true);
        this.f9936a.setColor(Color.parseColor("#FFFFFFFF"));
        this.f9936a.setStyle(Paint.Style.STROKE);
        this.f9936a.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f9938d = ofFloat;
        ofFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f9936a.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f9937b, this.f9936a);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9937b = 10;
        b();
    }

    public void a() {
        int min = (int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        f9935c = min;
        int i10 = min - 18;
        f9935c = i10;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, i10);
        ofInt.setInterpolator(new a(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SplashDiffuseView.this.f9937b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.requestLayout();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.f9938d.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }
        });
        ofInt.start();
    }
}
