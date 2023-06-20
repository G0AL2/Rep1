package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class e extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f20502a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final MediationNativeListener f20503b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f20502a = abstractAdViewAdapter;
        this.f20503b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f20503b.onAdClicked(this.f20502a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f20503b.onAdClosed(this.f20502a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f20503b.onAdFailedToLoad(this.f20502a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f20503b.onAdImpression(this.f20502a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f20503b.onAdOpened(this.f20502a);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f20503b.zze(this.f20502a, nativeCustomTemplateAd, str);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f20503b.zzc(this.f20502a, nativeCustomTemplateAd);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f20503b.onAdLoaded(this.f20502a, new a(unifiedNativeAd));
    }
}
