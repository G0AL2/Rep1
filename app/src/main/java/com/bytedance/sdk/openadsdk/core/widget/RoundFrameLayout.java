package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;

/* loaded from: classes.dex */
public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Path f13019a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f13020b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f13021c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f13022d;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    public void a(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f13022d;
        fArr[0] = f10;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f11;
        fArr[4] = f13;
        fArr[5] = f13;
        fArr[6] = f12;
        fArr[7] = f12;
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(a());
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(this.f13021c, null, 31);
            super.dispatchDraw(canvas);
            canvas.drawPath(a(), this.f13020b);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(a());
            super.draw(canvas);
        } else {
            canvas.saveLayer(this.f13021c, null, 31);
            super.draw(canvas);
            canvas.drawPath(a(), this.f13020b);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13021c.set(0.0f, 0.0f, i10, i11);
    }

    public void setBottomLeftRadius(float f10) {
        float[] fArr = this.f13022d;
        fArr[6] = f10;
        fArr[7] = f10;
        postInvalidate();
    }

    public void setBottomRightRadius(float f10) {
        float[] fArr = this.f13022d;
        fArr[5] = f10;
        fArr[6] = f10;
        postInvalidate();
    }

    public void setRadius(float f10) {
        Arrays.fill(this.f13022d, f10);
        postInvalidate();
    }

    public void setTopLeftRadius(float f10) {
        float[] fArr = this.f13022d;
        fArr[0] = f10;
        fArr[1] = f10;
        postInvalidate();
    }

    public void setTopRightRadius(float f10) {
        float[] fArr = this.f13022d;
        fArr[2] = f10;
        fArr[3] = f10;
        postInvalidate();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13019a = new Path();
        this.f13021c = new RectF();
        Paint paint = new Paint();
        this.f13020b = paint;
        paint.setAntiAlias(true);
        this.f13020b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f13022d = new float[8];
    }

    private Path a() {
        this.f13019a.reset();
        this.f13019a.addRoundRect(this.f13021c, this.f13022d, Path.Direction.CW);
        return this.f13019a;
    }
}
