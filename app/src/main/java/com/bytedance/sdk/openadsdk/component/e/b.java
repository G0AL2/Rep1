package com.bytedance.sdk.openadsdk.component.e;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTAppOpenAdTopManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static String f11391g = "Skip";

    /* renamed from: a  reason: collision with root package name */
    private TextView f11392a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f11393b;

    /* renamed from: c  reason: collision with root package name */
    private a f11394c;

    /* renamed from: d  reason: collision with root package name */
    private int f11395d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f11396e = 5.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f11397f = 0;

    /* renamed from: h  reason: collision with root package name */
    private ValueAnimator f11398h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11399i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11400j;

    public b() {
        f11391g = t.a(m.a(), "tt_txt_skip");
    }

    private void g() {
        this.f11392a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.e.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.f11394c != null) {
                    b.this.f11394c.b(view);
                }
            }
        });
        this.f11393b.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.e.b.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.f11394c == null || !b.this.f11399i) {
                    return;
                }
                b.this.f11394c.a(view);
            }
        });
    }

    public void c() {
        TextView textView = this.f11393b;
        if (textView != null) {
            textView.performClick();
        }
    }

    public int d() {
        return this.f11395d;
    }

    public float e() {
        return this.f11396e;
    }

    public int f() {
        return this.f11397f;
    }

    public void a(Activity activity) {
        this.f11392a = (TextView) activity.findViewById(t.e(activity, "tt_top_dislike"));
        this.f11393b = (TextView) activity.findViewById(t.e(activity, "tt_top_skip"));
        this.f11392a.setText(t.a(m.a(), "tt_reward_feedback"));
        g();
    }

    public void b(int i10) {
        this.f11397f = i10;
    }

    public ValueAnimator b() {
        return this.f11398h;
    }

    public void a() {
        int i10 = (int) (this.f11396e * 1000.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i10);
        this.f11398h = ofInt;
        ofInt.setDuration(i10);
        this.f11398h.setInterpolator(new LinearInterpolator());
        this.f11398h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.e.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    public void a(int i10) {
        this.f11395d = i10;
        float f10 = (i10 * 1.0f) / 1000.0f;
        int ceil = (int) Math.ceil(this.f11396e - f10);
        if (ceil <= 0) {
            ceil = 0;
            a aVar = this.f11394c;
            if (aVar != null && !this.f11400j) {
                aVar.a();
                this.f11400j = true;
            }
        }
        String valueOf = String.valueOf(ceil);
        if (f10 >= this.f11397f) {
            valueOf = ((Object) valueOf) + " | " + f11391g;
            this.f11399i = true;
        }
        this.f11393b.setText(valueOf);
    }

    public void a(float f10) {
        this.f11396e = f10;
        if (f10 <= 0.0f) {
            this.f11396e = 5.0f;
        }
        a();
    }

    public void a(a aVar) {
        this.f11394c = aVar;
    }
}
