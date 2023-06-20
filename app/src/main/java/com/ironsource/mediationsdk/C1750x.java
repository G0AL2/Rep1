package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C1751y;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1750x extends C1751y implements RewardedVideoSmashListener {

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.sdk.e f27544i;

    /* renamed from: j  reason: collision with root package name */
    private long f27545j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1750x(java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.model.NetworkSettings r6, com.ironsource.mediationsdk.sdk.e r7, int r8, com.ironsource.mediationsdk.AbstractAdapter r9) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getInterstitialSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r0.<init>(r6, r1, r2)
            r3.<init>(r0, r9)
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getRewardedVideoSettings()
            r0.<init>(r6, r1, r2)
            r3.f27548b = r0
            org.json.JSONObject r6 = r0.f27215b
            r3.f27549c = r6
            r3.f27547a = r9
            r3.f27544i = r7
            r3.f27550d = r8
            r9.initRewardedVideoForDemandOnly(r4, r5, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1750x.<init>(java.lang.String, java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings, com.ironsource.mediationsdk.sdk.e, int, com.ironsource.mediationsdk.AbstractAdapter):void");
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f27548b.f27214a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f27548b.f27214a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showRewardedVideo state=" + g());
        if (a(C1751y.a.LOADED, C1751y.a.SHOW_IN_PROGRESS)) {
            this.f27547a.showRewardedVideo(this.f27549c, this);
            return;
        }
        this.f27544i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadRewardedVideo state=" + g());
        C1751y.a aVar = C1751y.a.NOT_LOADED;
        C1751y.a aVar2 = C1751y.a.LOADED;
        C1751y.a aVar3 = C1751y.a.LOAD_IN_PROGRESS;
        C1751y.a a10 = a(new C1751y.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            if (a10 == aVar3) {
                this.f27544i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.f27544i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.f27545j = new Date().getTime();
        d("start timer");
        a(new TimerTask() { // from class: com.ironsource.mediationsdk.x.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1750x c1750x = C1750x.this;
                c1750x.d("load timed out state=" + C1750x.this.g());
                if (C1750x.this.a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.NOT_LOADED)) {
                    C1750x.this.f27544i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C1750x.this, new Date().getTime() - C1750x.this.f27545j);
                }
            }
        });
        if (!i()) {
            this.f27547a.loadRewardedVideoForDemandOnly(this.f27549c, this);
            return;
        }
        this.f27551e = str2;
        this.f27552f = jSONObject;
        this.f27553g = list;
        this.f27547a.loadRewardedVideoForDemandOnlyForBidding(this.f27549c, this, str);
    }

    public final boolean b() {
        return this.f27547a.isRewardedVideoAvailable(this.f27549c);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.f27544i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        a(C1751y.a.NOT_LOADED);
        c("onRewardedVideoAdClosed");
        this.f27544i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.f27544i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        this.f27544i.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(C1751y.a.NOT_LOADED);
        c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f27544i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        this.f27544i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + g());
        h();
        if (a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.NOT_LOADED)) {
            this.f27544i.a(ironSourceError, this, new Date().getTime() - this.f27545j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        c("onRewardedVideoLoadSuccess state=" + g());
        h();
        if (a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.LOADED)) {
            this.f27544i.a(this, new Date().getTime() - this.f27545j);
        }
    }
}
