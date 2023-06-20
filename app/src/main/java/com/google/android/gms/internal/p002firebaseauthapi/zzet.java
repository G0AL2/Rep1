package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzet  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzet {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 1);
    public static final byte[] zzd = zzc(2, 1);
    public static final byte[] zze = zzc(2, 2);
    public static final byte[] zzf = zzc(2, 3);
    public static final byte[] zzg = new byte[0];
    private static final byte[] zzh = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzi = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzj = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzjq zzjqVar) throws GeneralSecurityException {
        if (zzjqVar.zzf() != 2 && zzjqVar.zzf() != 1) {
            String str = "UNRECOGNIZED";
            if (zzjqVar.zze() != 2 && zzjqVar.zze() != 1) {
                if (zzjqVar.zzd() == 2 || zzjqVar.zzd() == 1) {
                    int zzd2 = zzjqVar.zzd();
                    if (zzd2 == 2) {
                        str = "AEAD_UNKNOWN";
                    } else if (zzd2 == 3) {
                        str = "AES_128_GCM";
                    } else if (zzd2 == 4) {
                        str = "AES_256_GCM";
                    } else if (zzd2 == 5) {
                        str = "CHACHA20_POLY1305";
                    }
                    throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
                }
                return;
            }
            int zze2 = zzjqVar.zze();
            if (zze2 == 2) {
                str = "KDF_UNKNOWN";
            } else if (zze2 == 3) {
                str = "HKDF_SHA256";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(zzjk.zza(zzjqVar.zzf())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzlx.zzc(zzi, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzlx.zzc(zzh, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzlx.zzc(zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return zzlx.zzc(zzc(2, i10), zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
