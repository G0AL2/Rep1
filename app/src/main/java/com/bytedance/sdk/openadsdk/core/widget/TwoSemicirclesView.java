package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class TwoSemicirclesView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final RectF f13075a;

    /* renamed from: b  reason: collision with root package name */
    private int f13076b;

    /* renamed from: c  reason: collision with root package name */
    private int f13077c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f13078d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f13079e;

    /* renamed from: f  reason: collision with root package name */
    private float f13080f;

    /* renamed from: g  reason: collision with root package name */
    private float f13081g;

    /* renamed from: h  reason: collision with root package name */
    private int f13082h;

    /* renamed from: i  reason: collision with root package name */
    private int f13083i;

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13080f = -90.0f;
        this.f13081g = 220.0f;
        this.f13082h = Color.parseColor("#FFFFFF");
        this.f13083i = Color.parseColor("#C4C4C4");
        a();
        float f10 = this.f13081g;
        this.f13075a = new RectF(-f10, -f10, f10, f10);
    }

    private void a() {
        Paint paint = new Paint();
        this.f13078d = paint;
        paint.setColor(this.f13082h);
        this.f13078d.setStyle(Paint.Style.STROKE);
        this.f13078d.setStrokeWidth(4.0f);
        this.f13078d.setAlpha(20);
        Paint paint2 = new Paint(this.f13078d);
        this.f13079e = paint2;
        paint2.setColor(this.f13083i);
        this.f13079e.setAlpha(255);
    }

    public Paint getPaintOne() {
        return this.f13078d;
    }

    public Paint getPaintTwo() {
        return this.f13079e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f13075a;
        float f10 = this.f13081g;
        rectF.set(-f10, -f10, f10, f10);
        canvas.translate(this.f13076b / 2, this.f13077c / 2);
        canvas.drawArc(this.f13075a, this.f13080f, 180.0f, false, this.f13078d);
        canvas.drawArc(this.f13075a, this.f13080f + 180.0f, 180.0f, false, this.f13079e);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13076b = i10;
        this.f13077c = i11;
    }

    public void setCurrentStartAngle(float f10) {
        this.f13080f = f10;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f13078d = paint;
        postInvalidate();
    }

    public void setPaintTwo(Paint paint) {
        this.f13079e = paint;
        postInvalidate();
    }

    public void setRadius(float f10) {
        this.f13081g = f10;
        postInvalidate();
    }
}
