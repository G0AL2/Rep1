package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.MRAIDPolicy;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobProvider;
import com.vehiclecloud.app.videofetch.rnads.admob.testSuite.RNAdmobTestSuiteLauncherModule;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNativeAdPositioning;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class RNAdsAdmobProvider implements RNAdsProvider {
    private final RNAdsLifecycleObserver mLifecycleObserver = new AnonymousClass1();
    private final RNAdsAdmobInterstitial mInterstitialAd = new RNAdsAdmobInterstitial();
    private final RNAdsAdmobNative mNativeAd = new RNAdsAdmobNative();
    private final RNAdsAdmobReward mReward = new RNAdsAdmobReward();
    private final RNAdsAdmobAppOpenAd mAppOpenAd = new RNAdsAdmobAppOpenAd();
    private final RNAdsIlrd mIlrd = new RNAdsAdmobIlrd();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobProvider$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements RNAdsLifecycleObserver {
        AnonymousClass1() {
            RNAdsAdmobProvider.this = r1;
        }

        public static /* synthetic */ void a(Activity activity, InitializationStatus initializationStatus) {
            lambda$onCreate$0(activity, initializationStatus);
        }

        public static /* synthetic */ void lambda$onCreate$0(Activity activity, InitializationStatus initializationStatus) {
            if (ContextHelper.isDebug(activity)) {
                InneractiveAdManager.setLogLevel(2);
                initializationStatus.getAdapterStatusMap();
                Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
                for (String str : adapterStatusMap.keySet()) {
                    AdapterStatus adapterStatus = adapterStatusMap.get(str);
                    if (adapterStatus != null) {
                        timber.log.a.d("Adapter name: %s, state: %s, Description: %s, Latency: %d", str, adapterStatus.getInitializationState().name(), adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency()));
                    }
                }
            }
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
        public void onCreate(final Activity activity) {
            RNGDPRModule.askUser(activity);
            MobileAds.initialize(activity, new OnInitializationCompleteListener() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.c
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    RNAdsAdmobProvider.AnonymousClass1.a(activity, initializationStatus);
                }
            });
            String string = ContextHelper.getString(activity, "amazon_aps_app_key");
            if (string != null) {
                AdRegistration.getInstance(string, activity);
                AdRegistration.setAdNetworkInfo(new DTBAdNetworkInfo(DTBAdNetwork.ADMOB));
                AdRegistration.setMRAIDSupportedVersions(new String[]{com.amazon.device.ads.BuildConfig.VERSION_NAME, DtbConstants.APS_ADAPTER_VERSION_2, "3.0"});
                AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
                if (ContextHelper.isDebug(activity)) {
                    AdRegistration.enableLogging(true);
                    AdRegistration.enableTesting(true);
                }
            }
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
        public /* synthetic */ void onPause(Activity activity) {
            zd.c.b(this, activity);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
        public /* synthetic */ void onResume(Activity activity) {
            zd.c.c(this, activity);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver
        public /* synthetic */ void onStop(Activity activity) {
            zd.c.d(this, activity);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public void addNativeModules(ReactApplicationContext reactApplicationContext, List<NativeModule> list) {
        list.add(new RNAdmobTestSuiteLauncherModule(reactApplicationContext));
        list.add(new RNGDPRModule(reactApplicationContext));
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public RNAdsAppOpenAd<?> getAppOpenAd() {
        return this.mAppOpenAd;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public RNAdsIlrd getIlrd() {
        return this.mIlrd;
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
    public RNAdsNative<?> getNativeAd() {
        return this.mNativeAd;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public /* synthetic */ RNAdsNativeAdPositioning getNativeAdPositioning() {
        return zd.e.g(this);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsProvider
    public RNAdsReward<?> getRewardAd() {
        return this.mReward;
    }
}
