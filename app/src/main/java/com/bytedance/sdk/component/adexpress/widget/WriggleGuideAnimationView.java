package com.bytedance.sdk.component.adexpress.widget;

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
public class WriggleGuideAnimationView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f9952a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9953b;

    /* renamed from: c  reason: collision with root package name */
    private v f9954c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f9955d;

    /* renamed from: e  reason: collision with root package name */
    private a f9956e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f9957f;

    /* renamed from: g  reason: collision with root package name */
    private WriggleGuideView f9958g;

    /* renamed from: h  reason: collision with root package name */
    private int f9959h;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WriggleGuideAnimationView.this.f9953b != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -35.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new b(null));
                rotateAnimation.setDuration(1500L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        WriggleGuideAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WriggleGuideAnimationView.this.f9953b.startAnimation(rotateAnimation);
                            }
                        }, 300L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                WriggleGuideAnimationView.this.f9953b.startAnimation(rotateAnimation);
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
            return f10 <= 0.4f ? f10 * 2.5f : f10 <= 0.8f ? (f10 * (-2.2f)) + 1.86f : (f10 * (-0.7f)) + 0.7f;
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public WriggleGuideAnimationView(Context context, int i10, int i11) {
        super(context);
        this.f9959h = i11;
        a(context, i10);
    }

    public TextView getTopTextView() {
        return this.f9952a;
    }

    public LinearLayout getWriggleLayout() {
        return this.f9957f;
    }

    public WriggleGuideView getWriggleProgressIv() {
        return this.f9958g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f9954c == null) {
                this.f9954c = new v(getContext().getApplicationContext());
            }
            this.f9954c.a(new v.a() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.2
                @Override // com.bytedance.sdk.component.utils.v.a
                public void a(int i10) {
                    if (i10 == 2 && WriggleGuideAnimationView.this.isShown() && WriggleGuideAnimationView.this.f9956e != null) {
                        WriggleGuideAnimationView.this.f9956e.a();
                    }
                }
            });
            this.f9954c.b(this.f9959h);
            this.f9954c.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f9954c;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        v vVar = this.f9954c;
        if (vVar != null) {
            if (z10) {
                vVar.a();
            } else {
                vVar.b();
            }
        }
    }

    public void setOnShakeViewListener(a aVar) {
        this.f9956e = aVar;
    }

    public void setShakeText(String str) {
        this.f9955d.setText(str);
    }

    private void a(Context context, int i10) {
        LinearLayout.inflate(context, i10, this);
        this.f9957f = (LinearLayout) findViewById(t.e(context, "tt_interact_splash_wriggle_layout"));
        this.f9953b = (ImageView) findViewById(t.e(context, "tt_interact_splash_top_img"));
        this.f9958g = (WriggleGuideView) findViewById(t.e(context, "tt_interact_splash_progress_img"));
        this.f9952a = (TextView) findViewById(t.e(context, "tt_interact_splash_top_text"));
        this.f9955d = (TextView) findViewById(t.e(context, "tt_interact_splash_click_bar_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f9957f.setBackground(gradientDrawable);
    }

    public void a() {
        postDelayed(new AnonymousClass1(), 500L);
    }
}
