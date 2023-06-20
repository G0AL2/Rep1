package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class c extends InterstitialAdLoadCallback {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f20480a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f20481b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f20480a = abstractAdViewAdapter;
        this.f20481b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f20481b.onAdFailedToLoad(this.f20480a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f20480a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.f20481b));
        this.f20481b.onAdLoaded(this.f20480a);
    }
}
