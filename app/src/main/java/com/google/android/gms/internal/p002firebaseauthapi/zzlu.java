package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzlu implements zzan {
    private final zzdb zza;

    public zzlu(byte[] bArr) throws GeneralSecurityException {
        if (zzdl.zza(2)) {
            this.zza = new zzdb(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
