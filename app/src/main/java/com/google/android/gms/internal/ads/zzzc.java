package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzc implements zzzu {
    private final zzze zza;
    private final long zzb;

    public zzzc(zzze zzzeVar, long j10) {
        this.zza = zzzeVar;
        this.zzb = j10;
    }

    private final zzzv zza(long j10, long j11) {
        return new zzzv((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        zzcw.zzb(this.zza.zzk);
        zzze zzzeVar = this.zza;
        zzzd zzzdVar = zzzeVar.zzk;
        long[] jArr = zzzdVar.zza;
        long[] jArr2 = zzzdVar.zzb;
        int zzd = zzeg.zzd(jArr, zzzeVar.zzb(j10), true, false);
        zzzv zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb != j10 && zzd != jArr.length - 1) {
            int i10 = zzd + 1;
            return new zzzs(zza, zza(jArr[i10], jArr2[i10]));
        }
        return new zzzs(zza, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
