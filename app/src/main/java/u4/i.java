package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: OrientedDrawable.java */
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: d  reason: collision with root package name */
    final Matrix f37473d;

    /* renamed from: e  reason: collision with root package name */
    private int f37474e;

    /* renamed from: f  reason: collision with root package name */
    private int f37475f;

    /* renamed from: g  reason: collision with root package name */
    private final Matrix f37476g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f37477h;

    public i(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f37476g = new Matrix();
        this.f37477h = new RectF();
        this.f37473d = new Matrix();
        this.f37474e = i10 - (i10 % 90);
        this.f37475f = (i11 < 0 || i11 > 8) ? 0 : 0;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        if (this.f37474e <= 0 && ((i10 = this.f37475f) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f37473d);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // u4.g, u4.s
    public void e(Matrix matrix) {
        t(matrix);
        if (this.f37473d.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f37473d);
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f37475f;
        if (i10 != 5 && i10 != 7 && this.f37474e % 180 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f37475f;
        if (i10 != 5 && i10 != 7 && this.f37474e % 180 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u4.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i10;
        Drawable current = getCurrent();
        int i11 = this.f37474e;
        if (i11 <= 0 && ((i10 = this.f37475f) == 0 || i10 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i12 = this.f37475f;
        if (i12 == 2) {
            this.f37473d.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f37473d.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f37473d.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f37473d.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f37473d.setRotate(i11, rect.centerX(), rect.centerY());
        } else {
            this.f37473d.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f37473d.postScale(1.0f, -1.0f);
        }
        this.f37476g.reset();
        this.f37473d.invert(this.f37476g);
        this.f37477h.set(rect);
        this.f37476g.mapRect(this.f37477h);
        RectF rectF = this.f37477h;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
