package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.fq;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zznb {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i10;
            copyOf[31] = (byte) (i10 | 64);
            int i11 = zzlz.zzb;
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i12 = 0; i12 < 7; i12++) {
                    byte[][] bArr3 = zzlz.zza;
                    if (zzlx.zzb(bArr3[i12], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(zzmr.zza(bArr3[i12])));
                    }
                }
                long[] zzk = zzmq.zzk(copyOf2);
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
                        zzlz.zza(jArr4, jArr2, i17);
                        zzlz.zza(jArr5, jArr3, i17);
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
                        zzmq.zzi(jArr4, jArr4, jArr5);
                        zzmq.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzmq.zzi(jArr2, jArr2, jArr3);
                        zzmq.zzh(jArr3, copyOf4, jArr3);
                        zzmq.zzb(jArr14, jArr2, jArr5);
                        zzmq.zzb(jArr15, jArr4, jArr3);
                        zzmq.zze(jArr14);
                        zzmq.zzd(jArr14);
                        zzmq.zze(jArr15);
                        zzmq.zzd(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        zzmq.zzi(jArr14, jArr14, jArr15);
                        zzmq.zzh(jArr15, copyOf4, jArr15);
                        zzmq.zzg(jArr18, jArr14);
                        zzmq.zzg(jArr17, jArr15);
                        zzmq.zzb(jArr15, jArr17, zzk);
                        zzmq.zze(jArr15);
                        zzmq.zzd(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        zzmq.zzg(jArr12, jArr4);
                        zzmq.zzg(jArr13, jArr5);
                        zzmq.zzb(jArr8, jArr12, jArr13);
                        zzmq.zze(jArr8);
                        zzmq.zzd(jArr8);
                        zzmq.zzh(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzmq.zzf(jArr10, jArr13, 121665L);
                        zzmq.zzd(jArr10);
                        zzmq.zzi(jArr10, jArr10, jArr12);
                        zzmq.zzb(jArr16, jArr13, jArr10);
                        zzmq.zze(jArr16);
                        zzmq.zzd(jArr16);
                        zzlz.zza(jArr8, jArr6, i17);
                        zzlz.zza(jArr16, jArr7, i17);
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
                zzmq.zzg(jArr24, jArr5);
                zzmq.zzg(jArr34, jArr24);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zza(jArr25, jArr32, jArr5);
                zzmq.zza(jArr26, jArr25, jArr24);
                zzmq.zzg(jArr32, jArr26);
                zzmq.zza(jArr27, jArr32, jArr25);
                zzmq.zzg(jArr32, jArr27);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zza(jArr28, jArr32, jArr27);
                zzmq.zzg(jArr32, jArr28);
                zzmq.zzg(jArr34, jArr32);
                for (int i21 = 2; i21 < 10; i21 += 2) {
                    zzmq.zzg(jArr32, jArr34);
                    zzmq.zzg(jArr34, jArr32);
                }
                zzmq.zza(jArr29, jArr34, jArr28);
                zzmq.zzg(jArr32, jArr29);
                zzmq.zzg(jArr34, jArr32);
                for (int i22 = 2; i22 < 20; i22 += 2) {
                    zzmq.zzg(jArr32, jArr34);
                    zzmq.zzg(jArr34, jArr32);
                }
                zzmq.zza(jArr32, jArr34, jArr29);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zzg(jArr32, jArr34);
                for (int i23 = 2; i23 < 10; i23 += 2) {
                    zzmq.zzg(jArr34, jArr32);
                    zzmq.zzg(jArr32, jArr34);
                }
                zzmq.zza(jArr30, jArr32, jArr28);
                zzmq.zzg(jArr32, jArr30);
                zzmq.zzg(jArr34, jArr32);
                for (int i24 = 2; i24 < 50; i24 += 2) {
                    zzmq.zzg(jArr32, jArr34);
                    zzmq.zzg(jArr34, jArr32);
                }
                zzmq.zza(jArr31, jArr34, jArr30);
                zzmq.zzg(jArr34, jArr31);
                zzmq.zzg(jArr32, jArr34);
                for (int i25 = 2; i25 < 100; i25 += 2) {
                    zzmq.zzg(jArr34, jArr32);
                    zzmq.zzg(jArr32, jArr34);
                }
                zzmq.zza(jArr34, jArr32, jArr31);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zzg(jArr34, jArr32);
                for (int i26 = 2; i26 < 50; i26 += 2) {
                    zzmq.zzg(jArr32, jArr34);
                    zzmq.zzg(jArr34, jArr32);
                }
                zzmq.zza(jArr32, jArr34, jArr30);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zzg(jArr32, jArr34);
                zzmq.zzg(jArr34, jArr32);
                zzmq.zza(jArr23, jArr34, jArr26);
                zzmq.zza(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                zzmq.zza(jArr35, zzk, jArr22);
                zzmq.zzi(jArr36, zzk, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                zzmq.zzi(jArr38, jArr36, jArr40);
                zzmq.zza(jArr38, jArr38, jArr3);
                zzmq.zzi(jArr38, jArr38, jArr33);
                zzmq.zza(jArr38, jArr38, jArr35);
                zzmq.zza(jArr38, jArr38, jArr33);
                zzmq.zzf(jArr37, jArr38, 4L);
                zzmq.zzd(jArr37);
                zzmq.zza(jArr38, jArr35, jArr3);
                zzmq.zzh(jArr38, jArr38, jArr3);
                zzmq.zza(jArr39, jArr36, jArr33);
                zzmq.zzi(jArr38, jArr38, jArr39);
                zzmq.zzg(jArr38, jArr38);
                if (zzlx.zzb(zzmq.zzj(jArr37), zzmq.zzj(jArr38))) {
                    return zzmq.zzj(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzmr.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
