package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzjd {
    public final zzsa zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjd(zzsa zzsaVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzcw.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzcw.zzd(z14);
        this.zza = zzsaVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjd.class == obj.getClass()) {
            zzjd zzjdVar = (zzjd) obj;
            if (this.zzb == zzjdVar.zzb && this.zzc == zzjdVar.zzc && this.zzd == zzjdVar.zzd && this.zze == zzjdVar.zze && this.zzg == zzjdVar.zzg && this.zzh == zzjdVar.zzh && this.zzi == zzjdVar.zzi && zzeg.zzS(this.zza, zzjdVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzjd zza(long j10) {
        return j10 == this.zzc ? this : new zzjd(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzjd zzb(long j10) {
        return j10 == this.zzb ? this : new zzjd(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
