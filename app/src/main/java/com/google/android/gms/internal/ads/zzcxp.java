package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxp {
    private final zzdei zza;
    private final zzdgo zzb;

    public zzcxp(zzdei zzdeiVar, zzdgo zzdgoVar) {
        this.zza = zzdeiVar;
        this.zzb = zzdgoVar;
    }

    public final zzdei zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdgo zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdiz zzc() {
        zzdgo zzdgoVar = this.zzb;
        return zzdgoVar != null ? new zzdiz(zzdgoVar, zzcfv.zzf) : new zzdiz(new zzcxo(this), zzcfv.zzf);
    }
}
