package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgib {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]);
        long j10 = jArr2[1];
        jArr[2] = ((j10 + j10) * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]);
        jArr[3] = (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]);
        long j11 = jArr2[2];
        long j12 = jArr3[2];
        long j13 = (jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1]);
        jArr[4] = (j11 * j12) + j13 + j13 + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]);
        jArr[5] = (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]);
        long j14 = (jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1]);
        jArr[6] = j14 + j14 + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]);
        jArr[7] = (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]);
        long j15 = jArr2[4];
        long j16 = jArr3[4];
        long j17 = (jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1]);
        jArr[8] = (j15 * j16) + j17 + j17 + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]);
        jArr[9] = (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]);
        long j18 = (jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1]);
        jArr[10] = j18 + j18 + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]);
        jArr[11] = (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]);
        long j19 = jArr2[6];
        long j20 = jArr3[6];
        long j21 = (jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3]);
        jArr[12] = (j19 * j20) + j21 + j21 + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]);
        jArr[13] = (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]);
        long j22 = (jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5]);
        jArr[14] = j22 + j22 + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]);
        jArr[15] = (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]);
        long j23 = jArr2[8] * jArr3[8];
        long j24 = (jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7]);
        jArr[16] = j23 + j24 + j24;
        jArr[17] = (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]);
        long j25 = jArr2[9];
        jArr[18] = (j25 + j25) * jArr3[9];
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j14;
        long j15 = jArr[10];
        long j16 = j14 + j15 + j15;
        jArr[0] = j16;
        jArr[0] = j16 + jArr[10];
        jArr[10] = 0;
        long j17 = jArr[0];
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(long[] jArr) {
        long j10 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j10;
        long j11 = jArr[18];
        long j12 = j10 + j11 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + jArr[18];
        long j13 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j13;
        long j14 = jArr[17];
        long j15 = j13 + j14 + j14;
        jArr[7] = j15;
        jArr[7] = j15 + jArr[17];
        long j16 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j16;
        long j17 = jArr[16];
        long j18 = j16 + j17 + j17;
        jArr[6] = j18;
        jArr[6] = j18 + jArr[16];
        long j19 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j19;
        long j20 = jArr[15];
        long j21 = j19 + j20 + j20;
        jArr[5] = j21;
        jArr[5] = j21 + jArr[15];
        long j22 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j22;
        long j23 = jArr[14];
        long j24 = j22 + j23 + j23;
        jArr[4] = j24;
        jArr[4] = j24 + jArr[14];
        long j25 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j25;
        long j26 = jArr[13];
        long j27 = j25 + j26 + j26;
        jArr[3] = j27;
        jArr[3] = j27 + jArr[13];
        long j28 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j28;
        long j29 = jArr[12];
        long j30 = j28 + j29 + j29;
        jArr[2] = j30;
        jArr[2] = j30 + jArr[12];
        long j31 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j31;
        long j32 = jArr[11];
        long j33 = j31 + j32 + j32;
        jArr[1] = j33;
        jArr[1] = j33 + jArr[11];
        long j34 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j34;
        long j35 = jArr[10];
        long j36 = j34 + j35 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + jArr[10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzf(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        long j13 = (j12 * j12) + (jArr2[0] * jArr2[2]);
        long j14 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j15 = jArr2[2];
        long j16 = jArr2[1];
        long j17 = jArr2[3];
        long j18 = jArr2[0];
        long j19 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j20 = jArr2[3];
        long j21 = jArr2[2];
        long j22 = jArr2[4];
        long j23 = jArr2[0];
        long j24 = jArr2[6];
        long j25 = jArr2[1];
        long j26 = (j20 * j20) + (j21 * j22) + (j23 * j24) + ((j25 + j25) * jArr2[5]);
        long j27 = (jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j28 = jArr2[4];
        long j29 = jArr2[2];
        long j30 = jArr2[6];
        long j31 = jArr2[0];
        long j32 = jArr2[8];
        long j33 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j34 = (j29 * j30) + (j31 * j32) + j33 + j33;
        long j35 = (jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j36 = jArr2[5];
        long j37 = jArr2[4];
        long j38 = jArr2[6];
        long j39 = jArr2[2];
        long j40 = jArr2[8];
        long j41 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j42 = (j36 * j36) + (j37 * j38) + (j39 * j40) + j41 + j41;
        long j43 = (jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j44 = jArr2[6];
        long j45 = jArr2[4];
        long j46 = jArr2[8];
        long j47 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j48 = (j45 * j46) + j47 + j47;
        long j49 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j50 = jArr2[7];
        long j51 = jArr2[6];
        long j52 = jArr2[8];
        long j53 = jArr2[5];
        long j54 = (j50 * j50) + (j51 * j52) + ((j53 + j53) * jArr2[9]);
        long j55 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j56 = jArr2[8];
        long j57 = jArr2[8];
        long j58 = jArr2[9];
        zzc(new long[]{j10 * j10, (j11 + j11) * jArr2[1], j13 + j13, j14 + j14, (j15 * j15) + (j16 * 4 * j17) + ((j18 + j18) * jArr2[4]), j19 + j19, j26 + j26, j27 + j27, (j28 * j28) + j34 + j34, j35 + j35, j42 + j42, j43 + j43, (j44 * j44) + j48 + j48, j49 + j49, j54 + j54, j55 + j55, (j56 * j56) + (jArr2[7] * 4 * jArr2[9]), (j57 + j57) * jArr2[9], (j58 + j58) * j58}, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzj(long[] jArr) {
        int i10;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 9) {
                long j12 = copyOf[i18];
                copyOf[i18] = j12 + (i16 << i15);
                i18++;
                copyOf[i18] = copyOf[i18] - (-((int) (((j12 >> 31) & j12) >> zzd[i18 & 1])));
            }
            long j13 = copyOf[9];
            int i19 = -((int) (((j13 >> 31) & j13) >> 25));
            copyOf[9] = j13 + (i19 << 25);
            copyOf[0] = copyOf[0] - (i19 * 19);
        }
        long j14 = copyOf[0];
        copyOf[0] = j14 + (i10 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j14 >> 31) & j14) >> 26)));
        for (int i20 = 0; i20 < 2; i20++) {
            int i21 = 0;
            while (i21 < 9) {
                long j15 = copyOf[i21];
                int i22 = zzd[i21 & 1];
                copyOf[i21] = zzc[i14] & j15;
                i21++;
                copyOf[i21] = copyOf[i21] + ((int) (j15 >> i22));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j10 >> 25)) * 19);
        int i23 = ~((((int) j11) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) copyOf[i24]) ^ zzc[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 + i29)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i23);
        long j16 = 33554431 & i23;
        copyOf[1] = copyOf[1] - j16;
        for (int i30 = 2; i30 < 10; i30 += 2) {
            copyOf[i30] = copyOf[i30] - (67108863 & i23);
            int i31 = i30 + 1;
            copyOf[i31] = copyOf[i31] - j16;
        }
        for (int i32 = 0; i32 < 10; i32++) {
            copyOf[i32] = copyOf[i32] << zzb[i32];
        }
        byte[] bArr = new byte[32];
        for (int i33 = 0; i33 < 10; i33++) {
            int[] iArr = zza;
            int i34 = iArr[i33];
            byte b10 = bArr[i34];
            long j17 = copyOf[i33];
            bArr[i34] = (byte) (b10 | (j17 & 255));
            bArr[iArr[i33] + 1] = (byte) (bArr[i11] | ((j17 >> 8) & 255));
            bArr[iArr[i33] + 2] = (byte) (bArr[i12] | ((j17 >> 16) & 255));
            bArr[iArr[i33] + 3] = (byte) (bArr[i13] | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zza[i10];
            jArr[i10] = (((((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i11 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | ((bArr[i11 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16)) | ((bArr[i11 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24)) >> zzb[i10]) & zzc[i10 & 1];
        }
        return jArr;
    }
}
