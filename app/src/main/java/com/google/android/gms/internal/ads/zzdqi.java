package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdqi implements zzgqu {
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
    private final zzgrh zzk;
    private final zzgrh zzl;
    private final zzgrh zzm;
    private final zzgrh zzn;
    private final zzgrh zzo;
    private final zzgrh zzp;

    public zzdqi(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6, zzgrh zzgrhVar7, zzgrh zzgrhVar8, zzgrh zzgrhVar9, zzgrh zzgrhVar10, zzgrh zzgrhVar11, zzgrh zzgrhVar12, zzgrh zzgrhVar13, zzgrh zzgrhVar14, zzgrh zzgrhVar15, zzgrh zzgrhVar16) {
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
        this.zzk = zzgrhVar11;
        this.zzl = zzgrhVar12;
        this.zzm = zzgrhVar13;
        this.zzn = zzgrhVar14;
        this.zzo = zzgrhVar15;
        this.zzp = zzgrhVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzdqh zzb() {
        Context context = (Context) this.zza.zzb();
        zzdpq zzdpqVar = (zzdpq) this.zzb.zzb();
        zzaoc zzaocVar = (zzaoc) this.zzc.zzb();
        zzcfo zza = ((zzcnv) this.zzd).zza();
        com.google.android.gms.ads.internal.zza zza2 = com.google.android.gms.ads.internal.zza.zza();
        zzbdm zzbdmVar = (zzbdm) this.zzf.zzb();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzdqh(context, zzdpqVar, zzaocVar, zza, zza2, zzbdmVar, zzfvmVar, ((zzdbk) this.zzh).zza(), (zzdqz) this.zzi.zzb(), (zzdtp) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzdwh) this.zzl.zzb(), (zzfgp) this.zzm.zzb(), (zzfii) this.zzn.zzb(), (zzees) this.zzo.zzb(), (zzdsk) this.zzp.zzb());
    }
}
