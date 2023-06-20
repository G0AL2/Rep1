package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* loaded from: classes.dex */
public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    ObjectAnimator f9674a;

    /* renamed from: b  reason: collision with root package name */
    ObjectAnimator f9675b;

    /* renamed from: s  reason: collision with root package name */
    private int f9676s;

    /* renamed from: t  reason: collision with root package name */
    private Runnable f9677t;

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f9676s = 0;
        this.f9677t = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseScrollWidgetImp.this.a();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c
    public void b() {
        removeCallbacks(this.f9677t);
        ObjectAnimator objectAnimator = this.f9674a;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f9674a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f9675b;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f9675b.cancel();
        }
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f9690h - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f9677t, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        final View childAt = getChildAt(this.f9676s);
        final View childAt2 = getChildAt((this.f9676s + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.f9690h + getChildAt(this.f9676s).getHeight())) / 2);
        this.f9674a = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9674a.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.f9690h + childAt2.getHeight()) / 2, 0.0f);
        this.f9675b = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.f9675b.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.f9674a.setDuration(500L);
        this.f9675b.setDuration(500L);
        this.f9674a.start();
        this.f9675b.start();
        int i10 = this.f9676s + 1;
        this.f9676s = i10;
        this.f9676s = i10 % getChildCount();
        postDelayed(this.f9677t, Constants.MIN_PROGRESS_TIME);
    }
}
