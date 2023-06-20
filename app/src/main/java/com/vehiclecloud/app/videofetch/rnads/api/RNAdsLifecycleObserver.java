package com.vehiclecloud.app.videofetch.rnads.api;

import android.app.Activity;

/* loaded from: classes3.dex */
public interface RNAdsLifecycleObserver {
    void onCreate(Activity activity);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onStop(Activity activity);
}
