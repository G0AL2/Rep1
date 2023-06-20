package com.vehiclecloud.app.videofetch.rnads.api;

/* loaded from: classes3.dex */
public interface RNAdsFullScreenAdListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToLoad(String str);

    void onAdFailedToShow(String str);

    void onAdLoaded(Object obj);

    void onAdShowed();
}
