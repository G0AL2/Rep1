package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzads implements zzadq {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzads(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzads zza(long j10, long j11, zzzk zzzkVar, zzdy zzdyVar) {
        int zzn;
        int i10 = zzzkVar.zzg;
        int i11 = zzzkVar.zzd;
        int zze = zzdyVar.zze();
        if ((zze & 1) != 1 || (zzn = zzdyVar.zzn()) == 0) {
            return null;
        }
        long zzw = zzeg.zzw(zzn, i10 * 1000000, i11);
        if ((zze & 6) != 6) {
            return new zzads(j11, zzzkVar.zzc, zzw, -1L, null);
        }
        long zzs = zzdyVar.zzs();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = zzdyVar.zzk();
        }
        if (j10 != -1) {
            long j12 = j11 + zzs;
            if (j10 != j12) {
                Log.w("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new zzads(j11, zzzkVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j10) {
        long j11 = j10 - this.zza;
        if (!zzh() || j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzcw.zzb(this.zzf);
        double d10 = (j11 * 256.0d) / this.zzd;
        int zzd = zzeg.zzd(jArr, (long) d10, true, true);
        long zzd2 = zzd(zzd);
        long j12 = jArr[zzd];
        int i10 = zzd + 1;
        long zzd3 = zzd(i10);
        long j13 = zzd == 99 ? 256L : jArr[i10];
        return zzd2 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (zzd3 - zzd2));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        long[] jArr;
        if (!zzh()) {
            zzzv zzzvVar = new zzzv(0L, this.zza + this.zzb);
            return new zzzs(zzzvVar, zzzvVar);
        }
        long zzr = zzeg.zzr(j10, 0L, this.zzc);
        double d10 = (zzr * 100.0d) / this.zzc;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) zzcw.zzb(this.zzf))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        zzzv zzzvVar2 = new zzzv(zzr, this.zza + zzeg.zzr(Math.round((d11 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzzs(zzzvVar2, zzzvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zzf != null;
    }
}
