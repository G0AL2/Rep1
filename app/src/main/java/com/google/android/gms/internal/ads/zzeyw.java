package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeyw {
    private final zzfdo zza;
    private final zzdbc zzb;
    private final Executor zzc;
    private zzeyv zzd;

    public zzeyw(zzfdo zzfdoVar, zzdbc zzdbcVar, Executor executor) {
        this.zza = zzfdoVar;
        this.zzb = zzdbcVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfdy zze() {
        zzfcd zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfvl zzc() {
        zzfvl zzf;
        zzeyv zzeyvVar = this.zzd;
        if (zzeyvVar == null) {
            if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
                zzeyv zzeyvVar2 = new zzeyv(null, zze(), null);
                this.zzd = zzeyvVar2;
                zzf = zzfvc.zzi(zzeyvVar2);
            } else {
                zzf = zzfvc.zzf(zzfvc.zzm(zzfut.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzeyt(this), this.zzc), zzebn.class, new zzeys(this), this.zzc);
            }
            return zzfvc.zzm(zzf, new zzfok() { // from class: com.google.android.gms.internal.ads.zzeyr
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    return (zzeyv) obj;
                }
            }, this.zzc);
        }
        return zzfvc.zzi(zzeyvVar);
    }
}
