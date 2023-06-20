package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsLifecycleObserver;

/* loaded from: classes3.dex */
public class RNAdsLifecycleManager {
    static RNAdsNativeAdLoader mNativeAdLoader;
    private static RNAdsLifecycleObserver mObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init(RNAdsLifecycleObserver rNAdsLifecycleObserver) {
        mObserver = rNAdsLifecycleObserver;
    }

    public static void onCreate(Activity activity) {
        RNAdsLifecycleObserver rNAdsLifecycleObserver = mObserver;
        if (rNAdsLifecycleObserver != null) {
            rNAdsLifecycleObserver.onCreate(activity);
        }
    }

    public static void onDestroy() {
        RNAdsNativeAdLoader rNAdsNativeAdLoader = mNativeAdLoader;
        if (rNAdsNativeAdLoader != null) {
            rNAdsNativeAdLoader.destroy();
        }
    }

    public static void onPause(Activity activity) {
        RNAdsLifecycleObserver rNAdsLifecycleObserver = mObserver;
        if (rNAdsLifecycleObserver != null) {
            rNAdsLifecycleObserver.onPause(activity);
        }
    }

    public static void onResume(Activity activity) {
        RNAdsLifecycleObserver rNAdsLifecycleObserver = mObserver;
        if (rNAdsLifecycleObserver != null) {
            rNAdsLifecycleObserver.onResume(activity);
        }
    }

    public static void onStop(Activity activity) {
        RNAdsLifecycleObserver rNAdsLifecycleObserver = mObserver;
        if (rNAdsLifecycleObserver != null) {
            rNAdsLifecycleObserver.onStop(activity);
        }
    }
}
