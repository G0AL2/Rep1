package u4;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: RoundedColorDrawable.java */
/* loaded from: classes.dex */
public class l extends Drawable implements j {

    /* renamed from: c  reason: collision with root package name */
    float[] f37480c;

    /* renamed from: a  reason: collision with root package name */
    private final float[] f37478a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    final float[] f37479b = new float[8];

    /* renamed from: d  reason: collision with root package name */
    final Paint f37481d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private boolean f37482e = false;

    /* renamed from: f  reason: collision with root package name */
    private float f37483f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f37484g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private int f37485h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37486i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f37487j = false;

    /* renamed from: k  reason: collision with root package name */
    final Path f37488k = new Path();

    /* renamed from: l  reason: collision with root package name */
    final Path f37489l = new Path();

    /* renamed from: m  reason: collision with root package name */
    private int f37490m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f37491n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    private int f37492o = 255;

    public l(int i10) {
        e(i10);
    }

    @TargetApi(11)
    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    private void f() {
        float[] fArr;
        float[] fArr2;
        this.f37488k.reset();
        this.f37489l.reset();
        this.f37491n.set(getBounds());
        RectF rectF = this.f37491n;
        float f10 = this.f37483f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f37482e) {
            this.f37489l.addCircle(this.f37491n.centerX(), this.f37491n.centerY(), Math.min(this.f37491n.width(), this.f37491n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f37479b;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f37478a[i11] + this.f37484g) - (this.f37483f / 2.0f);
                i11++;
            }
            this.f37489l.addRoundRect(this.f37491n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f37491n;
        float f11 = this.f37483f;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f37484g + (this.f37486i ? this.f37483f : 0.0f);
        this.f37491n.inset(f12, f12);
        if (this.f37482e) {
            this.f37488k.addCircle(this.f37491n.centerX(), this.f37491n.centerY(), Math.min(this.f37491n.width(), this.f37491n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f37486i) {
            if (this.f37480c == null) {
                this.f37480c = new float[8];
            }
            while (true) {
                fArr2 = this.f37480c;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f37478a[i10] - this.f37483f;
                i10++;
            }
            this.f37488k.addRoundRect(this.f37491n, fArr2, Path.Direction.CW);
        } else {
            this.f37488k.addRoundRect(this.f37491n, this.f37478a, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f37491n.inset(f13, f13);
    }

    @Override // u4.j
    public void b(int i10, float f10) {
        if (this.f37485h != i10) {
            this.f37485h = i10;
            invalidateSelf();
        }
        if (this.f37483f != f10) {
            this.f37483f = f10;
            f();
            invalidateSelf();
        }
    }

    public boolean c() {
        return this.f37487j;
    }

    @Override // u4.j
    public void d(boolean z10) {
        this.f37482e = z10;
        f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f37481d.setColor(e.c(this.f37490m, this.f37492o));
        this.f37481d.setStyle(Paint.Style.FILL);
        this.f37481d.setFilterBitmap(c());
        canvas.drawPath(this.f37488k, this.f37481d);
        if (this.f37483f != 0.0f) {
            this.f37481d.setColor(e.c(this.f37485h, this.f37492o));
            this.f37481d.setStyle(Paint.Style.STROKE);
            this.f37481d.setStrokeWidth(this.f37483f);
            canvas.drawPath(this.f37489l, this.f37481d);
        }
    }

    public void e(int i10) {
        if (this.f37490m != i10) {
            this.f37490m = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37492o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.b(e.c(this.f37490m, this.f37492o));
    }

    @Override // u4.j
    public void i(float f10) {
        if (this.f37484g != f10) {
            this.f37484g = f10;
            f();
            invalidateSelf();
        }
    }

    @Override // u4.j
    public void j(float f10) {
        y3.k.c(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f37478a, f10);
        f();
        invalidateSelf();
    }

    @Override // u4.j
    public void m(boolean z10) {
        if (this.f37487j != z10) {
            this.f37487j = z10;
            invalidateSelf();
        }
    }

    @Override // u4.j
    public void n(boolean z10) {
        if (this.f37486i != z10) {
            this.f37486i = z10;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // u4.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f37478a, 0.0f);
        } else {
            y3.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f37478a, 0, 8);
        }
        f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f37492o) {
            this.f37492o = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
