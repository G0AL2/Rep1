package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcoe implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcoe(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzcag zzb() {
        Context zza = ((zzcnl) this.zza).zza();
        zzfhu zzfhuVar = (zzfhu) this.zzb.zzb();
        zzbta zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcfo.zza(), zzfhuVar);
        zzbsu zzbsuVar = zzbsx.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbsuVar, zzbsuVar);
        return new zzcaf(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcfo.zza(), zzfhuVar).zza("google.afma.sdkConstants.getSdkConstants", zzbsuVar, zzbsuVar));
    }
}
