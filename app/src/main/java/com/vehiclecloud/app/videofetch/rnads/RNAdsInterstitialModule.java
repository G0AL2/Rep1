package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.LinkedHashMap;
import java.util.Map;
import qe.g;
import qe.k;
import we.e;
import we.e0;
import we.i1;
import we.s0;

/* compiled from: RNAdsInterstitialModule.kt */
/* loaded from: classes3.dex */
public final class RNAdsInterstitialModule extends RNAdsReactContextBaseModule {
    public static final Companion Companion = new Companion(null);
    private static final int ERR_LOADED = 0;
    private static final int ERR_NOT_READY = 0;
    private static final int ERR_SHOWING = -1;
    private static final String EVENT_INTERSTITIAL = "RNAdsInterstitialEvent";
    private static final int RESULT_OK = 1;
    private static final String TAG = "RNAdsInterstitial";
    private final Map<String, InterstitialAdManager> cache;
    private final RNAdsInterstitial<?> interstitialAd;
    private boolean isShowingAd;
    private i1 showingTimeoutJob;

    /* compiled from: RNAdsInterstitialModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: RNAdsInterstitialModule.kt */
    /* loaded from: classes3.dex */
    public final class InterstitialAdManager implements RNAdsFullScreenAdListener {

        /* renamed from: ad  reason: collision with root package name */
        private Object f28538ad;
        private final String adUnitId;
        private boolean isLoadingAd;
        private long loadTime;
        private i1 reloadJob;
        private int retryTimes;
        private String screen;
        final /* synthetic */ RNAdsInterstitialModule this$0;

        public InterstitialAdManager(RNAdsInterstitialModule rNAdsInterstitialModule, String str, String str2) {
            k.f(rNAdsInterstitialModule, "this$0");
            k.f(str, "adUnitId");
            k.f(str2, "screen");
            this.this$0 = rNAdsInterstitialModule;
            this.adUnitId = str;
            this.screen = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cancelReLoadSchedule() {
            i1 i1Var = this.reloadJob;
            if (i1Var != null) {
                i1.a.a(i1Var, null, 1, null);
            }
            this.reloadJob = null;
        }

        private final void cancelShowingTimeoutJob() {
            i1 i1Var = this.this$0.showingTimeoutJob;
            if (i1Var != null) {
                i1.a.a(i1Var, null, 1, null);
            }
            this.this$0.showingTimeoutJob = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle getAnalyticsCommonParams() {
            Bundle bundle = new Bundle();
            bundle.putString("item_category", this.screen);
            bundle.putString(Analytics.Param.ITEM_NAME, this.screen);
            return bundle;
        }

        private final void scheduleReload() {
            int i10 = this.retryTimes;
            if (i10 < 5) {
                this.retryTimes = i10 + 1;
            }
            e0 scope = this.this$0.getScope();
            this.reloadJob = scope != null ? e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1(this, null), 2, null) : null;
        }

        public final boolean isAdAvailable() {
            return this.f28538ad != null;
        }

        public final void loadAd() {
            if (this.isLoadingAd || isAdAvailable()) {
                return;
            }
            this.isLoadingAd = true;
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.c(), null, new RNAdsInterstitialModule$InterstitialAdManager$loadAd$1(this, this.this$0, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdClicked() {
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdClicked$1(this.this$0, this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdDismissed() {
            this.f28538ad = null;
            this.this$0.isShowingAd = false;
            cancelShowingTimeoutJob();
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1(this.this$0, this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdFailedToLoad(String str) {
            k.f(str, "cause");
            this.isLoadingAd = false;
            scheduleReload();
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1(this.this$0, this, str, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdFailedToShow(String str) {
            k.f(str, "cause");
            this.f28538ad = null;
            this.this$0.isShowingAd = false;
            cancelShowingTimeoutJob();
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToShow$1(this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdLoaded(Object obj) {
            k.f(obj, "ad");
            this.f28538ad = obj;
            this.isLoadingAd = false;
            this.retryTimes = 0;
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1(this.this$0, this, null), 2, null);
        }

        @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
        public void onAdShowed() {
            e0 scope = this.this$0.getScope();
            if (scope == null) {
                return;
            }
            e.b(scope, s0.b(), null, new RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1(this.this$0, this, null), 2, null);
        }

        public final void resendLatestInterstitialEvent() {
            RNAdsInterstitialModule.sendInterstitialEvent$default(this.this$0, (this.isLoadingAd || this.f28538ad == null) ? RNAdsEvents.EVENT_LOADING : RNAdsEvents.EVENT_LOADED, this.adUnitId, null, 4, null);
        }

        public final void show(String str) {
            e0 scope;
            k.f(str, "screen");
            this.screen = str;
            Object obj = this.f28538ad;
            if (obj == null) {
                return;
            }
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
            Activity currentActivity = rNAdsInterstitialModule.getCurrentActivity();
            if (currentActivity == null || (scope = rNAdsInterstitialModule.getScope()) == null) {
                return;
            }
            e.b(scope, s0.c(), null, new RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1(rNAdsInterstitialModule, currentActivity, this, obj, null), 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule(ReactApplicationContext reactApplicationContext, RNAdsInterstitial<?> rNAdsInterstitial) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        k.f(rNAdsInterstitial, "interstitialAd");
        this.interstitialAd = rNAdsInterstitial;
        this.cache = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int loadAd(String str, String str2) {
        if (this.cache.containsKey(str)) {
            InterstitialAdManager interstitialAdManager = this.cache.get(str);
            if (interstitialAdManager == null) {
                return 0;
            }
            interstitialAdManager.resendLatestInterstitialEvent();
            return 0;
        }
        Map<String, InterstitialAdManager> map = this.cache;
        InterstitialAdManager interstitialAdManager2 = new InterstitialAdManager(this, str, str2);
        interstitialAdManager2.loadAd();
        map.put(str, interstitialAdManager2);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInterstitialEvent(String str, String str2, String str3) {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsInterstitialModule$sendInterstitialEvent$1(str, str2, str3, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void sendInterstitialEvent$default(RNAdsInterstitialModule rNAdsInterstitialModule, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        rNAdsInterstitialModule.sendInterstitialEvent(str, str2, str3);
    }

    @ReactMethod
    public final void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void load(ReadableArray readableArray, Promise promise) {
        k.f(readableArray, "adUnits");
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsInterstitialModule$load$1(readableArray, this, promise, null), 2, null);
    }

    @ReactMethod
    public final void removeListeners(double d10) {
    }

    @ReactMethod
    public final void show(String str, String str2, Promise promise) {
        k.f(str, "adUnitId");
        k.f(str2, "screen");
        if (this.isShowingAd) {
            if (promise == null) {
                return;
            }
            promise.resolve(-1);
            return;
        }
        InterstitialAdManager interstitialAdManager = this.cache.get(str);
        if (interstitialAdManager == null) {
            loadAd(str, str2);
            if (promise == null) {
                return;
            }
            promise.resolve(-1);
        } else if (!interstitialAdManager.isAdAvailable()) {
            interstitialAdManager.loadAd();
            if (promise == null) {
                return;
            }
            promise.resolve(0);
        } else {
            interstitialAdManager.show(str2);
            if (promise == null) {
                return;
            }
            promise.resolve(1);
        }
    }
}
