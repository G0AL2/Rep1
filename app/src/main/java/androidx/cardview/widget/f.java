package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f1824a;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1826c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1827d;

    /* renamed from: e  reason: collision with root package name */
    private float f1828e;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1831h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1832i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1833j;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1829f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1830g = true;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1834k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1825b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ColorStateList colorStateList, float f10) {
        this.f1824a = f10;
        e(colorStateList);
        this.f1826c = new RectF();
        this.f1827d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1831h = colorStateList;
        this.f1825b.setColor(colorStateList.getColorForState(getState(), this.f1831h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1826c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1827d.set(rect);
        if (this.f1829f) {
            float d10 = g.d(this.f1828e, this.f1824a, this.f1830g);
            this.f1827d.inset((int) Math.ceil(g.c(this.f1828e, this.f1824a, this.f1830g)), (int) Math.ceil(d10));
            this.f1826c.set(this.f1827d);
        }
    }

    public ColorStateList b() {
        return this.f1831h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f1828e;
    }

    public float d() {
        return this.f1824a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1825b;
        if (this.f1832i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1832i);
            z10 = true;
        }
        RectF rectF = this.f1826c;
        float f10 = this.f1824a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f1828e && this.f1829f == z10 && this.f1830g == z11) {
            return;
        }
        this.f1828e = f10;
        this.f1829f = z10;
        this.f1830g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1827d, this.f1824a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 == this.f1824a) {
            return;
        }
        this.f1824a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1833j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1831h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1831h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1825b.getColor();
        if (z10) {
            this.f1825b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1833j;
        if (colorStateList2 == null || (mode = this.f1834k) == null) {
            return z10;
        }
        this.f1832i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1825b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1825b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1833j = colorStateList;
        this.f1832i = a(colorStateList, this.f1834k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1834k = mode;
        this.f1832i = a(this.f1833j, mode);
        invalidateSelf();
    }
}
