package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z;
import com.google.android.gms.common.api.Api;
import ha.l;

/* compiled from: FlowLayout.java */
/* loaded from: classes3.dex */
public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f22482a;

    /* renamed from: b  reason: collision with root package name */
    private int f22483b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22484c;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l.D0, 0, 0);
        this.f22482a = obtainStyledAttributes.getDimensionPixelSize(l.F0, 0);
        this.f22483b = obtainStyledAttributes.getDimensionPixelSize(l.E0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean b() {
        return this.f22484c;
    }

    protected int getItemSpacing() {
        return this.f22483b;
    }

    protected int getLineSpacing() {
        return this.f22482a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            return;
        }
        boolean z11 = z.C(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = androidx.core.view.h.b(marginLayoutParams);
                    i14 = androidx.core.view.h.a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = i17 + i15 + childAt.getMeasuredWidth();
                if (!this.f22484c && measuredWidth > i16) {
                    i18 = this.f22482a + paddingTop;
                    i17 = paddingRight;
                }
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i15 + i14 + childAt.getMeasuredWidth() + this.f22483b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i12 + childAt.getMeasuredWidth() <= paddingRight || b()) {
                    i14 = i19;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f22482a + paddingTop;
                }
                int measuredWidth = i14 + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i12 + i13 + childAt.getMeasuredWidth() + this.f22483b;
                if (i18 == getChildCount() - 1) {
                    i17 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i10) {
        this.f22483b = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i10) {
        this.f22482a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f22484c = z10;
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22484c = false;
        c(context, attributeSet);
    }
}
