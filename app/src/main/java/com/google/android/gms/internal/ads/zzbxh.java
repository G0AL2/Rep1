package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxh extends zzbmo {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbxh(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze(zzbmy zzbmyVar) {
        this.zza.onNativeAdLoaded(new zzbxa(zzbmyVar));
    }
}
