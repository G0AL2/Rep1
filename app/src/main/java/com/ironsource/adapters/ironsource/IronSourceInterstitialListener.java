package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.j.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceInterstitialListener implements c {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i10);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClose() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialOpen() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
