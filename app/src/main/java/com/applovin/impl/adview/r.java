package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class r extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f7108c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f7109d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private final float[] f7110e;

    /* renamed from: f  reason: collision with root package name */
    private Path f7111f;

    public r(Context context) {
        super(context);
        this.f7110e = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f7108c.setARGB(80, 0, 0, 0);
        Paint paint = f7109d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f7110e;
            if (i10 >= fArr.length) {
                Path path = new Path();
                this.f7111f = path;
                float[] fArr2 = this.f7110e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f7111f;
                float[] fArr3 = this.f7110e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f7111f;
                float[] fArr4 = this.f7110e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f7111f;
                float[] fArr5 = this.f7110e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f7111f;
                float[] fArr6 = this.f7110e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f7111f;
                float[] fArr7 = this.f7110e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i10] = fArr[i10] * 0.3f * this.f7049a;
            i10++;
        }
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        a();
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getStrokeWidth() {
        return this.f7049a * 2.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f7108c);
        Paint paint = f7109d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f7111f, paint);
    }
}
