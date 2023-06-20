package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzein extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzdhf zzc;

    public zzein(zzcnf zzcnfVar, zzdbd zzdbdVar, zzdhf zzdhfVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbdVar;
        this.zzc = zzdhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeii
    protected final zzfvl zzc(zzfcd zzfcdVar, Bundle bundle) {
        zzdsx zzi = this.zza.zzi();
        zzdbd zzdbdVar = this.zzb;
        zzdbdVar.zzf(zzfcdVar);
        zzdbdVar.zzd(bundle);
        zzi.zzd(zzdbdVar.zzg());
        zzi.zzc(this.zzc);
        zzcza zzb = zzi.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}
