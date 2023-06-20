package com.google.android.gms.internal.ads;

import android.util.Log;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgp implements zzja {
    private final zzvv zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzgp() {
        zzvv zzvvVar = new zzvv(true, Constants.MIN_PROGRESS_STEP);
        zzj(IronSourceConstants.IS_INSTANCE_NOT_FOUND, 0, "bufferForPlaybackMs", "0");
        zzj(jh.DEFAULT_BITMAP_TIMEOUT, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, IronSourceConstants.IS_INSTANCE_NOT_FOUND, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, jh.DEFAULT_BITMAP_TIMEOUT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzvvVar;
        this.zzb = zzeg.zzv(50000L);
        this.zzc = zzeg.zzv(50000L);
        this.zzd = zzeg.zzv(2500L);
        this.zze = zzeg.zzv(5000L);
        this.zzg = 13107200;
        this.zzf = zzeg.zzv(0L);
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        zzcw.zze(z10, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z10) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z10) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] zzjtVarArr, zzty zztyVar, zzvg[] zzvgVarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzjtVarArr.length;
            if (i10 < 2) {
                if (zzvgVarArr[i10] != null) {
                    i11 += zzjtVarArr[i10].zzb() != 1 ? 131072000 : 13107200;
                }
                i10++;
            } else {
                int max = Math.max(13107200, i11);
                this.zzg = max;
                this.zza.zzf(max);
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
        int zza = this.zza.zza();
        int i10 = this.zzg;
        long j12 = this.zzb;
        if (f10 > 1.0f) {
            j12 = Math.min(zzeg.zzs(j12, f10), this.zzc);
        }
        if (j11 < Math.max(j12, 500000L)) {
            boolean z10 = zza < i10;
            this.zzh = z10;
            if (!z10 && j11 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzc || zza >= i10) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long j10, float f10, boolean z10, long j11) {
        long zzu = zzeg.zzu(j10, f10);
        long j12 = z10 ? this.zze : this.zzd;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || zzu >= j12 || this.zza.zza() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.zza;
    }
}
