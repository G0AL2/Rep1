package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.z;
import ua.a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes3.dex */
public final class a {
    private static final boolean V;
    private static final Paint W;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;

    /* renamed from: a  reason: collision with root package name */
    private final View f22453a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22454b;

    /* renamed from: c  reason: collision with root package name */
    private float f22455c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f22456d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f22457e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f22458f;

    /* renamed from: g  reason: collision with root package name */
    private int f22459g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f22460h = 16;

    /* renamed from: i  reason: collision with root package name */
    private float f22461i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f22462j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f22463k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f22464l;

    /* renamed from: m  reason: collision with root package name */
    private float f22465m;

    /* renamed from: n  reason: collision with root package name */
    private float f22466n;

    /* renamed from: o  reason: collision with root package name */
    private float f22467o;

    /* renamed from: p  reason: collision with root package name */
    private float f22468p;

    /* renamed from: q  reason: collision with root package name */
    private float f22469q;

    /* renamed from: r  reason: collision with root package name */
    private float f22470r;

    /* renamed from: s  reason: collision with root package name */
    private Typeface f22471s;

    /* renamed from: t  reason: collision with root package name */
    private Typeface f22472t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f22473u;

    /* renamed from: v  reason: collision with root package name */
    private ua.a f22474v;

    /* renamed from: w  reason: collision with root package name */
    private ua.a f22475w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f22476x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f22477y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f22478z;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0299a implements a.InterfaceC0516a {
        C0299a() {
        }

        @Override // ua.a.InterfaceC0516a
        public void a(Typeface typeface) {
            a.this.G(typeface);
        }
    }

    static {
        V = Build.VERSION.SDK_INT < 18;
        W = null;
    }

    public a(View view) {
        this.f22453a = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.f22457e = new Rect();
        this.f22456d = new Rect();
        this.f22458f = new RectF();
    }

    private static boolean A(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private boolean H(Typeface typeface) {
        ua.a aVar = this.f22475w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f22471s != typeface) {
            this.f22471s = typeface;
            return true;
        }
        return false;
    }

