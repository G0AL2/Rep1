package u4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: AutoRotateDrawable.java */
/* loaded from: classes.dex */
public class b extends g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private int f37441d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37442e;

    /* renamed from: f  reason: collision with root package name */
    float f37443f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37444g;

    public b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int w() {
        return (int) ((20.0f / this.f37441d) * 360.0f);
    }

    private void x() {
        if (this.f37444g) {
            return;
        }
        this.f37444g = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right;
        int i11 = bounds.left;
        int i12 = i10 - i11;
        int i13 = bounds.bottom;
        int i14 = bounds.top;
        int i15 = i13 - i14;
        float f10 = this.f37443f;
        if (!this.f37442e) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, i11 + (i12 / 2), i14 + (i15 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        x();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37444g = false;
        this.f37443f += w();
        invalidateSelf();
    }

    public b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) y3.k.g(drawable));
        this.f37443f = 0.0f;
        this.f37444g = false;
        this.f37441d = i10;
        this.f37442e = z10;
    }
}
