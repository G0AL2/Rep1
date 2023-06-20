package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import com.amazon.admob_adapter.APSAdMobCustomInterstitialSingleEvent;
import com.amazon.device.ads.DTBAdUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;

/* loaded from: classes3.dex */
public class RNAdsAdmobInterstitial implements RNAdsInterstitial<InterstitialAd> {
    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public void load(ReactApplicationContext reactApplicationContext, final String str, final RNAdsFullScreenAdListener rNAdsFullScreenAdListener) {
        AdRequest build;
        String string = ContextHelper.getString(reactApplicationContext, "amazon_aps_slot_uuid_iv_admob");
        if (ContextHelper.isDebug(reactApplicationContext) || str.equals("ca-app-pub-2774555922612370/5828321802") || str.equals("ca-app-pub-2774555922612370/4924729861")) {
            string = ContextHelper.getString(reactApplicationContext, "amazon_aps_slot_uuid_iv_admob_test");
        }
        timber.log.a.f("amazonInterstitialSlotId: %s", string);
        if (string == null) {
            build = new AdRequest.Builder().build();
        } else {
            build = new AdRequest.Builder().addCustomEventExtrasBundle(APSAdMobCustomInterstitialSingleEvent.class, DTBAdUtil.createAdMobInterstitialRequestBundle(string)).build();
        }
        timber.log.a.d("interstitial load: %s ", str);
        InterstitialAd.load(ContextHelper.getActivity(reactApplicationContext), str, build, new InterstitialAdLoadCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobInterstitial.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                timber.log.a.d("interstitial load failed: %s", str);
                rNAdsFullScreenAdListener.onAdFailedToLoad(String.valueOf(loadAdError.getCode()));
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                timber.log.a.d("interstitial loaded: %s", str);
                rNAdsFullScreenAdListener.onAdLoaded(interstitialAd);
            }
        });
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public /* synthetic */ void showByObject(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, Object obj) {
        zd.b.a(this, activity, rNAdsFullScreenAdListener, obj);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial
    public void show(Activity activity, final RNAdsFullScreenAdListener rNAdsFullScreenAdListener, InterstitialAd interstitialAd) {
        interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobInterstitial.2
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
        OnPaidEventListener onPaidEventListener = RNAdsAdmobIlrd.onPaidEventListener;
        if (onPaidEventListener != null) {
            interstitialAd.setOnPaidEventListener(onPaidEventListener);
        }
        interstitialAd.show(activity);
    }
}
