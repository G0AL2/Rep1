package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtp {
    private final zzclu zza;
    private final Context zzb;
    private final zzaoc zzc;
    private final zzbiy zzd;
    private final zzcfo zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzbdm zzg;
    private final zzdei zzh;

    public zzdtp(zzclu zzcluVar, Context context, zzaoc zzaocVar, zzbiy zzbiyVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, zzdei zzdeiVar) {
        this.zza = zzcluVar;
        this.zzb = context;
        this.zzc = zzaocVar;
        this.zzd = zzbiyVar;
        this.zze = zzcfoVar;
        this.zzf = zzaVar;
        this.zzg = zzbdmVar;
        this.zzh = zzdeiVar;
    }

    public final zzcli zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbl zzfblVar, zzfbo zzfboVar) throws zzclt {
        return zzclu.zza(this.zzb, zzcmx.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdte(this), this.zzf, this.zzg, zzfblVar, zzfboVar);
    }
}
