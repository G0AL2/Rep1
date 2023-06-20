package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdoi implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;

    public zzdoi(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6, zzgrh zzgrhVar7, zzgrh zzgrhVar8, zzgrh zzgrhVar9) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
        this.zzg = zzgrhVar7;
        this.zzh = zzgrhVar8;
        this.zzi = zzgrhVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzdoh zzb() {
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzdoh(((zzcnj) this.zza).zzb(), ((zzdbk) this.zzb).zza(), (zzdnm) this.zzc.zzb(), ((zzdoa) this.zzd).zza(), (zzdos) this.zze.zzb(), (zzdpa) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzfvmVar, (zzdne) this.zzi.zzb());
    }
}
