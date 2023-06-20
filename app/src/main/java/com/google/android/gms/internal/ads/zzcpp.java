package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcpp implements zzexy {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcop zzd;
    private final zzcpp zze = this;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpp(zzcop zzcopVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcpo zzcpoVar) {
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzgrh zzgrhVar3;
        this.zzd = zzcopVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgqu zza = zzgqv.zza(context);
        this.zzf = zza;
        zzgqu zza2 = zzgqv.zza(zzqVar);
        this.zzg = zza2;
        zzgrhVar = zzcopVar.zzo;
        zzgrh zzc = zzgqt.zzc(new zzemi(zzgrhVar));
        this.zzh = zzc;
        zzgrh zzc2 = zzgqt.zzc(zzemn.zza());
        this.zzi = zzc2;
        zzgrh zzc3 = zzgqt.zzc(zzdgq.zza());
        this.zzj = zzc3;
        zzgrhVar2 = zzcopVar.zzp;
        zzgrhVar3 = zzcopVar.zzQ;
        this.zzk = zzgqt.zzc(new zzexw(zza, zzgrhVar2, zza2, zzgrhVar3, zzc, zzc2, zzfcf.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final zzelo zza() {
        zzcni zzcniVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzexv zzexvVar = (zzexv) this.zzk.zzb();
        zzemh zzemhVar = (zzemh) this.zzh.zzb();
        zzcniVar = this.zzd.zza;
        zzcfo zzd = zzcniVar.zzd();
        zzgrc.zzb(zzd);
        return new zzelo(context, zzqVar, str, zzexvVar, zzemhVar, zzd);
    }
}
