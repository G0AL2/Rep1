package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.common.b;
import java.util.List;

/* loaded from: classes.dex */
public interface TTAdNative {

    /* loaded from: classes.dex */
    public interface AppOpenAdListener extends b {
        void onAppOpenAdLoaded(TTAppOpenAd tTAppOpenAd);

        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface BannerAdListener extends b {
        void onBannerAdLoad(TTBannerAd tTBannerAd);

        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);
    }

    /* loaded from: classes.dex */
    public interface FeedAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onFeedAdLoad(List<TTFeedAd> list);
    }

    /* loaded from: classes.dex */
    public interface FullScreenVideoAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd);

        void onFullScreenVideoCached();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface InteractionAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onInteractionAdLoad(TTInteractionAd tTInteractionAd);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface NativeAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onNativeAdLoad(List<TTNativeAd> list);
    }

    /* loaded from: classes.dex */
    public interface NativeExpressAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onNativeExpressAdLoad(List<TTNativeExpressAd> list);
    }

    /* loaded from: classes.dex */
    public interface RewardVideoAdListener extends b {
        @Override // com.bytedance.sdk.openadsdk.common.b
        void onError(int i10, String str);

        void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd);

        void onRewardVideoCached();
    }

    void loadAppOpenAd(AdSlot adSlot, AppOpenAdListener appOpenAdListener, int i10);

    void loadBannerExpressAd(AdSlot adSlot, NativeExpressAdListener nativeExpressAdListener);

    void loadFeedAd(AdSlot adSlot, FeedAdListener feedAdListener);

    void loadFullScreenVideoAd(AdSlot adSlot, FullScreenVideoAdListener fullScreenVideoAdListener);

    @Deprecated
    void loadNativeAd(AdSlot adSlot, NativeAdListener nativeAdListener);

    void loadRewardVideoAd(AdSlot adSlot, RewardVideoAdListener rewardVideoAdListener);
}
