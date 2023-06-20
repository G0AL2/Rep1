package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzj implements zzzu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzzj(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        boolean z10 = length2 > 0;
        this.zzd = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.zza = jArr3;
            long[] jArr4 = new long[i10];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        if (!this.zzd) {
            zzzv zzzvVar = zzzv.zza;
            return new zzzs(zzzvVar, zzzvVar);
        }
        int zzd = zzeg.zzd(this.zzb, j10, true, true);
        zzzv zzzvVar2 = new zzzv(this.zzb[zzd], this.zza[zzd]);
        if (zzzvVar2.zzb != j10) {
            long[] jArr = this.zzb;
            if (zzd != jArr.length - 1) {
                int i10 = zzd + 1;
                return new zzzs(zzzvVar2, new zzzv(jArr[i10], this.zza[i10]));
            }
        }
        return new zzzs(zzzvVar2, zzzvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zzd;
    }
}
