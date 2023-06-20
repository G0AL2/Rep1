package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjz implements zzjb {
    private final zzcx zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzbt zze = zzbt.zza;

    public zzjz(zzcx zzcxVar) {
        this.zza = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        long zza;
        long j10 = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzbt zzbtVar = this.zze;
            if (zzbtVar.zzc == 1.0f) {
                zza = zzeg.zzv(elapsedRealtime);
            } else {
                zza = zzbtVar.zza(elapsedRealtime);
            }
            return j10 + zza;
        }
        return j10;
    }

    public final void zzb(long j10) {
        this.zzc = j10;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbtVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzbtVar;
    }
}
