package com.vehiclecloud.app.videofetch.rnads.api;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public interface RNAdsIlrd {

    /* loaded from: classes3.dex */
    public interface Uploader {
        void onPaidEvent(String str, double d10);
    }

    String getAdPlatform();

    void init(ReadableMap readableMap, Uploader uploader);
}
