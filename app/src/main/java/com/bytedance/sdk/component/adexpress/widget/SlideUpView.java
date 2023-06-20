package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class SlideUpView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f9923a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9924b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f9925c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f9926d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f9927e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f9928f;

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f9929g;

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f9930h;

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f9931i;

    public SlideUpView(Context context) {
        super(context);
        this.f9928f = new AnimatorSet();
        this.f9929g = new AnimatorSet();
        this.f9930h = new AnimatorSet();
        this.f9931i = new AnimatorSet();
        a(context);
    }

    public void c() {
        AnimatorSet animatorSet = this.f9928f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f9930h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f9929g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f9931i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f9928f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void setGuideText(String str) {
        this.f9927e.setText(str);
    }

    private void a(Context context) {
        if (context == null) {
            context = c.a();
        }
        RelativeLayout.inflate(context, t.f(context, "tt_dynamic_splash_slide_up"), this);
        this.f9925c = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_guide_bar"));
        this.f9923a = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_finger"));
        this.f9924b = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_circle"));
        this.f9927e = (TextView) findViewById(t.e(context, "slide_guide_text"));
        this.f9926d = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_bg"));
    }

    public void b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9923a, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9923a, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9923a, "translationY", 0.0f, b.a(getContext(), -100.0f));
        ofFloat3.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) b.a(getContext(), 100.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f9926d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideUpView.this.f9926d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9926d, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9926d, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9924b, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f9924b, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f9924b, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f9924b, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f9924b, "translationY", 0.0f, b.a(getContext(), -100.0f));
        ofFloat10.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f9929g.setDuration(50L);
        this.f9931i.setDuration(1500L);
        this.f9930h.setDuration(50L);
        this.f9929g.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.f9930h.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.f9931i.playTogether(ofFloat3, ofInt, ofFloat10);
        this.f9928f.playSequentially(this.f9930h, this.f9931i, this.f9929g);
    }

    public void a() {
        b();
        this.f9928f.start();
        this.f9928f.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideUpView.this.f9928f.start();
                    }
                }, 200L);
            }
        });
    }
}
