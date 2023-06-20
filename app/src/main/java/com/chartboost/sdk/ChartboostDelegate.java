package com.chartboost.sdk;

import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public abstract class ChartboostDelegate implements com.chartboost.sdk.impl.a {
    @Deprecated
    public void didCacheInPlay(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCacheInterstitial(String str) {
    }

    @Deprecated
    public void didCacheMoreApps(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCacheRewardedVideo(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didClickInterstitial(String str) {
    }

    @Deprecated
    public void didClickMoreApps(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didClickRewardedVideo(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCloseInterstitial(String str) {
    }

    @Deprecated
    public void didCloseMoreApps(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCloseRewardedVideo(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCompleteInterstitial(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didCompleteRewardedVideo(String str, int i10) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didDismissInterstitial(String str) {
    }

    @Deprecated
    public void didDismissMoreApps(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didDismissRewardedVideo(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didDisplayInterstitial(String str) {
    }

    @Deprecated
    public void didDisplayMoreApps(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didDisplayRewardedVideo(String str) {
    }

    @Deprecated
    public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
    }

    @Override // com.chartboost.sdk.impl.a
    @Deprecated
    public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void didInitialize() {
    }

    @Override // com.chartboost.sdk.impl.a
    public boolean shouldDisplayInterstitial(String str) {
        return true;
    }

    @Deprecated
    public boolean shouldDisplayMoreApps(String str) {
        return true;
    }

    @Override // com.chartboost.sdk.impl.a
    public boolean shouldDisplayRewardedVideo(String str) {
        return true;
    }

    @Override // com.chartboost.sdk.impl.a
    public boolean shouldRequestInterstitial(String str) {
        return true;
    }

    @Deprecated
    public boolean shouldRequestMoreApps(String str) {
        return true;
    }

    @Override // com.chartboost.sdk.impl.a
    public void willDisplayInterstitial(String str) {
    }

    @Override // com.chartboost.sdk.impl.a
    public void willDisplayVideo(String str) {
    }
}
