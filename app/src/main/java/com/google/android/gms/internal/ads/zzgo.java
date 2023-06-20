package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgo {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgo(float f10, float f11, long j10, float f12, long j11, long j12, float f13, zzgn zzgnVar) {
        this.zza = j11;
        this.zzb = j12;
    }

    private static long zzf(long j10, long j11, float f10) {
        return (((float) j10) * 0.999f) + (((float) j11) * 9.999871E-4f);
    }

    private final void zzg() {
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            long j11 = this.zzd;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.zzf;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.zzg;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j10, long j11) {
        long zzr;
        if (this.zzc != -9223372036854775807L) {
            long j12 = j10 - j11;
            long j13 = this.zzm;
            if (j13 == -9223372036854775807L) {
                this.zzm = j12;
                this.zzn = 0L;
            } else {
                long max = Math.max(j12, zzf(j13, j12, 0.999f));
                this.zzm = max;
                this.zzn = zzf(this.zzn, Math.abs(j12 - max), 0.999f);
            }
            if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long j14 = this.zzm + (this.zzn * 3);
            if (this.zzh > j14) {
                float zzv = (float) zzeg.zzv(1000L);
                long[] jArr = {j14, this.zze, this.zzh - (((this.zzk - 1.0f) * zzv) + ((this.zzi - 1.0f) * zzv))};
                zzr = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j15 = jArr[i10];
                    if (j15 > zzr) {
                        zzr = j15;
                    }
                }
                this.zzh = zzr;
            } else {
                zzr = zzeg.zzr(j10 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j14);
                this.zzh = zzr;
                long j16 = this.zzg;
                if (j16 != -9223372036854775807L && zzr > j16) {
                    this.zzh = j16;
                    zzr = j16;
                }
            }
            long j17 = j10 - zzr;
            if (Math.abs(j17) < this.zza) {
                this.zzk = 1.0f;
                return 1.0f;
            }
            float zza = zzeg.zza((((float) j17) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
            this.zzk = zza;
            return zza;
        }
        return 1.0f;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzau zzauVar) {
        long j10 = zzauVar.zzc;
        this.zzc = zzeg.zzv(-9223372036854775807L);
        this.zzf = zzeg.zzv(-9223372036854775807L);
        this.zzg = zzeg.zzv(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }
}
