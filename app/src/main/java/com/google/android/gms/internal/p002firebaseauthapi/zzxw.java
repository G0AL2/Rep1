package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.fq;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzxv zzxvVar) throws zzzt {
        int zzj = zzj(bArr, i10, zzxvVar);
        int i11 = zzxvVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzxvVar.zzc = zzyi.zzb;
                    return zzj;
                }
                zzxvVar.zzc = zzyi.zzo(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzzt.zzi();
        }
        throw zzzt.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzabc zzabcVar, byte[] bArr, int i10, int i11, int i12, zzxv zzxvVar) throws IOException {
        zzaat zzaatVar = (zzaat) zzabcVar;
        Object zze = zzaatVar.zze();
        int zzc = zzaatVar.zzc(zze, bArr, i10, i11, i12, zzxvVar);
        zzaatVar.zzf(zze);
        zzxvVar.zzc = zze;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzabc zzabcVar, byte[] bArr, int i10, int i11, zzxv zzxvVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzxvVar);
            i13 = zzxvVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zze = zzabcVar.zze();
            int i15 = i13 + i14;
            zzabcVar.zzi(zze, bArr, i14, i15, zzxvVar);
            zzabcVar.zzf(zze);
            zzxvVar.zzc = zze;
            return i15;
        }
        throw zzzt.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzabc zzabcVar, int i10, byte[] bArr, int i11, int i12, zzzq zzzqVar, zzxv zzxvVar) throws IOException {
        int zzd = zzd(zzabcVar, bArr, i11, i12, zzxvVar);
        zzzqVar.add(zzxvVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzxvVar);
            if (i10 != zzxvVar.zza) {
                break;
            }
            zzd = zzd(zzabcVar, bArr, zzj, i12, zzxvVar);
            zzzqVar.add(zzxvVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzzq zzzqVar, zzxv zzxvVar) throws IOException {
        zzzm zzzmVar = (zzzm) zzzqVar;
        int zzj = zzj(bArr, i10, zzxvVar);
        int i11 = zzxvVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzxvVar);
            zzzmVar.zzf(zzxvVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzzt.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzxv zzxvVar) throws zzzt {
        int zzj = zzj(bArr, i10, zzxvVar);
        int i11 = zzxvVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzxvVar.zzc = "";
                return zzj;
            }
            zzxvVar.zzc = new String(bArr, zzj, i11, zzzr.zzb);
            return zzj + i11;
        }
        throw zzzt.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzxv zzxvVar) throws zzzt {
        int zzj = zzj(bArr, i10, zzxvVar);
        int i11 = zzxvVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzxvVar.zzc = "";
                return zzj;
            }
            zzxvVar.zzc = zzaci.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzzt.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzabu zzabuVar, zzxv zzxvVar) throws zzzt {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzxvVar);
                zzabuVar.zzh(i10, Long.valueOf(zzxvVar.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzabuVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzxvVar);
                int i14 = zzxvVar.zza;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - zzj) {
                        if (i14 == 0) {
                            zzabuVar.zzh(i10, zzyi.zzb);
                        } else {
                            zzabuVar.zzh(i10, zzyi.zzo(bArr, zzj, i14));
                        }
                        return zzj + i14;
                    }
                    throw zzzt.zzi();
                }
                throw zzzt.zzf();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    zzabuVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                    return i11 + 4;
                }
                throw zzzt.zzc();
            } else {
                int i15 = (i10 & (-8)) | 4;
                zzabu zze = zzabu.zze();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzxvVar);
                    int i17 = zzxvVar.zza;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = zzj2;
                        break;
                    }
                    i16 = i17;
                    i11 = zzi(i17, bArr, zzj2, i12, zze, zzxvVar);
                }
                if (i11 <= i12 && i16 == i15) {
                    zzabuVar.zzh(i10, zze);
                    return i11;
                }
                throw zzzt.zzg();
            }
        }
        throw zzzt.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzxv zzxvVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzxvVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzxvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzxv zzxvVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzxvVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzxvVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzxvVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzxvVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzxvVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzzq zzzqVar, zzxv zzxvVar) {
        zzzm zzzmVar = (zzzm) zzzqVar;
        int zzj = zzj(bArr, i11, zzxvVar);
        zzzmVar.zzf(zzxvVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzxvVar);
            if (i10 != zzxvVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzxvVar);
            zzzmVar.zzf(zzxvVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzxv zzxvVar) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzxvVar.zzb = j10;
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
        zzxvVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
