package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundFrameLayout;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import m3.c;

/* loaded from: classes.dex */
public class NativeExpressVideoView extends NativeExpressView implements c.InterfaceC0450c, c.d {

    /* renamed from: a  reason: collision with root package name */
    int f12545a;

    /* renamed from: b  reason: collision with root package name */
    boolean f12546b;

    /* renamed from: c  reason: collision with root package name */
    boolean f12547c;

    /* renamed from: d  reason: collision with root package name */
    int f12548d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12549e;

    /* renamed from: u  reason: collision with root package name */
    private ExpressVideoView f12550u;

    /* renamed from: v  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.multipro.b.a f12551v;

    /* renamed from: w  reason: collision with root package name */
    private long f12552w;

    /* renamed from: x  reason: collision with root package name */
    private long f12553x;

    public NativeExpressVideoView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, String str) {
        super(context, nVar, adSlot, str, false);
        this.f12545a = 1;
        this.f12546b = false;
        this.f12547c = true;
        this.f12549e = true;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.bytedance.sdk.component.adexpress.b.m mVar) {
        if (mVar == null) {
            return;
        }
        double d10 = mVar.d();
        double e10 = mVar.e();
        double f10 = mVar.f();
        double g10 = mVar.g();
        int b10 = (int) v.b(this.f12563f, (float) d10);
        int b11 = (int) v.b(this.f12563f, (float) e10);
        int b12 = (int) v.b(this.f12563f, (float) f10);
        int b13 = (int) v.b(this.f12563f, (float) g10);
        float b14 = v.b(this.f12563f, mVar.i());
        float b15 = v.b(this.f12563f, mVar.j());
        float b16 = v.b(this.f12563f, mVar.k());
        float b17 = v.b(this.f12563f, mVar.l());
        com.bytedance.sdk.component.utils.l.b("ExpressView", "videoWidth:" + f10);
        com.bytedance.sdk.component.utils.l.b("ExpressView", "videoHeight:" + g10);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12568k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(b12, b13);
        }
        layoutParams.width = b12;
        layoutParams.height = b13;
        layoutParams.topMargin = b11;
        layoutParams.leftMargin = b10;
        this.f12568k.setLayoutParams(layoutParams);
        this.f12568k.removeAllViews();
        ExpressVideoView expressVideoView = this.f12550u;
        if (expressVideoView != null) {
            this.f12568k.addView(expressVideoView);
            ((RoundFrameLayout) this.f12568k).a(b14, b15, b16, b17);
            this.f12550u.a(0L, true, false);
            c(this.f12548d);
            if (!com.bytedance.sdk.component.utils.o.d(this.f12563f) && !this.f12547c && this.f12549e) {
                this.f12550u.e();
            }
            setShowAdInteractionView(false);
        }
    }

    private void o() {
        try {
            this.f12551v = new com.bytedance.sdk.openadsdk.multipro.b.a();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.f12563f, this.f12566i, this.f12564g, this.f12574r);
            this.f12550u = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.f12550u.setControllerStatusCallBack(new NativeVideoTsView.b() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.1
                @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.b
                public void a(boolean z10, long j10, long j11, long j12, boolean z11) {
                    NativeExpressVideoView.this.f12551v.f13513a = z10;
                    NativeExpressVideoView.this.f12551v.f13517e = j10;
                    NativeExpressVideoView.this.f12551v.f13518f = j11;
                    NativeExpressVideoView.this.f12551v.f13519g = j12;
                    NativeExpressVideoView.this.f12551v.f13516d = z11;
                }
            });
            this.f12550u.setVideoAdLoadListener(this);
            this.f12550u.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f12564g)) {
                this.f12550u.setIsAutoPlay(this.f12546b ? this.f12565h.isAutoPlay() : this.f12547c);
            } else if ("open_ad".equals(this.f12564g)) {
                this.f12550u.setIsAutoPlay(true);
            } else {
                this.f12550u.setIsAutoPlay(this.f12547c);
            }
            if ("open_ad".equals(this.f12564g)) {
                this.f12550u.setIsQuiet(true);
            } else {
                this.f12550u.setIsQuiet(com.bytedance.sdk.openadsdk.core.m.h().a(this.f12548d));
            }
            this.f12550u.d();
        } catch (Exception unused) {
            this.f12550u = null;
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        ExpressVideoView expressVideoView = this.f12550u;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z10);
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void a_() {
        this.f12549e = false;
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoAdStartPlay");
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoAdStartPlay();
        }
        this.f12545a = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void b() {
    }

    @Override // m3.c.InterfaceC0450c
    public void b_() {
        this.f12549e = false;
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoAdPaused");
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoAdPaused();
        }
        this.f12569l = true;
        this.f12545a = 3;
    }

    void c(int i10) {
        int c10 = com.bytedance.sdk.openadsdk.core.m.h().c(i10);
        if (3 == c10) {
            this.f12546b = false;
            this.f12547c = false;
        } else if (4 == c10) {
            this.f12546b = true;
        } else {
            int c11 = com.bytedance.sdk.component.utils.o.c(com.bytedance.sdk.openadsdk.core.m.a());
            if (1 == c10) {
                this.f12546b = false;
                this.f12547c = u.e(c11);
            } else if (2 == c10) {
                if (u.f(c11) || u.e(c11) || u.g(c11)) {
                    this.f12546b = false;
                    this.f12547c = true;
                }
            } else if (5 == c10 && (u.e(c11) || u.g(c11))) {
                this.f12546b = false;
                this.f12547c = true;
            }
        }
        if (!this.f12547c) {
            this.f12545a = 3;
        }
        com.bytedance.sdk.component.utils.l.c("NativeVideoAdView", "mIsAutoPlay=" + this.f12547c + ",status=" + c10);
    }

    @Override // m3.c.InterfaceC0450c
    public void c_() {
        this.f12549e = false;
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoAdContinuePlay");
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoAdContinuePlay();
        }
        this.f12569l = false;
        this.f12545a = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public int d() {
        ExpressVideoView expressVideoView;
        if (this.f12545a == 3 && (expressVideoView = this.f12550u) != null) {
            expressVideoView.d();
        }
        ExpressVideoView expressVideoView2 = this.f12550u;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().r()) {
            return this.f12545a;
        }
        return 1;
    }

    @Override // m3.c.InterfaceC0450c
    public void d_() {
        this.f12549e = false;
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoComplete");
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoAdComplete();
        }
        this.f12545a = 5;
        com.bytedance.sdk.component.adexpress.b.b bVar = this.f12575s;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        this.f12575s.d().f();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void e() {
    }

    @Override // m3.c.d
    public void e_() {
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoLoad");
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoLoad();
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.b.a getVideoModel() {
        return this.f12551v;
    }

    protected void h() {
        this.f12568k = new RoundFrameLayout(this.f12563f);
        int f10 = u.f(this.f12566i);
        this.f12548d = f10;
        c(f10);
        o();
        addView(this.f12568k, new FrameLayout.LayoutParams(-1, -1));
        super.g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        ExpressVideoView expressVideoView = this.f12550u;
        if (expressVideoView != null) {
            expressVideoView.setCanInterruptVideoPlay(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.b.n
    public void a(com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar, com.bytedance.sdk.component.adexpress.b.m mVar) {
        this.f12576t = dVar;
        if ((dVar instanceof o) && ((o) dVar).p() != null) {
            ((o) this.f12576t).p().a((j) this);
        }
        if (mVar != null && mVar.a()) {
            a(mVar);
        }
        super.a(dVar, mVar);
    }

    private void a(final com.bytedance.sdk.component.adexpress.b.m mVar) {
        if (mVar == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(mVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressVideoView.this.b(mVar);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a(boolean z10) {
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onMuteVideo,mute:" + z10);
        ExpressVideoView expressVideoView = this.f12550u;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z10);
            setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a() {
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onSkipVideo");
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public long c() {
        return this.f12552w;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a(int i10) {
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onChangeVideoState,stateType:" + i10);
        ExpressVideoView expressVideoView = this.f12550u;
        if (expressVideoView == null) {
            com.bytedance.sdk.component.utils.l.e("NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i10 == 1) {
            expressVideoView.a(0L, true, false);
        } else if (i10 == 2 || i10 == 3) {
            expressVideoView.setCanInterruptVideoPlay(true);
            this.f12550u.performClick();
        } else if (i10 == 4) {
            expressVideoView.getNativeVideoController().f();
        } else if (i10 != 5) {
        } else {
            expressVideoView.a(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.b.g
    public void a(View view, int i10, com.bytedance.sdk.component.adexpress.b bVar) {
        if (i10 == -1 || bVar == null) {
            return;
        }
        if (i10 != 4) {
            if (i10 != 11) {
                super.a(view, i10, bVar);
                return;
            }
        } else if (this.f12564g == "draw_ad") {
            ExpressVideoView expressVideoView = this.f12550u;
            if (expressVideoView != null) {
                expressVideoView.performClick();
                return;
            }
            return;
        }
        try {
            ExpressVideoView expressVideoView2 = this.f12550u;
            if (expressVideoView2 != null) {
                expressVideoView2.setCanInterruptVideoPlay(true);
                this.f12550u.performClick();
                if (this.f12569l) {
                    ExpressVideoView expressVideoView3 = this.f12550u;
                    expressVideoView3.findViewById(t.e(expressVideoView3.getContext(), "tt_video_play")).setVisibility(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void a(long j10, long j11) {
        this.f12549e = false;
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onProgressUpdate(j10, j11);
        }
        int i10 = this.f12545a;
        if (i10 != 5 && i10 != 3 && j10 > this.f12552w) {
            this.f12545a = 2;
        }
        this.f12552w = j10;
        this.f12553x = j11;
        com.bytedance.sdk.component.adexpress.b.b bVar = this.f12575s;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        this.f12575s.d().setTimeUpdate(((int) (j11 - j10)) / 1000);
    }

    @Override // m3.c.d
    public void a(int i10, int i11) {
        com.bytedance.sdk.component.utils.l.b("NativeExpressVideoView", "onVideoError,errorCode:" + i10 + ",extraCode:" + i11);
        TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener = this.f12567j;
        if (expressVideoAdListener != null) {
            expressVideoAdListener.onVideoError(i10, i11);
        }
        this.f12552w = this.f12553x;
        this.f12545a = 4;
    }
}
