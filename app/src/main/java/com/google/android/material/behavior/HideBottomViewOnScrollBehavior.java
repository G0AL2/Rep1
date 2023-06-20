package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f22053a;

    /* renamed from: b  reason: collision with root package name */
    private int f22054b;

    /* renamed from: c  reason: collision with root package name */
    private int f22055c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPropertyAnimator f22056d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f22056d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f22053a = 0;
        this.f22054b = 2;
        this.f22055c = 0;
    }

    private void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f22056d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void G(V v10, int i10) {
        this.f22055c = i10;
        if (this.f22054b == 1) {
            v10.setTranslationY(this.f22053a + i10);
        }
    }

    public void H(V v10) {
        if (this.f22054b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22056d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f22054b = 1;
        F(v10, this.f22053a + this.f22055c, 175L, ia.a.f31871c);
    }

    public void I(V v10) {
        if (this.f22054b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22056d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f22054b = 2;
        F(v10, 0, 225L, ia.a.f31872d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f22053a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        if (i11 > 0) {
            H(v10);
        } else if (i11 < 0) {
            I(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22053a = 0;
        this.f22054b = 2;
        this.f22055c = 0;
    }
}
