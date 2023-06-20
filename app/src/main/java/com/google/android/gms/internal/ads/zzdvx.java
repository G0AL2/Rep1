package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdvx implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdvx(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwk zzdwkVar = (zzdwk) this.zza.zzb();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? new zzdiz((zzedf) this.zzc.zzb(), zzfvmVar) : new zzdiz(zzdwkVar, zzfvmVar);
    }
}
