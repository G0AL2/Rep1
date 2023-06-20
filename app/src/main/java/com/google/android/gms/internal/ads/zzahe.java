package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzahe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahe(int i10) {
    }

    private final int zze(zzys zzysVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzysVar.zzj();
        return 0;
    }

    public final int zza(zzys zzysVar, zzzr zzzrVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzysVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzysVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j11 = zzd - min;
            if (zzysVar.zzf() != j11) {
                zzzrVar.zza = j11;
                return 1;
            }
            this.zzb.zzC(min);
            zzysVar.zzj();
            ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdyVar = this.zzb;
            int zzc = zzdyVar.zzc();
            int zzd2 = zzdyVar.zzd();
            int i11 = zzd2 - 188;
            while (true) {
                if (i11 < zzc) {
                    break;
                }
                byte[] zzH = zzdyVar.zzH();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * 188) + i11;
                    if (i14 < zzc || i14 >= zzd2 || zzH[i14] != 71) {
                        i13 = 0;
                    } else {
                        i13++;
                        if (i13 == 5) {
                            long zzb = zzaho.zzb(zzdyVar, i11, i10);
                            if (zzb != -9223372036854775807L) {
                                j10 = zzb;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                i11--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzysVar);
            return 0;
        } else if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzysVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                Log.w("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzysVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzysVar.zzd());
            if (zzysVar.zzf() != 0) {
                zzzrVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzysVar.zzj();
            ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdyVar2 = this.zzb;
            int zzc2 = zzdyVar2.zzc();
            int zzd3 = zzdyVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzdyVar2.zzH()[zzc2] == 71) {
                    long zzb3 = zzaho.zzb(zzdyVar2, zzc2, i10);
                    if (zzb3 != -9223372036854775807L) {
                        j10 = zzb3;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
