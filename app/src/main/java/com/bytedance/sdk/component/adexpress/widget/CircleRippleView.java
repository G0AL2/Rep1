package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CircleRippleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f9832a;

    /* renamed from: b  reason: collision with root package name */
    private int f9833b;

    /* renamed from: c  reason: collision with root package name */
    private float f9834c;

    /* renamed from: d  reason: collision with root package name */
    private int f9835d;

    /* renamed from: e  reason: collision with root package name */
    private float f9836e;

    /* renamed from: f  reason: collision with root package name */
    private int f9837f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9838g;

    /* renamed from: h  reason: collision with root package name */
    private List<Integer> f9839h;

    /* renamed from: i  reason: collision with root package name */
    private List<Integer> f9840i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f9841j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f9842k;

    /* renamed from: l  reason: collision with root package name */
    private float f9843l;

    /* renamed from: m  reason: collision with root package name */
    private float f9844m;

    /* renamed from: n  reason: collision with root package name */
    private int f9845n;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    private void c() {
        Paint paint = new Paint();
        this.f9841j = paint;
        paint.setAntiAlias(true);
        this.f9841j.setStrokeWidth(this.f9845n);
        this.f9839h.add(255);
        this.f9840i.add(0);
        Paint paint2 = new Paint();
        this.f9842k = paint2;
        paint2.setAntiAlias(true);
        this.f9842k.setColor(Color.parseColor("#0FFFFFFF"));
        this.f9842k.setStyle(Paint.Style.FILL);
    }

    public void a() {
        this.f9838g = true;
        invalidate();
    }

    public void b() {
        this.f9838g = false;
        this.f9840i.clear();
        this.f9839h.clear();
        this.f9839h.add(255);
        this.f9840i.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f9841j.setShader(new LinearGradient(this.f9843l, 0.0f, this.f9844m, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.f9839h.size()) {
                break;
            }
            Integer num = this.f9839h.get(i10);
            this.f9841j.setAlpha(num.intValue());
            Integer num2 = this.f9840i.get(i10);
            if (this.f9834c + num2.intValue() < this.f9836e) {
                canvas.drawCircle(this.f9843l, this.f9844m, this.f9834c + num2.intValue(), this.f9841j);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f9836e) {
                this.f9839h.set(i10, Integer.valueOf(num.intValue() - this.f9837f > 0 ? num.intValue() - (this.f9837f * 3) : 1));
                this.f9840i.set(i10, Integer.valueOf(num2.intValue() + this.f9837f));
            }
            i10++;
        }
        List<Integer> list = this.f9840i;
        if (list.get(list.size() - 1).intValue() >= this.f9836e / this.f9835d) {
            this.f9839h.add(255);
            this.f9840i.add(0);
        }
        if (this.f9840i.size() >= 3) {
            this.f9840i.remove(0);
            this.f9839h.remove(0);
        }
        this.f9841j.setAlpha(255);
        this.f9841j.setColor(this.f9833b);
        canvas.drawCircle(this.f9843l, this.f9844m, this.f9834c, this.f9842k);
        if (this.f9838g) {
            invalidate();
        }
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
        float f10 = i10 / 2.0f;
        this.f9843l = f10;
        this.f9844m = i11 / 2.0f;
        float f11 = f10 - (this.f9845n / 2.0f);
        this.f9836e = f11;
        this.f9834c = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.f9832a = i10;
    }

    public void setCoreColor(int i10) {
        this.f9833b = i10;
    }

    public void setCoreRadius(int i10) {
        this.f9834c = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.f9837f = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.f9835d = i10;
    }

    public void setMaxWidth(int i10) {
        this.f9836e = i10;
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9832a = -1;
        this.f9833b = -65536;
        this.f9834c = 18.0f;
        this.f9835d = 3;
        this.f9836e = 50.0f;
        this.f9837f = 2;
        this.f9838g = false;
        this.f9839h = new ArrayList();
        this.f9840i = new ArrayList();
        this.f9845n = 24;
        c();
    }
}
