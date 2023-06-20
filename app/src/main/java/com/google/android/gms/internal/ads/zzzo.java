package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzo {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzcw.zzf(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zze(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zze(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zze(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        zze(zArr);
                        return i15;
                    }
                    i14 = i15;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            zArr[2] = bArr[i13] == 0;
            return i11;
        }
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i19 + 1;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i11 - i15);
        }
        return i11;
    }

    public static zzzm zzc(byte[] bArr, int i10, int i11) {
        zzzq zzzqVar = new zzzq(bArr, 4, i11);
        int zzc2 = zzzqVar.zzc();
        int zzc3 = zzzqVar.zzc();
        zzzqVar.zzd();
        return new zzzm(zzc2, zzc3, zzzqVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzzn zzd(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzo.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzzn");
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
