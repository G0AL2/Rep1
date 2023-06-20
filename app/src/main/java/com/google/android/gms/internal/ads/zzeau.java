package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeau implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;

    public zzeau(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6, zzgrh zzgrhVar7, zzgrh zzgrhVar8) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
        this.zzg = zzgrhVar7;
        this.zzh = zzgrhVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzeat zzb() {
        zzcnf zzcnfVar = (zzcnf) this.zza.zzb();
        Context zza = ((zzcnl) this.zzb).zza();
        zzcfo zza2 = ((zzcnv) this.zzc).zza();
        zzfcd zza3 = ((zzdbk) this.zzd).zza();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzeat(zzcnfVar, zza, zza2, zza3, zzfvmVar, (String) this.zzf.zzb(), (zzfhs) this.zzg.zzb(), (zzdwc) this.zzh.zzb());
    }
}
