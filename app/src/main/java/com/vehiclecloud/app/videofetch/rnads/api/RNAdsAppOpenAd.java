package com.vehiclecloud.app.videofetch.rnads.api;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes3.dex */
public interface RNAdsAppOpenAd<T> {
    void load(ReactApplicationContext reactApplicationContext, String str, RNAdsFullScreenAdListener rNAdsFullScreenAdListener);

    void show(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, T t10);

    void showByObject(Activity activity, RNAdsFullScreenAdListener rNAdsFullScreenAdListener, Object obj);
}
