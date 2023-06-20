package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, x.a {

    /* renamed from: a  reason: collision with root package name */
    Animation.AnimationListener f9811a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f9812b;

    /* renamed from: c  reason: collision with root package name */
    private int f9813c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9814d;

    /* renamed from: e  reason: collision with root package name */
    private Context f9815e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f9816f;

    /* renamed from: g  reason: collision with root package name */
    private int f9817g;

    /* renamed from: h  reason: collision with root package name */
    private int f9818h;

    /* renamed from: i  reason: collision with root package name */
    private float f9819i;

    /* renamed from: j  reason: collision with root package name */
    private int f9820j;

    /* renamed from: k  reason: collision with root package name */
    private int f9821k;

    /* renamed from: l  reason: collision with root package name */
    private int f9822l;

    /* renamed from: m  reason: collision with root package name */
    private int f9823m;

    /* renamed from: n  reason: collision with root package name */
    private Handler f9824n;

    public AnimationText(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.f9812b = new ArrayList();
        this.f9813c = 0;
        this.f9814d = 1;
        this.f9824n = new x(Looper.getMainLooper(), this);
        this.f9811a = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.AnimationText.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AnimationText.this.f9816f != null) {
                    AnimationText.this.f9816f.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f9818h = i10;
        this.f9819i = f10;
        this.f9820j = i11;
        this.f9823m = i12;
        c();
    }

    private void c() {
        setFactory(this);
    }

    public void b() {
        List<String> list = this.f9812b;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.f9813c;
        this.f9813c = i10 + 1;
        this.f9821k = i10;
        setText(this.f9812b.get(i10));
        if (this.f9813c > this.f9812b.size() - 1) {
            this.f9813c = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f9816f = textView;
        textView.setTextColor(this.f9818h);
        this.f9816f.setTextSize(this.f9819i);
        this.f9816f.setMaxLines(this.f9820j);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f9816f.setTextAlignment(this.f9823m);
        }
        return this.f9816f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9824n.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(l.a(this.f9812b.get(this.f9821k), this.f9819i, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.f9817g = i10;
    }

    public void setAnimationText(List<String> list) {
        this.f9812b = list;
    }

    public void setAnimationType(int i10) {
        this.f9822l = i10;
    }

    public void setMaxLines(int i10) {
        this.f9820j = i10;
    }

    public void setTextColor(int i10) {
        this.f9818h = i10;
    }

    public void setTextSize(float f10) {
        this.f9819i = f10;
    }

    public void a() {
        int i10 = this.f9822l;
        if (i10 == 1) {
            setInAnimation(getContext(), t.l(this.f9815e, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), t.l(this.f9815e, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), t.l(this.f9815e, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), t.l(this.f9815e, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f9811a);
            getOutAnimation().setAnimationListener(this.f9811a);
        }
        this.f9824n.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what != 1) {
            return;
        }
        b();
        this.f9824n.sendEmptyMessageDelayed(1, this.f9817g);
    }
}
