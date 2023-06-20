package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxi extends zzbmu {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbxi(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
