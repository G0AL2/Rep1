package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* loaded from: classes.dex */
public class TTCountdownView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13037a = t.a(m.a(), "tt_count_down_view");

    /* renamed from: b  reason: collision with root package name */
    private float f13038b;

    /* renamed from: c  reason: collision with root package name */
    private float f13039c;

    /* renamed from: d  reason: collision with root package name */
    private int f13040d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13041e;

    /* renamed from: f  reason: collision with root package name */
    private float f13042f;

    /* renamed from: g  reason: collision with root package name */
    private float f13043g;

    /* renamed from: h  reason: collision with root package name */
    private String f13044h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13045i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f13046j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f13047k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f13048l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f13049m;

    /* renamed from: n  reason: collision with root package name */
    private float f13050n;

    /* renamed from: o  reason: collision with root package name */
    private float f13051o;

    /* renamed from: p  reason: collision with root package name */
    private RectF f13052p;

    /* renamed from: q  reason: collision with root package name */
    private a f13053q;

    /* renamed from: r  reason: collision with root package name */
    private AnimatorSet f13054r;

    /* renamed from: s  reason: collision with root package name */
    private ValueAnimator f13055s;

    /* renamed from: t  reason: collision with root package name */
    private ValueAnimator f13056t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator f13057u;

    /* loaded from: classes.dex */
    public interface a {
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.f13056t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13056t = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13050n, 0.0f);
        this.f13056t = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f13056t.setDuration(a(this.f13050n, this.f13042f) * 1000.0f);
        this.f13056t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.f13050n = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f13056t;
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.f13055s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13055s = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13051o, 0.0f);
        this.f13055s = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f13055s.setDuration(a(this.f13051o, this.f13043g) * 1000.0f);
        this.f13055s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.f13051o = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f13055s;
    }

    public float a(float f10, float f11) {
        return f10 * f11;
    }

    public float a(float f10, int i10) {
        return i10 * f10;
    }

    public a getCountdownListener() {
        return this.f13053q;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        b(canvas);
        a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            size = b();
        }
        if (mode2 != 1073741824) {
            size2 = b();
        }
        setMeasuredDimension(size, size2);
    }

    public void setCountDownTime(int i10) {
        float f10 = i10;
        this.f13043g = f10;
        this.f13042f = f10;
        a();
    }

    public void setCountdownListener(a aVar) {
        this.f13053q = aVar;
    }

    private void a(Canvas canvas) {
        String str;
        canvas.save();
        Paint.FontMetrics fontMetrics = this.f13049m.getFontMetrics();
        String str2 = f13037a;
        if (this.f13045i) {
            str = "" + ((int) Math.ceil(a(this.f13051o, this.f13043g)));
        } else {
            str = this.f13044h;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        canvas.drawText(str2, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.f13049m);
        canvas.restore();
    }

    private int b() {
        return (int) ((((this.f13038b / 2.0f) + this.f13039c) * 2.0f) + a(4.0f));
    }

    private void b(Canvas canvas) {
        float f10;
        canvas.save();
        float a10 = a(this.f13050n, 360);
        if (this.f13041e) {
            f10 = this.f13040d - a10;
        } else {
            f10 = this.f13040d;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f13039c, this.f13047k);
        canvas.drawCircle(0.0f, 0.0f, this.f13039c, this.f13048l);
        canvas.drawArc(this.f13052p, f10, a10, false, this.f13046j);
        canvas.restore();
    }

    public void a() {
        AnimatorSet animatorSet = this.f13054r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f13054r = null;
        }
        ValueAnimator valueAnimator = this.f13057u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13057u = null;
        }
        ValueAnimator valueAnimator2 = this.f13055s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f13055s = null;
        }
        ValueAnimator valueAnimator3 = this.f13056t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f13056t = null;
        }
        this.f13050n = 1.0f;
        this.f13051o = 1.0f;
        invalidate();
    }

    private float a(float f10) {
        return TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics());
    }
}
