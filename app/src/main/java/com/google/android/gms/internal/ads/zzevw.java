package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevw implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;

    public zzevw(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcer zzcerVar = (zzcer) this.zza.zzb();
        boolean booleanValue = ((zzevn) this.zzb).zzb().booleanValue();
        zzceg zzcegVar = new zzceg();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzevu(zzcerVar, booleanValue, zzcegVar, zzfvmVar, ((zzevl) this.zze).zza(), (ScheduledExecutorService) this.zzf.zzb(), null);
    }
}
