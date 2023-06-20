package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class PressInteractView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f9869a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9870b;

    /* renamed from: c  reason: collision with root package name */
    private SplashDiffuseView f9871c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f9872d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9873e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f9874f;

    public PressInteractView(Context context) {
        super(context);
        this.f9873e = true;
        this.f9869a = context;
        this.f9872d = new AnimatorSet();
        c();
        d();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.f9870b.getLayoutParams();
                layoutParams.topMargin = ((int) ((PressInteractView.this.f9871c.getMeasuredHeight() / 2.0f) - b.a(PressInteractView.this.getContext(), 5.0f))) + ((int) b.a(PressInteractView.this.f9869a, 20.0f));
                layoutParams.leftMargin = ((int) ((PressInteractView.this.f9871c.getMeasuredWidth() / 2.0f) - b.a(PressInteractView.this.getContext(), 5.0f))) + ((int) b.a(PressInteractView.this.f9869a, 20.0f));
                layoutParams.bottomMargin = (int) (((-PressInteractView.this.f9871c.getMeasuredHeight()) / 2.0f) + b.a(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-PressInteractView.this.f9871c.getMeasuredWidth()) / 2.0f) + b.a(PressInteractView.this.getContext(), 5.0f));
                PressInteractView.this.f9870b.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f9874f.setVisibility(0);
        this.f9874f.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f9874f.setTextColor(i10);
    }

    private void c() {
        this.f9871c = new SplashDiffuseView(this.f9869a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f9869a, 50.0f), (int) b.a(this.f9869a, 50.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) b.a(this.f9869a, 20.0f);
        layoutParams.leftMargin = (int) b.a(this.f9869a, 20.0f);
        addView(this.f9871c, layoutParams);
        this.f9870b = new ImageView(this.f9869a);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f9869a, 78.0f), (int) b.a(this.f9869a, 78.0f));
        this.f9870b.setImageResource(t.d(this.f9869a, "tt_splash_hand"));
        addView(this.f9870b, layoutParams2);
        TextView textView = new TextView(this.f9869a);
        this.f9874f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) b.a(this.f9869a, 10.0f);
        addView(this.f9874f, layoutParams3);
        this.f9874f.setVisibility(8);
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9870b, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f9873e) {
                    PressInteractView.this.f9871c.a();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                pressInteractView.f9873e = !pressInteractView.f9873e;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressInteractView.this.f9870b, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                PressInteractView.this.f9870b.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9870b, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f9872d.playTogether(ofFloat, ofFloat2);
    }

    public void b() {
        AnimatorSet animatorSet = this.f9872d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void a() {
        this.f9872d.start();
    }
}
