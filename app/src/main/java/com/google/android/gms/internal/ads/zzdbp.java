package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbp implements zzgqu {
    private final zzdbo zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdbp(zzdbo zzdboVar, zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4) {
        this.zza = zzdboVar;
        this.zzb = zzgrhVar;
        this.zzc = zzgrhVar2;
        this.zzd = zzgrhVar3;
        this.zze = zzgrhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcfo zza = ((zzcnv) this.zzc).zza();
        zzfbl zza2 = ((zzcyn) this.zzd).zza();
        zzccf zzccfVar = new zzccf();
        if (zza2.zzB != null) {
            return new zzcce(context, zza, zza2.zzB, zza2.zzt.zzb, zzccfVar, null);
        }
        return null;
    }
}
