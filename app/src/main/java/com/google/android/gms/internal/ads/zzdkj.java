package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdkj implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdkj(zzdkd zzdkdVar, zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4) {
        this.zza = zzdkdVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
        this.zzd = zzgrhVar3;
        this.zze = zzgrhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzcfo zza = ((zzcnv) this.zzc).zza();
        final zzfbl zza2 = ((zzcyn) this.zzd).zza();
        final zzfcd zza3 = ((zzdbk) this.zze).zza();
        return new zzdiz(new zzddh() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzddh
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzcfv.zzf);
    }
}
