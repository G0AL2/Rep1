package com.vehiclecloud.app.videofetch.rnads.api;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes3.dex */
public interface RNAdsReward<T> {

    /* loaded from: classes3.dex */
    public interface Listener extends RNAdsFullScreenAdListener {
        void onUserEarnedReward();
    }

    void load(ReactApplicationContext reactApplicationContext, String str, Listener listener);

    void show(Activity activity, Listener listener, T t10);

    void showByObject(Activity activity, Listener listener, Object obj);
}
