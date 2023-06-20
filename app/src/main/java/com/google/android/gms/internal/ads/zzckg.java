package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckg implements zzja {
    private final zzvv zza = new zzvv(true, Constants.MIN_PROGRESS_STEP);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] zzjtVarArr, zzty zztyVar, zzvg[] zzvgVarArr) {
        int i10 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjtVarArr.length;
            if (i10 < 2) {
                if (zzvgVarArr[i10] != null) {
                    this.zzf += zzjtVarArr[i10].zzb() != 1 ? 131072000 : 13107200;
                }
                i10++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzg(long j10, long j11, float f10) {
        boolean z10 = true;
        char c10 = j11 > this.zzc ? (char) 0 : j11 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || zza >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long j10, float f10, boolean z10, long j11) {
        long j12 = z10 ? this.zze : this.zzd;
        return j12 <= 0 || j10 >= j12;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.zza;
    }

    @VisibleForTesting
    final void zzj(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzb = i10 * 1000;
    }
}
