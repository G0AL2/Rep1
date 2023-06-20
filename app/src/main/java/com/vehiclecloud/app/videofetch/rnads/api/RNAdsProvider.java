package com.vehiclecloud.app.videofetch.rnads.api;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* loaded from: classes3.dex */
public interface RNAdsProvider {
    void addNativeModules(ReactApplicationContext reactApplicationContext, List<NativeModule> list);

    RNAdsAppOpenAd<?> getAppOpenAd();

    RNAdsIlrd getIlrd();

    RNAdsInterstitial<?> getInterstitialAd();

    RNAdsLifecycleObserver getLifecycleObserver();

    RNAdsNative<?> getNativeAd();

    RNAdsNativeAdPositioning getNativeAdPositioning();

    RNAdsReward<?> getRewardAd();
}
