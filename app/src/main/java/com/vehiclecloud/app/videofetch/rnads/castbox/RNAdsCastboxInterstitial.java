package com.vehiclecloud.app.videofetch.rnads.castbox;

import android.app.Activity;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.interstitial.InterstitialAd;
import zd.b;

/* loaded from: classes3.dex */
public class RNAdsCastboxInterstitial implements RNAdsInterstitial<InterstitialAd> {
    private final SdkOnInitializationCompleteListener sdkInitListener;

    public RNAdsCastboxInterstitial(SdkOnInitializationCompleteListener sdkOnInitializationCompleteListener) {
        this.sdkInitListener = sdkOnInitializationCompleteListener;
    }

    public static /* synthetic */ void a(RNAdsCastboxInterstitial rNAdsCastboxInterstitial, ReactApplicationContext reactApplicationContext, String str, RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        rNAdsCastboxInterstitial.lambda$load$0(reactApplicationContext, str, rNAdsFullScreenAdListener);
    }

    /* renamed from: doLoad */
    public void lambda$load$0(ReactApplicationContext reactApplicationContext, String str, final RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            rNAdsFullScreenAdListener.onAdFailedToLoad("activity is null");
            return;
        }
        final InterstitialAd interstitialAd = new InterstitialAd(currentActivity, str);
        interstitialAd.setListener(new InterstitialAd.InterstitialAdListener() { // from class: com.vehiclecloud.app.videofetch.rnads.castbox.RNAdsCastboxInterstitial.1
            {
                RNAdsCastboxInterstitial.this = this;
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onAdClicked() {
                rNAdsFullScreenAdListener.onAdClicked();
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onAdDismissed() {
                rNAdsFullScreenAdListener.onAdDismissed();
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onAdImpression(float f10) {
                rNAdsFullScreenAdListener.onAdShowed();
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onAdLoaded() {
                Log.i("CastboxInterstitial", "onAdLoaded: " + rNAdsFullScreenAdListener);
                rNAdsFullScreenAdListener.onAdLoaded(interstitialAd);
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onError(AdError adError) {
            }

            @Override // fm.castbox.mediation.interstitial.InterstitialAd.InterstitialAdListener
            public void onEventualFailure(AdError adError) {
                rNAdsFullScreenAdListener.onAdFailedToLoad(String.valueOf(adError.getCode()));
            }
        });
        interstitialAd.loadAd();
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public void load(final ReactApplicationContext reactApplicationContext, final String str, final RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        SdkOnInitializationCompleteListener sdkOnInitializationCompleteListener = this.sdkInitListener;
        if (sdkOnInitializationCompleteListener.status == 1) {
            lambda$load$0(reactApplicationContext, str, rNAdsFullScreenAdListener);
        } else {
            sdkOnInitializationCompleteListener.pending(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnads.castbox.a
                @Override // java.lang.Runnable
                public final void run() {
                    RNAdsCastboxInterstitial.a(RNAdsCastboxInterstitial.this, reactApplicationContext, str, rNAdsFullScreenAdListener);
                }
            });
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public /* synthetic */ void showByObject(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, Object obj) {
        b.a(this, activity, rNAdsFullScreenAdListener, obj);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public void show(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, InterstitialAd interstitialAd) {
        interstitialAd.showAd();
    }
}
