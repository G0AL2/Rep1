package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzecy implements zzdeo, zzddh, zzdbw {
    private final zzfgo zza;
    private final zzfgp zzb;
    private final zzcev zzc;

    public zzecy(zzfgo zzfgoVar, zzfgp zzfgpVar, zzcev zzcevVar) {
        this.zza = zzfgoVar;
        this.zzb = zzfgpVar;
        this.zzc = zzcevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgo zzfgoVar = this.zza;
        zzfgoVar.zza("action", "ftl");
        zzfgoVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfgoVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        this.zza.zzh(zzfbxVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
        this.zza.zzi(zzbzvVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzfgp zzfgpVar = this.zzb;
        zzfgo zzfgoVar = this.zza;
        zzfgoVar.zza("action", RNAdsEvents.EVENT_LOADED);
        zzfgpVar.zzb(zzfgoVar);
    }
}
