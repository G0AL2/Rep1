package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class d extends FullScreenContentCallback {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f20500a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f20501b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f20500a = abstractAdViewAdapter;
        this.f20501b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f20501b.onAdClosed(this.f20500a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f20501b.onAdOpened(this.f20500a);
    }
}
