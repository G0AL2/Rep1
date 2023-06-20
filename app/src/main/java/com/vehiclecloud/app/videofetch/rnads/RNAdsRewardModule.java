package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.u;
import qe.g;
import qe.k;
import we.e;
import we.e0;
import we.i1;
import we.s0;

/* compiled from: RNAdsRewardModule.kt */
/* loaded from: classes3.dex */
public final class RNAdsRewardModule extends RNAdsReactContextBaseModule implements RNAdsReward.Listener {
    private static final Bundle ANALYTICS_COMMON_PARAMS;
    private static final String ANALYTICS_ITEM_CATEGORY = "earnExtraTimes";
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_REWARD_AD = "RNAdsRewardAdEvent";
    private static final String TAG = "RNAdsReward";

    /* renamed from: ad  reason: collision with root package name */
    private Object f28540ad;
    private boolean isLoadingAd;
    private boolean isShowingAd;
    private long loadTime;
    private String mAdUnitId;
    private final RNAdsReward<?> mReward;
    private i1 reloadJob;
    private int retryTimes;

    /* compiled from: RNAdsRewardModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        Bundle bundle = new Bundle();
        bundle.putString("item_category", ANALYTICS_ITEM_CATEGORY);
        bundle.putString(Analytics.Param.ITEM_NAME, ANALYTICS_ITEM_CATEGORY);
        ANALYTICS_COMMON_PARAMS = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsRewardModule(ReactApplicationContext reactApplicationContext, RNAdsReward<?> rNAdsReward) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        k.f(rNAdsReward, "mReward");
        this.mReward = rNAdsReward;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelLoadTimeoutSchedule() {
        i1 i1Var = this.reloadJob;
        if (i1Var != null) {
            i1.a.a(i1Var, null, 1, null);
        }
        this.reloadJob = null;
    }

    private final boolean isAdAvailable() {
        return this.f28540ad != null;
    }

    private final void scheduleReload() {
        int i10 = this.retryTimes;
        if (i10 == 5) {
            return;
        }
        this.retryTimes = i10 + 1;
        e0 scope = getScope();
        this.reloadJob = scope != null ? e.b(scope, s0.b(), null, new RNAdsRewardModule$scheduleReload$1(this, null), 2, null) : null;
    }

    private final void sendRewardAdEvent(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str);
        createMap.putString("adUnitId", str2);
        if (str3 != null) {
            createMap.putString("error", str3);
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(EVENT_REWARD_AD, createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void sendRewardAdEvent$default(RNAdsRewardModule rNAdsRewardModule, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        rNAdsRewardModule.sendRewardAdEvent(str, str2, str3);
    }

    @ReactMethod
    public final void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void load(String str) {
        e0 scope;
        k.f(str, "adUnitId");
        if (this.isLoadingAd || isAdAvailable() || (scope = getScope()) == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsRewardModule$load$1(this, str, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdClicked() {
        timber.log.a.f37331a.d("onAdClicked", new Object[0]);
        sendRewardAdEvent$default(this, RNAdsEvents.EVENT_CLICKED, this.mAdUnitId, null, 4, null);
        logEvent("rads_clk", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdDismissed() {
        this.f28540ad = null;
        this.isShowingAd = false;
        timber.log.a.f37331a.d("onAdDismissedFullScreenContent.", new Object[0]);
        String str = this.mAdUnitId;
        if (str != null) {
            load(str);
        }
        sendRewardAdEvent$default(this, RNAdsEvents.EVENT_CLOSED, this.mAdUnitId, null, 4, null);
        logEvent("rads_close", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToLoad(String str) {
        k.f(str, "cause");
        this.isLoadingAd = false;
        scheduleReload();
        timber.log.a.f37331a.d(k.l("Ad load occur error: ", str), new Object[0]);
        sendRewardAdEvent("error", this.mAdUnitId, str);
        Bundle bundle = new Bundle();
        bundle.putString("item_category", ANALYTICS_ITEM_CATEGORY);
        bundle.putString(Analytics.Param.ITEM_NAME, ANALYTICS_ITEM_CATEGORY);
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "error_code", str);
        u uVar = u.f29813a;
        logEvent("rads_failed", bundle);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToShow(String str) {
        k.f(str, "cause");
        this.f28540ad = null;
        this.isShowingAd = false;
        timber.log.a.f37331a.d(k.l("onAdFailedToShowFullScreenContent: ", str), new Object[0]);
        String str2 = this.mAdUnitId;
        if (str2 == null) {
            return;
        }
        load(str2);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdLoaded(Object obj) {
        k.f(obj, "ad");
        timber.log.a.f37331a.d("Ad loaded", new Object[0]);
        this.f28540ad = obj;
        this.isLoadingAd = false;
        this.retryTimes = 0;
        sendRewardAdEvent$default(this, RNAdsEvents.EVENT_LOADED, this.mAdUnitId, null, 4, null);
        Bundle bundle = new Bundle();
        bundle.putString("item_category", ANALYTICS_ITEM_CATEGORY);
        bundle.putString(Analytics.Param.ITEM_NAME, ANALYTICS_ITEM_CATEGORY);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, System.currentTimeMillis() - this.loadTime);
        u uVar = u.f29813a;
        logEvent("rads_loaded", bundle);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdShowed() {
        sendRewardAdEvent$default(this, RNAdsEvents.EVENT_OPENED, this.mAdUnitId, null, 4, null);
        logEvent("rads_imp", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward.Listener
    public void onUserEarnedReward() {
        sendRewardAdEvent$default(this, RNAdsEvents.EVENT_REWARDED, this.mAdUnitId, null, 4, null);
        logEvent("rads_rewarded", ANALYTICS_COMMON_PARAMS);
    }

    @ReactMethod
    public final void removeListeners(double d10) {
    }

    @ReactMethod
    public final void show(String str, Promise promise) {
        e0 scope;
        k.f(str, "adUnitId");
        if (this.isShowingAd) {
            timber.log.a.f37331a.d("ad is already showing.", new Object[0]);
        } else if (!isAdAvailable()) {
            timber.log.a.f37331a.d("ad is not ready yet.", new Object[0]);
            load(str);
        } else {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null || (scope = getScope()) == null) {
                return;
            }
            e.b(scope, s0.c(), null, new RNAdsRewardModule$show$1$1(this, str, currentActivity, null), 2, null);
        }
    }
}
