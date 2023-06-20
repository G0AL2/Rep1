package com.applovin.mediation.rtb;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public final class AppLovinRtbBannerRenderer implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private static final String TAG = "AppLovinRtbBannerRenderer";
    private final MediationBannerAdConfiguration adConfiguration;
    private AppLovinAdView adView;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback;
    private MediationBannerAdCallback mBannerAdCallback;

    public AppLovinRtbBannerRenderer(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.callback = mediationAdLoadCallback;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner clicked.");
        this.mBannerAdCallback.reportAdClicked();
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner closed fullscreen.");
        this.mBannerAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner displayed.");
        this.mBannerAdCallback.reportAdImpression();
        this.mBannerAdCallback.onAdOpened();
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Banner hidden.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner left application.");
        this.mBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(TAG, "Banner opened fullscreen.");
        this.mBannerAdCallback.onAdOpened();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        String str = TAG;
        Log.d(str, "Banner did load ad: " + appLovinAd.getAdIdNumber());
        this.mBannerAdCallback = this.callback.onSuccess(this);
        this.adView.renderAd(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        ApplovinAdapter.log(3, adError.getMessage());
        this.callback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.adView;
    }

    public void loadAd() {
        Context context = this.adConfiguration.getContext();
        AppLovinAdSize appLovinAdSize = AppLovinAdSize.BANNER;
        AdSize adSize = this.adConfiguration.getAdSize();
        if (adSize.getWidth() >= 728 && adSize.getHeight() >= 90) {
            appLovinAdSize = AppLovinAdSize.LEADER;
        } else if (adSize.getWidth() >= 320) {
            adSize.getHeight();
        }
        AppLovinSdk retrieveSdk = AppLovinUtils.retrieveSdk(this.adConfiguration.getServerParameters(), context);
        AppLovinAdView appLovinAdView = new AppLovinAdView(retrieveSdk, appLovinAdSize, context);
        this.adView = appLovinAdView;
        appLovinAdView.setAdDisplayListener(this);
        this.adView.setAdClickListener(this);
        this.adView.setAdViewEventListener(this);
        retrieveSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
    }
}
