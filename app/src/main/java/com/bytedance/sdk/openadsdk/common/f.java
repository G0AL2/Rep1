package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTTitleNewStyleManager.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    TTAdDislikeDialog f11282a;

    /* renamed from: b  reason: collision with root package name */
    TTAdDislikeToast f11283b;

    /* renamed from: e  reason: collision with root package name */
    private final RelativeLayout f11286e;

    /* renamed from: f  reason: collision with root package name */
    private final n f11287f;

    /* renamed from: g  reason: collision with root package name */
    private Context f11288g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f11289h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f11290i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f11291j;

    /* renamed from: k  reason: collision with root package name */
    private ProgressBar f11292k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11294m;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f11284c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f11285d = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    private final int f11293l = v.e(m.a(), 44.0f);

    public f(Context context, RelativeLayout relativeLayout, n nVar) {
        this.f11288g = context;
        this.f11286e = relativeLayout;
        this.f11287f = nVar;
        e();
    }

    private void e() {
        this.f11289h = (ImageView) this.f11286e.findViewById(t.e(this.f11288g, "tt_title_bar_close"));
        this.f11290i = (TextView) this.f11286e.findViewById(t.e(this.f11288g, "tt_title_bar_title"));
        this.f11291j = (ImageView) this.f11286e.findViewById(t.e(this.f11288g, "tt_title_bar_feedback"));
        this.f11292k = (ProgressBar) this.f11286e.findViewById(t.e(this.f11288g, "tt_title_bar_browser_progress"));
        n nVar = this.f11287f;
        if (nVar != null) {
            this.f11290i.setText(TextUtils.isEmpty(nVar.U()) ? t.a(this.f11288g, "tt_web_title_default") : this.f11287f.U());
        }
        this.f11291j.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.f.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f.this.d();
            }
        });
    }

    private void f() {
        try {
            if (this.f11282a == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f11288g, this.f11287f);
                this.f11282a = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() { // from class: com.bytedance.sdk.openadsdk.common.f.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                    public void a(View view) {
                        f.this.f11284c.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                    public void b(View view) {
                        f.this.f11284c.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                    public void c(View view) {
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                    public void a(int i10, FilterWord filterWord) {
                        if (f.this.f11285d.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        f.this.f11285d.set(true);
                    }
                });
            }
            ((FrameLayout) this.f11286e.getRootView().findViewById(16908290)).addView(this.f11282a);
            if (this.f11283b == null) {
                this.f11283b = new TTAdDislikeToast(this.f11288g);
                ((FrameLayout) this.f11286e.getRootView().findViewById(16908290)).addView(this.f11283b);
            }
        } catch (Throwable unused) {
        }
    }

    private void g() {
        this.f11283b.a(com.bytedance.sdk.openadsdk.core.i.f.f12352d);
    }

    public void b() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11286e.getLayoutParams();
            if (this.f11294m || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.f11293l);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.f.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    f.this.f11286e.setLayoutParams(marginLayoutParams);
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.f.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    f.this.f11294m = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    f.this.f11294m = true;
                }
            });
            ofInt.start();
        } catch (Throwable unused) {
        }
    }

    public ImageView c() {
        return this.f11289h;
    }

    protected void d() {
        if (this.f11285d.get()) {
            g();
            return;
        }
        if (this.f11282a == null) {
            f();
        }
        this.f11282a.a();
    }

    public void a(WebView webView, int i10) {
        if (i10 == 100) {
            this.f11292k.setVisibility(8);
            return;
        }
        this.f11292k.setVisibility(0);
        this.f11292k.setProgress(i10);
    }

    public void a() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11286e.getLayoutParams();
            if (this.f11294m) {
                return;
            }
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.f11293l;
            if (i10 == (-i11)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-i11, 0);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.f.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        f.this.f11286e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.f.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        f.this.f11294m = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        f.this.f11294m = true;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
