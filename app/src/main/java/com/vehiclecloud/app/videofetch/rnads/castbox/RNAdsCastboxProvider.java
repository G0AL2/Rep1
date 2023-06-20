package com.vehiclecloud.app.videofetch.rnads.castbox;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNativeAdPositioning;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward;
import fm.castbox.mediation.SDKManager;
import java.util.List;
import zd.c;
import zd.e;

/* loaded from: classes3.dex */
public class RNAdsCastboxProvider implements RNAdsProvider {
    private final RNAdsCastboxInterstitial mInterstitialAd;
    private final RNAdsLifecycleObserver mLifecycleObserver;
    private final SdkOnInitializationCompleteListener sdkInitListener;

    public RNAdsCastboxProvider() {
        SdkOnInitializationCompleteListener sdkOnInitializationCompleteListener = new SdkOnInitializationCompleteListener();
        this.sdkInitListener = sdkOnInitializationCompleteListener;
        this.mLifecycleObserver = new RNAdsLifecycleObserver() { // from class: com.vehiclecloud.app.videofetch.rnads.castbox.RNAdsCastboxProvider.1
            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public void onCreate(Activity activity) {
                SDKManager.getInstance().initialize(activity, RNAdsCastboxProvider.this.sdkInitListener);
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public /* synthetic */ void onPause(Activity activity) {
                c.b(this, activity);
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public /* synthetic */ void onResume(Activity activity) {
                c.c(this, activity);
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public /* synthetic */ void onStop(Activity activity) {
                c.d(this, activity);
            }
        };
        this.mInterstitialAd = new RNAdsCastboxInterstitial(sdkOnInitializationCompleteListener);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ void addNativeModules(ReactApplicationContext reactApplicationContext, List list) {
        e.a(this, reactApplicationContext, list);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsAppOpenAd getAppOpenAd() {
        return e.b(this);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsIlrd getIlrd() {
        return e.c(this);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public RNAdsInterstitial<?> getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public RNAdsLifecycleObserver getLifecycleObserver() {
        return this.mLifecycleObserver;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsNative getNativeAd() {
        return e.f(this);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsNativeAdPositioning getNativeAdPositioning() {
        return e.g(this);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsReward getRewardAd() {
        return e.h(this);
    }
}
