package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyj implements zzzu {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i10 = length - 1;
        this.zzf = jArr2[i10] + jArr3[i10];
    }

    public final String toString() {
        int i10 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        return "ChunkIndex(length=" + i10 + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        int zzd = zzeg.zzd(this.zze, j10, true, true);
        zzzv zzzvVar = new zzzv(this.zze[zzd], this.zzc[zzd]);
        if (zzzvVar.zzb < j10 && zzd != this.zza - 1) {
            int i10 = zzd + 1;
            return new zzzs(zzzvVar, new zzzv(this.zze[i10], this.zzc[i10]));
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
