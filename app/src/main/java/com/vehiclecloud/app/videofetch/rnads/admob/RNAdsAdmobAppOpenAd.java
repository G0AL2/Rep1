package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;

/* loaded from: classes3.dex */
public class RNAdsAdmobAppOpenAd implements RNAdsAppOpenAd<AppOpenAd> {
    private AppOpenAd.AppOpenAdLoadCallback createLoadCallback(final RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        return new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobAppOpenAd.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                rNAdsFullScreenAdListener.onAdFailedToLoad(String.valueOf(loadAdError.getCode()));
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd appOpenAd) {
                rNAdsFullScreenAdListener.onAdLoaded(appOpenAd);
            }
        };
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd
    public void load(ReactApplicationContext reactApplicationContext, String str, RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        AppOpenAd.AppOpenAdLoadCallback createLoadCallback = createLoadCallback(rNAdsFullScreenAdListener);
        AppOpenAd.load(ContextHelper.getActivity(reactApplicationContext), str, new AdRequest.Builder().build(), 1, createLoadCallback);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd
    public /* synthetic */ void showByObject(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, Object obj) {
        zd.a.a(this, activity, rNAdsFullScreenAdListener, obj);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd
    public void show(Activity activity, final RNAdsFullScreenAdListener rNAdsFullScreenAdListener, AppOpenAd appOpenAd) {
        appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobAppOpenAd.1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                rNAdsFullScreenAdListener.onAdClicked();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                rNAdsFullScreenAdListener.onAdDismissed();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                rNAdsFullScreenAdListener.onAdFailedToShow(String.valueOf(adError.getCode()));
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                rNAdsFullScreenAdListener.onAdShowed();
            }
        });
        appOpenAd.show(activity);
    }
}
