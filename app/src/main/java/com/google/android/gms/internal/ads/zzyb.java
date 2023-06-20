package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyb implements zzzu {
    private final zzye zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzyb(zzye zzyeVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzyeVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long j10) {
        return this.zza.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        zzzv zzzvVar = new zzzv(j10, zzyd.zzf(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
