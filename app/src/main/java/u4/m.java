package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* compiled from: RoundedCornersDrawable.java */
/* loaded from: classes.dex */
public class m extends g implements j {

    /* renamed from: d  reason: collision with root package name */
    b f37493d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f37494e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f37495f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f37496g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f37497h;

    /* renamed from: i  reason: collision with root package name */
    final float[] f37498i;

    /* renamed from: j  reason: collision with root package name */
    final Paint f37499j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37500k;

    /* renamed from: l  reason: collision with root package name */
    private float f37501l;

    /* renamed from: m  reason: collision with root package name */
    private int f37502m;

    /* renamed from: n  reason: collision with root package name */
    private int f37503n;

    /* renamed from: o  reason: collision with root package name */
    private float f37504o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f37505p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f37506q;

    /* renamed from: r  reason: collision with root package name */
    private final Path f37507r;

    /* renamed from: s  reason: collision with root package name */
    private final Path f37508s;

    /* renamed from: t  reason: collision with root package name */
    private final RectF f37509t;

    /* compiled from: RoundedCornersDrawable.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37510a;

        static {
            int[] iArr = new int[b.values().length];
            f37510a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37510a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: RoundedCornersDrawable.java */
    /* loaded from: classes.dex */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) y3.k.g(drawable));
        this.f37493d = b.OVERLAY_COLOR;
        this.f37494e = new RectF();
        this.f37497h = new float[8];
        this.f37498i = new float[8];
        this.f37499j = new Paint(1);
        this.f37500k = false;
        this.f37501l = 0.0f;
        this.f37502m = 0;
        this.f37503n = 0;
        this.f37504o = 0.0f;
        this.f37505p = false;
        this.f37506q = false;
        this.f37507r = new Path();
        this.f37508s = new Path();
        this.f37509t = new RectF();
    }

    private void y() {
        float[] fArr;
        this.f37507r.reset();
        this.f37508s.reset();
        this.f37509t.set(getBounds());
        RectF rectF = this.f37509t;
        float f10 = this.f37504o;
        rectF.inset(f10, f10);
        if (this.f37493d == b.OVERLAY_COLOR) {
            this.f37507r.addRect(this.f37509t, Path.Direction.CW);
        }
        if (this.f37500k) {
            this.f37507r.addCircle(this.f37509t.centerX(), this.f37509t.centerY(), Math.min(this.f37509t.width(), this.f37509t.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f37507r.addRoundRect(this.f37509t, this.f37497h, Path.Direction.CW);
        }
        RectF rectF2 = this.f37509t;
        float f11 = this.f37504o;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f37509t;
        float f12 = this.f37501l;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f37500k) {
            this.f37508s.addCircle(this.f37509t.centerX(), this.f37509t.centerY(), Math.min(this.f37509t.width(), this.f37509t.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f37498i;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f37497h[i10] + this.f37504o) - (this.f37501l / 2.0f);
                i10++;
            }
            this.f37508s.addRoundRect(this.f37509t, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f37509t;
        float f13 = this.f37501l;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // u4.j
    public void b(int i10, float f10) {
        this.f37502m = i10;
        this.f37501l = f10;
        y();
        invalidateSelf();
    }

    @Override // u4.j
    public void d(boolean z10) {
        this.f37500k = z10;
        y();
        invalidateSelf();
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f37494e.set(getBounds());
        int i10 = a.f37510a[this.f37493d.ordinal()];
        if (i10 == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f37507r);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i10 == 2) {
            if (this.f37505p) {
                RectF rectF = this.f37495f;
                if (rectF == null) {
                    this.f37495f = new RectF(this.f37494e);
                    this.f37496g = new Matrix();
                } else {
                    rectF.set(this.f37494e);
                }
                RectF rectF2 = this.f37495f;
                float f10 = this.f37501l;
                rectF2.inset(f10, f10);
                this.f37496g.setRectToRect(this.f37494e, this.f37495f, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f37494e);
                canvas.concat(this.f37496g);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f37499j.setStyle(Paint.Style.FILL);
            this.f37499j.setColor(this.f37503n);
            this.f37499j.setStrokeWidth(0.0f);
            this.f37499j.setFilterBitmap(w());
            this.f37507r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f37507r, this.f37499j);
            if (this.f37500k) {
                float width = ((this.f37494e.width() - this.f37494e.height()) + this.f37501l) / 2.0f;
                float height = ((this.f37494e.height() - this.f37494e.width()) + this.f37501l) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f37494e;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + width, rectF3.bottom, this.f37499j);
                    RectF rectF4 = this.f37494e;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - width, rectF4.top, f12, rectF4.bottom, this.f37499j);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f37494e;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + height, this.f37499j);
                    RectF rectF6 = this.f37494e;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - height, rectF6.right, f16, this.f37499j);
                }
            }
        }
        if (this.f37502m != 0) {
            this.f37499j.setStyle(Paint.Style.STROKE);
            this.f37499j.setColor(this.f37502m);
            this.f37499j.setStrokeWidth(this.f37501l);
            this.f37507r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f37508s, this.f37499j);
        }
    }

    @Override // u4.j
    public void i(float f10) {
        this.f37504o = f10;
        y();
        invalidateSelf();
    }

    @Override // u4.j
    public void j(float f10) {
        Arrays.fill(this.f37497h, f10);
        y();
        invalidateSelf();
    }

    @Override // u4.j
    public void m(boolean z10) {
        if (this.f37506q != z10) {
            this.f37506q = z10;
            invalidateSelf();
        }
    }

    @Override // u4.j
    public void n(boolean z10) {
        this.f37505p = z10;
        y();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u4.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        y();
    }

    @Override // u4.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f37497h, 0.0f);
        } else {
            y3.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f37497h, 0, 8);
        }
        y();
        invalidateSelf();
    }

    public boolean w() {
        return this.f37506q;
    }

    public void x(int i10) {
        this.f37503n = i10;
        invalidateSelf();
    }
}
