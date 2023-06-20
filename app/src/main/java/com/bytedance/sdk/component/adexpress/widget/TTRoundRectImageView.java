package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f9948a;

    /* renamed from: b  reason: collision with root package name */
    private int f9949b;

    /* renamed from: c  reason: collision with root package name */
    private int f9950c;

    /* renamed from: d  reason: collision with root package name */
    private Matrix f9951d;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    private Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap a10 = a(drawable);
            if (a10 != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(a10, tileMode, tileMode);
                float f10 = 1.0f;
                if (a10.getWidth() != getWidth() || a10.getHeight() != getHeight()) {
                    f10 = Math.max((getWidth() * 1.0f) / a10.getWidth(), (getHeight() * 1.0f) / a10.getHeight());
                }
                this.f9951d.setScale(f10, f10);
                bitmapShader.setLocalMatrix(this.f9951d);
                this.f9948a.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f9949b, this.f9950c, this.f9948a);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i10) {
        this.f9949b = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f9950c = i10;
        postInvalidate();
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9949b = 25;
        this.f9950c = 25;
        Paint paint = new Paint();
        this.f9948a = paint;
        paint.setAntiAlias(true);
        this.f9948a.setFilterBitmap(true);
        this.f9951d = new Matrix();
    }
}
