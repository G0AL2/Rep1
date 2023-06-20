package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C1751y;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1748v extends C1751y implements InterstitialSmashListener {

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.sdk.d f27538i;

    /* renamed from: j  reason: collision with root package name */
    private long f27539j;

    public C1748v(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.d dVar, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f27538i = dVar;
        this.f27550d = i10;
        this.f27547a.initInterstitial(str, str2, this.f27549c, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f27548b.f27214a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f27548b.f27214a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showInterstitial state=" + g());
        if (a(C1751y.a.LOADED, C1751y.a.SHOW_IN_PROGRESS)) {
            this.f27547a.showInterstitial(this.f27549c, this);
            return;
        }
        this.f27538i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadInterstitial state=" + g());
        C1751y.a aVar = C1751y.a.NOT_LOADED;
        C1751y.a aVar2 = C1751y.a.LOADED;
        C1751y.a aVar3 = C1751y.a.LOAD_IN_PROGRESS;
        C1751y.a a10 = a(new C1751y.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            if (a10 == aVar3) {
                this.f27538i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.f27538i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.f27539j = new Date().getTime();
        d("start timer");
        a(new TimerTask() { // from class: com.ironsource.mediationsdk.v.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1748v c1748v = C1748v.this;
                c1748v.d("load timed out state=" + C1748v.this.g());
                if (C1748v.this.a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.NOT_LOADED)) {
                    C1748v.this.f27538i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C1748v.this, new Date().getTime() - C1748v.this.f27539j);
                }
            }
        });
        if (!i()) {
            this.f27547a.loadInterstitial(this.f27549c, this);
            return;
        }
        this.f27551e = str2;
        this.f27552f = jSONObject;
        this.f27553g = list;
        this.f27547a.loadInterstitialForBidding(this.f27549c, this, str);
    }

    public final boolean b() {
        return this.f27547a.isInterstitialReady(this.f27549c);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.f27538i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        a(C1751y.a.NOT_LOADED);
        c("onInterstitialAdClosed");
        this.f27538i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + g());
        h();
        if (a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.NOT_LOADED)) {
            this.f27538i.a(ironSourceError, this, new Date().getTime() - this.f27539j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.f27538i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + g());
        h();
        if (a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.LOADED)) {
            this.f27538i.a(this, new Date().getTime() - this.f27539j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        a(C1751y.a.NOT_LOADED);
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f27538i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.f27538i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
    }
}
