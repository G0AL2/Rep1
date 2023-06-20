package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.l0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: ReactViewBackgroundDrawable.java */
/* loaded from: classes.dex */
public class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private l0 f16387a;

    /* renamed from: b  reason: collision with root package name */
    private l0 f16388b;

    /* renamed from: c  reason: collision with root package name */
    private l0 f16389c;

    /* renamed from: d  reason: collision with root package name */
    private c f16390d;

    /* renamed from: e  reason: collision with root package name */
    private Path f16391e;

    /* renamed from: f  reason: collision with root package name */
    private Path f16392f;

    /* renamed from: g  reason: collision with root package name */
    private Path f16393g;

    /* renamed from: h  reason: collision with root package name */
    private Path f16394h;

    /* renamed from: j  reason: collision with root package name */
    private Path f16396j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f16397k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f16398l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f16399m;

    /* renamed from: n  reason: collision with root package name */
    private RectF f16400n;

    /* renamed from: o  reason: collision with root package name */
    private PointF f16401o;

    /* renamed from: p  reason: collision with root package name */
    private PointF f16402p;

    /* renamed from: q  reason: collision with root package name */
    private PointF f16403q;

    /* renamed from: r  reason: collision with root package name */
    private PointF f16404r;

    /* renamed from: x  reason: collision with root package name */
    private float[] f16410x;

    /* renamed from: y  reason: collision with root package name */
    private final Context f16411y;

    /* renamed from: z  reason: collision with root package name */
    private int f16412z;

    /* renamed from: i  reason: collision with root package name */
    private Path f16395i = new Path();

    /* renamed from: s  reason: collision with root package name */
    private boolean f16405s = false;

    /* renamed from: t  reason: collision with root package name */
    private float f16406t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private final Paint f16407u = new Paint(1);

    /* renamed from: v  reason: collision with root package name */
    private int f16408v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f16409w = 255;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactViewBackgroundDrawable.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16413a;

        static {
            int[] iArr = new int[c.values().length];
            f16413a = iArr;
            try {
                iArr[c.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16413a[c.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16413a[c.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ReactViewBackgroundDrawable.java */
    /* loaded from: classes.dex */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactViewBackgroundDrawable.java */
    /* loaded from: classes.dex */
    public enum c {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect a(c cVar, float f10) {
            int i10 = a.f16413a[cVar.ordinal()];
            if (i10 == 2) {
                float f11 = f10 * 3.0f;
                return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
            } else if (i10 != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
        }
    }

    public e(Context context) {
        this.f16411y = context;
    }

    private void B() {
        float f10;
        float f11;
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        if (this.f16405s) {
            this.f16405s = false;
            if (this.f16391e == null) {
                this.f16391e = new Path();
            }
            if (this.f16392f == null) {
                this.f16392f = new Path();
            }
            if (this.f16393g == null) {
                this.f16393g = new Path();
            }
            if (this.f16396j == null) {
                this.f16396j = new Path();
            }
            if (this.f16397k == null) {
                this.f16397k = new RectF();
            }
            if (this.f16398l == null) {
                this.f16398l = new RectF();
            }
            if (this.f16399m == null) {
                this.f16399m = new RectF();
            }
            if (this.f16400n == null) {
                this.f16400n = new RectF();
            }
            this.f16391e.reset();
            this.f16392f.reset();
            this.f16393g.reset();
            this.f16396j.reset();
            this.f16397k.set(getBounds());
            this.f16398l.set(getBounds());
            this.f16399m.set(getBounds());
            this.f16400n.set(getBounds());
            RectF k10 = k();
            RectF rectF = this.f16397k;
            rectF.top += k10.top;
            rectF.bottom -= k10.bottom;
            rectF.left += k10.left;
            rectF.right -= k10.right;
            RectF rectF2 = this.f16400n;
            rectF2.top += k10.top * 0.5f;
            rectF2.bottom -= k10.bottom * 0.5f;
            rectF2.left += k10.left * 0.5f;
            rectF2.right -= k10.right * 0.5f;
            float m10 = m();
            float h10 = h(m10, b.TOP_LEFT);
            float h11 = h(m10, b.TOP_RIGHT);
            float h12 = h(m10, b.BOTTOM_LEFT);
            float h13 = h(m10, b.BOTTOM_RIGHT);
            boolean z10 = o() == 1;
            float g10 = g(b.TOP_START);
            float g11 = g(b.TOP_END);
            float g12 = g(b.BOTTOM_START);
            float g13 = g(b.BOTTOM_END);
            if (s6.a.d().b(this.f16411y)) {
                if (!com.facebook.yoga.g.a(g10)) {
                    h10 = g10;
                }
                if (!com.facebook.yoga.g.a(g11)) {
                    h11 = g11;
                }
                if (!com.facebook.yoga.g.a(g12)) {
                    h12 = g12;
                }
                if (!com.facebook.yoga.g.a(g13)) {
                    h13 = g13;
                }
                f10 = z10 ? h11 : h10;
                if (!z10) {
                    h10 = h11;
                }
                f11 = z10 ? h13 : h12;
                if (z10) {
                    h13 = h12;
                }
            } else {
                float f12 = z10 ? g11 : g10;
                if (!z10) {
                    g10 = g11;
                }
                float f13 = z10 ? g13 : g12;
                if (!z10) {
                    g12 = g13;
                }
                if (!com.facebook.yoga.g.a(f12)) {
                    h10 = f12;
                }
                if (!com.facebook.yoga.g.a(g10)) {
                    h11 = g10;
                }
                if (!com.facebook.yoga.g.a(f13)) {
                    h12 = f13;
                }
                f10 = h10;
                h10 = h11;
                f11 = h12;
                if (!com.facebook.yoga.g.a(g12)) {
                    h13 = g12;
                }
            }
            float f14 = f11;
            this.f16391e.addRoundRect(this.f16397k, new float[]{Math.max(f10 - k10.left, 0.0f), Math.max(f10 - k10.top, 0.0f), Math.max(h10 - k10.right, 0.0f), Math.max(h10 - k10.top, 0.0f), Math.max(h13 - k10.right, 0.0f), Math.max(h13 - k10.bottom, 0.0f), Math.max(f11 - k10.left, 0.0f), Math.max(f11 - k10.bottom, 0.0f)}, Path.Direction.CW);
            this.f16392f.addRoundRect(this.f16398l, new float[]{f10, f10, h10, h10, h13, h13, f14, f14}, Path.Direction.CW);
            l0 l0Var = this.f16387a;
            float a10 = l0Var != null ? l0Var.a(8) / 2.0f : 0.0f;
            float f15 = f10 + a10;
            float f16 = h10 + a10;
            float f17 = h13 + a10;
            float f18 = f14 + a10;
            this.f16393g.addRoundRect(this.f16399m, new float[]{f15, f15, f16, f16, f17, f17, f18, f18}, Path.Direction.CW);
            Path path = this.f16396j;
            RectF rectF3 = this.f16400n;
            float[] fArr = new float[8];
            float f19 = k10.left;
            fArr[0] = Math.max(f10 - (f19 * 0.5f), f19 > 0.0f ? f10 / f19 : 0.0f);
            float f20 = k10.top;
            fArr[1] = Math.max(f10 - (f20 * 0.5f), f20 > 0.0f ? f10 / f20 : 0.0f);
            float f21 = k10.right;
            fArr[2] = Math.max(h10 - (f21 * 0.5f), f21 > 0.0f ? h10 / f21 : 0.0f);
            float f22 = k10.top;
            fArr[3] = Math.max(h10 - (f22 * 0.5f), f22 > 0.0f ? h10 / f22 : 0.0f);
            float f23 = k10.right;
            fArr[4] = Math.max(h13 - (f23 * 0.5f), f23 > 0.0f ? h13 / f23 : 0.0f);
            float f24 = k10.bottom;
            fArr[5] = Math.max(h13 - (f24 * 0.5f), f24 > 0.0f ? h13 / f24 : 0.0f);
            float f25 = k10.left;
            fArr[6] = Math.max(f14 - (f25 * 0.5f), f25 > 0.0f ? f14 / f25 : 0.0f);
            float f26 = k10.bottom;
            fArr[7] = Math.max(f14 - (f26 * 0.5f), f26 > 0.0f ? f14 / f26 : 0.0f);
            path.addRoundRect(rectF3, fArr, Path.Direction.CW);
            if (this.f16401o == null) {
                this.f16401o = new PointF();
            }
            PointF pointF = this.f16401o;
            RectF rectF4 = this.f16397k;
            float f27 = rectF4.left;
            pointF.x = f27;
            float f28 = rectF4.top;
            pointF.y = f28;
            RectF rectF5 = this.f16398l;
            l(f27, f28, (max * 2.0f) + f27, (max2 * 2.0f) + f28, rectF5.left, rectF5.top, f27, f28, pointF);
            if (this.f16404r == null) {
                this.f16404r = new PointF();
            }
            PointF pointF2 = this.f16404r;
            RectF rectF6 = this.f16397k;
            float f29 = rectF6.left;
            pointF2.x = f29;
            float f30 = rectF6.bottom;
            pointF2.y = f30;
            RectF rectF7 = this.f16398l;
            l(f29, f30 - (max8 * 2.0f), (max7 * 2.0f) + f29, f30, rectF7.left, rectF7.bottom, f29, f30, pointF2);
            if (this.f16402p == null) {
                this.f16402p = new PointF();
            }
            PointF pointF3 = this.f16402p;
            RectF rectF8 = this.f16397k;
            float f31 = rectF8.right;
            pointF3.x = f31;
            float f32 = rectF8.top;
            pointF3.y = f32;
            RectF rectF9 = this.f16398l;
            l(f31 - (max3 * 2.0f), f32, f31, (max4 * 2.0f) + f32, rectF9.right, rectF9.top, f31, f32, pointF3);
            if (this.f16403q == null) {
                this.f16403q = new PointF();
            }
            PointF pointF4 = this.f16403q;
            RectF rectF10 = this.f16397k;
            float f33 = rectF10.right;
            pointF4.x = f33;
            float f34 = rectF10.bottom;
            pointF4.y = f34;
            RectF rectF11 = this.f16398l;
            l(f33 - (max5 * 2.0f), f34 - (2.0f * max6), f33, f34, rectF11.right, rectF11.bottom, f33, f34, pointF4);
        }
    }

    private void C() {
        c cVar = this.f16390d;
        this.f16407u.setPathEffect(cVar != null ? c.a(cVar, n()) : null);
    }

    private void D(int i10) {
        c cVar = this.f16390d;
        this.f16407u.setPathEffect(cVar != null ? c.a(cVar, i10) : null);
    }

    private static int a(float f10, float f11) {
        return ((((int) f10) << 24) & (-16777216)) | (((int) f11) & 16777215);
    }

    private void b(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 == 0) {
            return;
        }
        if (this.f16394h == null) {
            this.f16394h = new Path();
        }
        this.f16407u.setColor(i10);
        this.f16394h.reset();
        this.f16394h.moveTo(f10, f11);
        this.f16394h.lineTo(f12, f13);
        this.f16394h.lineTo(f14, f15);
        this.f16394h.lineTo(f16, f17);
        this.f16394h.lineTo(f10, f11);
        canvas.drawPath(this.f16394h, this.f16407u);
    }

    private void c(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f16407u.setStyle(Paint.Style.FILL);
        int b10 = com.facebook.react.views.view.b.b(this.f16408v, this.f16409w);
        if (Color.alpha(b10) != 0) {
            this.f16407u.setColor(b10);
            canvas.drawRect(getBounds(), this.f16407u);
        }
        RectF k10 = k();
        int round = Math.round(k10.left);
        int round2 = Math.round(k10.top);
        int round3 = Math.round(k10.right);
        int round4 = Math.round(k10.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int f10 = f(0);
            int f11 = f(1);
            int f12 = f(2);
            int f13 = f(3);
            boolean z10 = o() == 1;
            int f14 = f(4);
            int f15 = f(5);
            if (s6.a.d().b(this.f16411y)) {
                if (q(4)) {
                    f10 = f14;
                }
                if (q(5)) {
                    f12 = f15;
                }
                int i17 = z10 ? f12 : f10;
                if (!z10) {
                    f10 = f12;
                }
                i11 = f10;
                i10 = i17;
            } else {
                int i18 = z10 ? f15 : f14;
                if (!z10) {
                    f14 = f15;
                }
                boolean q10 = q(4);
                boolean q11 = q(5);
                boolean z11 = z10 ? q11 : q10;
                if (!z10) {
                    q10 = q11;
                }
                if (z11) {
                    f10 = i18;
                }
                i10 = f10;
                i11 = q10 ? f14 : f12;
            }
            int i19 = bounds.left;
            int i20 = bounds.top;
            int e10 = e(round, round2, round3, round4, i10, f11, i11, f13);
            if (e10 != 0) {
                if (Color.alpha(e10) != 0) {
                    int i21 = bounds.right;
                    int i22 = bounds.bottom;
                    this.f16407u.setColor(e10);
                    this.f16407u.setStyle(Paint.Style.STROKE);
                    if (round > 0) {
                        this.f16395i.reset();
                        int round5 = Math.round(k10.left);
                        D(round5);
                        this.f16407u.setStrokeWidth(round5);
                        float f16 = i19 + (round5 / 2);
                        this.f16395i.moveTo(f16, i20);
                        this.f16395i.lineTo(f16, i22);
                        canvas.drawPath(this.f16395i, this.f16407u);
                    }
                    if (round2 > 0) {
                        this.f16395i.reset();
                        int round6 = Math.round(k10.top);
                        D(round6);
                        this.f16407u.setStrokeWidth(round6);
                        float f17 = i20 + (round6 / 2);
                        this.f16395i.moveTo(i19, f17);
                        this.f16395i.lineTo(i21, f17);
                        canvas.drawPath(this.f16395i, this.f16407u);
                    }
                    if (round3 > 0) {
                        this.f16395i.reset();
                        int round7 = Math.round(k10.right);
                        D(round7);
                        this.f16407u.setStrokeWidth(round7);
                        float f18 = i21 - (round7 / 2);
                        this.f16395i.moveTo(f18, i20);
                        this.f16395i.lineTo(f18, i22);
                        canvas.drawPath(this.f16395i, this.f16407u);
                    }
                    if (round4 > 0) {
                        this.f16395i.reset();
                        int round8 = Math.round(k10.bottom);
                        D(round8);
                        this.f16407u.setStrokeWidth(round8);
                        float f19 = i22 - (round8 / 2);
                        this.f16395i.moveTo(i19, f19);
                        this.f16395i.lineTo(i21, f19);
                        canvas.drawPath(this.f16395i, this.f16407u);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f16407u.setAntiAlias(false);
            int width = bounds.width();
            int height = bounds.height();
            if (round > 0) {
                float f20 = i19;
                float f21 = i19 + round;
                i12 = i20;
                b(canvas, i10, f20, i20, f21, i20 + round2, f21, i16 - round4, f20, i20 + height);
            } else {
                i12 = i20;
            }
            if (round2 > 0) {
                float f22 = i12;
                float f23 = i12 + round2;
                b(canvas, f11, i19, f22, i19 + round, f23, i15 - round3, f23, i19 + width, f22);
            }
            if (round3 > 0) {
                int i23 = i19 + width;
                float f24 = i23;
                float f25 = i23 - round3;
                b(canvas, i11, f24, i12, f24, i12 + height, f25, i14 - round4, f25, i12 + round2);
            }
            if (round4 > 0) {
                int i24 = i12 + height;
                float f26 = i24;
                float f27 = i24 - round4;
                b(canvas, f13, i19, f26, i19 + width, f26, i13 - round3, f27, i19 + round, f27);
            }
            this.f16407u.setAntiAlias(true);
        }
    }

    private void d(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        B();
        canvas.save();
        int b10 = com.facebook.react.views.view.b.b(this.f16408v, this.f16409w);
        if (Color.alpha(b10) != 0) {
            this.f16407u.setColor(b10);
            this.f16407u.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f16391e, this.f16407u);
        }
        RectF k10 = k();
        int f14 = f(0);
        int f15 = f(1);
        int f16 = f(2);
        int f17 = f(3);
        if (k10.top > 0.0f || k10.bottom > 0.0f || k10.left > 0.0f || k10.right > 0.0f) {
            float n10 = n();
            int f18 = f(8);
            if (k10.top != n10 || k10.bottom != n10 || k10.left != n10 || k10.right != n10 || f14 != f18 || f15 != f18 || f16 != f18 || f17 != f18) {
                this.f16407u.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.f16392f, Region.Op.INTERSECT);
                canvas.clipPath(this.f16391e, Region.Op.DIFFERENCE);
                boolean z10 = o() == 1;
                int f19 = f(4);
                int f20 = f(5);
                if (s6.a.d().b(this.f16411y)) {
                    if (q(4)) {
                        f14 = f19;
                    }
                    if (q(5)) {
                        f16 = f20;
                    }
                    i10 = z10 ? f16 : f14;
                    if (!z10) {
                        f14 = f16;
                    }
                    i11 = f14;
                } else {
                    int i12 = z10 ? f20 : f19;
                    if (!z10) {
                        f19 = f20;
                    }
                    boolean q10 = q(4);
                    boolean q11 = q(5);
                    boolean z11 = z10 ? q11 : q10;
                    if (!z10) {
                        q10 = q11;
                    }
                    if (z11) {
                        f14 = i12;
                    }
                    if (q10) {
                        i10 = f14;
                        i11 = f19;
                    } else {
                        i10 = f14;
                        i11 = f16;
                    }
                }
                RectF rectF = this.f16398l;
                float f21 = rectF.left;
                float f22 = rectF.right;
                float f23 = rectF.top;
                float f24 = rectF.bottom;
                if (k10.left > 0.0f) {
                    PointF pointF = this.f16401o;
                    float f25 = pointF.x;
                    float f26 = pointF.y;
                    PointF pointF2 = this.f16404r;
                    f10 = f24;
                    f11 = f23;
                    f12 = f22;
                    f13 = f21;
                    b(canvas, i10, f21, f23, f25, f26, pointF2.x, pointF2.y, f21, f10);
                } else {
                    f10 = f24;
                    f11 = f23;
                    f12 = f22;
                    f13 = f21;
                }
                if (k10.top > 0.0f) {
                    PointF pointF3 = this.f16401o;
                    float f27 = pointF3.x;
                    float f28 = pointF3.y;
                    PointF pointF4 = this.f16402p;
                    b(canvas, f15, f13, f11, f27, f28, pointF4.x, pointF4.y, f12, f11);
                }
                if (k10.right > 0.0f) {
                    PointF pointF5 = this.f16402p;
                    float f29 = pointF5.x;
                    float f30 = pointF5.y;
                    PointF pointF6 = this.f16403q;
                    b(canvas, i11, f12, f11, f29, f30, pointF6.x, pointF6.y, f12, f10);
                }
                if (k10.bottom > 0.0f) {
                    PointF pointF7 = this.f16404r;
                    float f31 = pointF7.x;
                    float f32 = pointF7.y;
                    PointF pointF8 = this.f16403q;
                    b(canvas, f17, f13, f10, f31, f32, pointF8.x, pointF8.y, f12, f10);
                }
            } else if (n10 > 0.0f) {
                this.f16407u.setColor(com.facebook.react.views.view.b.b(f18, this.f16409w));
                this.f16407u.setStyle(Paint.Style.STROKE);
                this.f16407u.setStrokeWidth(n10);
                canvas.drawPath(this.f16396j, this.f16407u);
            }
        }
        canvas.restore();
    }

    private static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = (i13 > 0 ? i17 : -1) & (i10 > 0 ? i14 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1);
        if (i10 <= 0) {
            i14 = 0;
        }
        if (i11 <= 0) {
            i15 = 0;
        }
        int i19 = i14 | i15;
        if (i12 <= 0) {
            i16 = 0;
        }
        int i20 = i19 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        if (i18 == (i20 | i17)) {
            return i18;
        }
        return 0;
    }

    private int f(int i10) {
        l0 l0Var = this.f16388b;
        float a10 = l0Var != null ? l0Var.a(i10) : 0.0f;
        l0 l0Var2 = this.f16389c;
        return a(l0Var2 != null ? l0Var2.a(i10) : 255.0f, a10);
    }

    private static void l(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        double d18 = (d10 + d12) / 2.0d;
        double d19 = (d11 + d13) / 2.0d;
        double d20 = d14 - d18;
        double d21 = d15 - d19;
        double abs = Math.abs(d12 - d10) / 2.0d;
        double abs2 = Math.abs(d13 - d11) / 2.0d;
        double d22 = ((d17 - d19) - d21) / ((d16 - d18) - d20);
        double d23 = d21 - (d20 * d22);
        double d24 = abs2 * abs2;
        double d25 = abs * abs;
        double d26 = d24 + (d25 * d22 * d22);
        double d27 = abs * 2.0d * abs * d23 * d22;
        double d28 = (-(d25 * ((d23 * d23) - d24))) / d26;
        double d29 = d26 * 2.0d;
        double sqrt = ((-d27) / d29) - Math.sqrt(d28 + Math.pow(d27 / d29, 2.0d));
        double d30 = sqrt + d18;
        double d31 = (d22 * sqrt) + d23 + d19;
        if (Double.isNaN(d30) || Double.isNaN(d31)) {
            return;
        }
        pointF.x = (float) d30;
        pointF.y = (float) d31;
    }

    private boolean q(int i10) {
        l0 l0Var = this.f16388b;
        float a10 = l0Var != null ? l0Var.a(i10) : Float.NaN;
        l0 l0Var2 = this.f16389c;
        return (com.facebook.yoga.g.a(a10) || com.facebook.yoga.g.a(l0Var2 != null ? l0Var2.a(i10) : Float.NaN)) ? false : true;
    }

    private void s(int i10, float f10) {
        if (this.f16389c == null) {
            this.f16389c = new l0(255.0f);
        }
        if (com.facebook.react.uimanager.e.a(this.f16389c.b(i10), f10)) {
            return;
        }
        this.f16389c.d(i10, f10);
        invalidateSelf();
    }

    private void u(int i10, float f10) {
        if (this.f16388b == null) {
            this.f16388b = new l0(0.0f);
        }
        if (com.facebook.react.uimanager.e.a(this.f16388b.b(i10), f10)) {
            return;
        }
        this.f16388b.d(i10, f10);
        invalidateSelf();
    }

    public boolean A(int i10) {
        if (this.f16412z != i10) {
            this.f16412z = i10;
            return r(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C();
        if (!p()) {
            c(canvas);
        } else {
            d(canvas);
        }
    }

    public float g(b bVar) {
        return h(Float.NaN, bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16409w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return com.facebook.react.views.view.b.a(com.facebook.react.views.view.b.b(this.f16408v, this.f16409w));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((!com.facebook.yoga.g.a(this.f16406t) && this.f16406t > 0.0f) || this.f16410x != null) {
            B();
            outline.setConvexPath(this.f16393g);
            return;
        }
        outline.setRect(getBounds());
    }

    public float h(float f10, b bVar) {
        float[] fArr = this.f16410x;
        if (fArr == null) {
            return f10;
        }
        float f11 = fArr[bVar.ordinal()];
        return com.facebook.yoga.g.a(f11) ? f10 : f11;
    }

    public float i(float f10, int i10) {
        l0 l0Var = this.f16387a;
        if (l0Var == null) {
            return f10;
        }
        float b10 = l0Var.b(i10);
        return com.facebook.yoga.g.a(b10) ? f10 : b10;
    }

    public int j() {
        return this.f16408v;
    }

    @TargetApi(21)
    public RectF k() {
        float i10 = i(0.0f, 8);
        float i11 = i(i10, 1);
        float i12 = i(i10, 3);
        float i13 = i(i10, 0);
        float i14 = i(i10, 2);
        if (this.f16387a != null) {
            boolean z10 = o() == 1;
            float b10 = this.f16387a.b(4);
            float b11 = this.f16387a.b(5);
            if (s6.a.d().b(this.f16411y)) {
                if (!com.facebook.yoga.g.a(b10)) {
                    i13 = b10;
                }
                if (!com.facebook.yoga.g.a(b11)) {
                    i14 = b11;
                }
                float f10 = z10 ? i14 : i13;
                if (z10) {
                    i14 = i13;
                }
                i13 = f10;
            } else {
                float f11 = z10 ? b11 : b10;
                if (!z10) {
                    b10 = b11;
                }
                if (!com.facebook.yoga.g.a(f11)) {
                    i13 = f11;
                }
                if (!com.facebook.yoga.g.a(b10)) {
                    i14 = b10;
                }
            }
        }
        return new RectF(i13, i11, i14, i12);
    }

    public float m() {
        if (com.facebook.yoga.g.a(this.f16406t)) {
            return 0.0f;
        }
        return this.f16406t;
    }

    public float n() {
        l0 l0Var = this.f16387a;
        if (l0Var == null || com.facebook.yoga.g.a(l0Var.b(8))) {
            return 0.0f;
        }
        return this.f16387a.b(8);
    }

    public int o() {
        return this.f16412z;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16405s = true;
    }

    public boolean p() {
        if (com.facebook.yoga.g.a(this.f16406t) || this.f16406t <= 0.0f) {
            float[] fArr = this.f16410x;
            if (fArr != null) {
                for (float f10 : fArr) {
                    if (!com.facebook.yoga.g.a(f10) && f10 > 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean r(int i10) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f16409w) {
            this.f16409w = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i10, float f10, float f11) {
        u(i10, f10);
        s(i10, f11);
    }

    public void v(String str) {
        c valueOf = str == null ? null : c.valueOf(str.toUpperCase(Locale.US));
        if (this.f16390d != valueOf) {
            this.f16390d = valueOf;
            this.f16405s = true;
            invalidateSelf();
        }
    }

    public void w(int i10, float f10) {
        if (this.f16387a == null) {
            this.f16387a = new l0();
        }
        if (com.facebook.react.uimanager.e.a(this.f16387a.b(i10), f10)) {
            return;
        }
        this.f16387a.d(i10, f10);
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
            this.f16405s = true;
        }
        invalidateSelf();
    }

    public void x(int i10) {
        this.f16408v = i10;
        invalidateSelf();
    }

    public void y(float f10) {
        if (com.facebook.react.uimanager.e.a(this.f16406t, f10)) {
            return;
        }
        this.f16406t = f10;
        this.f16405s = true;
        invalidateSelf();
    }

    public void z(float f10, int i10) {
        if (this.f16410x == null) {
            float[] fArr = new float[8];
            this.f16410x = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (com.facebook.react.uimanager.e.a(this.f16410x[i10], f10)) {
            return;
        }
        this.f16410x[i10] = f10;
        this.f16405s = true;
        invalidateSelf();
    }
}
