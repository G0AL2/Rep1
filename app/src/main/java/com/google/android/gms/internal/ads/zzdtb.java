package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtb implements zzgqu {
    private final zzgrh zza;

    public zzdtb(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdw zzbdwVar;
        if (((zzdbk) this.zza).zza().zzo.zza == 3) {
            zzbdwVar = zzbdw.REWARDED_INTERSTITIAL;
        } else {
            zzbdwVar = zzbdw.REWARD_BASED_VIDEO_AD;
        }
        zzgrc.zzb(zzbdwVar);
        return zzbdwVar;
    }
}
