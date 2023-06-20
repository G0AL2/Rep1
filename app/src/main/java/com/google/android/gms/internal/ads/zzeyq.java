package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyq implements zzeza {
    private final zzeza zza;
    private zzdbc zzb;

    public zzeyq(zzeza zzezaVar) {
        this.zza = zzezaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zzb;
    }

    public final synchronized zzfvl zzb(zzezb zzezbVar, zzeyz zzeyzVar, zzdbc zzdbcVar) {
        this.zzb = zzdbcVar;
        if (zzezbVar.zza != null) {
            zzcza zzb = zzdbcVar.zzb();
            return zzb.zzh(zzb.zzj(zzfvc.zzi(zzezbVar.zza)));
        }
        return ((zzeyp) this.zza).zzb(zzezbVar, zzeyzVar, zzdbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezbVar, zzeyz zzeyzVar, Object obj) {
        return zzb(zzezbVar, zzeyzVar, null);
    }
}
