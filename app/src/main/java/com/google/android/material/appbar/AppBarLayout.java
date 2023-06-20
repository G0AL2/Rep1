package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.i0;
import androidx.core.view.m;
import androidx.core.view.s;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import ha.k;
import ha.l;
import java.lang.ref.WeakReference;
import java.util.List;
import xa.g;
import xa.h;

@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f21967a;

    /* renamed from: b  reason: collision with root package name */
    private int f21968b;

    /* renamed from: c  reason: collision with root package name */
    private int f21969c;

    /* renamed from: d  reason: collision with root package name */
    private int f21970d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21971e;

    /* renamed from: f  reason: collision with root package name */
    private int f21972f;

    /* renamed from: g  reason: collision with root package name */
    private i0 f21973g;

    /* renamed from: h  reason: collision with root package name */
    private List<c> f21974h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21975i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f21976j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21977k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21978l;

    /* renamed from: m  reason: collision with root package name */
    private int f21979m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<View> f21980n;

    /* renamed from: o  reason: collision with root package name */
    private ValueAnimator f21981o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f21982p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f21983q;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                z.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f21984k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.q(appBarLayout.s(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H = H(coordinatorLayout.r(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f22011d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.n(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.M1);
            O(obtainStyledAttributes.getDimensionPixelSize(l.N1, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    class a implements s {
        a() {
        }

        @Override // androidx.core.view.s
        public i0 a(View view, i0 i0Var) {
            return AppBarLayout.this.l(i0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f21998a;

        b(AppBarLayout appBarLayout, g gVar) {
            this.f21998a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f21998a.T(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.f31130a);
    }

    private void a() {
        WeakReference<View> weakReference = this.f21980n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21980n = null;
    }

    private View b(View view) {
        int i10;
        if (this.f21980n == null && (i10 = this.f21979m) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f21979m);
            }
            if (findViewById != null) {
                this.f21980n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f21980n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void i() {
        this.f21968b = -1;
        this.f21969c = -1;
        this.f21970d = -1;
    }

    private void o(boolean z10, boolean z11, boolean z12) {
        this.f21972f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean p(boolean z10) {
        if (this.f21976j != z10) {
            this.f21976j = z10;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean r() {
        return this.f21983q != null && getTopInset() > 0;
    }

    private boolean t() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || z.z(childAt)) ? false : true;
        }
        return false;
    }

    private void u(g gVar, boolean z10) {
        float dimension = getResources().getDimension(ha.d.f31161a);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f21981o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.f21981o = ofFloat;
        ofFloat.setDuration(getResources().getInteger(ha.g.f31219a));
        this.f21981o.setInterpolator(ia.a.f31869a);
        this.f21981o.addUpdateListener(new b(this, gVar));
        this.f21981o.start();
    }

    private void v() {
        setWillNotDraw(!r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f21967a);
            this.f21983q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21983q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    boolean f() {
        return this.f21971e;
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int D;
        int i11 = this.f21969c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f21999a;
            if ((i13 & 5) == 5) {
                int i14 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i13 & 8) != 0) {
                    D = z.D(childAt);
                } else if ((i13 & 2) != 0) {
                    D = measuredHeight - z.D(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && z.z(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + D;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f21969c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f21970d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i13 = dVar.f21999a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= z.D(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f21970d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f21979m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int D = z.D(this);
        if (D == 0) {
            int childCount = getChildCount();
            D = childCount >= 1 ? z.D(getChildAt(childCount - 1)) : 0;
            if (D == 0) {
                return getHeight() / 3;
            }
        }
        return (D * 2) + topInset;
    }

    int getPendingAction() {
        return this.f21972f;
    }

    public Drawable getStatusBarForeground() {
        return this.f21983q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        i0 i0Var = this.f21973g;
        if (i0Var != null) {
            return i0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f21968b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f21999a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i11 == 0 && z.z(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= z.D(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f21968b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return getTotalScrollRange() != 0;
    }

    public boolean j() {
        return this.f21978l;
    }

    void k(int i10) {
        this.f21967a = i10;
        if (!willNotDraw()) {
            z.h0(this);
        }
        List<c> list = this.f21974h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = this.f21974h.get(i11);
                if (cVar != null) {
                    cVar.a(this, i10);
                }
            }
        }
    }

    i0 l(i0 i0Var) {
        i0 i0Var2 = z.z(this) ? i0Var : null;
        if (!h0.c.a(this.f21973g, i0Var2)) {
            this.f21973g = i0Var2;
            v();
            requestLayout();
        }
        return i0Var;
    }

    void m() {
        this.f21972f = 0;
    }

    public void n(boolean z10, boolean z11) {
        o(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f21982p == null) {
            this.f21982p = new int[4];
        }
        int[] iArr = this.f21982p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f21976j;
        int i11 = ha.b.f31153x;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f21977k) ? ha.b.f31154y : -ha.b.f31154y;
        int i12 = ha.b.f31151v;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f21977k) ? ha.b.f31150u : -ha.b.f31150u;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (z.z(this) && t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                z.b0(getChildAt(childCount), topInset);
            }
        }
        i();
        this.f21971e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((d) getChildAt(i14).getLayoutParams()).b() != null) {
                this.f21971e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f21983q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f21975i) {
            return;
        }
        if (!this.f21978l && !g()) {
            z11 = false;
        }
        p(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && z.z(this) && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = c0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    boolean q(boolean z10) {
        if (this.f21977k != z10) {
            this.f21977k = z10;
            refreshDrawableState();
            if (this.f21978l && (getBackground() instanceof g)) {
                u((g) getBackground(), z10);
                return true;
            }
            return true;
        }
        return false;
    }

    boolean s(View view) {
        View b10 = b(view);
        if (b10 != null) {
            view = b10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        n(z10, z.U(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f21978l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f21979m = i10;
        a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f21983q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f21983q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f21983q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f21983q, z.C(this));
                this.f21983q.setVisible(getVisibility() == 0, false);
                this.f21983q.setCallback(this);
            }
            v();
            z.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(e.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.b(this, f10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f21983q;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21983q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        /* renamed from: k  reason: collision with root package name */
        private int f21984k;

        /* renamed from: l  reason: collision with root package name */
        private int f21985l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f21986m;

        /* renamed from: n  reason: collision with root package name */
        private int f21987n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f21988o;

        /* renamed from: p  reason: collision with root package name */
        private float f21989p;

        /* renamed from: q  reason: collision with root package name */
        private WeakReference<View> f21990q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f21994a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f21995b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f21994a = coordinatorLayout;
                this.f21995b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f21994a, this.f21995b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public BaseBehavior() {
            this.f21987n = -1;
        }

        private void S(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            T(coordinatorLayout, t10, i10, height);
        }

        private void T(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f21986m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f21986m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f21986m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f21986m = valueAnimator3;
                valueAnimator3.setInterpolator(ia.a.f31873e);
                this.f21986m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f21986m.setDuration(Math.min(i11, 600));
            this.f21986m.setIntValues(M, i10);
            this.f21986m.start();
        }

        private boolean V(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.h() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean W(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private View X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof m) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View Y(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Z(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (W(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private int c0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b10 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (b10 != null) {
                    int a10 = dVar.a();
                    if ((a10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((a10 & 2) != 0) {
                            i11 -= z.D(childAt);
                        }
                    }
                    if (z.z(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * b10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean n0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> s10 = coordinatorLayout.s(t10);
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).K() != 0;
                }
            }
            return false;
        }

        private void o0(CoordinatorLayout coordinatorLayout, T t10) {
            int M = M();
            int Z = Z(t10, M);
            if (Z >= 0) {
                View childAt = t10.getChildAt(Z);
                d dVar = (d) childAt.getLayoutParams();
                int a10 = dVar.a();
                if ((a10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (Z == t10.getChildCount() - 1) {
                        i11 += t10.getTopInset();
                    }
                    if (W(a10, 2)) {
                        i11 += z.D(childAt);
                    } else if (W(a10, 5)) {
                        int D = z.D(childAt) + i11;
                        if (M < D) {
                            i10 = D;
                        } else {
                            i11 = D;
                        }
                    }
                    if (W(a10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (M < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    S(coordinatorLayout, t10, c0.a.b(i10, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void p0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View Y = Y(t10, i10);
            if (Y != null) {
                int a10 = ((d) Y.getLayoutParams()).a();
                boolean z11 = false;
                if ((a10 & 1) != 0) {
                    int D = z.D(Y);
                    if (i11 <= 0 || (a10 & 12) == 0 ? !((a10 & 2) == 0 || (-i10) < (Y.getBottom() - D) - t10.getTopInset()) : (-i10) >= (Y.getBottom() - D) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
                if (t10.j()) {
                    z11 = t10.s(X(coordinatorLayout));
                }
                boolean q10 = t10.q(z11);
                if (z10 || (q10 && n0(coordinatorLayout, t10))) {
                    t10.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f21984k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: U */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f21990q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: a0 */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: b0 */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: d0 */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            o0(coordinatorLayout, t10);
            if (t10.j()) {
                t10.q(t10.s(X(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: e0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int round;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            int i11 = this.f21987n;
            if (i11 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t10.getChildAt(i11);
                int i12 = -childAt.getBottom();
                if (this.f21988o) {
                    round = z.D(childAt) + t10.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f21989p);
                }
                P(coordinatorLayout, t10, i12 + round);
            } else if (pendingAction != 0) {
                boolean z10 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i13 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        S(coordinatorLayout, t10, i13, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, i13);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        S(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.m();
            this.f21987n = -1;
            G(c0.a.b(E(), -t10.getTotalScrollRange(), 0));
            p0(coordinatorLayout, t10, E(), 0, true);
            t10.k(E());
            return l10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: f0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.J(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: g0 */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    int i15 = -t10.getTotalScrollRange();
                    i13 = i15;
                    i14 = t10.getDownNestedPreScrollRange() + i15;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                if (i13 != i14) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i13, i14);
                }
            }
            if (t10.j()) {
                t10.q(t10.s(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.x(coordinatorLayout, t10, savedState.c());
                this.f21987n = savedState.f21991c;
                this.f21989p = savedState.f21992d;
                this.f21988o = savedState.f21993e;
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f21987n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            int E = E();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(y10);
                    savedState.f21991c = i10;
                    savedState.f21993e = bottom == z.D(childAt) + t10.getTopInset();
                    savedState.f21992d = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return y10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.j() || V(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f21986m) != null) {
                valueAnimator.cancel();
            }
            this.f21990q = null;
            this.f21985l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f21985l == 0 || i10 == 1) {
                o0(coordinatorLayout, t10);
                if (t10.j()) {
                    t10.q(t10.s(view));
                }
            }
            this.f21990q = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: m0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int M = M();
            int i13 = 0;
            if (i11 != 0 && M >= i11 && M <= i12) {
                int b10 = c0.a.b(i10, i11, i12);
                if (M != b10) {
                    int c02 = t10.f() ? c0(t10, b10) : b10;
                    boolean G = G(c02);
                    i13 = M - b10;
                    this.f21984k = b10 - c02;
                    if (!G && t10.f()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.k(E());
                    p0(coordinatorLayout, t10, b10, b10 < M ? -1 : 1, false);
                }
            } else {
                this.f21984k = 0;
            }
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21987n = -1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            int f21991c;

            /* renamed from: d  reason: collision with root package name */
            float f21992d;

            /* renamed from: e  reason: collision with root package name */
            boolean f21993e;

            /* loaded from: classes2.dex */
            static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f21991c = parcel.readInt();
                this.f21992d = parcel.readFloat();
                this.f21993e = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f21991c);
                parcel.writeFloat(this.f21992d);
                parcel.writeByte(this.f21993e ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21968b = -1;
        this.f21969c = -1;
        this.f21970d = -1;
        this.f21972f = 0;
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            e.a(this);
            e.c(this, attributeSet, i10, k.f31255d);
        }
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, l.f31267a, i10, k.f31255d, new int[0]);
        z.u0(this, k10.getDrawable(l.f31272b));
        if (getBackground() instanceof ColorDrawable) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.L(context);
            z.u0(this, gVar);
        }
        int i12 = l.f31292f;
        if (k10.hasValue(i12)) {
            o(k10.getBoolean(i12, false), false, false);
        }
        if (i11 >= 21) {
            int i13 = l.f31287e;
            if (k10.hasValue(i13)) {
                e.b(this, k10.getDimensionPixelSize(i13, 0));
            }
        }
        if (i11 >= 26) {
            int i14 = l.f31282d;
            if (k10.hasValue(i14)) {
                setKeyboardNavigationCluster(k10.getBoolean(i14, false));
            }
            int i15 = l.f31277c;
            if (k10.hasValue(i15)) {
                setTouchscreenBlocksFocus(k10.getBoolean(i15, false));
            }
        }
        this.f21978l = k10.getBoolean(l.f31297g, false);
        this.f21979m = k10.getResourceId(l.f31302h, -1);
        setStatusBarForeground(k10.getDrawable(l.f31307i));
        k10.recycle();
        z.D0(this, new a());
    }

    /* loaded from: classes2.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f21999a;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f22000b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21999a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f31312j);
            this.f21999a = obtainStyledAttributes.getInt(l.f31317k, 0);
            int i10 = l.f31322l;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f22000b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f21999a;
        }

        public Interpolator b() {
            return this.f22000b;
        }

        boolean c() {
            int i10 = this.f21999a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f21999a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21999a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21999a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21999a = 1;
        }
    }
}
