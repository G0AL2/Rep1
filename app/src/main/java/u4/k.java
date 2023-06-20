package u4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public class k extends n {
    private final Paint D;
    private final Paint E;
    private final Bitmap F;
    private WeakReference<Bitmap> G;

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    private void h() {
        WeakReference<Bitmap> weakReference = this.G;
        if (weakReference == null || weakReference.get() != this.F) {
            this.G = new WeakReference<>(this.F);
            Paint paint = this.D;
            Bitmap bitmap = this.F;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f37519f = true;
        }
        if (this.f37519f) {
            this.D.getShader().setLocalMatrix(this.f37537x);
            this.f37519f = false;
        }
        this.D.setFilterBitmap(a());
    }

    @Override // u4.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c6.b.d()) {
            c6.b.a("RoundedBitmapDrawable#draw");
        }
        if (!e()) {
            super.draw(canvas);
            if (c6.b.d()) {
                c6.b.b();
                return;
            }
            return;
        }
        g();
        f();
        h();
        int save = canvas.save();
        canvas.concat(this.f37534u);
        canvas.drawPath(this.f37518e, this.D);
        float f10 = this.f37517d;
        if (f10 > 0.0f) {
            this.E.setStrokeWidth(f10);
            this.E.setColor(e.c(this.f37520g, this.D.getAlpha()));
            canvas.drawPath(this.f37521h, this.E);
        }
        canvas.restoreToCount(save);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // u4.n
    public boolean e() {
        return super.e() && this.F != null;
    }

    @Override // u4.n, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.D.getAlpha()) {
            this.D.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // u4.n, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.D.setColorFilter(colorFilter);
    }
}
