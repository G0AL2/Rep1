package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class OZ extends ImageView {
    public float A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;

    public OZ(C1400Xy c1400Xy, int i10, int i11) {
        super(c1400Xy);
        this.A03 = C1095Mb.A01(EnumC1094Ma.RATINGS);
        this.A00 = 1.0f;
        this.A01 = i10;
        this.A02 = i11;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(2);
        paint.setColorFilter(new PorterDuffColorFilter(this.A01, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.A03, (Rect) null, new Rect(0, 0, getWidth(), getHeight()), paint);
        paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(this.A03, new Rect(0, 0, (int) (this.A00 * this.A03.getWidth()), this.A03.getHeight()), new Rect(0, 0, (int) (this.A00 * getWidth()), getHeight()), paint);
    }

    public void setFillRatio(float f10) {
        this.A00 = f10;
        postInvalidate();
    }
}
