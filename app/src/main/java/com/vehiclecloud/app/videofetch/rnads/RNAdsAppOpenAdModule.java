package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener;
import ee.u;
import qe.g;
import qe.k;
import we.e;
import we.e0;
import we.i1;
import we.s0;

/* compiled from: RNAdsAppOpenAdModule.kt */
/* loaded from: classes3.dex */
public final class RNAdsAppOpenAdModule extends RNAdsReactContextBaseModule implements o, RNAdsFullScreenAdListener {
    private static final Bundle ANALYTICS_COMMON_PARAMS;
    public static final Companion Companion = new Companion(null);
    private static final long EXPIRED_MS = 14400000;
    private static final String TAG = "RNAdsAppOpenAd";
    private Object appOpenAd;
    private boolean isLoadingAd;
    private boolean isShowingAd;
    private long loadTime;
    private String mAdUnitId;
    private final RNAdsAppOpenAd<?> mAppOpenAd;
    private long readyToShowTimes;
    private i1 reloadJob;
    private int retryTimes;

    /* compiled from: RNAdsAppOpenAdModule.kt */
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
        bundle.putString("item_category", "switchToForeground");
        bundle.putString("error_code", "");
        bundle.putString("Item_name", "openAd");
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        ANALYTICS_COMMON_PARAMS = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsAppOpenAdModule(ReactApplicationContext reactApplicationContext, RNAdsAppOpenAd<?> rNAdsAppOpenAd) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        k.f(rNAdsAppOpenAd, "mAppOpenAd");
        this.mAppOpenAd = rNAdsAppOpenAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelRelLoadSchedule() {
        i1 i1Var = this.reloadJob;
        if (i1Var != null) {
            i1.a.a(i1Var, null, 1, null);
        }
        this.reloadJob = null;
    }

    private final boolean isAdAvailable() {
        return this.appOpenAd != null && wasLoadTimeLessThan4HoursAgo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAd() {
        if (this.isLoadingAd || isAdAvailable()) {
            return;
        }
        this.isLoadingAd = true;
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.b(), null, new RNAdsAppOpenAdModule$loadAd$1(this, null), 2, null);
    }

    private final void scheduleReload() {
        int i10 = this.retryTimes;
        if (i10 == 5) {
            return;
        }
        this.retryTimes = i10 + 1;
        e0 scope = getScope();
        this.reloadJob = scope != null ? e.b(scope, s0.b(), null, new RNAdsAppOpenAdModule$scheduleReload$1(this, null), 2, null) : null;
    }

    private final void showAdIfAvailable() {
        e0 scope;
        if (this.isShowingAd) {
            return;
        }
        if (!isAdAvailable()) {
            loadAd();
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (scope = getScope()) == null) {
            return;
        }
        e.b(scope, s0.c(), null, new RNAdsAppOpenAdModule$showAdIfAvailable$1$1(this, currentActivity, null), 2, null);
    }

    private final boolean wasLoadTimeLessThan4HoursAgo() {
        return System.currentTimeMillis() - this.loadTime < EXPIRED_MS;
    }

    @ReactMethod
    public final void disable() {
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.c(), null, new RNAdsAppOpenAdModule$disable$1(this, null), 2, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void init(String str) {
        k.f(str, "adUnitId");
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        e.b(scope, s0.c(), null, new RNAdsAppOpenAdModule$init$1(this, str, null), 2, null);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdClicked() {
        logEvent("oads_clk", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdDismissed() {
        this.appOpenAd = null;
        this.isShowingAd = false;
        loadAd();
        logEvent("oads_close", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToLoad(String str) {
        k.f(str, "cause");
        this.isLoadingAd = false;
        scheduleReload();
        Bundle bundle = new Bundle();
        bundle.putString("item_category", "switchToForeground");
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "error_code", str);
        bundle.putString("Item_name", "openAd");
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        u uVar = u.f29813a;
        logEvent("oads_failed", bundle);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdFailedToShow(String str) {
        k.f(str, "cause");
        this.appOpenAd = null;
        this.isShowingAd = false;
        loadAd();
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdLoaded(Object obj) {
        k.f(obj, "ad");
        this.appOpenAd = obj;
        this.isLoadingAd = false;
        this.retryTimes = 0;
        this.loadTime = System.currentTimeMillis();
        logEvent("oads_loaded", ANALYTICS_COMMON_PARAMS);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsFullScreenAdListener
    public void onAdShowed() {
        logEvent("oads_imp", ANALYTICS_COMMON_PARAMS);
    }

    @y(i.b.ON_START)
    public final void onStart() {
        showAdIfAvailable();
    }
}
