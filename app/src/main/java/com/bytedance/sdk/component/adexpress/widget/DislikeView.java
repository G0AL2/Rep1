package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class DislikeView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f9846a;

    /* renamed from: b  reason: collision with root package name */
    private int f9847b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f9848c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f9849d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f9850e;

    /* renamed from: f  reason: collision with root package name */
    private int f9851f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f9852g;

    /* renamed from: h  reason: collision with root package name */
    private int f9853h;

    public DislikeView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f9849d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f9852g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f9850e = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f9848c;
        int i10 = this.f9851f;
        canvas.drawRoundRect(rectF, i10, i10, this.f9850e);
        RectF rectF2 = this.f9848c;
        int i11 = this.f9851f;
        canvas.drawRoundRect(rectF2, i11, i11, this.f9849d);
        int i12 = this.f9846a;
        int i13 = this.f9847b;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.f9852g);
        int i14 = this.f9846a;
        int i15 = this.f9847b;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.f9852g);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9846a = i10;
        this.f9847b = i11;
        int i14 = this.f9853h;
        this.f9848c = new RectF(i14, i14, this.f9846a - i14, this.f9847b - i14);
    }

    public void setBgColor(int i10) {
        this.f9850e.setStyle(Paint.Style.FILL);
        this.f9850e.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.f9852g.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.f9852g.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.f9851f = i10;
    }

    public void setStrokeColor(int i10) {
        this.f9849d.setStyle(Paint.Style.STROKE);
        this.f9849d.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.f9849d.setStrokeWidth(i10);
        this.f9853h = i10;
    }
}
