package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzyk implements zzzu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzyk(long j10, long j11, int i10, int i11, boolean z10) {
        long zzb;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            zzb = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzb = zzb(j10, j11, i10);
        }
        this.zzf = zzb;
    }

    private static long zzb(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long zza(long j10) {
        return zzb(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        long j11 = this.zzd;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        if (i10 != 0) {
            int i11 = this.zze;
            long j12 = this.zzc;
            long j13 = (((i11 * j10) / 8000000) / j12) * j12;
            if (i10 != 0) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.zzb + Math.max(j13, 0L);
            long zza = zza(max);
            zzzv zzzvVar = new zzzv(zza, max);
            if (this.zzd != -1 && zza < j10) {
                long j14 = max + this.zzc;
                if (j14 < this.zza) {
                    return new zzzs(zzzvVar, new zzzv(zza(j14), j14));
                }
            }
            return new zzzs(zzzvVar, zzzvVar);
        }
        zzzv zzzvVar2 = new zzzv(0L, this.zzb);
        return new zzzs(zzzvVar2, zzzvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
