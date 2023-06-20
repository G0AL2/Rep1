package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmw implements zzbe {
    private final zzft zza;
    private final int zzb;

    public zzmw(zzft zzftVar, int i10) throws GeneralSecurityException {
        this.zza = zzftVar;
        this.zzb = i10;
        if (i10 >= 10) {
            zzftVar.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzlx.zzb(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
