package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    private static final double f1835q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    static a f1836r;

    /* renamed from: a  reason: collision with root package name */
    private final int f1837a;

    /* renamed from: c  reason: collision with root package name */
    private Paint f1839c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f1840d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f1841e;

    /* renamed from: f  reason: collision with root package name */
    private float f1842f;

    /* renamed from: g  reason: collision with root package name */
    private Path f1843g;

    /* renamed from: h  reason: collision with root package name */
    private float f1844h;

    /* renamed from: i  reason: collision with root package name */
    private float f1845i;

    /* renamed from: j  reason: collision with root package name */
    private float f1846j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f1847k;

    /* renamed from: m  reason: collision with root package name */
    private final int f1849m;

    /* renamed from: n  reason: collision with root package name */
    private final int f1850n;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1848l = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1851o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1852p = false;

    /* renamed from: b  reason: collision with root package name */
    private Paint f1838b = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f1849m = resources.getColor(o.b.f34822d);
        this.f1850n = resources.getColor(o.b.f34821c);
        this.f1837a = resources.getDimensionPixelSize(o.c.f34823a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1839c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1842f = (int) (f10 + 0.5f);
        this.f1841e = new RectF();
        Paint paint2 = new Paint(this.f1839c);
        this.f1840d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f1844h;
        float f11 = 1.5f * f10;
        this.f1841e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    private void b() {
        float f10 = this.f1842f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f1845i;
        rectF2.inset(-f11, -f11);
        Path path = this.f1843g;
        if (path == null) {
            this.f1843g = new Path();
        } else {
            path.reset();
        }
        this.f1843g.setFillType(Path.FillType.EVEN_ODD);
        this.f1843g.moveTo(-this.f1842f, 0.0f);
        this.f1843g.rLineTo(-this.f1845i, 0.0f);
        this.f1843g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1843g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1843g.close();
        float f12 = this.f1842f;
        float f13 = f12 / (this.f1845i + f12);
        Paint paint = this.f1839c;
        float f14 = this.f1842f + this.f1845i;
        int i10 = this.f1849m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f1850n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1840d;
        float f15 = this.f1842f;
        float f16 = this.f1845i;
        int i11 = this.f1849m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f1850n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1840d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f1835q) * f11)) : f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) ((f10 * 1.5f) + ((1.0d - f1835q) * f11)) : f10 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f10 = this.f1842f;
        float f11 = (-f10) - this.f1845i;
        float f12 = f10 + this.f1837a + (this.f1846j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f1841e.width() - f13 > 0.0f;
        boolean z11 = this.f1841e.height() - f13 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1841e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f1843g, this.f1839c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f1841e.width() - f13, -this.f1842f, this.f1840d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1841e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1843g, this.f1839c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f1841e.width() - f13, (-this.f1842f) + this.f1845i, this.f1840d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1841e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1843g, this.f1839c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f1841e.height() - f13, -this.f1842f, this.f1840d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1841e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1843g, this.f1839c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f1841e.height() - f13, -this.f1842f, this.f1840d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1847k = colorStateList;
        this.f1838b.setColor(colorStateList.getColorForState(getState(), this.f1847k.getDefaultColor()));
    }

    private void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            float t10 = t(f10);
            float t11 = t(f11);
            if (t10 > t11) {
                if (!this.f1852p) {
                    this.f1852p = true;
                }
                t10 = t11;
            }
            if (this.f1846j == t10 && this.f1844h == t11) {
                return;
            }
            this.f1846j = t10;
            this.f1844h = t11;
            this.f1845i = (int) ((t10 * 1.5f) + this.f1837a + 0.5f);
            this.f1848l = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    private int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1848l) {
            a(getBounds());
            this.f1848l = false;
        }
        canvas.translate(0.0f, this.f1846j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f1846j) / 2.0f);
        f1836r.a(canvas, this.f1841e, this.f1842f, this.f1838b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f1847k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f1842f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f1844h, this.f1842f, this.f1851o));
        int ceil2 = (int) Math.ceil(c(this.f1844h, this.f1842f, this.f1851o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f1844h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1847k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        float f10 = this.f1844h;
        return (Math.max(f10, this.f1842f + this.f1837a + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1844h * 1.5f) + this.f1837a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        float f10 = this.f1844h;
        return (Math.max(f10, this.f1842f + this.f1837a + (f10 / 2.0f)) * 2.0f) + ((this.f1844h + this.f1837a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f1846j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f1851o = z10;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1848l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1847k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1838b.getColor() == colorForState) {
            return false;
        }
        this.f1838b.setColor(colorForState);
        this.f1848l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (int) (f10 + 0.5f);
            if (this.f1842f == f11) {
                return;
            }
            this.f1842f = f11;
            this.f1848l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(float f10) {
        s(this.f1846j, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(float f10) {
        s(f10, this.f1844h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1838b.setAlpha(i10);
        this.f1839c.setAlpha(i10);
        this.f1840d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1838b.setColorFilter(colorFilter);
    }
}
