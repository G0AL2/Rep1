package com.bytedance.sdk.openadsdk.core.widget;

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
    private Paint f13071a;

    /* renamed from: b  reason: collision with root package name */
    private int f13072b;

    /* renamed from: c  reason: collision with root package name */
    private int f13073c;

    /* renamed from: d  reason: collision with root package name */
    private Matrix f13074d;

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
                this.f13074d.setScale(f10, f10);
                bitmapShader.setLocalMatrix(this.f13074d);
                this.f13071a.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f13072b, this.f13073c, this.f13071a);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i10) {
        this.f13072b = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f13073c = i10;
        postInvalidate();
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13072b = 25;
        this.f13073c = 25;
        Paint paint = new Paint();
        this.f13071a = paint;
        paint.setAntiAlias(true);
        this.f13071a.setFilterBitmap(true);
        this.f13074d = new Matrix();
    }
}
