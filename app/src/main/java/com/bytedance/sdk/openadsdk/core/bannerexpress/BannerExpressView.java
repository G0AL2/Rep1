package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class BannerExpressView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f11939a;

    /* renamed from: b  reason: collision with root package name */
    protected NativeExpressView f11940b;

    /* renamed from: c  reason: collision with root package name */
    protected NativeExpressView f11941c;

    /* renamed from: d  reason: collision with root package name */
    protected n f11942d;

    /* renamed from: e  reason: collision with root package name */
    protected AdSlot f11943e;

    /* renamed from: f  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressAdInteractionListener f11944f;

    /* renamed from: g  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressVideoAdListener f11945g;

    /* renamed from: h  reason: collision with root package name */
    protected int f11946h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f11947i;

    /* renamed from: j  reason: collision with root package name */
    protected String f11948j;

    public BannerExpressView(Context context, n nVar, AdSlot adSlot) {
        super(context);
        this.f11948j = "banner_ad";
        this.f11939a = context;
        this.f11942d = nVar;
        this.f11943e = adSlot;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        NativeExpressView nativeExpressView = this.f11940b;
        this.f11940b = this.f11941c;
        this.f11941c = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f11941c.l();
            this.f11941c = null;
        }
    }

    public void b() {
        NativeExpressView nativeExpressView = this.f11940b;
        if (nativeExpressView != null) {
            nativeExpressView.j();
        }
    }

    public void c() {
        if (this.f11940b != null) {
            h.d().f(this.f11940b.getClosedListenerKey());
            removeView(this.f11940b);
            this.f11940b.l();
            this.f11940b = null;
        }
        if (this.f11941c != null) {
            h.d().f(this.f11941c.getClosedListenerKey());
            removeView(this.f11941c);
            this.f11941c.l();
            this.f11941c = null;
        }
        h.d().w();
    }

    public void d() {
        NativeExpressView nativeExpressView = this.f11941c;
        if (nativeExpressView != null) {
            nativeExpressView.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        try {
            if (this.f11947i || this.f11941c == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(a(this.f11940b)).with(b(this.f11941c));
            animatorSet.setDuration(this.f11946h).start();
            v.a((View) this.f11941c, 0);
            this.f11947i = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean f() {
        return this.f11941c != null;
    }

    public NativeExpressView getCurView() {
        return this.f11940b;
    }

    public NativeExpressView getNextView() {
        return this.f11941c;
    }

    public void setDuration(int i10) {
        this.f11946h = i10;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f11944f = expressAdInteractionListener;
        NativeExpressView nativeExpressView = this.f11940b;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.2
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                public void onAdClicked(View view, int i10) {
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener2 = bannerExpressView.f11944f;
                    if (expressAdInteractionListener2 != null) {
                        expressAdInteractionListener2.onAdClicked(bannerExpressView, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                public void onRenderFail(View view, String str, int i10) {
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener2 = bannerExpressView.f11944f;
                    if (expressAdInteractionListener2 != null) {
                        expressAdInteractionListener2.onRenderFail(bannerExpressView, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    NativeExpressView nativeExpressView2 = BannerExpressView.this.f11940b;
                    if (nativeExpressView2 != null) {
                        nativeExpressView2.setSoundMute(true);
                    }
                    BannerExpressView.this.a(f10, f11);
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener2 = bannerExpressView.f11944f;
                    if (expressAdInteractionListener2 != null) {
                        expressAdInteractionListener2.onRenderSuccess(bannerExpressView, f10, f11);
                    }
                }
            });
        }
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f11945g = expressVideoAdListener;
    }

    protected void a() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f11939a, this.f11942d, this.f11943e, this.f11948j);
        this.f11940b = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
    }

    private ObjectAnimator b(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", getWidth(), 0.0f);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BannerExpressView bannerExpressView = BannerExpressView.this;
                bannerExpressView.f11947i = false;
                bannerExpressView.g();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    public void a(n nVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f11939a, nVar, adSlot, this.f11948j);
        this.f11941c = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.1
            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i10) {
                BannerExpressView bannerExpressView = BannerExpressView.this;
                TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = bannerExpressView.f11944f;
                if (expressAdInteractionListener != null) {
                    expressAdInteractionListener.onAdClicked(bannerExpressView, i10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f10, float f11) {
                BannerExpressView.this.a(f10, f11);
                NativeExpressView nativeExpressView2 = BannerExpressView.this.f11941c;
                if (nativeExpressView2 != null) {
                    nativeExpressView2.setSoundMute(true);
                }
                BannerExpressView.this.e();
            }
        });
        v.a((View) this.f11941c, 8);
        addView(this.f11941c, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(float f10, float f11) {
        int b10 = (int) v.b(this.f11939a, f10);
        int b11 = (int) v.b(this.f11939a, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(b10, b11);
        }
        layoutParams.width = b10;
        layoutParams.height = b11;
        setLayoutParams(layoutParams);
    }

    private ObjectAnimator a(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", 0.0f, -getWidth());
    }
}
