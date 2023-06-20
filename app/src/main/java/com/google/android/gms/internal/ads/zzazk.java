package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazk implements zzazd {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzarx zzd = zzarx.zza;

    @Override // com.google.android.gms.internal.ads.zzazd
    public final long zzI() {
        long zza;
        long j10 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzarx zzarxVar = this.zzd;
            if (zzarxVar.zzb == 1.0f) {
                zza = zzare.zza(elapsedRealtime);
            } else {
                zza = zzarxVar.zza(elapsedRealtime);
            }
            return j10 + zza;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzJ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzK(zzarx zzarxVar) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzarxVar;
        return zzarxVar;
    }

    public final void zza(long j10) {
        this.zzb = j10;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzazd zzazdVar) {
        zza(zzazdVar.zzI());
        this.zzd = zzazdVar.zzJ();
    }
}
