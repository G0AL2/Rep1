package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzadr implements zzadq {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzadr(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzadr zza(long j10, long j11, zzzk zzzkVar, zzdy zzdyVar) {
        int zzk;
        zzdyVar.zzG(10);
        int zze = zzdyVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i10 = zzzkVar.zzd;
        long zzw = zzeg.zzw(zze, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int zzo = zzdyVar.zzo();
        int zzo2 = zzdyVar.zzo();
        int zzo3 = zzdyVar.zzo();
        zzdyVar.zzG(2);
        long j12 = j11 + zzzkVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i11 = 0;
        long j13 = j11;
        while (i11 < zzo) {
            int i12 = zzo2;
            long j14 = j12;
            jArr[i11] = (i11 * zzw) / zzo;
            jArr2[i11] = Math.max(j13, j14);
            if (zzo3 == 1) {
                zzk = zzdyVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzdyVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzdyVar.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzk = zzdyVar.zzn();
            }
            j13 += zzk * i12;
            i11++;
            jArr = jArr;
            zzo2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new zzadr(jArr3, jArr2, zzw, j13);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j10) {
        return this.zza[zzeg.zzd(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        int zzd = zzeg.zzd(this.zza, j10, true, true);
        zzzv zzzvVar = new zzzv(this.zza[zzd], this.zzb[zzd]);
        if (zzzvVar.zzb < j10) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i10 = zzd + 1;
                return new zzzs(zzzvVar, new zzzv(jArr[i10], this.zzb[i10]));
            }
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
