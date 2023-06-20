package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class w extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f7125c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f7126d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f7127e = new Paint(1);

    public w(Context context) {
        super(context);
        f7125c.setColor(-1);
        f7126d.setColor(-16777216);
        Paint paint = f7127e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f7049a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f7049a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f7049a * 3.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f7125c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f7126d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f7127e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
