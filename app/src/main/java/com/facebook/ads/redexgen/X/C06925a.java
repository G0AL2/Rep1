package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;

/* renamed from: com.facebook.ads.redexgen.X.5a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06925a implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C06955d A00;

    public C06925a(C06955d c06955d) {
        this.A00 = c06955d;
    }

    public final C06955d A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i10) {
        this.A00.withAppOrientation(i10);
        return this;
    }
}
