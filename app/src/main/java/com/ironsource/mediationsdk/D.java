package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: classes3.dex */
public final class D extends com.ironsource.mediationsdk.sdk.b {

    /* renamed from: a  reason: collision with root package name */
    private static final D f26231a = new D();

    /* renamed from: b  reason: collision with root package name */
    private InterstitialListener f26232b = null;

    /* renamed from: c  reason: collision with root package name */
    private LevelPlayInterstitialListener f26233c;

    private D() {
    }

    public static synchronized D a() {
        D d10;
        synchronized (D.class) {
            d10 = f26231a;
        }
        return d10;
    }

    static /* synthetic */ void a(D d10, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdReady();
                        D.a(D.this, "onInterstitialAdReady()");
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.7
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdReady(D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdReady() adInfo = " + D.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdLoadFailed(ironSourceError);
                        D d10 = D.this;
                        D.a(d10, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdLoadFailed(ironSourceError);
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdShowFailed(ironSourceError);
                        D d10 = D.this;
                        D.a(d10, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdShowFailed(ironSourceError, D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + D.this.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.f26232b = interstitialListener;
    }

    public final synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f26233c = levelPlayInterstitialListener;
    }

    public final void b(final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdOpened();
                        D.a(D.this, "onInterstitialAdOpened()");
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdOpened(D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + D.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c(final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.12
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdClosed();
                        D.a(D.this, "onInterstitialAdClosed()");
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.13
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdClosed(D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + D.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void d(final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.14
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdShowSucceeded();
                        D.a(D.this, "onInterstitialAdShowSucceeded()");
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdShowSucceeded(D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowSucceeded() adInfo = " + D.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void e(final AdInfo adInfo) {
        if (this.f26232b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26232b != null) {
                        D.this.f26232b.onInterstitialAdClicked();
                        D.a(D.this, "onInterstitialAdClicked()");
                    }
                }
            });
        }
        if (this.f26233c != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.D.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (D.this.f26233c != null) {
                        D.this.f26233c.onAdClicked(D.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() adInfo = " + D.this.f(adInfo));
                    }
                }
            });
        }
    }
}
