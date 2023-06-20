package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgin {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i10;
            copyOf[31] = (byte) (i10 | 64);
            int i11 = zzghj.zzb;
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i12 = 0; i12 < 7; i12++) {
                    byte[][] bArr3 = zzghj.zza;
                    if (zzghh.zzb(bArr3[i12], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgic.zza(bArr3[i12])));
                    }
                }
                long[] zzk = zzgib.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i13 = 0;
                for (int i14 = 32; i13 < i14; i14 = 32) {
                    int i15 = copyOf[(32 - i13) - 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                    int i16 = 0;
                    while (i16 < 8) {
                        int i17 = (i15 >> (7 - i16)) & 1;
                        zzghj.zza(jArr4, jArr2, i17);
                        zzghj.zza(jArr5, jArr3, i17);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i18 = i15;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i19 = i13;
                        long[] jArr13 = new long[19];
                        int i20 = i16;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        zzgib.zzi(jArr4, jArr4, jArr5);
                        zzgib.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgib.zzi(jArr2, jArr2, jArr3);
                        zzgib.zzh(jArr3, copyOf4, jArr3);
                        zzgib.zzb(jArr14, jArr2, jArr5);
                        zzgib.zzb(jArr15, jArr4, jArr3);
                        zzgib.zze(jArr14);
                        zzgib.zzd(jArr14);
                        zzgib.zze(jArr15);
                        zzgib.zzd(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        zzgib.zzi(jArr14, jArr14, jArr15);
                        zzgib.zzh(jArr15, copyOf4, jArr15);
                        zzgib.zzg(jArr18, jArr14);
                        zzgib.zzg(jArr17, jArr15);
                        zzgib.zzb(jArr15, jArr17, zzk);
                        zzgib.zze(jArr15);
                        zzgib.zzd(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        zzgib.zzg(jArr12, jArr4);
                        zzgib.zzg(jArr13, jArr5);
                        zzgib.zzb(jArr8, jArr12, jArr13);
                        zzgib.zze(jArr8);
                        zzgib.zzd(jArr8);
                        zzgib.zzh(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzgib.zzf(jArr10, jArr13, 121665L);
                        zzgib.zzd(jArr10);
                        zzgib.zzi(jArr10, jArr10, jArr12);
                        zzgib.zzb(jArr16, jArr13, jArr10);
                        zzgib.zze(jArr16);
                        zzgib.zzd(jArr16);
                        zzghj.zza(jArr8, jArr6, i17);
                        zzghj.zza(jArr16, jArr7, i17);
                        i16 = i20 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i15 = i18;
                        jArr = jArr11;
                        i13 = i19;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i13++;
                    copyOf = copyOf;
                }
                long[] jArr22 = jArr;
                long[] jArr23 = new long[10];
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = jArr2;
                long[] jArr34 = new long[10];
                zzgib.zzg(jArr24, jArr5);
                zzgib.zzg(jArr34, jArr24);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zza(jArr25, jArr32, jArr5);
                zzgib.zza(jArr26, jArr25, jArr24);
                zzgib.zzg(jArr32, jArr26);
                zzgib.zza(jArr27, jArr32, jArr25);
                zzgib.zzg(jArr32, jArr27);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zza(jArr28, jArr32, jArr27);
                zzgib.zzg(jArr32, jArr28);
                zzgib.zzg(jArr34, jArr32);
                for (int i21 = 2; i21 < 10; i21 += 2) {
                    zzgib.zzg(jArr32, jArr34);
                    zzgib.zzg(jArr34, jArr32);
                }
                zzgib.zza(jArr29, jArr34, jArr28);
                zzgib.zzg(jArr32, jArr29);
                zzgib.zzg(jArr34, jArr32);
                for (int i22 = 2; i22 < 20; i22 += 2) {
                    zzgib.zzg(jArr32, jArr34);
                    zzgib.zzg(jArr34, jArr32);
                }
                zzgib.zza(jArr32, jArr34, jArr29);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zzg(jArr32, jArr34);
                for (int i23 = 2; i23 < 10; i23 += 2) {
                    zzgib.zzg(jArr34, jArr32);
                    zzgib.zzg(jArr32, jArr34);
                }
                zzgib.zza(jArr30, jArr32, jArr28);
                zzgib.zzg(jArr32, jArr30);
                zzgib.zzg(jArr34, jArr32);
                for (int i24 = 2; i24 < 50; i24 += 2) {
                    zzgib.zzg(jArr32, jArr34);
                    zzgib.zzg(jArr34, jArr32);
                }
                zzgib.zza(jArr31, jArr34, jArr30);
                zzgib.zzg(jArr34, jArr31);
                zzgib.zzg(jArr32, jArr34);
                for (int i25 = 2; i25 < 100; i25 += 2) {
                    zzgib.zzg(jArr34, jArr32);
                    zzgib.zzg(jArr32, jArr34);
                }
                zzgib.zza(jArr34, jArr32, jArr31);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zzg(jArr34, jArr32);
                for (int i26 = 2; i26 < 50; i26 += 2) {
                    zzgib.zzg(jArr32, jArr34);
                    zzgib.zzg(jArr34, jArr32);
                }
                zzgib.zza(jArr32, jArr34, jArr30);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zzg(jArr32, jArr34);
                zzgib.zzg(jArr34, jArr32);
                zzgib.zza(jArr23, jArr34, jArr26);
                zzgib.zza(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                zzgib.zza(jArr35, zzk, jArr22);
                zzgib.zzi(jArr36, zzk, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                zzgib.zzi(jArr38, jArr36, jArr40);
                zzgib.zza(jArr38, jArr38, jArr3);
                zzgib.zzi(jArr38, jArr38, jArr33);
                zzgib.zza(jArr38, jArr38, jArr35);
                zzgib.zza(jArr38, jArr38, jArr33);
                zzgib.zzf(jArr37, jArr38, 4L);
                zzgib.zzd(jArr37);
                zzgib.zza(jArr38, jArr35, jArr3);
                zzgib.zzh(jArr38, jArr38, jArr3);
                zzgib.zza(jArr39, jArr36, jArr33);
                zzgib.zzi(jArr38, jArr38, jArr39);
                zzgib.zzg(jArr38, jArr38);
                if (zzghh.zzb(zzgib.zzj(jArr37), zzgib.zzj(jArr38))) {
                    return zzgib.zzj(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgic.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgik.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        int i10 = zza[31] & 63;
        zza[31] = (byte) i10;
        zza[31] = (byte) (i10 | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
