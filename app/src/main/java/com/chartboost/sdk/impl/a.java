package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public interface a {
    void didCacheInterstitial(String str);

    void didCacheRewardedVideo(String str);

    void didClickInterstitial(String str);

    void didClickRewardedVideo(String str);

    void didCloseInterstitial(String str);

    void didCloseRewardedVideo(String str);

    void didCompleteInterstitial(String str);

    void didCompleteRewardedVideo(String str, int i10);

    void didDismissInterstitial(String str);

    void didDismissRewardedVideo(String str);

    void didDisplayInterstitial(String str);

    void didDisplayRewardedVideo(String str);

    void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError);

    @Deprecated
    void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToRecordClick(String str, CBError.CBClickError cBClickError);

    void didInitialize();

    boolean shouldDisplayInterstitial(String str);

    boolean shouldDisplayRewardedVideo(String str);

    boolean shouldRequestInterstitial(String str);

    void willDisplayInterstitial(String str);

    void willDisplayVideo(String str);
}
