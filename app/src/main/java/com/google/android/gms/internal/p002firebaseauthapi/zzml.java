package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzml implements zzmp {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmp
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
