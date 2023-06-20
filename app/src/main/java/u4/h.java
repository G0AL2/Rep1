package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: MatrixDrawable.java */
/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: d  reason: collision with root package name */
    private Matrix f37469d;

    /* renamed from: e  reason: collision with root package name */
    private Matrix f37470e;

    /* renamed from: f  reason: collision with root package name */
    private int f37471f;

    /* renamed from: g  reason: collision with root package name */
    private int f37472g;

    private void w() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f37471f = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f37472g = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f37470e = this.f37469d;
            return;
        }
        current.setBounds(bounds);
        this.f37470e = null;
    }

    private void x() {
        if (this.f37471f == getCurrent().getIntrinsicWidth() && this.f37472g == getCurrent().getIntrinsicHeight()) {
            return;
        }
        w();
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        x();
        if (this.f37470e != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f37470e);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // u4.g, u4.s
    public void e(Matrix matrix) {
        super.e(matrix);
        Matrix matrix2 = this.f37470e;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u4.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        w();
    }

    @Override // u4.g
    public Drawable u(Drawable drawable) {
        Drawable u10 = super.u(drawable);
        w();
        return u10;
    }
}
