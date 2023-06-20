package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeig extends zzeii {
    private final zzcnf zza;
    private final zzdlp zzb;
    private final zzdbd zzc;
    private final zzdhf zzd;

    public zzeig(zzcnf zzcnfVar, zzdlp zzdlpVar, zzdbd zzdbdVar, zzdhf zzdhfVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdlpVar;
        this.zzc = zzdbdVar;
        this.zzd = zzdhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeii
    protected final zzfvl zzc(zzfcd zzfcdVar, Bundle bundle) {
        zzdlt zzh = this.zza.zzh();
        zzdbd zzdbdVar = this.zzc;
        zzdbdVar.zzf(zzfcdVar);
        zzdbdVar.zzd(bundle);
        zzh.zzf(zzdbdVar.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcvs(null));
        zzcza zza = zzh.zzg().zza();
        return zza.zzh(zza.zzi());
    }
}
