package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcqd implements zzdxq {
    private final Context zza;
    private final zzbph zzb;
    private final zzcop zzc;
    private final zzcqd zzd = this;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqd(zzcop zzcopVar, Context context, zzbph zzbphVar, zzcqc zzcqcVar) {
        this.zzc = zzcopVar;
        this.zza = context;
        this.zzb = zzbphVar;
        zzgqu zza = zzgqv.zza(this);
        this.zze = zza;
        zzgqu zza2 = zzgqv.zza(zzbphVar);
        this.zzf = zza2;
        zzdxm zzdxmVar = new zzdxm(zza2);
        this.zzg = zzdxmVar;
        this.zzh = zzgqt.zzc(new zzdxo(zza, zzdxmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdxq
    public final zzdxh zzb() {
        return new zzcpx(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdxq
    public final zzdxn zzd() {
        return (zzdxn) this.zzh.zzb();
    }
}
