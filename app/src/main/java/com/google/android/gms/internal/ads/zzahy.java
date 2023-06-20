package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzahy implements zzzu {
    private final zzahv zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzahy(zzahv zzahvVar, int i10, long j10, long j11) {
        this.zza = zzahvVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzahvVar.zzd;
        this.zzd = j12;
        this.zze = zza(j12);
    }

    private final long zza(long j10) {
        return zzeg.zzw(j10 * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        long zzr = zzeg.zzr((this.zza.zzc * j10) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j11 = this.zzc;
        int i10 = this.zza.zzd;
        long zza = zza(zzr);
        zzzv zzzvVar = new zzzv(zza, j11 + (i10 * zzr));
        if (zza < j10 && zzr != this.zzd - 1) {
            long j12 = zzr + 1;
            return new zzzs(zzzvVar, new zzzv(zza(j12), this.zzc + (j12 * this.zza.zzd)));
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
