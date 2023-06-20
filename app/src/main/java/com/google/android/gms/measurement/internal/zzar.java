package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzar {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j12 >= 0);
        Preconditions.checkArgument(j14 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar zza(Long l10, Long l11, Boolean bool) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar zzb(long j10, long j11) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzar zzc(long j10) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
