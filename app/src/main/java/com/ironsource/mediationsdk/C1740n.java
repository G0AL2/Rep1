package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1740n implements BannerSmashListener {

    /* renamed from: a  reason: collision with root package name */
    public AbstractAdapter f27295a;

    /* renamed from: b  reason: collision with root package name */
    public NetworkSettings f27296b;

    /* renamed from: c  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.a f27297c;

    /* renamed from: d  reason: collision with root package name */
    boolean f27298d;

    /* renamed from: e  reason: collision with root package name */
    IronSourceBannerLayout f27299e;

    /* renamed from: f  reason: collision with root package name */
    public int f27300f;

    /* renamed from: g  reason: collision with root package name */
    private Timer f27301g;

    /* renamed from: h  reason: collision with root package name */
    private long f27302h;

    /* renamed from: i  reason: collision with root package name */
    private a f27303i = a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.n$a */
    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1740n(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j10, int i10) {
        this.f27300f = i10;
        this.f27297c = aVar;
        this.f27295a = abstractAdapter;
        this.f27296b = networkSettings;
        this.f27302h = j10;
        abstractAdapter.addBannerListener(this);
    }

    private void a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + a() + " | " + str2, 3);
    }

    private void c() {
        if (this.f27295a == null) {
            return;
        }
        try {
            String str = J.a().f26340l;
            if (!TextUtils.isEmpty(str)) {
                this.f27295a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f27295a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e10) {
            a(":setCustomParams():" + e10.toString());
        }
    }

    private void d() {
        try {
            Timer timer = this.f27301g;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a("stopLoadTimer", e10.getLocalizedMessage());
        } finally {
            this.f27301g = null;
        }
    }

    public final String a() {
        return this.f27296b.isMultipleInstances() ? this.f27296b.getProviderTypeForReflection() : this.f27296b.getProviderName();
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        a("loadBanner");
        this.f27298d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            a("loadBanner - bannerLayout is null or destroyed");
            this.f27297c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f27295a == null) {
            a("loadBanner - mAdapter is null");
            this.f27297c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.f27299e = ironSourceBannerLayout;
            b();
            if (this.f27303i != a.NO_INIT) {
                a(a.LOAD_IN_PROGRESS);
                this.f27295a.loadBanner(ironSourceBannerLayout, this.f27296b.getBannerSettings(), this);
                return;
            }
            a(a.INIT_IN_PROGRESS);
            c();
            this.f27295a.initBanners(str, str2, this.f27296b.getBannerSettings(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f27303i = aVar;
        a("state=" + aVar.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + a() + " " + str, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        try {
            d();
            Timer timer = new Timer();
            this.f27301g = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.n.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    com.ironsource.mediationsdk.sdk.a aVar;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C1740n.this.f27303i == a.INIT_IN_PROGRESS) {
                        C1740n.this.a(a.NO_INIT);
                        C1740n.this.a("init timed out");
                        aVar = C1740n.this.f27297c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
                    } else if (C1740n.this.f27303i != a.LOAD_IN_PROGRESS) {
                        if (C1740n.this.f27303i == a.LOADED) {
                            C1740n.this.a(a.LOAD_FAILED);
                            C1740n.this.a("reload timed out");
                            C1740n.this.f27297c.b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C1740n.this, false);
                            return;
                        }
                        return;
                    } else {
                        C1740n.this.a(a.LOAD_FAILED);
                        C1740n.this.a("load timed out");
                        aVar = C1740n.this.f27297c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
                    }
                    aVar.a(ironSourceError, C1740n.this, false);
                }
            }, this.f27302h);
        } catch (Exception e10) {
            a("startLoadTimer", e10.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f27297c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f27297c;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        a("onBannerAdLoadFailed()");
        d();
        boolean z10 = ironSourceError.getErrorCode() == 606;
        a aVar = this.f27303i;
        if (aVar == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.f27297c.a(ironSourceError, this, z10);
        } else if (aVar == a.LOADED) {
            this.f27297c.b(ironSourceError, this, z10);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        a("onBannerAdLoaded()");
        d();
        a aVar = this.f27303i;
        if (aVar == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.f27297c.a(this, view, layoutParams);
        } else if (aVar == a.LOADED) {
            this.f27297c.a(this, view, layoutParams, this.f27295a.shouldBindBannerViewOnReload());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f27297c;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f27297c;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f27297c;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        d();
        if (this.f27303i == a.INIT_IN_PROGRESS) {
            this.f27297c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            a(a.NO_INIT);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        d();
        if (this.f27303i == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f27299e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f27297c.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f27299e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            b();
            a(a.LOAD_IN_PROGRESS);
            this.f27295a.loadBanner(this.f27299e, this.f27296b.getBannerSettings(), this);
        }
    }
}
