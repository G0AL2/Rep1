package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzlv implements zzar {
    private static final Collection zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzmt zzc;
    private final byte[] zzd;

    public zzlv(byte[] bArr) throws GeneralSecurityException {
        if (zzdl.zza(1)) {
            Collection collection = zza;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.zzd = Arrays.copyOfRange(bArr, i10, length);
                this.zzc = new zzmt(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzar
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzd;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) zzmh.zza.zza("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && zzmz.zzb()) {
                doFinal = new byte[0];
            }
            byte[][] bArr4 = {bArr2, doFinal};
            byte[] zza2 = this.zzc.zza(zzb, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr5 = bArr4[i10];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                zza2 = zzlx.zzd(zzlw.zzb(zza2), this.zzc.zza(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length2 = bArr6.length;
            if (length2 >= 16) {
                int length3 = zza2.length;
                if (length2 >= length3) {
                    int i11 = length2 - length3;
                    zzd = Arrays.copyOf(bArr6, length2);
                    for (int i12 = 0; i12 < zza2.length; i12++) {
                        int i13 = i11 + i12;
                        zzd[i13] = (byte) (zzd[i13] ^ zza2[i12]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                zzd = zzlx.zzd(zzlw.zza(bArr6), zzlw.zzb(zza2));
            }
            if (zzlx.zzb(copyOfRange, this.zzc.zza(zzd, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
