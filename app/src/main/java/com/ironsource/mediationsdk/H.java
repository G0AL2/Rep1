package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class H extends AbstractC1728b implements InterstitialSmashListener {

    /* renamed from: r  reason: collision with root package name */
    JSONObject f26273r;

    /* renamed from: s  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.i f26274s;

    /* renamed from: t  reason: collision with root package name */
    long f26275t;

    /* renamed from: u  reason: collision with root package name */
    private int f26276u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(NetworkSettings networkSettings, int i10) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f26273r = interstitialSettings;
        this.f26988k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f26989l = this.f26273r.optInt("maxAdsPerSession", 99);
        this.f26990m = this.f26273r.optInt("maxAdsPerDay", 99);
        this.f26982e = networkSettings.isMultipleInstances();
        this.f26983f = networkSettings.getSubProviderId();
        this.f26276u = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1728b
    public final void g() {
        this.f26985h = 0;
        a(AbstractC1728b.a.INITIATED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1728b
    public final void h() {
        try {
            e();
            Timer timer = new Timer();
            this.f26986i = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.H.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    cancel();
                    H h10 = H.this;
                    if (h10.f26978a != AbstractC1728b.a.INIT_PENDING || h10.f26274s == null) {
                        return;
                    }
                    H.this.a(AbstractC1728b.a.INIT_FAILED);
                    H.this.f26274s.a(ErrorBuilder.buildInitFailedError("Timeout", IronSourceConstants.INTERSTITIAL_AD_UNIT), H.this);
                }
            }, this.f26276u * 1000);
        } catch (Exception e10) {
            a("startInitTimer", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1728b
    public final void i() {
        try {
            f();
            Timer timer = new Timer();
            this.f26987j = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.H.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    cancel();
                    H h10 = H.this;
                    if (h10.f26978a != AbstractC1728b.a.LOAD_PENDING || h10.f26274s == null) {
                        return;
                    }
                    H.this.a(AbstractC1728b.a.NOT_AVAILABLE);
                    H.this.f26274s.a(ErrorBuilder.buildLoadFailedError("Timeout"), H.this, new Date().getTime() - H.this.f26275t);
                }
            }, this.f26276u * 1000);
        } catch (Exception e10) {
            a("startLoadTimer", e10.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC1728b
    protected final String k() {
        return "interstitial";
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        f();
        if (this.f26978a != AbstractC1728b.a.LOAD_PENDING || this.f26274s == null) {
            return;
        }
        this.f26274s.a(ironSourceError, this, new Date().getTime() - this.f26275t);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        f();
        if (this.f26978a != AbstractC1728b.a.LOAD_PENDING || this.f26274s == null) {
            return;
        }
        this.f26274s.a(this, new Date().getTime() - this.f26275t);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.b(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
        if (iVar != null) {
            iVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        e();
        if (this.f26978a == AbstractC1728b.a.INIT_PENDING) {
            a(AbstractC1728b.a.INIT_FAILED);
            com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
            if (iVar != null) {
                iVar.a(ironSourceError, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        e();
        if (this.f26978a == AbstractC1728b.a.INIT_PENDING) {
            a(AbstractC1728b.a.INITIATED);
            com.ironsource.mediationsdk.sdk.i iVar = this.f26274s;
            if (iVar != null) {
                iVar.a(this);
            }
        }
    }
}
