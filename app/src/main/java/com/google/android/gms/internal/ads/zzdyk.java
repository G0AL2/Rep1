package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyk implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    public zzdyk(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6, zzgrh zzgrhVar7, zzgrh zzgrhVar8, zzgrh zzgrhVar9, zzgrh zzgrhVar10) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
        this.zzg = zzgrhVar7;
        this.zzh = zzgrhVar8;
        this.zzi = zzgrhVar9;
        this.zzj = zzgrhVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.zza.zzb();
        Context zza = ((zzcnl) this.zzb).zza();
        WeakReference zza2 = ((zzcnm) this.zzc).zza();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzdyj(executor, zza, zza2, zzfvmVar, (zzduc) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdwq) this.zzg.zzb(), ((zzcnv) this.zzh).zza(), ((zzdil) this.zzi).zzb(), (zzfhu) this.zzj.zzb());
    }
}
