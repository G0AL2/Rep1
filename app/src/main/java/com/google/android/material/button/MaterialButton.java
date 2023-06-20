package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.view.z;
import androidx.core.widget.j;
import ha.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xa.h;
import xa.n;

/* loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f22147p = {16842911};

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f22148q = {16842912};

    /* renamed from: r  reason: collision with root package name */
    private static final int f22149r = k.f31260i;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.material.button.a f22150d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet<a> f22151e;

    /* renamed from: f  reason: collision with root package name */
    private b f22152f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f22153g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f22154h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f22155i;

    /* renamed from: j  reason: collision with root package name */
    private int f22156j;

    /* renamed from: k  reason: collision with root package name */
    private int f22157k;

    /* renamed from: l  reason: collision with root package name */
    private int f22158l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f22159m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22160n;

    /* renamed from: o  reason: collision with root package name */
    private int f22161o;

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: classes2.dex */
    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.f31146q);
    }

    private boolean b() {
        return z.C(this) == 1;
    }

    private boolean c() {
        com.google.android.material.button.a aVar = this.f22150d;
        return (aVar == null || aVar.m()) ? false : true;
    }

    private void d(boolean z10) {
        if (z10) {
            j.l(this, this.f22155i, null, null, null);
        } else {
            j.l(this, null, null, this.f22155i, null);
        }
    }

    private void e(boolean z10) {
        Drawable drawable = this.f22155i;
        boolean z11 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f22155i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f22154h);
            PorterDuff.Mode mode = this.f22153g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f22155i, mode);
            }
            int i10 = this.f22156j;
            if (i10 == 0) {
                i10 = this.f22155i.getIntrinsicWidth();
            }
            int i11 = this.f22156j;
            if (i11 == 0) {
                i11 = this.f22155i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f22155i;
            int i12 = this.f22157k;
            drawable2.setBounds(i12, 0, i10 + i12, i11);
        }
        int i13 = this.f22161o;
        boolean z12 = i13 == 1 || i13 == 2;
        if (z10) {
            d(z12);
            return;
        }
        Drawable[] a10 = j.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[2];
        if ((z12 && drawable3 != this.f22155i) || (!z12 && drawable4 != this.f22155i)) {
            z11 = true;
        }
        if (z11) {
            d(z12);
        }
    }

    private void f() {
        if (this.f22155i == null || getLayout() == null) {
            return;
        }
        int i10 = this.f22161o;
        if (i10 != 1 && i10 != 3) {
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i11 = this.f22156j;
            if (i11 == 0) {
                i11 = this.f22155i.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - z.G(this)) - i11) - this.f22158l) - z.H(this)) / 2;
            if (b() != (this.f22161o == 4)) {
                measuredWidth = -measuredWidth;
            }
            if (this.f22157k != measuredWidth) {
                this.f22157k = measuredWidth;
                e(false);
                return;
            }
            return;
        }
        this.f22157k = 0;
        e(false);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f22150d;
        return aVar != null && aVar.n();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.f22150d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f22155i;
    }

    public int getIconGravity() {
        return this.f22161o;
    }

    public int getIconPadding() {
        return this.f22158l;
    }

    public int getIconSize() {
        return this.f22156j;
    }

    public ColorStateList getIconTint() {
        return this.f22154h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f22153g;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.f22150d.f();
        }
        return null;
    }

    public xa.k getShapeAppearanceModel() {
        if (c()) {
            return this.f22150d.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.f22150d.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.f22150d.i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        if (c()) {
            return this.f22150d.j();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (c()) {
            return this.f22150d.k();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22159m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f22150d.d());
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f22147p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f22148q);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.google.android.material.button.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f22150d) == null) {
            return;
        }
        aVar.B(i13 - i11, i12 - i10);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f();
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (c()) {
            this.f22150d.p(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f22150d.q();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (c()) {
            this.f22150d.r(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f22159m != z10) {
            this.f22159m = z10;
            refreshDrawableState();
            if (this.f22160n) {
                return;
            }
            this.f22160n = true;
            Iterator<a> it = this.f22151e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f22159m);
            }
            this.f22160n = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (c()) {
            this.f22150d.s(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (c()) {
            this.f22150d.d().T(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f22155i != drawable) {
            this.f22155i = drawable;
            e(true);
        }
    }

    public void setIconGravity(int i10) {
        if (this.f22161o != i10) {
            this.f22161o = i10;
            f();
        }
    }

    public void setIconPadding(int i10) {
        if (this.f22158l != i10) {
            this.f22158l = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f22156j != i10) {
                this.f22156j = i10;
                e(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f22154h != colorStateList) {
            this.f22154h = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f22153g != mode) {
            this.f22153g = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(e.a.a(getContext(), i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f22152f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f22152f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.f22150d.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (c()) {
            setRippleColor(e.a.a(getContext(), i10));
        }
    }

    @Override // xa.n
    public void setShapeAppearanceModel(xa.k kVar) {
        if (c()) {
            this.f22150d.u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (c()) {
            this.f22150d.v(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.f22150d.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (c()) {
            setStrokeColor(e.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (c()) {
            this.f22150d.x(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f22150d.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f22150d.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f22159m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f22149r
            android.content.Context r9 = com.google.android.material.internal.g.f(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f22151e = r9
            r9 = 0
            r8.f22159m = r9
            r8.f22160n = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = ha.l.K0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r1 = ha.l.W0
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f22158l = r1
            int r1 = ha.l.Z0
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.h.c(r1, r2)
            r8.f22153g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = ha.l.Y0
            android.content.res.ColorStateList r1 = ua.c.a(r1, r0, r2)
            r8.f22154h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = ha.l.U0
            android.graphics.drawable.Drawable r1 = ua.c.d(r1, r0, r2)
            r8.f22155i = r1
            int r1 = ha.l.V0
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f22161o = r1
            int r1 = ha.l.X0
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f22156j = r1
            xa.k$b r10 = xa.k.e(r7, r10, r11, r6)
            xa.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f22150d = r11
            r11.o(r0)
            r0.recycle()
            int r10 = r8.f22158l
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f22155i
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
