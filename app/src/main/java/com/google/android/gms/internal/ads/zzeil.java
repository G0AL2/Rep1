package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeil extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzekr zzc;
    private final zzdhf zzd;

    public zzeil(zzcnf zzcnfVar, zzdbd zzdbdVar, zzekr zzekrVar, zzdhf zzdhfVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbdVar;
        this.zzc = zzekrVar;
        this.zzd = zzdhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeii
    protected final zzfvl zzc(zzfcd zzfcdVar, Bundle bundle) {
        zzdkx zzg = this.zza.zzg();
        zzdbd zzdbdVar = this.zzb;
        zzdbdVar.zzf(zzfcdVar);
        zzdbdVar.zzd(bundle);
        zzg.zze(zzdbdVar.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcza zza = zzg.zzf().zza();
        return zza.zzh(zza.zzi());
    }
}
