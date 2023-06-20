package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdah implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdah(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvq zzdvqVar = (zzdvq) this.zza.zzb();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? new zzdiz((zzecw) this.zzc.zzb(), zzfvmVar) : new zzdiz(zzdvqVar, zzfvmVar);
    }
}
