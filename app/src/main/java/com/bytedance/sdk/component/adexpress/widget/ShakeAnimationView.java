package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.v;

/* loaded from: classes.dex */
public class ShakeAnimationView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f9898a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9899b;

    /* renamed from: c  reason: collision with root package name */
    private v f9900c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f9901d;

    /* renamed from: e  reason: collision with root package name */
    private a f9902e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f9903f;

    /* renamed from: g  reason: collision with root package name */
    private int f9904g;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.f9899b != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new b(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.f9899b.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                ShakeAnimationView.this.f9899b.startAnimation(rotateAnimation);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    private static class b implements Interpolator {
        private b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public ShakeAnimationView(Context context, int i10, int i11) {
        super(context);
        this.f9904g = i11;
        a(context, i10);
    }

    public LinearLayout getShakeLayout() {
        return this.f9903f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f9900c == null) {
                this.f9900c = new v(getContext().getApplicationContext());
            }
            this.f9900c.a(new v.a() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
                @Override // com.bytedance.sdk.component.utils.v.a
                public void a(int i10) {
                    if (i10 == 1 && ShakeAnimationView.this.isShown() && ShakeAnimationView.this.f9902e != null) {
                        ShakeAnimationView.this.f9902e.a();
                    }
                }
            });
            this.f9900c.a(this.f9904g);
            this.f9900c.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f9900c;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        v vVar = this.f9900c;
        if (vVar != null) {
            if (z10) {
                vVar.a();
            } else {
                vVar.b();
            }
        }
    }

    public void setOnShakeViewListener(a aVar) {
        this.f9902e = aVar;
    }

    public void setShakeText(String str) {
        this.f9901d.setText(str);
    }

    private void a(Context context, int i10) {
        LinearLayout.inflate(context, i10, this);
        this.f9903f = (LinearLayout) findViewById(t.e(context, "tt_hand_container"));
        this.f9899b = (ImageView) findViewById(t.e(context, "tt_splash_rock_img"));
        this.f9898a = (TextView) findViewById(t.e(context, "tt_splash_rock_top_text"));
        this.f9901d = (TextView) findViewById(t.e(context, "tt_splash_rock_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f9903f.setBackground(gradientDrawable);
    }

    public void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
