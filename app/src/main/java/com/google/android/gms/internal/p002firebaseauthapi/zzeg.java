package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeg  reason: invalid package */
/* loaded from: classes2.dex */
final class zzeg implements zzej {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeg(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 != 16) {
            if (i10 == 32) {
                return zzet.zze;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzet.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzej
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzdb(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
