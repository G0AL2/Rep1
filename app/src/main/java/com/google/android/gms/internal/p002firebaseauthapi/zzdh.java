package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdh extends zzdf {
    public zzdh(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdf
    final zzdd zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzdg(bArr, i10);
    }
}
