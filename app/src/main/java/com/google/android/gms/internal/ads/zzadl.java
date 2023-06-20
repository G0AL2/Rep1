package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzadl implements zzadq {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzadl(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzeg.zzv(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzadl zza(long j10, zzacf zzacfVar, long j11) {
        int length = zzacfVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzacfVar.zzb + zzacfVar.zzd[i12];
            j12 += zzacfVar.zzc + zzacfVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzadl(jArr, jArr2, j11);
    }

    private static Pair zzd(long j10, long[] jArr, long[] jArr2) {
        int zzd = zzeg.zzd(jArr, j10, true, true);
        long j11 = jArr[zzd];
        long j12 = jArr2[zzd];
        int i10 = zzd + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j10) {
        return zzeg.zzv(((Long) zzd(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        Pair zzd = zzd(zzeg.zzz(zzeg.zzr(j10, 0L, this.zzc)), this.zzb, this.zza);
        long longValue = ((Long) zzd.first).longValue();
        zzzv zzzvVar = new zzzv(zzeg.zzv(longValue), ((Long) zzd.second).longValue());
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
