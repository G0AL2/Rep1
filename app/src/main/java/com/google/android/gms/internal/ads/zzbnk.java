package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnk extends zzbmu {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbnk(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
