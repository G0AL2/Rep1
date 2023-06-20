package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatu implements zzaud {
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    private final long zze;

    public zzatu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = iArr;
        this.zzb = jArr;
        this.zzc = jArr2;
        this.zzd = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.zze = 0L;
            return;
        }
        int i10 = length - 1;
        this.zze = jArr2[i10] + jArr3[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zzb(long j10) {
        return this.zzb[zzazo.zzc(this.zzd, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final boolean zzc() {
        return true;
    }
}
