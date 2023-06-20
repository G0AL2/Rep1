package com.vehiclecloud.app.videofetch.rnads.api;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes3.dex */
public interface RNAdsNative<T> {

    /* loaded from: classes3.dex */
    public interface Listener {
        void onAdClicked();

        void onAdFailedToLoad(String str);

        void onAdImpression();

        void onAdLoaded(Object obj);
    }

    void destroy(T t10);

    void destroyByObject(Object obj);

    View inflateAdView(Activity activity, T t10, int i10, int i11);

    View inflateAdViewByObject(Activity activity, Object obj, int i10, int i11);

    void loadAd(ReactApplicationContext reactApplicationContext, String str, int i10, Listener listener);
}
