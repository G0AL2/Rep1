package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeij extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzekr zzc;
    private final zzdhf zzd;
    private final zzdlp zze;
    private final zzdei zzf;
    private final ViewGroup zzg;
    private final zzdgo zzh;

    public zzeij(zzcnf zzcnfVar, zzdbd zzdbdVar, zzekr zzekrVar, zzdhf zzdhfVar, zzdlp zzdlpVar, zzdei zzdeiVar, ViewGroup viewGroup, zzdgo zzdgoVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbdVar;
        this.zzc = zzekrVar;
        this.zzd = zzdhfVar;
        this.zze = zzdlpVar;
        this.zzf = zzdeiVar;
        this.zzg = viewGroup;
        this.zzh = zzdgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeii
    protected final zzfvl zzc(zzfcd zzfcdVar, Bundle bundle) {
        zzcwr zze = this.zza.zze();
        zzdbd zzdbdVar = this.zzb;
        zzdbdVar.zzf(zzfcdVar);
        zzdbdVar.zzd(bundle);
        zze.zzi(zzdbdVar.zzg());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcxp(this.zzf, this.zzh));
        zze.zzc(new zzcvs(this.zzg));
        zzcza zzd = zze.zzj().zzd();
        return zzd.zzh(zzd.zzi());
    }
}
