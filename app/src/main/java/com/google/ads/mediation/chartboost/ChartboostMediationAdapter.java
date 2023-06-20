package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Model.CBError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class ChartboostMediationAdapter extends Adapter implements MediationRewardedAd {
    static final String CHARTBOOST_SDK_ERROR_DOMAIN = "com.chartboost.sdk";
    static final int ERROR_AD_ALREADY_LOADED = 101;
    static final int ERROR_BANNER_SIZE_MISMATCH = 100;
    static final String ERROR_DOMAIN = "com.google.ads.mediation.chartboost";
    static final int ERROR_INVALID_SERVER_PARAMETERS = 102;
    static final String TAG = "ChartboostMediationAdapter";
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mAdLoadCallback;
    private c mChartboostParams = new c();
    private final com.google.ads.mediation.chartboost.a mChartboostRewardedVideoDelegate = new a();
    private InitializationCompleteCallback mInitializationCallback;
    private boolean mIsLoading;
    private MediationRewardedAdCallback mRewardedAdCallback;

    /* loaded from: classes2.dex */
    class a extends com.google.ads.mediation.chartboost.a {
        a() {
        }

        @Override // com.google.ads.mediation.chartboost.a
        public c a() {
            return ChartboostMediationAdapter.this.mChartboostParams;
        }

        @Override // com.google.ads.mediation.chartboost.a
        public void b(AdError adError) {
            Log.e(ChartboostMediationAdapter.TAG, adError.toString());
            if (ChartboostMediationAdapter.this.mAdLoadCallback != null) {
                ChartboostMediationAdapter.this.mAdLoadCallback.onFailure(adError);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCacheRewardedVideo(String str) {
            super.didCacheRewardedVideo(str);
            if (ChartboostMediationAdapter.this.mAdLoadCallback != null && ChartboostMediationAdapter.this.mIsLoading && str.equals(ChartboostMediationAdapter.this.mChartboostParams.f())) {
                ChartboostMediationAdapter.this.mIsLoading = false;
                ChartboostMediationAdapter chartboostMediationAdapter = ChartboostMediationAdapter.this;
                chartboostMediationAdapter.mRewardedAdCallback = (MediationRewardedAdCallback) chartboostMediationAdapter.mAdLoadCallback.onSuccess(ChartboostMediationAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didClickRewardedVideo(String str) {
            super.didClickRewardedVideo(str);
            if (ChartboostMediationAdapter.this.mRewardedAdCallback != null) {
                ChartboostMediationAdapter.this.mRewardedAdCallback.reportAdClicked();
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCompleteRewardedVideo(String str, int i10) {
            super.didCompleteRewardedVideo(str, i10);
            if (ChartboostMediationAdapter.this.mRewardedAdCallback != null) {
                ChartboostMediationAdapter.this.mRewardedAdCallback.onVideoComplete();
                ChartboostMediationAdapter.this.mRewardedAdCallback.onUserEarnedReward(new d(i10));
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDismissRewardedVideo(String str) {
            super.didDismissRewardedVideo(str);
            if (ChartboostMediationAdapter.this.mRewardedAdCallback != null) {
                ChartboostMediationAdapter.this.mRewardedAdCallback.onAdClosed();
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDisplayRewardedVideo(String str) {
            super.didDisplayRewardedVideo(str);
            if (ChartboostMediationAdapter.this.mRewardedAdCallback != null) {
                ChartboostMediationAdapter.this.mRewardedAdCallback.onAdOpened();
                ChartboostMediationAdapter.this.mRewardedAdCallback.onVideoStart();
                ChartboostMediationAdapter.this.mRewardedAdCallback.reportAdImpression();
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            super.didFailToLoadRewardedVideo(str, cBImpressionError);
            AdError e10 = b.e(cBImpressionError);
            Log.i(ChartboostMediationAdapter.TAG, e10.toString());
            if (ChartboostMediationAdapter.this.mAdLoadCallback == null || !str.equals(ChartboostMediationAdapter.this.mChartboostParams.f())) {
                return;
            }
            if (ChartboostMediationAdapter.this.mIsLoading) {
                ChartboostMediationAdapter.this.mAdLoadCallback.onFailure(e10);
                ChartboostMediationAdapter.this.mIsLoading = false;
            } else if (cBImpressionError != CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW || ChartboostMediationAdapter.this.mRewardedAdCallback == null) {
            } else {
                ChartboostMediationAdapter.this.mRewardedAdCallback.onAdFailedToShow(e10);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didInitialize() {
            super.didInitialize();
            if (ChartboostMediationAdapter.this.mInitializationCallback != null) {
                ChartboostMediationAdapter.this.mInitializationCallback.onInitializationSucceeded();
            }
            if (ChartboostMediationAdapter.this.mAdLoadCallback != null) {
                ChartboostMediationAdapter.this.mIsLoading = true;
                e.p(ChartboostMediationAdapter.this.mChartboostRewardedVideoDelegate);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = Chartboost.getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "8.4.3.1".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "8.4.3.1"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashMap hashMap = new HashMap();
        for (MediationConfiguration mediationConfiguration : list) {
            Bundle serverParameters = mediationConfiguration.getServerParameters();
            String string = serverParameters.getString("appId");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put(string, serverParameters);
            }
        }
        int size = hashMap.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(102, "Missing or Invalid App ID.", ERROR_DOMAIN).toString());
            return;
        }
        String str = (String) hashMap.keySet().iterator().next();
        Bundle bundle = (Bundle) hashMap.get(str);
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Chartboost SDK.", "appId", hashMap.keySet(), str));
        }
        this.mInitializationCallback = initializationCompleteCallback;
        c a10 = b.a(bundle, null);
        this.mChartboostParams = a10;
        if (!b.h(a10)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(102, "Invalid server parameters.", ERROR_DOMAIN).toString());
        } else {
            e.w(context, this.mChartboostRewardedVideoDelegate);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mAdLoadCallback = mediationAdLoadCallback;
        c a10 = b.a(mediationRewardedAdConfiguration.getServerParameters(), mediationRewardedAdConfiguration.getMediationExtras());
        this.mChartboostParams = a10;
        if (!b.h(a10)) {
            AdError adError = new AdError(102, "Invalid server parameters.", ERROR_DOMAIN);
            Log.e(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        e.w(mediationRewardedAdConfiguration.getContext(), this.mChartboostRewardedVideoDelegate);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        e.s(this.mChartboostRewardedVideoDelegate);
    }
}
