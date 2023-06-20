package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: CoverDrawable.java */
/* loaded from: classes.dex */
public class a extends GradientDrawable {

    /* renamed from: a  reason: collision with root package name */
    private Paint f9747a;

    /* renamed from: b  reason: collision with root package name */
    private Path f9748b;

    public a() {
        this.f9748b = new Path();
        Paint paint = new Paint(1);
        this.f9747a = paint;
        paint.setColor(-1);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f9748b.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.f9748b;
        if (path != null && !path.isEmpty()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f9747a, 31);
            super.draw(canvas);
            this.f9747a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.f9748b, this.f9747a);
            this.f9747a.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.draw(canvas);
    }

    public a(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f9748b = new Path();
        Paint paint = new Paint(1);
        this.f9747a = paint;
        paint.setColor(-1);
    }
}
