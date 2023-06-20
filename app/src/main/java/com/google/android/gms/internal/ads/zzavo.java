package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzavo {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzavo(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        zzayz.zzc(iArr.length == length);
        int length2 = jArr.length;
        zzayz.zzc(length2 == length);
        zzayz.zzc(iArr2.length == length);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i10;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j10) {
        for (int zzc = zzazo.zzc(this.zze, j10, true, false); zzc >= 0; zzc--) {
            if ((this.zzf[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int zzb = zzazo.zzb(this.zze, j10, true, false); zzb < this.zze.length; zzb++) {
            if ((this.zzf[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}
