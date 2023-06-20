package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import ha.l;
import ia.h;
import java.util.List;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: s  reason: collision with root package name */
    private final Rect f22360s;

    /* renamed from: t  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f22361t;

    /* renamed from: u  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f22362u;

    /* renamed from: v  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f22363v;

    /* renamed from: w  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f22364w;

    /* renamed from: x  reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f22365x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f22366y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.c f22373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f22374c;

        a(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.c cVar, d dVar) {
            this.f22373b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f22372a = true;
            this.f22373b.f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f22373b.a();
            if (this.f22372a) {
                return;
            }
            this.f22373b.i(this.f22374c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f22373b.onAnimationStart(animator);
            this.f22372a = false;
        }
    }

    /* loaded from: classes2.dex */
    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class d {
    }

    static {
        new b(Float.class, "width");
        new c(Float.class, "height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(com.google.android.material.floatingactionbutton.c cVar, d dVar) {
        if (cVar.d()) {
            return;
        }
        if (!n()) {
            cVar.b();
            cVar.i(dVar);
            return;
        }
        measure(0, 0);
        AnimatorSet g10 = cVar.g();
        g10.addListener(new a(this, cVar, dVar));
        for (Animator.AnimatorListener animatorListener : cVar.h()) {
            g10.addListener(animatorListener);
        }
        g10.start();
    }

    private boolean n() {
        return z.U(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f22365x;
    }

    int getCollapsedSize() {
        return (Math.min(z.H(this), z.G(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.f22362u.c();
    }

    public h getHideMotionSpec() {
        return this.f22364w.c();
    }

    public h getShowMotionSpec() {
        return this.f22363v.c();
    }

    public h getShrinkMotionSpec() {
        return this.f22361t.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22366y && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f22366y = false;
            this.f22361t.b();
        }
    }

    public void setExtendMotionSpec(h hVar) {
        this.f22362u.e(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f22366y == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.c cVar = z10 ? this.f22362u : this.f22361t;
        if (cVar.d()) {
            return;
        }
        cVar.b();
    }

    public void setHideMotionSpec(h hVar) {
        this.f22364w.e(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    public void setShowMotionSpec(h hVar) {
        this.f22363v.e(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.f22361t.e(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    /* loaded from: classes2.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f22367a;

        /* renamed from: b  reason: collision with root package name */
        private d f22368b;

        /* renamed from: c  reason: collision with root package name */
        private d f22369c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22370d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f22371e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f22370d = false;
            this.f22371e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i10;
            Rect rect = extendedFloatingActionButton.f22360s;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            int i11 = 0;
            if (extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = extendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (extendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                z.b0(extendedFloatingActionButton, i11);
            }
            if (i10 != 0) {
                z.a0(extendedFloatingActionButton, i10);
            }
        }

        private boolean K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f22370d || this.f22371e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (K(appBarLayout, extendedFloatingActionButton)) {
                if (this.f22367a == null) {
                    this.f22367a = new Rect();
                }
                Rect rect = this.f22367a;
                com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    L(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (K(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    L(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f22371e;
            extendedFloatingActionButton.m(z10 ? extendedFloatingActionButton.f22362u : extendedFloatingActionButton.f22363v, z10 ? this.f22369c : this.f22368b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect rect2 = extendedFloatingActionButton.f22360s;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                N(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (view instanceof AppBarLayout) {
                    if (M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(view) && N(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        protected void L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f22371e;
            extendedFloatingActionButton.m(z10 ? extendedFloatingActionButton.f22361t : extendedFloatingActionButton.f22364w, z10 ? this.f22369c : this.f22368b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2457h == 0) {
                fVar.f2457h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f31388y0);
            this.f22370d = obtainStyledAttributes.getBoolean(l.f31393z0, false);
            this.f22371e = obtainStyledAttributes.getBoolean(l.A0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
