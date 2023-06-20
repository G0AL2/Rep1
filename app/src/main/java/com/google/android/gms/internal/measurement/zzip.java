package com.google.android.gms.internal.measurement;

import com.inmobi.media.fq;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzip {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzioVar.zzc = zzjb.zzb;
                    return zzj;
                }
                zzioVar.zzc = zzjb.zzl(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzkm.zzf();
        }
        throw zzkm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzlu zzluVar, byte[] bArr, int i10, int i11, int i12, zzio zzioVar) throws IOException {
        zzlm zzlmVar = (zzlm) zzluVar;
        Object zze = zzlmVar.zze();
        int zzc = zzlmVar.zzc(zze, bArr, i10, i11, i12, zzioVar);
        zzlmVar.zzf(zze);
        zzioVar.zzc = zze;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzlu zzluVar, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzioVar);
            i13 = zzioVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zze = zzluVar.zze();
            int i15 = i13 + i14;
            zzluVar.zzh(zze, bArr, i14, i15, zzioVar);
            zzluVar.zzf(zze);
            zzioVar.zzc = zze;
            return i15;
        }
        throw zzkm.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzlu zzluVar, int i10, byte[] bArr, int i11, int i12, zzkj zzkjVar, zzio zzioVar) throws IOException {
        int zzd = zzd(zzluVar, bArr, i11, i12, zzioVar);
        zzkjVar.add(zzioVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzioVar);
            if (i10 != zzioVar.zza) {
                break;
            }
            zzd = zzd(zzluVar, bArr, zzj, i12, zzioVar);
            zzkjVar.add(zzioVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzkj zzkjVar, zzio zzioVar) throws IOException {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzkm.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzioVar.zzc = "";
                return zzj;
            }
            zzioVar.zzc = new String(bArr, zzj, i11, zzkk.zzb);
            return zzj + i11;
        }
        throw zzkm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzioVar.zzc = "";
                return zzj;
            }
            zzioVar.zzc = zzna.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzkm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzmm zzmmVar, zzio zzioVar) throws zzkm {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzioVar);
                zzmmVar.zzh(i10, Long.valueOf(zzioVar.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzmmVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzioVar);
                int i14 = zzioVar.zza;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - zzj) {
                        if (i14 == 0) {
                            zzmmVar.zzh(i10, zzjb.zzb);
                        } else {
                            zzmmVar.zzh(i10, zzjb.zzl(bArr, zzj, i14));
                        }
                        return zzj + i14;
                    }
                    throw zzkm.zzf();
                }
                throw zzkm.zzd();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    zzmmVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                    return i11 + 4;
                }
                throw zzkm.zzb();
            } else {
                int i15 = (i10 & (-8)) | 4;
                zzmm zze = zzmm.zze();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzioVar);
                    int i17 = zzioVar.zza;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = zzj2;
                        break;
                    }
                    i16 = i17;
                    i11 = zzi(i17, bArr, zzj2, i12, zze, zzioVar);
                }
                if (i11 <= i12 && i16 == i15) {
                    zzmmVar.zzh(i10, zze);
                    return i11;
                }
                throw zzkm.zze();
            }
        }
        throw zzkm.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzio zzioVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzioVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzioVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzio zzioVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzioVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzioVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzioVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzioVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzioVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i11, zzioVar);
        zzkdVar.zzh(zzioVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzioVar);
            if (i10 != zzioVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzio zzioVar) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzioVar.zzb = j10;
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
        zzioVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
