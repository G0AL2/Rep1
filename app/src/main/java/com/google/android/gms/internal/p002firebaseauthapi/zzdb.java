package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdb {
    private static final ThreadLocal zza = new zzda();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzdb(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (zzdl.zza(2)) {
            zzna.zzb(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            this.zzc = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        AlgorithmParameterSpec gCMParameterSpec;
        if (bArr.length == 12) {
            boolean z10 = this.zzc;
            int i10 = true != z10 ? 16 : 28;
            int length = bArr2.length;
            if (length >= i10) {
                if (z10 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                if (zzmz.zzb() && zzmz.zza() <= 19) {
                    gCMParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                }
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(2, this.zzb, gCMParameterSpec);
                boolean z11 = this.zzc;
                int i11 = true != z11 ? 0 : 12;
                if (z11) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i11, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
