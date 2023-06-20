package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class PressButtonInteractView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f9862a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9863b;

    /* renamed from: c  reason: collision with root package name */
    private SplashDiffuseView f9864c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f9865d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9866e;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f9866e = true;
        this.f9862a = context;
        this.f9865d = new AnimatorSet();
        c();
        d();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.f9863b.getLayoutParams();
                layoutParams.topMargin = (int) ((PressButtonInteractView.this.f9864c.getMeasuredHeight() / 2.0f) - b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((PressButtonInteractView.this.f9864c.getMeasuredWidth() / 2.0f) - b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-PressButtonInteractView.this.f9864c.getMeasuredHeight()) / 2.0f) + b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-PressButtonInteractView.this.f9864c.getMeasuredWidth()) / 2.0f) + b.a(PressButtonInteractView.this.getContext(), 5.0f));
                PressButtonInteractView.this.f9863b.setLayoutParams(layoutParams);
            }
        });
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9863b, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f9866e) {
                    PressButtonInteractView.this.f9864c.a();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                pressButtonInteractView.f9866e = !pressButtonInteractView.f9866e;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressButtonInteractView.this.f9863b, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                PressButtonInteractView.this.f9863b.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9863b, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f9865d.playTogether(ofFloat, ofFloat2);
    }

    private void c() {
        this.f9864c = new SplashDiffuseView(this.f9862a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f9862a, 40.0f), (int) b.a(this.f9862a, 40.0f));
        layoutParams.gravity = 19;
        addView(this.f9864c, layoutParams);
        this.f9863b = new ImageView(this.f9862a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f9862a, 62.0f), (int) b.a(this.f9862a, 62.0f));
        layoutParams2.gravity = 16;
        this.f9863b.setImageResource(t.d(this.f9862a, "tt_splash_hand"));
        addView(this.f9863b, layoutParams2);
    }

    public void b() {
        AnimatorSet animatorSet = this.f9865d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void a() {
        this.f9865d.start();
    }
}
