package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import ha.j;
import ha.k;
import ha.l;
import i0.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import ua.d;
import ua.f;
import xa.n;

/* loaded from: classes2.dex */
public class Chip extends g implements a.InterfaceC0296a, n {

    /* renamed from: u  reason: collision with root package name */
    private static final Rect f22188u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private static final int[] f22189v = {16842913};

    /* renamed from: w  reason: collision with root package name */
    private static final int[] f22190w = {16842911};

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.material.chip.a f22191e;

    /* renamed from: f  reason: collision with root package name */
    private InsetDrawable f22192f;

    /* renamed from: g  reason: collision with root package name */
    private RippleDrawable f22193g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnClickListener f22194h;

    /* renamed from: i  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f22195i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f22196j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22197k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22198l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f22199m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22200n;

    /* renamed from: o  reason: collision with root package name */
    private int f22201o;

    /* renamed from: p  reason: collision with root package name */
    private int f22202p;

    /* renamed from: q  reason: collision with root package name */
    private final c f22203q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f22204r;

    /* renamed from: s  reason: collision with root package name */
    private final RectF f22205s;

    /* renamed from: t  reason: collision with root package name */
    private final f f22206t;

    /* loaded from: classes2.dex */
    class a extends f {
        a() {
        }

        @Override // ua.f
        public void a(int i10) {
        }

        @Override // ua.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f22191e.C2() ? Chip.this.f22191e.a1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f22191e != null) {
                Chip.this.f22191e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends m0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // m0.a
        protected int B(float f10, float f11) {
            return (Chip.this.m() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // m0.a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r()) {
                list.add(1);
            }
        }

