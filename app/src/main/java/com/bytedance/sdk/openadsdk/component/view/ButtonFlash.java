package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ButtonFlash extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private int f11797a;

    /* renamed from: b  reason: collision with root package name */
    private int f11798b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f11799c;

    /* renamed from: d  reason: collision with root package name */
    private LinearGradient f11800d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f11801e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f11802f;

    /* renamed from: g  reason: collision with root package name */
    private ValueAnimator f11803g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11804h;

    public ButtonFlash(Context context) {
        super(context);
        this.f11804h = true;
        b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11802f != null) {
            canvas.drawRoundRect(this.f11801e, 100.0f, 100.0f, this.f11799c);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11797a = i10;
        this.f11798b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f11797a / 2.0f, this.f11798b, new int[]{16777215, 1358954495, 16777215}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f11800d = linearGradient;
        this.f11799c.setShader(linearGradient);
        this.f11799c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f11802f = matrix;
        matrix.setTranslate(-this.f11797a, this.f11798b);
        this.f11800d.setLocalMatrix(this.f11802f);
        this.f11801e.set(0.0f, 0.0f, this.f11797a, this.f11798b);
    }

    public void setAutoRun(boolean z10) {
        this.f11804h = z10;
    }

    private void b() {
        this.f11801e = new RectF();
        this.f11799c = new Paint();
        c();
    }

    private void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11803g = ofFloat;
        ofFloat.setDuration(3000L);
        this.f11803g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.view.ButtonFlash.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((ButtonFlash.this.f11797a * 2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ButtonFlash.this.f11797a;
                if (ButtonFlash.this.f11802f != null) {
                    ButtonFlash.this.f11802f.setTranslate(floatValue, ButtonFlash.this.f11798b);
                }
                if (ButtonFlash.this.f11800d != null) {
                    ButtonFlash.this.f11800d.setLocalMatrix(ButtonFlash.this.f11802f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f11804h) {
            this.f11803g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f11803g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f11803g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            invalidate();
        }
    }

    public ButtonFlash(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11804h = true;
        b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11804h = true;
        b();
    }
}
