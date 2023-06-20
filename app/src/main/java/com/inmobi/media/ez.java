package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: NativeContainerLayout.java */
/* loaded from: classes3.dex */
public class ez extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25321a = ez.class.getSimpleName();

    /* compiled from: NativeContainerLayout.java */
    /* loaded from: classes3.dex */
    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f25322a;

        /* renamed from: b  reason: collision with root package name */
        public int f25323b;

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ez(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int i15 = aVar.f25322a;
                childAt.layout(i15, aVar.f25323b, childAt.getMeasuredWidth() + i15, aVar.f25323b + childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                i13 = Math.max(i13, aVar.f25322a + childAt.getMeasuredWidth());
                i12 = Math.max(i12, aVar.f25323b + childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(ViewGroup.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), ViewGroup.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }
}
