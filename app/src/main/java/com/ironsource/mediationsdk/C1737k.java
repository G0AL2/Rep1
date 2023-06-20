package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1737k extends com.ironsource.mediationsdk.sdk.b {

    /* renamed from: c  reason: collision with root package name */
    private static final C1737k f27118c = new C1737k();

    /* renamed from: a  reason: collision with root package name */
    BannerListener f27119a = null;

    /* renamed from: b  reason: collision with root package name */
    LevelPlayBannerListener f27120b = null;

    private C1737k() {
    }

    public static C1737k a() {
        return f27118c;
    }

    public final void a(final AdInfo adInfo) {
        if (this.f27119a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdScreenPresented();
                        IronLog.CALLBACK.info("onBannerAdScreenPresented()");
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdScreenPresented(C1737k.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenPresented() adInfo = " + C1737k.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final AdInfo adInfo, boolean z10) {
        if (this.f27119a != null && !z10) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdLoaded();
                        IronLog.CALLBACK.info("onBannerAdLoaded()");
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdLoaded(C1737k.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoaded() adInfo = " + C1737k.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError, boolean z10) {
        if (this.f27119a != null && !z10) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.7
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void b(final AdInfo adInfo) {
        if (this.f27119a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdScreenDismissed();
                        IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdScreenDismissed(C1737k.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdScreenDismissed() adInfo = " + C1737k.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c(final AdInfo adInfo) {
        if (this.f27119a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.12
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdLeftApplication();
                        IronLog.CALLBACK.info("onBannerAdLeftApplication()");
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdLeftApplication(C1737k.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLeftApplication() adInfo = " + C1737k.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void d(final AdInfo adInfo) {
        if (this.f27119a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27119a != null) {
                        C1737k.this.f27119a.onBannerAdClicked();
                        IronLog.CALLBACK.info("onBannerAdClicked()");
                    }
                }
            });
        }
        if (this.f27120b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.k.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1737k.this.f27120b != null) {
                        C1737k.this.f27120b.onAdClicked(C1737k.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + C1737k.this.f(adInfo));
                    }
                }
            });
        }
    }
}
