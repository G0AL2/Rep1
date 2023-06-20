package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class SlideRightView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f9910a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9911b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f9912c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f9913d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f9914e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f9915f;

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f9916g;

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f9917h;

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f9918i;

    public SlideRightView(Context context) {
        super(context);
        this.f9915f = new AnimatorSet();
        this.f9916g = new AnimatorSet();
        this.f9917h = new AnimatorSet();
        this.f9918i = new AnimatorSet();
        this.f9910a = context;
        b();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.f9914e.setText(str);
    }

    private void b() {
        ImageView imageView = new ImageView(this.f9910a);
        this.f9913d = imageView;
        imageView.setBackgroundResource(t.d(this.f9910a, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        addView(this.f9913d, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f9910a);
        this.f9912c = imageView2;
        imageView2.setImageResource(t.d(this.f9910a, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f9910a, 50.0f), (int) b.a(this.f9910a, 50.0f));
        layoutParams2.gravity = 48;
        addView(this.f9912c, layoutParams2);
        ImageView imageView3 = new ImageView(this.f9910a);
        this.f9911b = imageView3;
        imageView3.setImageResource(t.d(this.f9910a, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) b.a(this.f9910a, 80.0f), (int) b.a(this.f9910a, 80.0f));
        layoutParams3.gravity = 48;
        addView(this.f9911b, layoutParams3);
        TextView textView = new TextView(this.f9910a);
        this.f9914e = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f9914e, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) SlideRightView.this.f9911b.getLayoutParams();
                layoutParams5.topMargin = (int) ((SlideRightView.this.f9912c.getMeasuredHeight() / 2.0f) - b.a(SlideRightView.this.getContext(), 7.0f));
                layoutParams5.leftMargin = -SlideRightView.this.f9912c.getMeasuredWidth();
                SlideRightView.this.f9911b.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) SlideRightView.this.f9913d.getLayoutParams();
                layoutParams6.topMargin = (int) ((SlideRightView.this.f9912c.getMeasuredHeight() / 2.0f) - b.a(SlideRightView.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) (SlideRightView.this.f9912c.getMeasuredWidth() / 2.0f);
                SlideRightView.this.f9913d.setLayoutParams(layoutParams6);
            }
        });
    }

    private void c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9911b, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9912c, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9912c, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9913d, "alpha", 0.0f, 1.0f);
        this.f9917h.setDuration(300L);
        this.f9917h.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9911b, "translationX", 0.0f, b.a(getContext(), 80.0f));
        ofFloat5.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) b.a(getContext(), 80.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f9913d.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideRightView.this.f9913d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9912c, "translationX", 0.0f, b.a(getContext(), 80.0f));
        ofFloat6.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f9918i.setDuration(1500L);
        this.f9918i.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f9911b, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f9913d, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f9912c, "alpha", 1.0f, 0.0f);
        this.f9916g.setDuration(50L);
        this.f9916g.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.f9915f.playSequentially(this.f9917h, this.f9918i, this.f9916g);
    }

    public void a() {
        c();
        this.f9915f.start();
        this.f9915f.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideRightView.this.f9915f.start();
                    }
                }, 200L);
            }
        });
    }
}
