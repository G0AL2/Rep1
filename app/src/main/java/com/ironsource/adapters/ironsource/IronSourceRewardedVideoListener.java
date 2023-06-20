package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.j.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceRewardedVideoListener implements c {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z10) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z10;
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i10);
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClose() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialOpen() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }
}
