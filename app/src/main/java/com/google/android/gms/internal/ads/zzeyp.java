package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyp implements zzeza {
    private zzdbc zza;

    @Override // com.google.android.gms.internal.ads.zzeza
    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zza;
    }

    public final synchronized zzfvl zzb(zzezb zzezbVar, zzeyz zzeyzVar, zzdbc zzdbcVar) {
        zzcza zzb;
        if (zzdbcVar != null) {
            this.zza = zzdbcVar;
        } else {
            this.zza = (zzdbc) zzeyzVar.zza(zzezbVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezbVar, zzeyz zzeyzVar, Object obj) {
        return zzb(zzezbVar, zzeyzVar, null);
    }
}
