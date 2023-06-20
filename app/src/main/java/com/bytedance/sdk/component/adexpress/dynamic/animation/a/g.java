package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RubInAnimation.java */
/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: d  reason: collision with root package name */
    private a f9519d;

    /* compiled from: RubInAnimation.java */
    /* loaded from: classes.dex */
    private class a {

        /* renamed from: b  reason: collision with root package name */
        private View f9523b;

        public a(View view) {
            this.f9523b = view;
        }

        public void a(int i10) {
            ViewGroup.LayoutParams layoutParams = this.f9523b.getLayoutParams();
            layoutParams.height = i10;
            this.f9523b.setLayoutParams(layoutParams);
            this.f9523b.requestLayout();
        }
    }

    public g(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "alpha", 0.0f, 1.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        this.f9519d = new a(this.f9509c);
        final int i10 = this.f9509c.getLayoutParams().height;
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f9519d, "height", 0, i10).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                g.this.f9519d.a(i10);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}
