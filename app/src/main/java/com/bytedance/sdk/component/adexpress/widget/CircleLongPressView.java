package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class CircleLongPressView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f9826a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9827b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f9828c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f9829d;

    /* renamed from: e  reason: collision with root package name */
    private RingProgressView f9830e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f9831f;

    public CircleLongPressView(Context context) {
        super(context);
        this.f9831f = new AnimatorSet();
        this.f9826a = context;
        e();
        f();
    }

    private void e() {
        FrameLayout frameLayout = new FrameLayout(this.f9826a);
        this.f9830e = new RingProgressView(this.f9826a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f9826a, 95.0f), (int) b.a(this.f9826a, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f9830e, layoutParams);
        ImageView imageView = new ImageView(this.f9826a);
        this.f9827b = imageView;
        imageView.setImageResource(t.d(this.f9826a, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f9826a, 75.0f), (int) b.a(this.f9826a, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f9827b, layoutParams2);
        ImageView imageView2 = new ImageView(this.f9826a);
        this.f9828c = imageView2;
        imageView2.setImageResource(t.d(this.f9826a, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) b.a(this.f9826a, 63.0f), (int) b.a(this.f9826a, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f9828c, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f9826a);
        this.f9829d = textView;
        textView.setTextColor(-1);
        this.f9829d.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f9829d, layoutParams4);
    }

    private void f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9828c, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9828c, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f9831f.setDuration(800L);
        this.f9831f.playTogether(ofFloat, ofFloat2);
    }

    public void a() {
        this.f9831f.start();
    }

    public void b() {
        this.f9831f.cancel();
    }

    public void c() {
        this.f9830e.a();
    }

    public void d() {
        this.f9830e.b();
        this.f9830e.c();
    }

    public void setGuideText(String str) {
        this.f9829d.setText(str);
    }
}
