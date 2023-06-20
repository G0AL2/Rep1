package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyf {
    public static final zzyf zza = new zzyf(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzyf(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzyf zzd(long j10, long j11) {
        return new zzyf(-1, j10, j11);
    }

    public static zzyf zze(long j10) {
        return new zzyf(0, -9223372036854775807L, j10);
    }

    public static zzyf zzf(long j10, long j11) {
        return new zzyf(-2, j10, j11);
    }
}
