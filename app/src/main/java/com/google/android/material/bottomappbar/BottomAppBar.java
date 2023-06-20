package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ia.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xa.g;
import xa.h;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int R;
    private final g S;
    private Animator T;
    private Animator U;
    private int V;
    private int W;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f22074g0;

    /* renamed from: h0  reason: collision with root package name */
    private int f22075h0;

    /* renamed from: i0  reason: collision with root package name */
    private ArrayList<f> f22076i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f22077j0;

    /* renamed from: k0  reason: collision with root package name */
    private Behavior f22078k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f22079l0;

    /* renamed from: m0  reason: collision with root package name */
    AnimatorListenerAdapter f22080m0;

    /* renamed from: n0  reason: collision with root package name */
    k<FloatingActionButton> f22081n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f22087c;

        /* renamed from: d  reason: collision with root package name */
        boolean f22088d;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22087c);
            parcel.writeInt(this.f22088d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22087c = parcel.readInt();
            this.f22088d = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22090a;

        /* loaded from: classes2.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.i0();
            }
        }

        b(int i10) {
            this.f22090a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.n0(this.f22090a));
            floatingActionButton.s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
            BottomAppBar.this.U = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f22095b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f22096c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f22097d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f22095b = actionMenuView;
            this.f22096c = i10;
            this.f22097d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f22094a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f22094a) {
                return;
            }
            BottomAppBar.this.u0(this.f22095b, this.f22096c, this.f22097d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f22080m0.onAnimationStart(animator);
            FloatingActionButton k02 = BottomAppBar.this.k0();
            if (k02 != null) {
                k02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f22080m0);
        floatingActionButton.f(new e());
        floatingActionButton.g(this.f22081n0);
    }

    private void e0() {
        Animator animator = this.U;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.T;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void g0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k0(), "translationX", n0(i10));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f22079l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return n0(this.V);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().b();
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.S.B().p();
    }

    private void h0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m0(actionMenuView, i10, z10)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        ArrayList<f> arrayList;
        int i10 = this.f22075h0 - 1;
        this.f22075h0 = i10;
        if (i10 != 0 || (arrayList = this.f22076i0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ArrayList<f> arrayList;
        int i10 = this.f22075h0;
        this.f22075h0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f22076i0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton k0() {
        View l02 = l0();
        if (l02 instanceof FloatingActionButton) {
            return (FloatingActionButton) l02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View l0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.l0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n0(int i10) {
        boolean z10 = z.C(this) == 1;
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) - this.R) * (z10 ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean o0() {
        FloatingActionButton k02 = k0();
        return k02 != null && k02.o();
    }

    private void p0(int i10, boolean z10) {
        if (z.U(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!o0()) {
                i10 = 0;
                z10 = false;
            }
            h0(i10, z10, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.U = animatorSet;
            animatorSet.addListener(new c());
            this.U.start();
        }
    }

    private void q0(int i10) {
        if (this.V == i10 || !z.U(this)) {
            return;
        }
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.W == 1) {
            g0(i10, arrayList);
        } else {
            f0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.T = animatorSet;
        animatorSet.addListener(new a());
        this.T.start();
    }

    private void r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!o0()) {
                u0(actionMenuView, 0, false);
            } else {
                u0(actionMenuView, this.V, this.f22077j0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        getTopEdgeTreatment().k(getFabTranslationX());
        View l02 = l0();
        this.S.V((this.f22077j0 && o0()) ? 1.0f : 0.0f);
        if (l02 != null) {
            l02.setTranslationY(getFabTranslationY());
            l02.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(ActionMenuView actionMenuView, int i10, boolean z10) {
        actionMenuView.setTranslationX(m0(actionMenuView, i10, z10));
    }

    protected void f0(int i10, List<Animator> list) {
        FloatingActionButton k02 = k0();
        if (k02 == null || k02.n()) {
            return;
        }
        j0();
        k02.l(new b(i10));
    }

    public ColorStateList getBackgroundTint() {
        return this.S.D();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().b();
    }

    public int getFabAlignmentMode() {
        return this.V;
    }

    public int getFabAnimationMode() {
        return this.W;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d();
    }

    public boolean getHideOnScroll() {
        return this.f22074g0;
    }

    protected int m0(ActionMenuView actionMenuView, int i10, boolean z10) {
        boolean z11 = z.C(this) == 1;
        int measuredWidth = z11 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f820a & 8388615) == 8388611) {
                if (z11) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = measuredWidth - (z11 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i10 == 1 && z10) {
            return right;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.S);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            e0();
            s0();
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        this.V = savedState.f22087c;
        this.f22077j0 = savedState.f22088d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22087c = this.V;
        savedState.f22088d = this.f22077j0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.S, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().f(f10);
            this.S.invalidateSelf();
            s0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.S.T(f10);
        getBehavior().G(this, this.S.A() - this.S.z());
    }

    public void setFabAlignmentMode(int i10) {
        q0(i10);
        p0(i10, this.f22077j0);
        this.V = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.W = i10;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().g(f10);
            this.S.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().i(f10);
            this.S.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f22074g0 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    boolean t0(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().j(f10);
            this.S.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f22078k0 == null) {
            this.f22078k0 = new Behavior();
        }
        return this.f22078k0;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        private final Rect f22082e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<BottomAppBar> f22083f;

        /* renamed from: g  reason: collision with root package name */
        private int f22084g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f22085h;

        /* loaded from: classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f22083f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f22082e);
                    int height = Behavior.this.f22082e.height();
                    bottomAppBar.t0(height);
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f22084g == 0) {
                        int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(ha.d.f31176p);
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        return;
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f22085h = new a();
            this.f22082e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f22083f = new WeakReference<>(bottomAppBar);
            View l02 = bottomAppBar.l0();
            if (l02 != null && !z.U(l02)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) l02.getLayoutParams();
                fVar.f2453d = 49;
                this.f22084g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (l02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) l02;
                    floatingActionButton.addOnLayoutChangeListener(this.f22085h);
                    bottomAppBar.d0(floatingActionButton);
                }
                bottomAppBar.s0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22085h = new a();
            this.f22082e = new Rect();
        }
    }
}
