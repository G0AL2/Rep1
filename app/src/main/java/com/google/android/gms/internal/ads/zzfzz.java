package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzz implements zzgac {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzz(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 != 16) {
            if (i10 == 32) {
                return zzgan.zze;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzgan.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzfyu(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
