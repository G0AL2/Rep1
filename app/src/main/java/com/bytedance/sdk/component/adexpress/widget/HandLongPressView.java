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
public class HandLongPressView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f9854a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9855b;

    /* renamed from: c  reason: collision with root package name */
    private CircleRippleView f9856c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f9857d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9858e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f9859f;

    public HandLongPressView(Context context) {
        super(context);
        this.f9858e = true;
        this.f9854a = context;
        this.f9857d = new AnimatorSet();
        c();
        d();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.f9855b.getLayoutParams();
                layoutParams.topMargin = ((int) ((HandLongPressView.this.f9856c.getMeasuredHeight() / 2.0f) - b.a(HandLongPressView.this.getContext(), 5.0f))) + ((int) b.a(HandLongPressView.this.f9854a, 20.0f));
                layoutParams.leftMargin = ((int) ((HandLongPressView.this.f9856c.getMeasuredWidth() / 2.0f) - b.a(HandLongPressView.this.getContext(), 5.0f))) + ((int) b.a(HandLongPressView.this.f9854a, 20.0f));
                layoutParams.bottomMargin = (int) (((-HandLongPressView.this.f9856c.getMeasuredHeight()) / 2.0f) + b.a(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-HandLongPressView.this.f9856c.getMeasuredWidth()) / 2.0f) + b.a(HandLongPressView.this.getContext(), 5.0f));
                HandLongPressView.this.f9855b.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f9859f.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f9859f.setTextColor(i10);
    }

    private void c() {
        this.f9856c = new CircleRippleView(this.f9854a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f9854a, 80.0f), (int) b.a(this.f9854a, 80.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) b.a(this.f9854a, 20.0f);
        layoutParams.leftMargin = (int) b.a(this.f9854a, 20.0f);
        addView(this.f9856c, layoutParams);
        this.f9856c.a();
        this.f9855b = new ImageView(this.f9854a);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f9854a, 80.0f), (int) b.a(this.f9854a, 80.0f));
        this.f9855b.setImageResource(t.d(this.f9854a, "tt_splash_hand"));
        addView(this.f9855b, layoutParams2);
        TextView textView = new TextView(this.f9854a);
        this.f9859f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) b.a(this.f9854a, 10.0f);
        addView(this.f9859f, layoutParams3);
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9855b, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.f9858e) {
                    HandLongPressView.this.f9856c.a();
                    HandLongPressView.this.f9856c.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.f9856c.b();
                    HandLongPressView.this.f9856c.setAlpha(0.0f);
                }
                HandLongPressView handLongPressView = HandLongPressView.this;
                handLongPressView.f9858e = !handLongPressView.f9858e;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(HandLongPressView.this.f9855b, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                HandLongPressView.this.f9855b.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9855b, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f9857d.playTogether(ofFloat, ofFloat2);
    }

    public void b() {
        AnimatorSet animatorSet = this.f9857d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.f9856c;
        if (circleRippleView != null) {
            circleRippleView.b();
        }
    }

    public void a() {
        this.f9857d.start();
    }
}
