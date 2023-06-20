package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* loaded from: classes3.dex */
public final class ac extends com.ironsource.mediationsdk.sdk.b {

    /* renamed from: c  reason: collision with root package name */
    private static final ac f26759c = new ac();

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoListener f26760a = null;

    /* renamed from: b  reason: collision with root package name */
    public LevelPlayRewardedVideoBaseListener f26761b;

    private ac() {
    }

    public static ac a() {
        return f26759c;
    }

    static /* synthetic */ void a(ac acVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.14
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdOpened();
                        ac.a(ac.this, "onRewardedVideoAdOpened()");
                    }
                }
            });
        }
        if (this.f26761b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.15
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26761b != null) {
                        ac.this.f26761b.onAdOpened(ac.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdOpened() adInfo = " + ac.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.f26760a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.12
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ((RewardedVideoManualListener) ac.this.f26760a).onRewardedVideoAdLoadFailed(ironSourceError);
                        ac acVar = ac.this;
                        ac.a(acVar, "onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f26761b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.13
            @Override // java.lang.Runnable
            public final void run() {
                if (ac.this.f26761b != null) {
                    ((LevelPlayRewardedVideoManualListener) ac.this.f26761b).onAdLoadFailed(ironSourceError);
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                }
            }
        });
    }

    public final void a(final IronSourceError ironSourceError, final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.7
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdShowFailed(ironSourceError);
                        ac acVar = ac.this;
                        ac.a(acVar, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
        if (this.f26761b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26761b != null) {
                        ac.this.f26761b.onAdShowFailed(ironSourceError, ac.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdShowFailed() adInfo = " + ac.this.f(adInfo) + ", error = " + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final void a(final Placement placement, final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdRewarded(placement);
                        ac acVar = ac.this;
                        ac.a(acVar, "onRewardedVideoAdRewarded(" + placement + ")");
                    }
                }
            });
        }
        if (this.f26761b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26761b != null) {
                        ac.this.f26761b.onAdRewarded(placement, ac.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdRewarded() placement = " + placement + ", adInfo = " + ac.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void a(final boolean z10, final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.18
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAvailabilityChanged(z10);
                        ac acVar = ac.this;
                        ac.a(acVar, "onRewardedVideoAvailabilityChanged() available=" + z10);
                    }
                }
            });
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f26761b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ac.this.f26761b != null) {
                    if (!z10) {
                        ((LevelPlayRewardedVideoListener) ac.this.f26761b).onAdUnavailable();
                        IronLog.CALLBACK.info("onAdUnavailable()");
                        return;
                    }
                    ((LevelPlayRewardedVideoListener) ac.this.f26761b).onAdAvailable(ac.this.f(adInfo));
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onAdAvailable() adInfo = " + ac.this.f(adInfo));
                }
            }
        });
    }

    public final void b() {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdStarted();
                        ac.a(ac.this, "onRewardedVideoAdStarted()");
                    }
                }
            });
        }
    }

    public final void b(final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.16
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdClosed();
                        ac.a(ac.this, "onRewardedVideoAdClosed()");
                    }
                }
            });
        }
        if (this.f26761b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.17
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26761b != null) {
                        ac.this.f26761b.onAdClosed(ac.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClosed() adInfo = " + ac.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void b(final Placement placement, final AdInfo adInfo) {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdClicked(placement);
                        ac acVar = ac.this;
                        ac.a(acVar, "onRewardedVideoAdClicked(" + placement + ")");
                    }
                }
            });
        }
        if (this.f26761b != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26761b != null) {
                        ac.this.f26761b.onAdClicked(placement, ac.this.f(adInfo));
                        IronLog ironLog = IronLog.CALLBACK;
                        ironLog.info("onAdClicked() placement = " + placement + ", adInfo = " + ac.this.f(adInfo));
                    }
                }
            });
        }
    }

    public final void c() {
        if (this.f26760a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (ac.this.f26760a != null) {
                        ac.this.f26760a.onRewardedVideoAdEnded();
                        ac.a(ac.this, "onRewardedVideoAdEnded()");
                    }
                }
            });
        }
    }
}
