package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgii implements zzfwx {
    private final zzgbg zza;
    private final int zzb;

    public zzgii(zzgbg zzgbgVar, int i10) throws GeneralSecurityException {
        this.zza = zzgbgVar;
        this.zzb = i10;
        if (i10 >= 10) {
            zzgbgVar.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzghh.zzb(zzb(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
