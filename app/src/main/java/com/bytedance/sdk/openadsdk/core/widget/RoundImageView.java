package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class RoundImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f13023a;

    /* renamed from: b  reason: collision with root package name */
    private int f13024b;

    public RoundImageView(Context context) {
        super(context);
        this.f13023a = 0;
        this.f13024b = 0;
    }

    private Bitmap a(Bitmap bitmap, int i10) {
        Bitmap createBitmap;
        int i11 = i10 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            createBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (createBitmap != null) {
            bitmap = createBitmap;
        }
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i11) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i10;
        Bitmap bitmap2;
        Drawable drawable = getDrawable();
        if (drawable == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        measure(0, 0);
        if (drawable.getClass() == NinePatchDrawable.class) {
            return;
        }
        Bitmap bitmap3 = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
        if (bitmap3 == null) {
            return;
        }
        try {
            bitmap = bitmap3.copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f13023a == 0) {
            this.f13023a = getWidth();
        }
        if (this.f13024b == 0) {
            this.f13024b = getHeight();
        }
        int i11 = this.f13023a;
        int i12 = this.f13024b;
        if (i11 >= i12) {
            i11 = i12;
        }
        try {
            bitmap2 = a(bitmap, i11 / 2);
        } catch (Throwable unused2) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmap2, (this.f13023a / 2) - i10, (this.f13024b / 2) - i10, (Paint) null);
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13023a = 0;
        this.f13024b = 0;
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13023a = 0;
        this.f13024b = 0;
    }
}
