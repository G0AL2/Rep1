package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaes {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzys zzysVar) throws IOException {
        return zzc(zzysVar, true, false);
    }

    public static boolean zzb(zzys zzysVar, boolean z10) throws IOException {
        return zzc(zzysVar, false, false);
    }

    private static boolean zzc(zzys zzysVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        long zzd = zzysVar.zzd();
        long j10 = -1;
        long j11 = 4096;
        int i10 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i10 != 0 && zzd <= 4096) {
            j11 = zzd;
        }
        int i11 = (int) j11;
        zzdy zzdyVar = new zzdy(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            zzdyVar.zzC(8);
            if (!zzysVar.zzm(zzdyVar.zzH(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long zzs = zzdyVar.zzs();
            int zze = zzdyVar.zze();
            int i13 = 16;
            if (zzs == 1) {
                zzysVar.zzh(zzdyVar.zzH(), 8, 8);
                zzdyVar.zzE(16);
                zzs = zzdyVar.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzysVar.zzd();
                    if (zzd2 != j10) {
                        zzs = (zzd2 - zzysVar.zze()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (zzs < j12) {
                return z13;
            }
            i12 += i13;
            if (zze == 1836019574) {
                i11 += (int) zzs;
                if (i10 != 0 && i11 > zzd) {
                    i11 = (int) zzd;
                }
                j10 = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z12 = true;
                break;
            } else {
                long j13 = zzd;
                if ((i12 + zzs) - j12 >= i11) {
                    break;
                }
                int i14 = (int) (zzs - j12);
                i12 += i14;
                if (zze == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    zzdyVar.zzC(i14);
                    zzysVar.zzh(zzdyVar.zzH(), 0, i14);
                    int i15 = i14 >> 2;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (i16 == 1) {
                            zzdyVar.zzG(4);
                        } else {
                            int zze2 = zzdyVar.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i17 = 0; i17 < 29; i17++) {
                                    if (iArr[i17] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z14 = true;
                            break;
                        }
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i14 != 0) {
                    zzysVar.zzg(i14);
                }
                zzd = j13;
                j10 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }
}
