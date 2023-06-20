package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.android.material.internal.f;
import ha.l;
import ia.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ua.c;
import ua.d;
import va.b;
import xa.g;

/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, f.b {
    private static final int[] L0 = {16842910};
    private static final ShapeDrawable M0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private PorterDuffColorFilter A0;
    private float B;
    private ColorStateList B0;
    private ColorStateList C;
    private PorterDuff.Mode C0;
    private CharSequence D;
    private int[] D0;
    private boolean E;
    private boolean E0;
    private Drawable F;
    private ColorStateList F0;
    private ColorStateList G;
    private WeakReference<InterfaceC0296a> G0;
    private float H;
    private TextUtils.TruncateAt H0;
    private boolean I;
    private boolean I0;
    private boolean J;
    private int J0;
    private Drawable K;
    private boolean K0;
    private Drawable L;
    private ColorStateList M;
    private float N;
    private CharSequence O;
    private boolean P;
    private boolean Q;
    private Drawable R;
    private h S;
    private h T;
    private float U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;

    /* renamed from: g0  reason: collision with root package name */
    private float f22221g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f22222h0;

    /* renamed from: i0  reason: collision with root package name */
    private final Context f22223i0;

    /* renamed from: j0  reason: collision with root package name */
    private final Paint f22224j0;

    /* renamed from: k0  reason: collision with root package name */
    private final Paint f22225k0;

    /* renamed from: l0  reason: collision with root package name */
    private final Paint.FontMetrics f22226l0;

    /* renamed from: m0  reason: collision with root package name */
    private final RectF f22227m0;

    /* renamed from: n0  reason: collision with root package name */
    private final PointF f22228n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Path f22229o0;

    /* renamed from: p0  reason: collision with root package name */
    private final f f22230p0;

    /* renamed from: q0  reason: collision with root package name */
    private int f22231q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f22232r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f22233s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f22234t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f22235u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f22236v0;

    /* renamed from: w  reason: collision with root package name */
    private ColorStateList f22237w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f22238w0;

    /* renamed from: x  reason: collision with root package name */
    private ColorStateList f22239x;

    /* renamed from: x0  reason: collision with root package name */
    private int f22240x0;

    /* renamed from: y  reason: collision with root package name */
    private float f22241y;

    /* renamed from: y0  reason: collision with root package name */
    private int f22242y0;

    /* renamed from: z  reason: collision with root package name */
    private float f22243z;

    /* renamed from: z0  reason: collision with root package name */
    private ColorFilter f22244z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0296a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22224j0 = new Paint(1);
        this.f22226l0 = new Paint.FontMetrics();
        this.f22227m0 = new RectF();
        this.f22228n0 = new PointF();
        this.f22229o0 = new Path();
        this.f22242y0 = 255;
        this.C0 = PorterDuff.Mode.SRC_IN;
        this.G0 = new WeakReference<>(null);
        L(context);
        this.f22223i0 = context;
        f fVar = new f(this);
        this.f22230p0 = fVar;
        this.D = "";
        fVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f22225k0 = null;
        int[] iArr = L0;
        setState(iArr);
        c2(iArr);
        this.I0 = true;
        if (b.f38019a) {
            M0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (this.D != null) {
            Paint.Align p02 = p0(rect, this.f22228n0);
            n0(rect, this.f22227m0);
            if (this.f22230p0.d() != null) {
                this.f22230p0.e().drawableState = getState();
                this.f22230p0.j(this.f22223i0);
            }
            this.f22230p0.e().setTextAlign(p02);
            int i10 = 0;
            boolean z10 = Math.round(this.f22230p0.f(a1().toString())) > Math.round(this.f22227m0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f22227m0);
            }
            CharSequence charSequence = this.D;
            if (z10 && this.H0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f22230p0.e(), this.f22227m0.width(), this.H0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f22228n0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f22230p0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    private boolean D2() {
        return this.Q && this.R != null && this.f22238w0;
    }

    private boolean E2() {
        return this.E && this.F != null;
    }

    private boolean F2() {
        return this.J && this.K != null;
    }

    private void G2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void H2() {
        this.F0 = this.E0 ? b.d(this.C) : null;
    }

    @TargetApi(21)
    private void I2() {
        this.L = new RippleDrawable(b.d(Y0()), this.K, M0);
    }

    private void S1(ColorStateList colorStateList) {
        if (this.f22237w != colorStateList) {
            this.f22237w = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter e1() {
        ColorFilter colorFilter = this.f22244z0;
        return colorFilter != null ? colorFilter : this.A0;
    }

    private void g0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.K) {
            if (drawable.isStateful()) {
                drawable.setState(R0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.M);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.F;
        if (drawable == drawable2 && this.I) {
            androidx.core.graphics.drawable.a.o(drawable2, this.G);
        }
    }

    private static boolean g1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (E2() || D2()) {
            float f10 = this.U + this.V;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + this.H;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - this.H;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.H;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (F2()) {
            float f10 = this.f22222h0 + this.f22221g0 + this.N + this.Z + this.Y;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (F2()) {
            float f10 = this.f22222h0 + this.f22221g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.N;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.N;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.N;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private static boolean k1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (F2()) {
            float f10 = this.f22222h0 + this.f22221g0 + this.N + this.Z + this.Y;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean l1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean m1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f37683b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.D != null) {
            float i02 = this.U + i0() + this.X;
            float m02 = this.f22222h0 + m0() + this.Y;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + i02;
                rectF.right = rect.right - m02;
            } else {
                rectF.left = rect.left + m02;
                rectF.right = rect.right - i02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void n1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray k10 = com.google.android.material.internal.g.k(this.f22223i0, attributeSet, l.D, i10, i11, new int[0]);
        this.K0 = k10.hasValue(l.f31333n0);
        S1(c.a(this.f22223i0, k10, l.f31268a0));
        w1(c.a(this.f22223i0, k10, l.N));
        K1(k10.getDimension(l.V, 0.0f));
        int i12 = l.O;
        if (k10.hasValue(i12)) {
            y1(k10.getDimension(i12, 0.0f));
        }
        O1(c.a(this.f22223i0, k10, l.Y));
        Q1(k10.getDimension(l.Z, 0.0f));
        p2(c.a(this.f22223i0, k10, l.f31328m0));
        u2(k10.getText(l.I));
        v2(c.f(this.f22223i0, k10, l.E));
        int i13 = k10.getInt(l.G, 0);
        if (i13 == 1) {
            h2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            h2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            h2(TextUtils.TruncateAt.END);
        }
        J1(k10.getBoolean(l.U, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            J1(k10.getBoolean(l.R, false));
        }
        C1(c.d(this.f22223i0, k10, l.Q));
        int i14 = l.T;
        if (k10.hasValue(i14)) {
            G1(c.a(this.f22223i0, k10, i14));
        }
        E1(k10.getDimension(l.S, 0.0f));
        f2(k10.getBoolean(l.f31303h0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            f2(k10.getBoolean(l.f31278c0, false));
        }
        T1(c.d(this.f22223i0, k10, l.f31273b0));
        d2(c.a(this.f22223i0, k10, l.f31298g0));
        Y1(k10.getDimension(l.f31288e0, 0.0f));
        q1(k10.getBoolean(l.J, false));
        v1(k10.getBoolean(l.M, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            v1(k10.getBoolean(l.L, false));
        }
        s1(c.d(this.f22223i0, k10, l.K));
        s2(h.b(this.f22223i0, k10, l.f31338o0));
        i2(h.b(this.f22223i0, k10, l.f31313j0));
        M1(k10.getDimension(l.X, 0.0f));
        m2(k10.getDimension(l.f31323l0, 0.0f));
        k2(k10.getDimension(l.f31318k0, 0.0f));
        z2(k10.getDimension(l.f31348q0, 0.0f));
        x2(k10.getDimension(l.f31343p0, 0.0f));
        a2(k10.getDimension(l.f31293f0, 0.0f));
        V1(k10.getDimension(l.f31283d0, 0.0f));
        A1(k10.getDimension(l.P, 0.0f));
        o2(k10.getDimensionPixelSize(l.H, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        k10.recycle();
    }

    private float o0() {
        this.f22230p0.e().getFontMetrics(this.f22226l0);
        Paint.FontMetrics fontMetrics = this.f22226l0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean p1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.p1(int[], int[]):boolean");
    }

    private boolean q0() {
        return this.Q && this.R != null && this.P;
    }

    public static a r0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.n1(attributeSet, i10, i11);
        return aVar;
    }

    private void s0(Canvas canvas, Rect rect) {
        if (D2()) {
            h0(rect, this.f22227m0);
            RectF rectF = this.f22227m0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.R.setBounds(0, 0, (int) this.f22227m0.width(), (int) this.f22227m0.height());
            this.R.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.K0) {
            return;
        }
        this.f22224j0.setColor(this.f22232r0);
        this.f22224j0.setStyle(Paint.Style.FILL);
        this.f22224j0.setColorFilter(e1());
        this.f22227m0.set(rect);
        canvas.drawRoundRect(this.f22227m0, D0(), D0(), this.f22224j0);
    }

    private void u0(Canvas canvas, Rect rect) {
        if (E2()) {
            h0(rect, this.f22227m0);
            RectF rectF = this.f22227m0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.F.setBounds(0, 0, (int) this.f22227m0.width(), (int) this.f22227m0.height());
            this.F.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.B <= 0.0f || this.K0) {
            return;
        }
        this.f22224j0.setColor(this.f22234t0);
        this.f22224j0.setStyle(Paint.Style.STROKE);
        if (!this.K0) {
            this.f22224j0.setColorFilter(e1());
        }
        RectF rectF = this.f22227m0;
        float f10 = this.B;
        rectF.set(rect.left + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.f22243z - (this.B / 2.0f);
        canvas.drawRoundRect(this.f22227m0, f11, f11, this.f22224j0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.K0) {
            return;
        }
        this.f22224j0.setColor(this.f22231q0);
        this.f22224j0.setStyle(Paint.Style.FILL);
        this.f22227m0.set(rect);
        canvas.drawRoundRect(this.f22227m0, D0(), D0(), this.f22224j0);
    }

    private void x0(Canvas canvas, Rect rect) {
        if (F2()) {
            k0(rect, this.f22227m0);
            RectF rectF = this.f22227m0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.K.setBounds(0, 0, (int) this.f22227m0.width(), (int) this.f22227m0.height());
            if (b.f38019a) {
                this.L.setBounds(this.K.getBounds());
                this.L.jumpToCurrentState();
                this.L.draw(canvas);
            } else {
                this.K.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        this.f22224j0.setColor(this.f22235u0);
        this.f22224j0.setStyle(Paint.Style.FILL);
        this.f22227m0.set(rect);
        if (!this.K0) {
            canvas.drawRoundRect(this.f22227m0, D0(), D0(), this.f22224j0);
            return;
        }
        g(new RectF(rect), this.f22229o0);
        super.o(canvas, this.f22224j0, this.f22229o0, t());
    }

    private void z0(Canvas canvas, Rect rect) {
        Paint paint = this.f22225k0;
        if (paint != null) {
            paint.setColor(z.a.f(-16777216, 127));
            canvas.drawRect(rect, this.f22225k0);
            if (E2() || D2()) {
                h0(rect, this.f22227m0);
                canvas.drawRect(this.f22227m0, this.f22225k0);
            }
            if (this.D != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f22225k0);
            }
            if (F2()) {
                k0(rect, this.f22227m0);
                canvas.drawRect(this.f22227m0, this.f22225k0);
            }
            this.f22225k0.setColor(z.a.f(-65536, 127));
            j0(rect, this.f22227m0);
            canvas.drawRect(this.f22227m0, this.f22225k0);
            this.f22225k0.setColor(z.a.f(-16711936, 127));
            l0(rect, this.f22227m0);
            canvas.drawRect(this.f22227m0, this.f22225k0);
        }
    }

    public void A1(float f10) {
        if (this.f22222h0 != f10) {
            this.f22222h0 = f10;
            invalidateSelf();
            o1();
        }
    }

    public void A2(int i10) {
        z2(this.f22223i0.getResources().getDimension(i10));
    }

    public Drawable B0() {
        return this.R;
    }

    public void B1(int i10) {
        A1(this.f22223i0.getResources().getDimension(i10));
    }

    public void B2(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
            H2();
            onStateChange(getState());
        }
    }

    public ColorStateList C0() {
        return this.f22239x;
    }

    public void C1(Drawable drawable) {
        Drawable F0 = F0();
        if (F0 != drawable) {
            float i02 = i0();
            this.F = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float i03 = i0();
            G2(F0);
            if (E2()) {
                g0(this.F);
            }
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C2() {
        return this.I0;
    }

    public float D0() {
        return this.K0 ? E() : this.f22243z;
    }

    public void D1(int i10) {
        C1(e.a.b(this.f22223i0, i10));
    }

    public float E0() {
        return this.f22222h0;
    }

    public void E1(float f10) {
        if (this.H != f10) {
            float i02 = i0();
            this.H = f10;
            float i03 = i0();
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    public Drawable F0() {
        Drawable drawable = this.F;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void F1(int i10) {
        E1(this.f22223i0.getResources().getDimension(i10));
    }

    public float G0() {
        return this.H;
    }

    public void G1(ColorStateList colorStateList) {
        this.I = true;
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (E2()) {
                androidx.core.graphics.drawable.a.o(this.F, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList H0() {
        return this.G;
    }

    public void H1(int i10) {
        G1(e.a.a(this.f22223i0, i10));
    }

    public float I0() {
        return this.f22241y;
    }

    public void I1(int i10) {
        J1(this.f22223i0.getResources().getBoolean(i10));
    }

    public float J0() {
        return this.U;
    }

    public void J1(boolean z10) {
        if (this.E != z10) {
            boolean E2 = E2();
            this.E = z10;
            boolean E22 = E2();
            if (E2 != E22) {
                if (E22) {
                    g0(this.F);
                } else {
                    G2(this.F);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public ColorStateList K0() {
        return this.A;
    }

    public void K1(float f10) {
        if (this.f22241y != f10) {
            this.f22241y = f10;
            invalidateSelf();
            o1();
        }
    }

    public float L0() {
        return this.B;
    }

    public void L1(int i10) {
        K1(this.f22223i0.getResources().getDimension(i10));
    }

    public Drawable M0() {
        Drawable drawable = this.K;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void M1(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidateSelf();
            o1();
        }
    }

    public CharSequence N0() {
        return this.O;
    }

    public void N1(int i10) {
        M1(this.f22223i0.getResources().getDimension(i10));
    }

    public float O0() {
        return this.f22221g0;
    }

    public void O1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            if (this.K0) {
                b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.N;
    }

    public void P1(int i10) {
        O1(e.a.a(this.f22223i0, i10));
    }

    public float Q0() {
        return this.Z;
    }

    public void Q1(float f10) {
        if (this.B != f10) {
            this.B = f10;
            this.f22224j0.setStrokeWidth(f10);
            if (this.K0) {
                super.c0(f10);
            }
            invalidateSelf();
        }
    }

    public int[] R0() {
        return this.D0;
    }

    public void R1(int i10) {
        Q1(this.f22223i0.getResources().getDimension(i10));
    }

    public ColorStateList S0() {
        return this.M;
    }

    public void T0(RectF rectF) {
        l0(getBounds(), rectF);
    }

    public void T1(Drawable drawable) {
        Drawable M02 = M0();
        if (M02 != drawable) {
            float m02 = m0();
            this.K = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f38019a) {
                I2();
            }
            float m03 = m0();
            G2(M02);
            if (F2()) {
                g0(this.K);
            }
            invalidateSelf();
            if (m02 != m03) {
                o1();
            }
        }
    }

    public TextUtils.TruncateAt U0() {
        return this.H0;
    }

    public void U1(CharSequence charSequence) {
        if (this.O != charSequence) {
            this.O = g0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public h V0() {
        return this.T;
    }

    public void V1(float f10) {
        if (this.f22221g0 != f10) {
            this.f22221g0 = f10;
            invalidateSelf();
            if (F2()) {
                o1();
            }
        }
    }

    public float W0() {
        return this.W;
    }

    public void W1(int i10) {
        V1(this.f22223i0.getResources().getDimension(i10));
    }

    public float X0() {
        return this.V;
    }

    public void X1(int i10) {
        T1(e.a.b(this.f22223i0, i10));
    }

    public ColorStateList Y0() {
        return this.C;
    }

    public void Y1(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidateSelf();
            if (F2()) {
                o1();
            }
        }
    }

    public h Z0() {
        return this.S;
    }

    public void Z1(int i10) {
        Y1(this.f22223i0.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        o1();
        invalidateSelf();
    }

    public CharSequence a1() {
        return this.D;
    }

    public void a2(float f10) {
        if (this.Z != f10) {
            this.Z = f10;
            invalidateSelf();
            if (F2()) {
                o1();
            }
        }
    }

    public d b1() {
        return this.f22230p0.d();
    }

    public void b2(int i10) {
        a2(this.f22223i0.getResources().getDimension(i10));
    }

    public float c1() {
        return this.Y;
    }

    public boolean c2(int[] iArr) {
        if (Arrays.equals(this.D0, iArr)) {
            return false;
        }
        this.D0 = iArr;
        if (F2()) {
            return p1(getState(), iArr);
        }
        return false;
    }

    public float d1() {
        return this.X;
    }

    public void d2(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (F2()) {
                androidx.core.graphics.drawable.a.o(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f22242y0;
        int a10 = i10 < 255 ? ja.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        w0(canvas, bounds);
        t0(canvas, bounds);
        if (this.K0) {
            super.draw(canvas);
        }
        v0(canvas, bounds);
        y0(canvas, bounds);
        u0(canvas, bounds);
        s0(canvas, bounds);
        if (this.I0) {
            A0(canvas, bounds);
        }
        x0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f22242y0 < 255) {
            canvas.restoreToCount(a10);
        }
    }

    public void e2(int i10) {
        d2(e.a.a(this.f22223i0, i10));
    }

    public boolean f1() {
        return this.E0;
    }

    public void f2(boolean z10) {
        if (this.J != z10) {
            boolean F2 = F2();
            this.J = z10;
            boolean F22 = F2();
            if (F2 != F22) {
                if (F22) {
                    g0(this.K);
                } else {
                    G2(this.K);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public void g2(InterfaceC0296a interfaceC0296a) {
        this.G0 = new WeakReference<>(interfaceC0296a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22242y0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f22244z0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f22241y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.U + i0() + this.X + this.f22230p0.f(a1().toString()) + this.Y + m0() + this.f22222h0), this.J0);
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f22243z);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f22243z);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h1() {
        return this.P;
    }

    public void h2(TextUtils.TruncateAt truncateAt) {
        this.H0 = truncateAt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i0() {
        if (E2() || D2()) {
            return this.V + this.H + this.W;
        }
        return 0.0f;
    }

    public boolean i1() {
        return l1(this.K);
    }

    public void i2(h hVar) {
        this.T = hVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return k1(this.f22237w) || k1(this.f22239x) || k1(this.A) || (this.E0 && k1(this.F0)) || m1(this.f22230p0.d()) || q0() || l1(this.F) || l1(this.R) || k1(this.B0);
    }

    public boolean j1() {
        return this.J;
    }

    public void j2(int i10) {
        i2(h.c(this.f22223i0, i10));
    }

    public void k2(float f10) {
        if (this.W != f10) {
            float i02 = i0();
            this.W = f10;
            float i03 = i0();
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    public void l2(int i10) {
        k2(this.f22223i0.getResources().getDimension(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m0() {
        if (F2()) {
            return this.Z + this.N + this.f22221g0;
        }
        return 0.0f;
    }

    public void m2(float f10) {
        if (this.V != f10) {
            float i02 = i0();
            this.V = f10;
            float i03 = i0();
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    public void n2(int i10) {
        m2(this.f22223i0.getResources().getDimension(i10));
    }

    protected void o1() {
        InterfaceC0296a interfaceC0296a = this.G0.get();
        if (interfaceC0296a != null) {
            interfaceC0296a.a();
        }
    }

    public void o2(int i10) {
        this.J0 = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (E2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.F, i10);
        }
        if (D2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.R, i10);
        }
        if (F2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.K, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (E2()) {
            onLevelChange |= this.F.setLevel(i10);
        }
        if (D2()) {
            onLevelChange |= this.R.setLevel(i10);
        }
        if (F2()) {
            onLevelChange |= this.K.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // xa.g, android.graphics.drawable.Drawable, com.google.android.material.internal.f.b
    public boolean onStateChange(int[] iArr) {
        if (this.K0) {
            super.onStateChange(iArr);
        }
        return p1(iArr, R0());
    }

    Paint.Align p0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.D != null) {
            float i02 = this.U + i0() + this.X;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + i02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - i02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - o0();
        }
        return align;
    }

    public void p2(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            H2();
            onStateChange(getState());
        }
    }

    public void q1(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            float i02 = i0();
            if (!z10 && this.f22238w0) {
                this.f22238w0 = false;
            }
            float i03 = i0();
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    public void q2(int i10) {
        p2(e.a.a(this.f22223i0, i10));
    }

    public void r1(int i10) {
        q1(this.f22223i0.getResources().getBoolean(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r2(boolean z10) {
        this.I0 = z10;
    }

    public void s1(Drawable drawable) {
        if (this.R != drawable) {
            float i02 = i0();
            this.R = drawable;
            float i03 = i0();
            G2(this.R);
            g0(this.R);
            invalidateSelf();
            if (i02 != i03) {
                o1();
            }
        }
    }

    public void s2(h hVar) {
        this.S = hVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f22242y0 != i10) {
            this.f22242y0 = i10;
            invalidateSelf();
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f22244z0 != colorFilter) {
            this.f22244z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // xa.g, android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            this.A0 = pa.a.a(this, this.B0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (E2()) {
            visible |= this.F.setVisible(z10, z11);
        }
        if (D2()) {
            visible |= this.R.setVisible(z10, z11);
        }
        if (F2()) {
            visible |= this.K.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(int i10) {
        s1(e.a.b(this.f22223i0, i10));
    }

    public void t2(int i10) {
        s2(h.c(this.f22223i0, i10));
    }

    public void u1(int i10) {
        v1(this.f22223i0.getResources().getBoolean(i10));
    }

    public void u2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.D, charSequence)) {
            return;
        }
        this.D = charSequence;
        this.f22230p0.i(true);
        invalidateSelf();
        o1();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(boolean z10) {
        if (this.Q != z10) {
            boolean D2 = D2();
            this.Q = z10;
            boolean D22 = D2();
            if (D2 != D22) {
                if (D22) {
                    g0(this.R);
                } else {
                    G2(this.R);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public void v2(d dVar) {
        this.f22230p0.h(dVar, this.f22223i0);
    }

    public void w1(ColorStateList colorStateList) {
        if (this.f22239x != colorStateList) {
            this.f22239x = colorStateList;
            onStateChange(getState());
        }
    }

    public void w2(int i10) {
        v2(new d(this.f22223i0, i10));
    }

    public void x1(int i10) {
        w1(e.a.a(this.f22223i0, i10));
    }

    public void x2(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            o1();
        }
    }

    @Deprecated
    public void y1(float f10) {
        if (this.f22243z != f10) {
            this.f22243z = f10;
            setShapeAppearanceModel(B().w(f10));
        }
    }

    public void y2(int i10) {
        x2(this.f22223i0.getResources().getDimension(i10));
    }

    @Deprecated
    public void z1(int i10) {
        y1(this.f22223i0.getResources().getDimension(i10));
    }

    public void z2(float f10) {
        if (this.X != f10) {
            this.X = f10;
            invalidateSelf();
            o1();
        }
    }
}