    private boolean N(Typeface typeface) {
        ua.a aVar = this.f22474v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f22472t != typeface) {
            this.f22472t = typeface;
            return true;
        }
        return false;
    }

    private void P(float f10) {
        g(f10);
        boolean z10 = V && this.F != 1.0f;
        this.A = z10;
        if (z10) {
            j();
        }
        z.h0(this.f22453a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b() {
        float f10 = this.G;
        g(this.f22462j);
        CharSequence charSequence = this.f22477y;
        float measureText = charSequence != null ? this.J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b10 = androidx.core.view.e.b(this.f22460h, this.f22478z ? 1 : 0);
        int i10 = b10 & 112;
        if (i10 == 48) {
            this.f22466n = this.f22457e.top - this.J.ascent();
        } else if (i10 != 80) {
            this.f22466n = this.f22457e.centerY() + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f22466n = this.f22457e.bottom;
        }
        int i11 = b10 & 8388615;
        if (i11 == 1) {
            this.f22468p = this.f22457e.centerX() - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f22468p = this.f22457e.left;
        } else {
            this.f22468p = this.f22457e.right - measureText;
        }
        g(this.f22461i);
        CharSequence charSequence2 = this.f22477y;
        float measureText2 = charSequence2 != null ? this.J.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b11 = androidx.core.view.e.b(this.f22459g, this.f22478z ? 1 : 0);
        int i12 = b11 & 112;
        if (i12 == 48) {
            this.f22465m = this.f22456d.top - this.J.ascent();
        } else if (i12 != 80) {
            this.f22465m = this.f22456d.centerY() + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f22465m = this.f22456d.bottom;
        }
        int i13 = b11 & 8388615;
        if (i13 == 1) {
            this.f22467o = this.f22456d.centerX() - (measureText2 / 2.0f);
        } else if (i13 != 5) {
            this.f22467o = this.f22456d.left;
        } else {
            this.f22467o = this.f22456d.right - measureText2;
        }
        h();
        P(f10);
    }

    private void d() {
        f(this.f22455c);
    }

    private boolean e(CharSequence charSequence) {
        return (z.C(this.f22453a) == 1 ? g0.f.f30455d : g0.f.f30454c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f10) {
        u(f10);
        this.f22469q = x(this.f22467o, this.f22468p, f10, this.L);
        this.f22470r = x(this.f22465m, this.f22466n, f10, this.L);
        P(x(this.f22461i, this.f22462j, f10, this.M));
        if (this.f22464l != this.f22463k) {
            this.J.setColor(a(p(), n(), f10));
        } else {
            this.J.setColor(n());
        }
        this.J.setShadowLayer(x(this.R, this.N, f10, null), x(this.S, this.O, f10, null), x(this.T, this.P, f10, null), a(o(this.U), o(this.Q), f10));
        z.h0(this.f22453a);
    }

    private void g(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        if (this.f22476x == null) {
            return;
        }
        float width = this.f22457e.width();
        float width2 = this.f22456d.width();
        if (v(f10, this.f22462j)) {
            f11 = this.f22462j;
            this.F = 1.0f;
            Typeface typeface = this.f22473u;
            Typeface typeface2 = this.f22471s;
            if (typeface != typeface2) {
                this.f22473u = typeface2;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            float f12 = this.f22461i;
            Typeface typeface3 = this.f22473u;
            Typeface typeface4 = this.f22472t;
            if (typeface3 != typeface4) {
                this.f22473u = typeface4;
                z10 = true;
            } else {
                z10 = false;
            }
            if (v(f10, f12)) {
                this.F = 1.0f;
            } else {
                this.F = f10 / this.f22461i;
            }
            float f13 = this.f22462j / this.f22461i;
            width = width2 * f13 > width ? Math.min(width / f13, width2) : width2;
            f11 = f12;
            z11 = z10;
        }
        if (width > 0.0f) {
            z11 = this.G != f11 || this.I || z11;
            this.G = f11;
            this.I = false;
        }
        if (this.f22477y == null || z11) {
            this.J.setTextSize(this.G);
            this.J.setTypeface(this.f22473u);
            this.J.setLinearText(this.F != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.f22476x, this.J, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.f22477y)) {
                return;
            }
            this.f22477y = ellipsize;
            this.f22478z = e(ellipsize);
        }
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void j() {
        if (this.B != null || this.f22456d.isEmpty() || TextUtils.isEmpty(this.f22477y)) {
            return;
        }
        f(0.0f);
        this.D = this.J.ascent();
        this.E = this.J.descent();
        TextPaint textPaint = this.J;
        CharSequence charSequence = this.f22477y;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.E - this.D);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.B);
        CharSequence charSequence2 = this.f22477y;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.J.descent(), this.J);
        if (this.C == null) {
            this.C = new Paint(3);
        }
    }

    private int o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int p() {
        return o(this.f22463k);
    }

    private void s(TextPaint textPaint) {
        textPaint.setTextSize(this.f22462j);
        textPaint.setTypeface(this.f22471s);
    }

    private void t(TextPaint textPaint) {
        textPaint.setTextSize(this.f22461i);
        textPaint.setTypeface(this.f22472t);
    }

    private void u(float f10) {
        this.f22458f.left = x(this.f22456d.left, this.f22457e.left, f10, this.L);
        this.f22458f.top = x(this.f22465m, this.f22466n, f10, this.L);
        this.f22458f.right = x(this.f22456d.right, this.f22457e.right, f10, this.L);
        this.f22458f.bottom = x(this.f22456d.bottom, this.f22457e.bottom, f10, this.L);
    }

    private static boolean v(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    private static float x(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return ia.a.a(f10, f11, f12);
    }

    public void B(int i10, int i11, int i12, int i13) {
        if (A(this.f22457e, i10, i11, i12, i13)) {
            return;
        }
        this.f22457e.set(i10, i11, i12, i13);
        this.I = true;
        y();
    }

    public void C(Rect rect) {
        B(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void D(int i10) {
        ua.d dVar = new ua.d(this.f22453a.getContext(), i10);
        ColorStateList colorStateList = dVar.f37683b;
        if (colorStateList != null) {
            this.f22464l = colorStateList;
        }
        float f10 = dVar.f37682a;
        if (f10 != 0.0f) {
            this.f22462j = f10;
        }
        ColorStateList colorStateList2 = dVar.f37687f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f37688g;
        this.P = dVar.f37689h;
        this.N = dVar.f37690i;
        ua.a aVar = this.f22475w;
        if (aVar != null) {
            aVar.c();
        }
        this.f22475w = new ua.a(new C0299a(), dVar.e());
        dVar.h(this.f22453a.getContext(), this.f22475w);
        z();
    }

    public void E(ColorStateList colorStateList) {
        if (this.f22464l != colorStateList) {
            this.f22464l = colorStateList;
            z();
        }
    }

    public void F(int i10) {
        if (this.f22460h != i10) {
            this.f22460h = i10;
            z();
        }
    }

    public void G(Typeface typeface) {
        if (H(typeface)) {
            z();
        }
    }

    public void I(int i10, int i11, int i12, int i13) {
        if (A(this.f22456d, i10, i11, i12, i13)) {
            return;
        }
        this.f22456d.set(i10, i11, i12, i13);
        this.I = true;
        y();
    }

    public void J(Rect rect) {
        I(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void K(ColorStateList colorStateList) {
        if (this.f22463k != colorStateList) {
            this.f22463k = colorStateList;
            z();
        }
    }

    public void L(int i10) {
        if (this.f22459g != i10) {
            this.f22459g = i10;
            z();
        }
    }

    public void M(float f10) {
        if (this.f22461i != f10) {
            this.f22461i = f10;
            z();
        }
    }

    public void O(float f10) {
        float a10 = c0.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f22455c) {
            this.f22455c = a10;
            d();
        }
    }

    public void Q(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        z();
    }

    public final boolean R(int[] iArr) {
        this.H = iArr;
        if (w()) {
            z();
            return true;
        }
        return false;
    }

    public void S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f22476x, charSequence)) {
            this.f22476x = charSequence;
            this.f22477y = null;
            h();
            z();
        }
    }

    public void T(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        z();
    }

    public void U(Typeface typeface) {
        boolean H = H(typeface);
        boolean N = N(typeface);
        if (H || N) {
            z();
        }
    }

    public float c() {
        if (this.f22476x == null) {
            return 0.0f;
        }
        s(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.f22476x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void i(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.f22477y != null && this.f22454b) {
            float f10 = this.f22469q;
            float f11 = this.f22470r;
            boolean z10 = this.A && this.B != null;
            if (z10) {
                ascent = this.D * this.F;
            } else {
                ascent = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z10) {
                f11 += ascent;
            }
            float f12 = f11;
            float f13 = this.F;
            if (f13 != 1.0f) {
                canvas.scale(f13, f13, f10, f12);
            }
            if (z10) {
                canvas.drawBitmap(this.B, f10, f12, this.C);
            } else {
                CharSequence charSequence = this.f22477y;
                canvas.drawText(charSequence, 0, charSequence.length(), f10, f12, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void k(RectF rectF) {
        boolean e10 = e(this.f22476x);
        Rect rect = this.f22457e;
        float c10 = !e10 ? rect.left : rect.right - c();
        rectF.left = c10;
        Rect rect2 = this.f22457e;
        rectF.top = rect2.top;
        rectF.right = !e10 ? c10 + c() : rect2.right;
        rectF.bottom = this.f22457e.top + m();
    }

    public ColorStateList l() {
        return this.f22464l;
    }

    public float m() {
        s(this.K);
        return -this.K.ascent();
    }

    public int n() {
        return o(this.f22464l);
    }

    public float q() {
        t(this.K);
        return -this.K.ascent();
    }

    public float r() {
        return this.f22455c;
    }

    public final boolean w() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f22464l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f22463k) != null && colorStateList.isStateful());
    }

    void y() {
        this.f22454b = this.f22457e.width() > 0 && this.f22457e.height() > 0 && this.f22456d.width() > 0 && this.f22456d.height() > 0;
    }

    public void z() {
        if (this.f22453a.getHeight() <= 0 || this.f22453a.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }
}
