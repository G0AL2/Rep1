package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobProvider;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RNAdsPackage implements t {
    private final RNAdsProvider adsProvider = createProvider();
    private final RNAdsProvider castboxAdsProvider = createCastboxProvider();
    private RNAdsNativeAdLoader mNativeAdLoader;

    public RNAdsPackage() {
        RNAdsLifecycleManager.init(new RNAdsLifecycleObserver() { // from class: com.vehiclecloud.app.videofetch.rnads.RNAdsPackage.1
            private final List<RNAdsLifecycleObserver> observers;

            {
                ArrayList arrayList = new ArrayList(2);
                this.observers = arrayList;
                if (RNAdsPackage.this.adsProvider != null) {
                    arrayList.add(RNAdsPackage.this.adsProvider.getLifecycleObserver());
                }
                if (RNAdsPackage.this.castboxAdsProvider != null) {
                    arrayList.add(RNAdsPackage.this.castboxAdsProvider.getLifecycleObserver());
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public void onCreate(Activity activity) {
                for (RNAdsLifecycleObserver rNAdsLifecycleObserver : this.observers) {
                    rNAdsLifecycleObserver.onCreate(activity);
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public void onPause(Activity activity) {
                for (RNAdsLifecycleObserver rNAdsLifecycleObserver : this.observers) {
                    rNAdsLifecycleObserver.onPause(activity);
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public void onResume(Activity activity) {
                for (RNAdsLifecycleObserver rNAdsLifecycleObserver : this.observers) {
                    rNAdsLifecycleObserver.onResume(activity);
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
            public void onStop(Activity activity) {
                for (RNAdsLifecycleObserver rNAdsLifecycleObserver : this.observers) {
                    rNAdsLifecycleObserver.onStop(activity);
                }
            }
        });
    }

    private static RNAdsProvider createCastboxProvider() {
        return null;
    }

    private static RNAdsProvider createProvider() {
        try {
            return new RNAdsAdmobProvider();
        } catch (Exception unused) {
            return null;
        }
    }

    private void initNativeCache(ReactApplicationContext reactApplicationContext, RNAdsNative<?> rNAdsNative) {
        if (this.mNativeAdLoader != null) {
            return;
        }
        RNAdsNativeAdLoader rNAdsNativeAdLoader = new RNAdsNativeAdLoader(reactApplicationContext, rNAdsNative);
        this.mNativeAdLoader = rNAdsNativeAdLoader;
        RNAdsLifecycleManager.mNativeAdLoader = rNAdsNativeAdLoader;
    }

    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        if (this.adsProvider == null) {
            return arrayList;
        }
        RNAdsProvider rNAdsProvider = this.castboxAdsProvider;
        if (rNAdsProvider != null && rNAdsProvider.getInterstitialAd() != null) {
            arrayList.add(new RNAdsSplashModule(reactApplicationContext, this.castboxAdsProvider.getInterstitialAd()));
        } else if (this.adsProvider.getInterstitialAd() != null) {
            arrayList.add(new RNAdsSplashModule(reactApplicationContext, this.adsProvider.getInterstitialAd()));
        }
        if (this.adsProvider.getInterstitialAd() != null) {
            arrayList.add(new RNAdsInterstitialModule(reactApplicationContext, this.adsProvider.getInterstitialAd()));
        }
        if (this.adsProvider.getNativeAd() != null) {
            initNativeCache(reactApplicationContext, this.adsProvider.getNativeAd());
            arrayList.add(new RNAdsNativeModule(reactApplicationContext, this.mNativeAdLoader));
        }
        if (this.adsProvider.getRewardAd() != null) {
            arrayList.add(new RNAdsRewardModule(reactApplicationContext, this.adsProvider.getRewardAd()));
        }
        if (this.adsProvider.getAppOpenAd() != null) {
            arrayList.add(new RNAdsAppOpenAdModule(reactApplicationContext, this.adsProvider.getAppOpenAd()));
        }
        if (this.adsProvider.getIlrd() != null) {
            arrayList.add(new RNAdsIlrdModule(reactApplicationContext, this.adsProvider.getIlrd()));
        }
        this.adsProvider.addNativeModules(reactApplicationContext, arrayList);
        return arrayList;
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        RNAdsProvider rNAdsProvider = this.adsProvider;
        if (rNAdsProvider != null && rNAdsProvider.getNativeAd() != null) {
            initNativeCache(reactApplicationContext, this.adsProvider.getNativeAd());
            arrayList.add(new RNAdsNativeViewManager(this.mNativeAdLoader));
        }
        return arrayList;
    }
}
