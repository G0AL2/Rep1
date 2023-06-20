package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzyh {
    protected final zzyb zza;
    protected final zzyg zzb;
    protected zzyd zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzyh(zzye zzyeVar, zzyg zzygVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzygVar;
        this.zzd = i10;
        this.zza = new zzyb(zzyeVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzys zzysVar, long j10, zzzr zzzrVar) {
        if (j10 == zzysVar.zzf()) {
            return 0;
        }
        zzzrVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzys zzysVar, long j10) throws IOException {
        long zzf = j10 - zzysVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzyl) zzysVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zzyd zzydVar = this.zzc;
            zzcw.zzb(zzydVar);
            j10 = zzydVar.zzf;
            j11 = zzydVar.zzg;
            j12 = zzydVar.zzh;
            if (j11 - j10 <= this.zzd) {
                zzc(false, j10);
                return zzf(zzysVar, j10, zzzrVar);
            } else if (!zzg(zzysVar, j12)) {
                return zzf(zzysVar, j12, zzzrVar);
            } else {
                zzysVar.zzj();
                zzyg zzygVar = this.zzb;
                j13 = zzydVar.zzb;
                zzyf zza = zzygVar.zza(zzysVar, j13);
                i10 = zza.zzb;
                if (i10 == -3) {
                    zzc(false, j12);
                    return zzf(zzysVar, j12, zzzrVar);
                } else if (i10 == -2) {
                    j19 = zza.zzc;
                    j20 = zza.zzd;
                    zzyd.zzh(zzydVar, j19, j20);
                } else if (i10 != -1) {
                    j14 = zza.zzd;
                    zzg(zzysVar, j14);
                    j15 = zza.zzd;
                    zzc(true, j15);
                    j16 = zza.zzd;
                    return zzf(zzysVar, j16, zzzrVar);
                } else {
                    j17 = zza.zzc;
                    j18 = zza.zzd;
                    zzyd.zzg(zzydVar, j17, j18);
                }
            }
        }
    }

    public final zzzu zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzyd zzydVar = this.zzc;
        if (zzydVar != null) {
            j15 = zzydVar.zza;
            if (j15 == j10) {
                return;
            }
        }
        long zzf = this.zza.zzf(j10);
        zzyb zzybVar = this.zza;
        j11 = zzybVar.zzc;
        j12 = zzybVar.zzd;
        j13 = zzybVar.zze;
        j14 = zzybVar.zzf;
        this.zzc = new zzyd(j10, zzf, 0L, j11, j12, j13, j14);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
