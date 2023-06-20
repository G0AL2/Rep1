package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeh  reason: invalid package */
/* loaded from: classes2.dex */
final class zzeh implements zzej {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final byte[] zzb() {
        return zzet.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzde(bArr).zzc(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
