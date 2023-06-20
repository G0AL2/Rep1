package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class W extends aa implements InterstitialSmashListener {

    /* renamed from: a  reason: collision with root package name */
    a f26573a;

    /* renamed from: b  reason: collision with root package name */
    private V f26574b;

    /* renamed from: j  reason: collision with root package name */
    private Timer f26575j;

    /* renamed from: k  reason: collision with root package name */
    private int f26576k;

    /* renamed from: l  reason: collision with root package name */
    private String f26577l;

    /* renamed from: m  reason: collision with root package name */
    private String f26578m;

    /* renamed from: n  reason: collision with root package name */
    private long f26579n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f26580o;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public W(String str, String str2, NetworkSettings networkSettings, V v10, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f26580o = new Object();
        this.f26573a = a.NO_INIT;
        this.f26577l = str;
        this.f26578m = str2;
        this.f26574b = v10;
        this.f26575j = null;
        this.f26576k = i10;
        this.f26734c.addInterstitialListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        d("current state=" + this.f26573a + ", new state=" + aVar);
        this.f26573a = aVar;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + k() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 0);
    }

    private void e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 3);
    }

    private void q() {
        try {
            String str = J.a().f26340l;
            if (!TextUtils.isEmpty(str)) {
                this.f26734c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f26734c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e10) {
            d("setCustomParams() " + e10.getMessage());
        }
    }

    private void r() {
        synchronized (this.f26580o) {
            Timer timer = this.f26575j;
            if (timer != null) {
                timer.cancel();
                this.f26575j = null;
            }
        }
    }

    private void s() {
        synchronized (this.f26580o) {
            d("start timer");
            r();
            Timer timer = new Timer();
            this.f26575j = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.W.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    W w10 = W.this;
                    w10.d("timed out state=" + W.this.f26573a.name() + " isBidder=" + W.this.h());
                    if (W.this.f26573a == a.INIT_IN_PROGRESS && W.this.h()) {
                        W.this.a(a.NO_INIT);
                        return;
                    }
                    W.this.a(a.LOAD_FAILED);
                    W.this.f26574b.a(ErrorBuilder.buildLoadFailedError("timed out"), W.this, new Date().getTime() - W.this.f26579n);
                }
            }, this.f26576k * 1000);
        }
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.f26734c.getInterstitialBiddingData(this.f26737f);
            }
            return null;
        } catch (Throwable th) {
            e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        try {
            this.f26579n = new Date().getTime();
            d("loadInterstitial");
            this.f26736e = false;
            if (h()) {
                s();
                a(a.LOAD_IN_PROGRESS);
                this.f26734c.loadInterstitialForBidding(this.f26737f, this, str);
            } else if (this.f26573a != a.NO_INIT) {
                s();
                a(a.LOAD_IN_PROGRESS);
                this.f26734c.loadInterstitial(this.f26737f, this);
            } else {
                s();
                a(a.INIT_IN_PROGRESS);
                q();
                this.f26734c.initInterstitial(this.f26577l, this.f26578m, this.f26737f, this);
            }
        } catch (Throwable th) {
            e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        d("initForBidding()");
        a(a.INIT_IN_PROGRESS);
        q();
        try {
            this.f26734c.initInterstitialForBidding(this.f26577l, this.f26578m, this.f26737f, this);
        } catch (Throwable th) {
            e(k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void c() {
        try {
            this.f26734c.showInterstitial(this.f26737f, this);
        } catch (Throwable th) {
            e(k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void f() {
        this.f26734c.setMediationState(AbstractC1728b.a.CAPPED_PER_SESSION, "interstitial");
    }

    public final boolean g() {
        try {
            return this.f26734c.isInterstitialReady(this.f26737f);
        } catch (Throwable th) {
            e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.f26574b.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        c("onInterstitialAdClosed");
        this.f26574b.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f26573a.name());
        r();
        if (this.f26573a != a.LOAD_IN_PROGRESS) {
            return;
        }
        a(a.LOAD_FAILED);
        this.f26574b.a(ironSourceError, this, new Date().getTime() - this.f26579n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.f26574b.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + this.f26573a.name());
        r();
        if (this.f26573a != a.LOAD_IN_PROGRESS) {
            return;
        }
        a(a.LOADED);
        this.f26574b.a(this, new Date().getTime() - this.f26579n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f26574b.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        c("onInterstitialAdShowSucceeded");
        this.f26574b.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.f26574b.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f26573a.name());
        if (this.f26573a != a.INIT_IN_PROGRESS) {
            return;
        }
        r();
        a(a.NO_INIT);
        this.f26574b.b(ironSourceError, this);
        if (h()) {
            return;
        }
        this.f26574b.a(ironSourceError, this, new Date().getTime() - this.f26579n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        c("onInterstitialInitSuccess state=" + this.f26573a.name());
        if (this.f26573a != a.INIT_IN_PROGRESS) {
            return;
        }
        r();
        if (h()) {
            a(a.INIT_SUCCESS);
        } else {
            a(a.LOAD_IN_PROGRESS);
            s();
            try {
                this.f26734c.loadInterstitial(this.f26737f, this);
            } catch (Throwable th) {
                e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
            }
        }
        this.f26574b.f(this);
    }
}
