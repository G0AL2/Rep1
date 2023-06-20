package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.i0;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f22011d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f22012e;

    /* renamed from: f  reason: collision with root package name */
    private int f22013f;

    /* renamed from: g  reason: collision with root package name */
    private int f22014g;

    public b() {
        this.f22011d = new Rect();
        this.f22012e = new Rect();
        this.f22013f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f22011d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            i0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && z.z(coordinatorLayout) && !z.z(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f22012e;
            androidx.core.view.e.a(N(fVar.f2452c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f22013f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i10);
        this.f22013f = 0;
    }

    abstract View H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f22014g == 0) {
            return 0;
        }
        float J = J(view);
        int i10 = this.f22014g;
        return c0.a.b((int) (J * i10), 0, i10);
    }

    abstract float J(View view);

    public final int K() {
        return this.f22014g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int M() {
        return this.f22013f;
    }

    public final void O(int i10) {
        this.f22014g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H;
        i0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (H = H(coordinatorLayout.r(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (z.z(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.k() + lastWindowInsets.h();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L, i14 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i13);
            return true;
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22011d = new Rect();
        this.f22012e = new Rect();
        this.f22013f = 0;
    }
}
