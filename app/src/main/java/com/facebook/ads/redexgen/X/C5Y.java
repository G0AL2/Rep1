package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5Y implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C5Y(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad2) {
        this.A00.onAdClicked(ad2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad2) {
        this.A00.onAdLoaded(ad2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
        this.A00.onError(ad2, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
        this.A00.onLoggingImpression(ad2);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) rewardedInterstitialAdListener).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
