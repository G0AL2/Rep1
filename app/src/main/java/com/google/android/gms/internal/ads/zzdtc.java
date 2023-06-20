package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtc implements zzgqu {
    private final zzgrh zza;

    public zzdtc(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdbk) this.zza).zza().zzo.zza == 3 ? "rewarded_interstitial" : RNAdsEvents.EVENT_REWARDED;
    }
}
