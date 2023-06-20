package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdvs implements zzdeo, zzddh, zzdbw {
    private final zzdwc zza;
    private final zzdwm zzb;

    public zzdvs(zzdwc zzdwcVar, zzdwm zzdwmVar) {
        this.zza = zzdwcVar;
        this.zzb = zzdwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        this.zza.zzb(zzfbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
        this.zza.zzc(zzbzvVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.zza.zza().put("action", RNAdsEvents.EVENT_LOADED);
        this.zzb.zze(this.zza.zza());
    }
}
