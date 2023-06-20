package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeym implements zzeza {
    private final zzfdo zza;
    private final Executor zzb;
    private final zzfuy zzc = new zzeyk(this);

    public zzeym(zzfdo zzfdoVar, Executor executor) {
        this.zza = zzfdoVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzdbc zzdbcVar, zzeyv zzeyvVar) throws Exception {
        zzfdy zzfdyVar = zzeyvVar.zzb;
        zzbzv zzbzvVar = zzeyvVar.zza;
        zzfdx zzb = zzfdyVar != null ? this.zza.zzb(zzfdyVar) : null;
        if (zzfdyVar == null) {
            return zzfvc.zzi(null);
        }
        if (zzb != null && zzbzvVar != null) {
            zzfvc.zzr(zzdbcVar.zzb().zzg(zzbzvVar), this.zzc, this.zzb);
        }
        return zzfvc.zzi(new zzeyl(zzfdyVar, zzbzvVar, zzb));
    }

    public final zzfvl zzb(zzezb zzezbVar, zzeyz zzeyzVar, final zzdbc zzdbcVar) {
        return zzfvc.zzf(zzfvc.zzn(zzfut.zzv(new zzeyw(this.zza, zzdbcVar, this.zzb).zzc()), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeyi
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeym.this.zza(zzdbcVar, (zzeyv) obj);
            }
        }, this.zzb), Exception.class, new zzeyj(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezbVar, zzeyz zzeyzVar, Object obj) {
        return zzb(zzezbVar, zzeyzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
