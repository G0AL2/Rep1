package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ShadowTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f13027a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f13028b;

    /* renamed from: c  reason: collision with root package name */
    private int f13029c;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    private void a() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f13027a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f13027a.setColor(Color.parseColor("#99333333"));
        this.f13027a.setAntiAlias(true);
        this.f13027a.setStrokeWidth(0.0f);
        this.f13028b = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f13028b;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.f13027a);
        canvas.translate((this.f13028b.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.f13029c = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i12 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i12, measuredHeight);
            this.f13028b.set(0.0f, 0.0f, i12, measuredHeight);
            return;
        }
        this.f13028b.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13029c = 0;
        a();
    }
}
