package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdk  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdk implements zzan {
    private static final ThreadLocal zza = new zzdj();
    private final SecretKey zzb;

    public zzdk(byte[] bArr) throws GeneralSecurityException {
        zzna.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (zzmz.zzb()) {
                    ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = zza;
            ((Cipher) threadLocal.get()).init(2, this.zzb, ivParameterSpec);
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
