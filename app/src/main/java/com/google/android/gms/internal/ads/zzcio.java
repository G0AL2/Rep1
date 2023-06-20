package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcio {
    private final zzaym zza = new zzaym(true, Constants.MIN_PROGRESS_STEP);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zze(false);
    }

    public final void zzb() {
        zze(true);
    }

    public final void zzc() {
        zze(true);
    }

    public final void zzd(zzary[] zzaryVarArr, zzaxq zzaxqVar, zzayc zzaycVar) {
        this.zzf = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzaycVar.zza(i10) != null) {
                this.zzf += zzazo.zzf(zzaryVarArr[i10].zzc());
            }
        }
        this.zza.zzf(this.zzf);
    }

    @VisibleForTesting
    final void zze(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    public final synchronized void zzf(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzg(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzh(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzi(int i10) {
        this.zzb = i10 * 1000;
    }

    public final synchronized boolean zzj(long j10) {
        boolean z10;
        z10 = true;
        char c10 = j10 > this.zzc ? (char) 0 : j10 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || zza >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    public final synchronized boolean zzk(long j10, boolean z10) {
        long j11;
        j11 = z10 ? this.zze : this.zzd;
        return j11 <= 0 || j10 >= j11;
    }

    public final zzaym zzl() {
        return this.zza;
    }
}
