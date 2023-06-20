package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzaas {
    protected final zzzy zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaas(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    protected abstract boolean zza(zzdy zzdyVar) throws zzbp;

    protected abstract boolean zzb(zzdy zzdyVar, long j10) throws zzbp;

    public final boolean zzf(zzdy zzdyVar, long j10) throws zzbp {
        return zza(zzdyVar) && zzb(zzdyVar, j10);
    }
}
