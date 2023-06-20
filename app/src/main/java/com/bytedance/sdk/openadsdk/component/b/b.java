package com.bytedance.sdk.openadsdk.component.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import java.lang.ref.WeakReference;
import m3.c;

/* compiled from: TTFeedAdImpl.java */
/* loaded from: classes.dex */
class b extends com.bytedance.sdk.openadsdk.core.f.a implements c.InterfaceC0450c, c.d, TTFeedAd, a.InterfaceC0184a {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.multipro.b.a f11354a;

    /* renamed from: b  reason: collision with root package name */
    boolean f11355b;

    /* renamed from: c  reason: collision with root package name */
    boolean f11356c;

    /* renamed from: d  reason: collision with root package name */
    int f11357d;

    /* renamed from: e  reason: collision with root package name */
    AdSlot f11358e;

    /* renamed from: f  reason: collision with root package name */
    int f11359f;

    /* renamed from: m  reason: collision with root package name */
    private TTFeedAd.VideoAdListener f11360m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<NativeVideoTsView> f11361n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, n nVar, int i10, AdSlot adSlot) {
        super(context, nVar, i10);
        this.f11355b = false;
        this.f11356c = true;
        this.f11359f = i10;
        this.f11358e = adSlot;
        this.f11354a = new com.bytedance.sdk.openadsdk.multipro.b.a();
        int f10 = u.f(this.f12242h);
        this.f11357d = f10;
        a(f10);
        a("embeded_ad");
    }

    @Override // m3.c.InterfaceC0450c
    public void a_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdStartPlay(this);
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void b_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdPaused(this);
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void c_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdContinuePlay(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public double currentPlayTime() {
        try {
            WeakReference<NativeVideoTsView> weakReference = this.f11361n;
            if (weakReference == null || weakReference.get() == null || !this.f11355b) {
                return 0.0d;
            }
            return this.f11361n.get().getCurrentPlayTime();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void d_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdComplete(this);
        }
    }

    @Override // m3.c.d
    public void e_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoLoad(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.b.a.InterfaceC0184a
    public com.bytedance.sdk.openadsdk.multipro.b.a f() {
        return this.f11354a;
    }

    @Override // com.bytedance.sdk.openadsdk.core.f.a, com.bytedance.sdk.openadsdk.TTNativeAd
    public View getAdView() {
        NativeVideoTsView nativeVideoTsView;
        n nVar = this.f12242h;
        if (nVar != null && this.f12243i != null) {
            if (n.c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f12243i, this.f12242h, this.f12241g.a());
                    this.f11361n = new WeakReference<>(nativeVideoTsView);
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.a() { // from class: com.bytedance.sdk.openadsdk.component.b.b.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.a
                        public void a(View view, int i10) {
                            if (((com.bytedance.sdk.openadsdk.core.f.a) b.this).f12241g != null) {
                                ((com.bytedance.sdk.openadsdk.core.f.a) b.this).f12241g.a(view, i10);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.b() { // from class: com.bytedance.sdk.openadsdk.component.b.b.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.b
                        public void a(boolean z10, long j10, long j11, long j12, boolean z11) {
                            com.bytedance.sdk.openadsdk.multipro.b.a aVar = b.this.f11354a;
                            aVar.f13513a = z10;
                            aVar.f13517e = j10;
                            aVar.f13518f = j11;
                            aVar.f13519g = j12;
                            aVar.f13516d = z11;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.f11359f) {
                        nativeVideoTsView.setIsAutoPlay(this.f11355b ? this.f11358e.isAutoPlay() : this.f11356c);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.f11356c);
                    }
                    nativeVideoTsView.setIsQuiet(m.h().a(this.f11357d));
                } catch (Exception unused) {
                }
                if (!n.c(this.f12242h) && nativeVideoTsView != null && nativeVideoTsView.a(0L, true, false)) {
                    return nativeVideoTsView;
                }
            }
            nativeVideoTsView = null;
            if (!n.c(this.f12242h)) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public double getVideoDuration() {
        n nVar = this.f12242h;
        if (nVar == null || nVar.J() == null) {
            return 0.0d;
        }
        return this.f12242h.J().r();
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public void pause() {
        try {
            WeakReference<NativeVideoTsView> weakReference = this.f11361n;
            if (weakReference == null || weakReference.get() == null || !this.f11355b) {
                return;
            }
            this.f11361n.get().k();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public void play() {
        try {
            WeakReference<NativeVideoTsView> weakReference = this.f11361n;
            if (weakReference == null || weakReference.get() == null || !this.f11355b) {
                return;
            }
            this.f11361n.get().m();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        this.f11360m = videoAdListener;
    }

    private void a(int i10) {
        int c10 = m.h().c(i10);
        if (3 == c10) {
            this.f11355b = false;
            this.f11356c = false;
        } else if (4 == c10) {
            this.f11355b = true;
        } else {
            int c11 = o.c(m.a());
            if (1 == c10 && u.e(c11)) {
                this.f11355b = false;
                this.f11356c = true;
            } else if (2 == c10) {
                if (u.f(c11) || u.e(c11) || u.g(c11)) {
                    this.f11355b = false;
                    this.f11356c = true;
                }
            } else if (5 == c10) {
                if (u.e(c11) || u.g(c11)) {
                    this.f11356c = true;
                }
            }
        }
    }

    @Override // m3.c.d
    public void a(int i10, int i11) {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onVideoError(i10, i11);
        }
    }

    @Override // m3.c.InterfaceC0450c
    public void a(long j10, long j11) {
        TTFeedAd.VideoAdListener videoAdListener = this.f11360m;
        if (videoAdListener != null) {
            videoAdListener.onProgressUpdate(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.f.a
    protected void a(String str) {
        super.a(str);
    }
}
