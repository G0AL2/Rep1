package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import ha.b;
import xa.k;
import xa.n;

/* compiled from: MaterialCardView.java */
/* loaded from: classes2.dex */
public class a extends CardView implements Checkable, n {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f22181n = {16842911};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f22182o = {16842912};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f22183p = {b.f31152w};

    /* renamed from: j  reason: collision with root package name */
    private boolean f22184j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22185k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22186l;

    /* renamed from: m  reason: collision with root package name */
    private InterfaceC0295a f22187m;

    /* compiled from: MaterialCardView.java */
    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0295a {
        void a(a aVar, boolean z10);
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return this.f22186l;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f22185k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f22181n);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f22182o);
        }
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f22183p);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(CardView.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CardView.class.getName());
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f22184j) {
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        throw null;
    }

    public void setCheckable(boolean z10) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f22185k != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i10) {
        e.a.b(getContext(), i10);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        throw null;
    }

    public void setDragged(boolean z10) {
        if (this.f22186l != z10) {
            this.f22186l = z10;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0295a interfaceC0295a) {
        this.f22187m = interfaceC0295a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        throw null;
    }

    public void setProgress(float f10) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        e.a.a(getContext(), i10);
        throw null;
    }

    @Override // xa.n
    public void setShapeAppearanceModel(k kVar) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.f22185k = !this.f22185k;
            refreshDrawableState();
            g();
            InterfaceC0295a interfaceC0295a = this.f22187m;
            if (interfaceC0295a != null) {
                interfaceC0295a.a(this, this.f22185k);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
