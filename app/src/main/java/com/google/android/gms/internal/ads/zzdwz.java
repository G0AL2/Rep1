package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdwz implements zzgqu {
    private final zzdwu zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdwz(zzdwu zzdwuVar, zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzdwuVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        Set zze = zzdwu.zze((zzdxe) this.zzb.zzb(), zzfvmVar);
        zzgrc.zzb(zze);
        return zze;
    }
}
