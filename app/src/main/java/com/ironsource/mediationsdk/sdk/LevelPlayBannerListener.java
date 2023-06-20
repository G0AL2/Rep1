package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public interface LevelPlayBannerListener {
    void onAdClicked(AdInfo adInfo);

    void onAdLeftApplication(AdInfo adInfo);

    void onAdLoadFailed(IronSourceError ironSourceError);

    void onAdLoaded(AdInfo adInfo);

    void onAdScreenDismissed(AdInfo adInfo);

    void onAdScreenPresented(AdInfo adInfo);
}
