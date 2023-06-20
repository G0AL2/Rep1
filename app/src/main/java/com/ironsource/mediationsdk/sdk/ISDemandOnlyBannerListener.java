package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public interface ISDemandOnlyBannerListener {
    void onBannerAdClicked();

    void onBannerAdLeftApplication();

    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    void onBannerAdLoaded();

    void onBannerAdScreenDismissed();

    void onBannerAdScreenPresented();
}
