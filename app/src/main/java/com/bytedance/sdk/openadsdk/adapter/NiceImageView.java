package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class NiceImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Context f10935a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10936b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10937c;

    /* renamed from: d  reason: collision with root package name */
    private int f10938d;

    /* renamed from: e  reason: collision with root package name */
    private int f10939e;

    /* renamed from: f  reason: collision with root package name */
    private int f10940f;

    /* renamed from: g  reason: collision with root package name */
    private int f10941g;

    /* renamed from: h  reason: collision with root package name */
    private int f10942h;

    /* renamed from: i  reason: collision with root package name */
    private int f10943i;

    /* renamed from: j  reason: collision with root package name */
    private int f10944j;

    /* renamed from: k  reason: collision with root package name */
    private int f10945k;

    /* renamed from: l  reason: collision with root package name */
    private int f10946l;

    /* renamed from: m  reason: collision with root package name */
    private int f10947m;

    /* renamed from: n  reason: collision with root package name */
    private Xfermode f10948n;

    /* renamed from: o  reason: collision with root package name */
    private int f10949o;

    /* renamed from: p  reason: collision with root package name */
    private int f10950p;

    /* renamed from: q  reason: collision with root package name */
    private float f10951q;

    /* renamed from: r  reason: collision with root package name */
    private float[] f10952r;

    /* renamed from: s  reason: collision with root package name */
    private float[] f10953s;

    /* renamed from: t  reason: collision with root package name */
    private RectF f10954t;

    /* renamed from: u  reason: collision with root package name */
    private RectF f10955u;

    /* renamed from: v  reason: collision with root package name */
    private Paint f10956v;

    /* renamed from: w  reason: collision with root package name */
    private Path f10957w;

    /* renamed from: x  reason: collision with root package name */
    private Path f10958x;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        if (this.f10936b) {
            int i10 = this.f10938d;
            if (i10 > 0) {
                a(canvas, i10, this.f10939e, this.f10951q - (i10 / 2.0f));
            }
            int i11 = this.f10940f;
            if (i11 > 0) {
                a(canvas, i11, this.f10941g, (this.f10951q - this.f10938d) - (i11 / 2.0f));
                return;
            }
            return;
        }
        int i12 = this.f10938d;
        if (i12 > 0) {
            a(canvas, i12, this.f10939e, this.f10955u, this.f10952r);
        }
    }

    private void b() {
        if (this.f10936b) {
            float min = Math.min(this.f10949o, this.f10950p) / 2.0f;
            this.f10951q = min;
            RectF rectF = this.f10954t;
            int i10 = this.f10949o;
            int i11 = this.f10950p;
            rectF.set((i10 / 2.0f) - min, (i11 / 2.0f) - min, (i10 / 2.0f) + min, (i11 / 2.0f) + min);
            return;
        }
        this.f10954t.set(0.0f, 0.0f, this.f10949o, this.f10950p);
        if (this.f10937c) {
            this.f10954t = this.f10955u;
        }
    }

    private void c() {
        if (this.f10936b) {
            return;
        }
        int i10 = 0;
        if (this.f10942h <= 0) {
            float[] fArr = this.f10952r;
            int i11 = this.f10943i;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.f10944j;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.f10946l;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.f10945k;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.f10953s;
            int i15 = this.f10938d;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.f10952r;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.f10942h;
            fArr3[i10] = i16;
            this.f10953s[i10] = i16 - (this.f10938d / 2.0f);
            i10++;
        }
    }

    private void d() {
        if (this.f10936b) {
            return;
        }
        this.f10940f = 0;
    }

    public void isCircle(boolean z10) {
        this.f10936b = z10;
        d();
        b();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.f10937c = z10;
        b();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f10954t, null, 31);
        if (!this.f10937c) {
            int i10 = this.f10949o;
            int i11 = this.f10938d;
            int i12 = this.f10940f;
            int i13 = this.f10950p;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.f10956v.reset();
        this.f10957w.reset();
        if (this.f10936b) {
            this.f10957w.addCircle(this.f10949o / 2.0f, this.f10950p / 2.0f, this.f10951q, Path.Direction.CCW);
        } else {
            this.f10957w.addRoundRect(this.f10954t, this.f10953s, Path.Direction.CCW);
        }
        this.f10956v.setAntiAlias(true);
        this.f10956v.setStyle(Paint.Style.FILL);
        this.f10956v.setXfermode(this.f10948n);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f10957w, this.f10956v);
        } else {
            this.f10958x.addRect(this.f10954t, Path.Direction.CCW);
            this.f10958x.op(this.f10957w, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f10958x, this.f10956v);
        }
        this.f10956v.setXfermode(null);
        int i14 = this.f10947m;
        if (i14 != 0) {
            this.f10956v.setColor(i14);
            canvas.drawPath(this.f10957w, this.f10956v);
        }
        canvas.restore();
        a(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f10949o = i10;
        this.f10950p = i11;
        a();
        b();
    }

    public void setBorderColor(int i10) {
        this.f10939e = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f10938d = v.e(this.f10935a, i10);
        a(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.f10945k = v.e(this.f10935a, i10);
        a(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.f10946l = v.e(this.f10935a, i10);
        a(true);
    }

    public void setCornerRadius(int i10) {
        this.f10942h = v.e(this.f10935a, i10);
        a(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.f10943i = v.e(this.f10935a, i10);
        a(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.f10944j = v.e(this.f10935a, i10);
        a(true);
    }

    public void setInnerBorderColor(int i10) {
        this.f10941g = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.f10940f = v.e(this.f10935a, i10);
        d();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.f10947m = i10;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10939e = -1;
        this.f10941g = -1;
        this.f10935a = context;
        this.f10942h = v.e(context, 10.0f);
        this.f10952r = new float[8];
        this.f10953s = new float[8];
        this.f10955u = new RectF();
        this.f10954t = new RectF();
        this.f10956v = new Paint();
        this.f10957w = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f10948n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f10948n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f10958x = new Path();
        }
        c();
        d();
    }

    private void a(Canvas canvas, int i10, int i11, float f10) {
        a(i10, i11);
        this.f10957w.addCircle(this.f10949o / 2.0f, this.f10950p / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.f10957w, this.f10956v);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        a(i10, i11);
        this.f10957w.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f10957w, this.f10956v);
    }

    private void a(int i10, int i11) {
        this.f10957w.reset();
        this.f10956v.setStrokeWidth(i10);
        this.f10956v.setColor(i11);
        this.f10956v.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        if (this.f10936b) {
            return;
        }
        RectF rectF = this.f10955u;
        int i10 = this.f10938d;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.f10949o - (i10 / 2.0f), this.f10950p - (i10 / 2.0f));
    }

    private void a(boolean z10) {
        if (z10) {
            this.f10942h = 0;
        }
        c();
        a();
        invalidate();
    }
}
