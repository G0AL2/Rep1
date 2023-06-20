package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaff {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdy zzg = new zzdy(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzys zzysVar, boolean z10) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzyv.zzc(zzysVar, this.zzg.zzH(), 0, 27, z10) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z10) {
                    return false;
                }
                throw zzbp.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int zzk = this.zzg.zzk();
            this.zzc = zzk;
            this.zzd = zzk + 27;
            this.zzg.zzC(zzk);
            if (zzyv.zzc(zzysVar, this.zzg.zzH(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzk();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzys zzysVar, long j10) throws IOException {
        int i10;
        zzcw.zzd(zzysVar.zzf() == zzysVar.zze());
        this.zzg.zzC(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || zzysVar.zzf() + 4 < j10) && zzyv.zzc(zzysVar, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() != 1332176723) {
                    ((zzyl) zzysVar).zzo(1, false);
                } else {
                    zzysVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (i10 != 0 && zzysVar.zzf() >= j10) {
                break;
            }
        } while (zzysVar.zzc(1) != -1);
        return false;
    }
}
