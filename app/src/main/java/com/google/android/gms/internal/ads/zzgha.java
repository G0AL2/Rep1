package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgha implements zzgie {
    private static final ThreadLocal zza = new zzggz();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgha(byte[] bArr, int i10) throws GeneralSecurityException {
        if (zzfze.zza(2)) {
            zzgim.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) zza.get()).getBlockSize();
            this.zzd = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.zzc = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void zzc(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzc);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.zzb, ivParameterSpec);
        } else {
            cipher.init(2, this.zzb, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int i11 = this.zzc;
            int i12 = length - i11;
            byte[] bArr3 = new byte[i12];
            zzc(bArr, i11, i12, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - i10) {
            byte[] bArr2 = new byte[i10 + length];
            byte[] zza2 = zzgik.zza(i10);
            System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
            zzc(bArr, 0, length, bArr2, this.zzc, zza2, true);
            return bArr2;
        }
        int i11 = this.zzc;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11));
    }
}
