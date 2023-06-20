package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzafa implements zzafg {
    private final zzze zza;
    private final zzzd zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzafa(zzze zzzeVar, zzzd zzzdVar) {
        this.zza = zzzeVar;
        this.zzb = zzzdVar;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final long zzd(zzys zzysVar) {
        long j10 = this.zzd;
        if (j10 >= 0) {
            this.zzd = -1L;
            return -(j10 + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final zzzu zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzzc(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeg.zzd(jArr, j10, true, true)];
    }
}
