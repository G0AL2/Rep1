package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.k0;
import androidx.core.view.z;
import androidx.core.widget.j;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements k.a {
    private static final int[] F = {16842912};
    private androidx.appcompat.view.menu.g A;
    private ColorStateList B;
    private boolean C;
    private Drawable D;
    private final androidx.core.view.a E;

    /* renamed from: v  reason: collision with root package name */
    private int f22447v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f22448w;

    /* renamed from: x  reason: collision with root package name */
    boolean f22449x;

    /* renamed from: y  reason: collision with root package name */
    private final CheckedTextView f22450y;

    /* renamed from: z  reason: collision with root package name */
    private FrameLayout f22451z;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.Y(NavigationMenuItemView.this.f22449x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f22450y.setVisibility(8);
            FrameLayout frameLayout = this.f22451z;
            if (frameLayout != null) {
                k0.a aVar = (k0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f22451z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f22450y.setVisibility(0);
        FrameLayout frameLayout2 = this.f22451z;
        if (frameLayout2 != null) {
            k0.a aVar2 = (k0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f22451z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(d.a.f28677w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        return this.A.getTitle() == null && this.A.getIcon() == null && this.A.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f22451z == null) {
                this.f22451z = (FrameLayout) ((ViewStub) findViewById(ha.f.f31196c)).inflate();
            }
            this.f22451z.removeAllViews();
            this.f22451z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.A = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            z.u0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        c1.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.A;
        if (gVar != null && gVar.isCheckable() && this.A.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f22449x != z10) {
            this.f22449x = z10;
            this.E.l(this.f22450y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f22450y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.B);
            }
            int i10 = this.f22447v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f22448w) {
            if (this.D == null) {
                Drawable e10 = y.h.e(getResources(), ha.e.f31193g, getContext().getTheme());
                this.D = e10;
                if (e10 != null) {
                    int i11 = this.f22447v;
                    e10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.D;
        }
        j.l(this.f22450y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f22450y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f22447v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f22450y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f22448w = z10;
    }

    public void setTextAppearance(int i10) {
        j.q(this.f22450y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f22450y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f22450y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ha.h.f31223c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ha.d.f31165e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ha.f.f31197d);
        this.f22450y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        z.q0(checkedTextView, aVar);
    }
}
