package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzavk {
    private static final int[] zza = {zzazo.zzg("isom"), zzazo.zzg("iso2"), zzazo.zzg("iso3"), zzazo.zzg("iso4"), zzazo.zzg("iso5"), zzazo.zzg("iso6"), zzazo.zzg("avc1"), zzazo.zzg("hvc1"), zzazo.zzg("hev1"), zzazo.zzg("mp41"), zzazo.zzg("mp42"), zzazo.zzg("3g2a"), zzazo.zzg("3g2b"), zzazo.zzg("3gr6"), zzazo.zzg("3gs6"), zzazo.zzg("3ge6"), zzazo.zzg("3gg6"), zzazo.zzg("M4V "), zzazo.zzg("M4A "), zzazo.zzg("f4v "), zzazo.zzg("kddi"), zzazo.zzg("M4VP"), zzazo.zzg("qt  "), zzazo.zzg("MSNV")};

    public static boolean zza(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzc(zzatvVar, true);
    }

    public static boolean zzb(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzc(zzatvVar, false);
    }

    private static boolean zzc(zzatv zzatvVar, boolean z10) throws IOException, InterruptedException {
        boolean z11;
        long zzc = zzatvVar.zzc();
        int i10 = (int) ((zzc == -1 || zzc > 4096) ? 4096L : 4096L);
        zzazh zzazhVar = new zzazh(64);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < i10) {
            zzazhVar.zzs(8);
            zzatvVar.zzg(zzazhVar.zza, 0, 8, false);
            long zzm = zzazhVar.zzm();
            int zze = zzazhVar.zze();
            int i12 = 16;
            if (zzm == 1) {
                zzatvVar.zzg(zzazhVar.zza, 8, 8, false);
                zzazhVar.zzu(16);
                zzm = zzazhVar.zzn();
            } else {
                i12 = 8;
            }
            long j10 = i12;
            if (zzm < j10) {
                return false;
            }
            i11 += i12;
            if (zze != zzaut.zzE) {
                if (zze == zzaut.zzN || zze == zzaut.zzP) {
                    z11 = true;
                    break;
                } else if ((i11 + zzm) - j10 >= i10) {
                    break;
                } else {
                    int i13 = (int) (zzm - j10);
                    i11 += i13;
                    if (zze == zzaut.zzd) {
                        if (i13 < 8) {
                            return false;
                        }
                        zzazhVar.zzs(i13);
                        zzatvVar.zzg(zzazhVar.zza, 0, i13, false);
                        int i14 = i13 >> 2;
                        for (int i15 = 0; i15 < i14; i15++) {
                            if (i15 == 1) {
                                zzazhVar.zzw(4);
                            } else {
                                int zze2 = zzazhVar.zze();
                                if ((zze2 >>> 8) != zzazo.zzg("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i16 = 0; i16 < 24; i16++) {
                                        if (iArr[i16] != zze2) {
                                        }
                                    }
                                    continue;
                                }
                                z12 = true;
                                break;
                            }
                        }
                        if (!z12) {
                            return false;
                        }
                    } else if (i13 != 0) {
                        zzatvVar.zzf(i13, false);
                    }
                }
            }
        }
        z11 = false;
        return z12 && z10 == z11;
    }
}
