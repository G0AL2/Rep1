package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.g;
import ha.k;
import ha.l;

/* loaded from: classes2.dex */
public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: d  reason: collision with root package name */
    private int f22210d;

    /* renamed from: e  reason: collision with root package name */
    private int f22211e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22212f;

    /* renamed from: g  reason: collision with root package name */
    private d f22213g;

    /* renamed from: h  reason: collision with root package name */
    private final b f22214h;

    /* renamed from: i  reason: collision with root package name */
    private e f22215i;

    /* renamed from: j  reason: collision with root package name */
    private int f22216j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22217k;

    /* loaded from: classes2.dex */
    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (ChipGroup.this.f22217k) {
                return;
            }
            int id2 = compoundButton.getId();
            if (z10) {
                if (ChipGroup.this.f22216j != -1 && ChipGroup.this.f22216j != id2 && ChipGroup.this.f22212f) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.k(chipGroup.f22216j, false);
                }
                ChipGroup.this.setCheckedId(id2);
            } else if (ChipGroup.this.f22216j == id2) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(ChipGroup chipGroup, int i10);
    }

    /* loaded from: classes2.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f22219a;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            int hashCode;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        hashCode = View.generateViewId();
                    } else {
                        hashCode = view2.hashCode();
                    }
                    view2.setId(hashCode);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f22214h);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22219a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22219a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.f31134e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.f22217k = true;
            ((Chip) findViewById).setChecked(z10);
            this.f22217k = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.f22216j = i10;
        d dVar = this.f22213g;
        if (dVar == null || !this.f22212f) {
            return;
        }
        dVar.a(this, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f22216j;
                if (i11 != -1 && this.f22212f) {
                    k(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.material.internal.c
    public boolean b() {
        return super.b();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f22212f) {
            return this.f22216j;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f22210d;
    }

    public int getChipSpacingVertical() {
        return this.f22211e;
    }

    public void j() {
        this.f22217k = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f22217k = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f22216j;
        if (i10 != -1) {
            k(i10, true);
            setCheckedId(this.f22216j);
        }
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f22210d != i10) {
            this.f22210d = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f22211e != i10) {
            this.f22211e = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f22213g = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f22215i.f22219a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        if (this.f22212f != z10) {
            this.f22212f = z10;
            j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22214h = new b();
        this.f22215i = new e();
        this.f22216j = -1;
        this.f22217k = false;
        TypedArray k10 = g.k(context, attributeSet, l.f31353r0, i10, k.f31261j, new int[0]);
        int dimensionPixelOffset = k10.getDimensionPixelOffset(l.f31363t0, 0);
        setChipSpacingHorizontal(k10.getDimensionPixelOffset(l.f31368u0, dimensionPixelOffset));
        setChipSpacingVertical(k10.getDimensionPixelOffset(l.f31373v0, dimensionPixelOffset));
        setSingleLine(k10.getBoolean(l.f31378w0, false));
        setSingleSelection(k10.getBoolean(l.f31383x0, false));
        int resourceId = k10.getResourceId(l.f31358s0, -1);
        if (resourceId != -1) {
            this.f22216j = resourceId;
        }
        k10.recycle();
        super.setOnHierarchyChangeListener(this.f22215i);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
