package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzki {
    public final long zza;
    public final zzci zzb;
    public final int zzc;
    public final zzsa zzd;
    public final long zze;
    public final zzci zzf;
    public final int zzg;
    public final zzsa zzh;
    public final long zzi;
    public final long zzj;

    public zzki(long j10, zzci zzciVar, int i10, zzsa zzsaVar, long j11, zzci zzciVar2, int i11, zzsa zzsaVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzciVar;
        this.zzc = i10;
        this.zzd = zzsaVar;
        this.zze = j11;
        this.zzf = zzciVar2;
        this.zzg = i11;
        this.zzh = zzsaVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzki.class == obj.getClass()) {
            zzki zzkiVar = (zzki) obj;
            if (this.zza == zzkiVar.zza && this.zzc == zzkiVar.zzc && this.zze == zzkiVar.zze && this.zzg == zzkiVar.zzg && this.zzi == zzkiVar.zzi && this.zzj == zzkiVar.zzj && zzfoq.zza(this.zzb, zzkiVar.zzb) && zzfoq.zza(this.zzd, zzkiVar.zzd) && zzfoq.zza(this.zzf, zzkiVar.zzf) && zzfoq.zza(this.zzh, zzkiVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
