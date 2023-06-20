package u4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes.dex */
public abstract class n extends Drawable implements j, r {
    private s C;

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f37514a;

    /* renamed from: k  reason: collision with root package name */
    float[] f37524k;

    /* renamed from: p  reason: collision with root package name */
    RectF f37529p;

    /* renamed from: v  reason: collision with root package name */
    Matrix f37535v;

    /* renamed from: w  reason: collision with root package name */
    Matrix f37536w;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f37515b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f37516c = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f37517d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    protected final Path f37518e = new Path();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f37519f = true;

    /* renamed from: g  reason: collision with root package name */
    protected int f37520g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected final Path f37521h = new Path();

    /* renamed from: i  reason: collision with root package name */
    private final float[] f37522i = new float[8];

    /* renamed from: j  reason: collision with root package name */
    final float[] f37523j = new float[8];

    /* renamed from: l  reason: collision with root package name */
    final RectF f37525l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    final RectF f37526m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    final RectF f37527n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    final RectF f37528o = new RectF();

    /* renamed from: q  reason: collision with root package name */
    final Matrix f37530q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    final Matrix f37531r = new Matrix();

    /* renamed from: s  reason: collision with root package name */
    final Matrix f37532s = new Matrix();

    /* renamed from: t  reason: collision with root package name */
    final Matrix f37533t = new Matrix();

    /* renamed from: u  reason: collision with root package name */
    final Matrix f37534u = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    final Matrix f37537x = new Matrix();

    /* renamed from: y  reason: collision with root package name */
    private float f37538y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    private boolean f37539z = false;
    private boolean A = false;
    private boolean B = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Drawable drawable) {
        this.f37514a = drawable;
    }

    public boolean a() {
        return this.A;
    }

    @Override // u4.j
    public void b(int i10, float f10) {
        if (this.f37520g == i10 && this.f37517d == f10) {
            return;
        }
        this.f37520g = i10;
        this.f37517d = f10;
        this.B = true;
        invalidateSelf();
    }

    @Override // u4.r
    public void c(s sVar) {
        this.C = sVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f37514a.clearColorFilter();
    }

    @Override // u4.j
    public void d(boolean z10) {
        this.f37515b = z10;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c6.b.d()) {
            c6.b.a("RoundedDrawable#draw");
        }
        this.f37514a.draw(canvas);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f37515b || this.f37516c || this.f37517d > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        float[] fArr;
        if (this.B) {
            this.f37521h.reset();
            RectF rectF = this.f37525l;
            float f10 = this.f37517d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f37515b) {
                this.f37521h.addCircle(this.f37525l.centerX(), this.f37525l.centerY(), Math.min(this.f37525l.width(), this.f37525l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f37523j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f37522i[i10] + this.f37538y) - (this.f37517d / 2.0f);
                    i10++;
                }
                this.f37521h.addRoundRect(this.f37525l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f37525l;
            float f11 = this.f37517d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f37518e.reset();
            float f12 = this.f37538y + (this.f37539z ? this.f37517d : 0.0f);
            this.f37525l.inset(f12, f12);
            if (this.f37515b) {
                this.f37518e.addCircle(this.f37525l.centerX(), this.f37525l.centerY(), Math.min(this.f37525l.width(), this.f37525l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f37539z) {
                if (this.f37524k == null) {
                    this.f37524k = new float[8];
                }
                for (int i11 = 0; i11 < this.f37523j.length; i11++) {
                    this.f37524k[i11] = this.f37522i[i11] - this.f37517d;
                }
                this.f37518e.addRoundRect(this.f37525l, this.f37524k, Path.Direction.CW);
            } else {
                this.f37518e.addRoundRect(this.f37525l, this.f37522i, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f37525l.inset(f13, f13);
            this.f37518e.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        Matrix matrix;
        s sVar = this.C;
        if (sVar != null) {
            sVar.e(this.f37532s);
            this.C.o(this.f37525l);
        } else {
            this.f37532s.reset();
            this.f37525l.set(getBounds());
        }
        this.f37527n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f37528o.set(this.f37514a.getBounds());
        this.f37530q.setRectToRect(this.f37527n, this.f37528o, Matrix.ScaleToFit.FILL);
        if (this.f37539z) {
            RectF rectF = this.f37529p;
            if (rectF == null) {
                this.f37529p = new RectF(this.f37525l);
            } else {
                rectF.set(this.f37525l);
            }
            RectF rectF2 = this.f37529p;
            float f10 = this.f37517d;
            rectF2.inset(f10, f10);
            if (this.f37535v == null) {
                this.f37535v = new Matrix();
            }
            this.f37535v.setRectToRect(this.f37525l, this.f37529p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f37535v;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f37532s.equals(this.f37533t) || !this.f37530q.equals(this.f37531r) || ((matrix = this.f37535v) != null && !matrix.equals(this.f37536w))) {
            this.f37519f = true;
            this.f37532s.invert(this.f37534u);
            this.f37537x.set(this.f37532s);
            if (this.f37539z) {
                this.f37537x.postConcat(this.f37535v);
            }
            this.f37537x.preConcat(this.f37530q);
            this.f37533t.set(this.f37532s);
            this.f37531r.set(this.f37530q);
            if (this.f37539z) {
                Matrix matrix3 = this.f37536w;
                if (matrix3 == null) {
                    this.f37536w = new Matrix(this.f37535v);
                } else {
                    matrix3.set(this.f37535v);
                }
            } else {
                Matrix matrix4 = this.f37536w;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.f37525l.equals(this.f37526m)) {
            return;
        }
        this.B = true;
        this.f37526m.set(this.f37525l);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37514a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37514a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f37514a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f37514a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f37514a.getOpacity();
    }

    @Override // u4.j
    public void i(float f10) {
        if (this.f37538y != f10) {
            this.f37538y = f10;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // u4.j
    public void j(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        y3.k.i(i10 >= 0);
        Arrays.fill(this.f37522i, f10);
        this.f37516c = i10 != 0;
        this.B = true;
        invalidateSelf();
    }

    @Override // u4.j
    public void m(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            invalidateSelf();
        }
    }

    @Override // u4.j
    public void n(boolean z10) {
        if (this.f37539z != z10) {
            this.f37539z = z10;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f37514a.setBounds(rect);
    }

    @Override // u4.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f37522i, 0.0f);
            this.f37516c = false;
        } else {
            y3.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f37522i, 0, 8);
            this.f37516c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f37516c |= fArr[i10] > 0.0f;
            }
        }
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37514a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f37514a.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37514a.setColorFilter(colorFilter);
    }
}
