package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class b extends AdListener implements AppEventListener, zza {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f20478a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final MediationBannerListener f20479b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f20478a = abstractAdViewAdapter;
        this.f20479b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f20479b.onAdClicked(this.f20478a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f20479b.onAdClosed(this.f20478a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f20479b.onAdFailedToLoad(this.f20478a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f20479b.onAdLoaded(this.f20478a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f20479b.onAdOpened(this.f20478a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f20479b.zzd(this.f20478a, str, str2);
    }
}