        @Override // m0.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.s();
                }
                return false;
            }
            return false;
        }

        @Override // m0.a
        protected void M(i0.c cVar) {
            cVar.Y(Chip.this.q());
            cVar.b0(Chip.this.isClickable());
            if (!Chip.this.q() && !Chip.this.isClickable()) {
                cVar.a0("android.view.View");
            } else {
                cVar.a0(Chip.this.q() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.B0(text);
            } else {
                cVar.e0(text);
            }
        }

        @Override // m0.a
        protected void N(int i10, i0.c cVar) {
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.e0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = j.f31242h;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    cVar.e0(context.getString(i11, objArr).trim());
                }
                cVar.W(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f31492g);
                cVar.g0(Chip.this.isEnabled());
                return;
            }
            cVar.e0("");
            cVar.W(Chip.f22188u);
        }

        @Override // m0.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f22199m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.f31135f);
    }

    private void A() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.f22206t);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f22205s.setEmpty();
        if (m()) {
            this.f22191e.T0(this.f22205s);
        }
        return this.f22205s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f22204r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f22204r;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    private void h(com.google.android.material.chip.a aVar) {
        aVar.g2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] i() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f22199m) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f22198l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f22197k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f22199m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f22198l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f22197k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void k() {
        if (getBackgroundDrawable() == this.f22192f && this.f22191e.getCallback() == null) {
            this.f22191e.setCallback(this.f22192f);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean l(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = m0.a.class.getDeclaredField(InneractiveMediationDefs.GENDER_MALE);
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f22203q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = m0.a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f22203q, Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
                    return true;
                }
            } catch (IllegalAccessException e10) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            } catch (NoSuchFieldException e11) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            } catch (NoSuchMethodException e12) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e12);
            } catch (InvocationTargetException e13) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e13);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        com.google.android.material.chip.a aVar = this.f22191e;
        return (aVar == null || aVar.M0() == null) ? false : true;
    }

    private void n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, l.D, i10, k.f31262k, new int[0]);
        this.f22200n = k10.getBoolean(l.f31308i0, false);
        this.f22202p = (int) Math.ceil(k10.getDimension(l.W, (float) Math.ceil(h.a(getContext(), 48))));
        k10.recycle();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void p(int i10, int i11, int i12, int i13) {
        this.f22192f = new InsetDrawable((Drawable) this.f22191e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f22198l != z10) {
            this.f22198l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f22197k != z10) {
            this.f22197k = z10;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f22192f != null) {
            this.f22192f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.g2(null);
        }
    }

    private void w() {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (m() && r()) {
            z.q0(this, this.f22203q);
        } else {
            z.q0(this, null);
        }
    }

    private void x() {
        if (va.b.f38019a) {
            y();
            return;
        }
        this.f22191e.B2(true);
        z.u0(this, getBackgroundDrawable());
        k();
    }

    private void y() {
        this.f22193g = new RippleDrawable(va.b.d(this.f22191e.Y0()), getBackgroundDrawable(), null);
        this.f22191e.B2(false);
        z.u0(this, this.f22193g);
    }

    private void z() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f22191e) == null) {
            return;
        }
        z.E0(this, (int) (this.f22191e.J0() + this.f22191e.d1() + this.f22191e.i0()), getPaddingTop(), (int) (aVar.E0() + this.f22191e.c1() + this.f22191e.m0()), getPaddingBottom());
    }

    @Override // com.google.android.material.chip.a.InterfaceC0296a
    public void a() {
        j(this.f22202p);
        x();
        z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return l(motionEvent) || this.f22203q.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f22203q.w(keyEvent) || this.f22203q.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f22191e;
        if ((aVar == null || !aVar.i1()) ? false : this.f22191e.c2(i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f22192f;
        return insetDrawable == null ? this.f22191e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f22191e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f22203q.A() != 1 && this.f22203q.x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public ia.h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public xa.k getShapeAppearanceModel() {
        return this.f22191e.B();
    }

    public ia.h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public boolean j(int i10) {
        this.f22202p = i10;
        if (!u()) {
            t();
            return false;
        }
        int max = Math.max(0, i10 - this.f22191e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f22191e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            t();
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f22192f != null) {
            Rect rect = new Rect();
            this.f22192f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
        } else {
            setMinHeight(i10);
            setMinWidth(i10);
        }
        p(i11, i12, i11, i12);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.h.f(this, this.f22191e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f22189v);
        }
        if (q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f22190w);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f22203q.I(z10, i10, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!q() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(q() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f22201o != i10) {
            this.f22201o = i10;
            z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f22197k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f22197k
            if (r0 == 0) goto L34
            r5.s()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        com.google.android.material.chip.a aVar = this.f22191e;
        return aVar != null && aVar.h1();
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f22191e;
        return aVar != null && aVar.j1();
    }

    public boolean s() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f22194h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.f22203q.U(1, 1);
        return z10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f22193g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f22193g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.q1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.r1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar == null) {
            this.f22196j = z10;
        } else if (aVar.h1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked == z10 || (onCheckedChangeListener = this.f22195i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.s1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.t1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.u1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.w1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.y1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f22191e;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f22191e = aVar;
            aVar.r2(false);
            h(this.f22191e);
            j(this.f22202p);
            x();
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.A1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.C1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.E1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.G1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.K1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.T1(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.U1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.V1(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.X1(i10);
        }
        w();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.a2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.d2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f22191e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f22191e;
            if (aVar != null) {
                aVar.h2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f22200n = z10;
        j(this.f22202p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(ia.h hVar) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.i2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.k2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f22191e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i10);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f22195i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f22194h = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.p2(colorStateList);
        }
        if (this.f22191e.f1()) {
            return;
        }
        y();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.q2(i10);
            if (this.f22191e.f1()) {
                return;
            }
            y();
        }
    }

    @Override // xa.n
    public void setShapeAppearanceModel(xa.k kVar) {
        this.f22191e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(ia.h hVar) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.s2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.C2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f22191e;
        if (aVar2 != null) {
            aVar2.u2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.v2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.z2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    public boolean u() {
        return this.f22200n;
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22204r = new Rect();
        this.f22205s = new RectF();
        this.f22206t = new a();
        B(attributeSet);
        int i11 = k.f31262k;
        com.google.android.material.chip.a r02 = com.google.android.material.chip.a.r0(context, attributeSet, i10, i11);
        n(context, attributeSet, i10);
        setChipDrawable(r02);
        r02.T(z.w(this));
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, l.D, i10, i11, new int[0]);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            setTextColor(ua.c.a(context, k10, l.F));
        }
        boolean hasValue = k10.hasValue(l.f31333n0);
        k10.recycle();
        c cVar = new c(this);
        this.f22203q = cVar;
        if (i12 >= 24) {
            z.q0(this, cVar);
        } else {
            w();
        }
        if (!hasValue) {
            o();
        }
        setChecked(this.f22196j);
        setText(r02.a1());
        setEllipsize(r02.U0());
        setIncludeFontPadding(false);
        A();
        if (!this.f22191e.C2()) {
            setSingleLine();
        }
        setGravity(8388627);
        z();
        if (u()) {
            setMinHeight(this.f22202p);
        }
        this.f22201o = z.C(this);
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.f2(z10);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.v1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.J1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.w2(i10);
        }
        A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f22191e;
        if (aVar != null) {
            aVar.w2(i10);
        }
        A();
    }
}
