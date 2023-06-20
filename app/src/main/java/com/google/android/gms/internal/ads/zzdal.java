package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdal implements zzdeo {
    private final Context zza;
    private final zzfcd zzb;
    private final zzcfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdyj zze;
    private final zzfhu zzf;

    public zzdal(Context context, zzfcd zzfcdVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdyj zzdyjVar, zzfhu zzfhuVar) {
        this.zza = context;
        this.zzb = zzfcdVar;
        this.zzc = zzcfoVar;
        this.zzd = zzgVar;
        this.zze = zzdyjVar;
        this.zzf = zzfhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzda)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
