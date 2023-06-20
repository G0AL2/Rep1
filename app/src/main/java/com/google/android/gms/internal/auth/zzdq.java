package com.google.android.gms.internal.auth;

import com.inmobi.media.fq;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzdq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i10, zzdpVar);
        int i11 = zzdpVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzdpVar.zzc = zzeb.zzb;
                    return zzj;
                }
                zzdpVar.zzc = zzeb.zzk(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzew.zzf();
        }
        throw zzew.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzgb zzgbVar, byte[] bArr, int i10, int i11, int i12, zzdp zzdpVar) throws IOException {
        zzft zzftVar = (zzft) zzgbVar;
        Object zzd = zzftVar.zzd();
        int zzb = zzftVar.zzb(zzd, bArr, i10, i11, i12, zzdpVar);
        zzftVar.zze(zzd);
        zzdpVar.zzc = zzd;
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzgb zzgbVar, byte[] bArr, int i10, int i11, zzdp zzdpVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzdpVar);
            i13 = zzdpVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zzd = zzgbVar.zzd();
            int i15 = i13 + i14;
            zzgbVar.zzg(zzd, bArr, i14, i15, zzdpVar);
            zzgbVar.zze(zzd);
            zzdpVar.zzc = zzd;
            return i15;
        }
        throw zzew.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzgb<?> zzgbVar, int i10, byte[] bArr, int i11, int i12, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        int zzd = zzd(zzgbVar, bArr, i11, i12, zzdpVar);
        zzeuVar.add(zzdpVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzdpVar);
            if (i10 != zzdpVar.zza) {
                break;
            }
            zzd = zzd(zzgbVar, bArr, zzj, i12, zzdpVar);
            zzeuVar.add(zzdpVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        zzer zzerVar = (zzer) zzeuVar;
        int zzj = zzj(bArr, i10, zzdpVar);
        int i11 = zzdpVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzdpVar);
            zzerVar.zze(zzdpVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzew.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i10, zzdpVar);
        int i11 = zzdpVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzdpVar.zzc = "";
                return zzj;
            }
            zzdpVar.zzc = new String(bArr, zzj, i11, zzev.zza);
            return zzj + i11;
        }
        throw zzew.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i10, zzdpVar);
        int i11 = zzdpVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzdpVar.zzc = "";
                return zzj;
            }
            zzdpVar.zzc = zzhd.zzb(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzew.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgq zzgqVar, zzdp zzdpVar) throws zzew {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzdpVar);
                zzgqVar.zzf(i10, Long.valueOf(zzdpVar.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzgqVar.zzf(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzdpVar);
                int i14 = zzdpVar.zza;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - zzj) {
                        if (i14 == 0) {
                            zzgqVar.zzf(i10, zzeb.zzb);
                        } else {
                            zzgqVar.zzf(i10, zzeb.zzk(bArr, zzj, i14));
                        }
                        return zzj + i14;
                    }
                    throw zzew.zzf();
                }
                throw zzew.zzc();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    zzgqVar.zzf(i10, Integer.valueOf(zzb(bArr, i11)));
                    return i11 + 4;
                }
                throw zzew.zza();
            } else {
                int i15 = (i10 & (-8)) | 4;
                zzgq zzc = zzgq.zzc();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzdpVar);
                    int i17 = zzdpVar.zza;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = zzj2;
                        break;
                    }
                    i16 = i17;
                    i11 = zzi(i17, bArr, zzj2, i12, zzc, zzdpVar);
                }
                if (i11 <= i12 && i16 == i15) {
                    zzgqVar.zzf(i10, zzc);
                    return i11;
                }
                throw zzew.zzd();
            }
        }
        throw zzew.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzdp zzdpVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzdpVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzdpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzdp zzdpVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzdpVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzdpVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzdpVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzdpVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzdpVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzeu<?> zzeuVar, zzdp zzdpVar) {
        zzer zzerVar = (zzer) zzeuVar;
        int zzj = zzj(bArr, i11, zzdpVar);
        zzerVar.zze(zzdpVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzdpVar);
            if (i10 != zzdpVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdpVar);
            zzerVar.zze(zzdpVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzdp zzdpVar) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzdpVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        zzdpVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
