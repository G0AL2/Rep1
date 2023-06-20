package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzzt implements zzzu {
    private final long zza;
    private final zzzs zzb;

    public zzzt(long j10, long j11) {
        this.zza = j10;
        zzzv zzzvVar = j11 == 0 ? zzzv.zza : new zzzv(0L, j11);
        this.zzb = new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return false;
    }
}
