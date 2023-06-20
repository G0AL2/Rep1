package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.z;
import com.google.android.material.internal.h;
import ha.b;
import ha.l;
import ua.c;
import xa.g;
import xa.k;
import xa.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f22162s;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f22163a;

    /* renamed from: b  reason: collision with root package name */
    private k f22164b;

    /* renamed from: c  reason: collision with root package name */
    private int f22165c;

    /* renamed from: d  reason: collision with root package name */
    private int f22166d;

    /* renamed from: e  reason: collision with root package name */
    private int f22167e;

    /* renamed from: f  reason: collision with root package name */
    private int f22168f;

    /* renamed from: g  reason: collision with root package name */
    private int f22169g;

    /* renamed from: h  reason: collision with root package name */
    private int f22170h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f22171i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f22172j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f22173k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f22174l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f22175m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22176n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22177o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22178p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f22179q;

    /* renamed from: r  reason: collision with root package name */
    private LayerDrawable f22180r;

    static {
        f22162s = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f22163a = materialButton;
        this.f22164b = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g d10 = d();
        g l10 = l();
        if (d10 != null) {
            d10.a0(this.f22170h, this.f22173k);
            if (l10 != null) {
                l10.Z(this.f22170h, this.f22176n ? na.a.c(this.f22163a, b.f31141l) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f22165c, this.f22167e, this.f22166d, this.f22168f);
    }

    private Drawable a() {
        g gVar = new g(this.f22164b);
        gVar.L(this.f22163a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f22172j);
        PorterDuff.Mode mode = this.f22171i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.a0(this.f22170h, this.f22173k);
        g gVar2 = new g(this.f22164b);
        gVar2.setTint(0);
        gVar2.Z(this.f22170h, this.f22176n ? na.a.c(this.f22163a, b.f31141l) : 0);
        if (f22162s) {
            g gVar3 = new g(this.f22164b);
            this.f22175m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(va.b.d(this.f22174l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f22175m);
            this.f22180r = rippleDrawable;
            return rippleDrawable;
        }
        va.a aVar = new va.a(this.f22164b);
        this.f22175m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, va.b.d(this.f22174l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f22175m});
        this.f22180r = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z10) {
        LayerDrawable layerDrawable = this.f22180r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f22162s) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f22180r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return (g) this.f22180r.getDrawable(!z10 ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i10, int i11) {
        Drawable drawable = this.f22175m;
        if (drawable != null) {
            drawable.setBounds(this.f22165c, this.f22167e, i11 - this.f22166d, i10 - this.f22168f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f22169g;
    }

    public n c() {
        LayerDrawable layerDrawable = this.f22180r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f22180r.getNumberOfLayers() > 2) {
            return (n) this.f22180r.getDrawable(2);
        }
        return (n) this.f22180r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g d() {
        return e(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f22174l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k g() {
        return this.f22164b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f22173k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f22170h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f22172j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        return this.f22171i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f22177o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f22179q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(TypedArray typedArray) {
        this.f22165c = typedArray.getDimensionPixelOffset(l.L0, 0);
        this.f22166d = typedArray.getDimensionPixelOffset(l.M0, 0);
        this.f22167e = typedArray.getDimensionPixelOffset(l.N0, 0);
        this.f22168f = typedArray.getDimensionPixelOffset(l.O0, 0);
        int i10 = l.S0;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f22169g = dimensionPixelSize;
            u(this.f22164b.w(dimensionPixelSize));
            this.f22178p = true;
        }
        this.f22170h = typedArray.getDimensionPixelSize(l.f31279c1, 0);
        this.f22171i = h.c(typedArray.getInt(l.R0, -1), PorterDuff.Mode.SRC_IN);
        this.f22172j = c.a(this.f22163a.getContext(), typedArray, l.Q0);
        this.f22173k = c.a(this.f22163a.getContext(), typedArray, l.f31274b1);
        this.f22174l = c.a(this.f22163a.getContext(), typedArray, l.f31269a1);
        this.f22179q = typedArray.getBoolean(l.P0, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(l.T0, 0);
        int H = z.H(this.f22163a);
        int paddingTop = this.f22163a.getPaddingTop();
        int G = z.G(this.f22163a);
        int paddingBottom = this.f22163a.getPaddingBottom();
        this.f22163a.setInternalBackground(a());
        g d10 = d();
        if (d10 != null) {
            d10.T(dimensionPixelSize2);
        }
        z.E0(this.f22163a, H + this.f22165c, paddingTop + this.f22167e, G + this.f22166d, paddingBottom + this.f22168f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10) {
        if (d() != null) {
            d().setTint(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f22177o = true;
        this.f22163a.setSupportBackgroundTintList(this.f22172j);
        this.f22163a.setSupportBackgroundTintMode(this.f22171i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f22179q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10) {
        if (this.f22178p && this.f22169g == i10) {
            return;
        }
        this.f22169g = i10;
        this.f22178p = true;
        u(this.f22164b.w(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(ColorStateList colorStateList) {
        if (this.f22174l != colorStateList) {
            this.f22174l = colorStateList;
            boolean z10 = f22162s;
            if (z10 && (this.f22163a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f22163a.getBackground()).setColor(va.b.d(colorStateList));
            } else if (z10 || !(this.f22163a.getBackground() instanceof va.a)) {
            } else {
                ((va.a) this.f22163a.getBackground()).setTintList(va.b.d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(k kVar) {
        this.f22164b = kVar;
        A(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(boolean z10) {
        this.f22176n = z10;
        C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f22173k != colorStateList) {
            this.f22173k = colorStateList;
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i10) {
        if (this.f22170h != i10) {
            this.f22170h = i10;
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f22172j != colorStateList) {
            this.f22172j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.f22172j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(PorterDuff.Mode mode) {
        if (this.f22171i != mode) {
            this.f22171i = mode;
            if (d() == null || this.f22171i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(d(), this.f22171i);
        }
    }
}
