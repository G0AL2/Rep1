package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen  reason: invalid package */
/* loaded from: classes2.dex */
final class zzen {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzej zza(zzjq zzjqVar) throws GeneralSecurityException {
        if (zzjqVar.zzd() == 3) {
            return new zzeg(16);
        }
        if (zzjqVar.zzd() == 4) {
            return new zzeg(32);
        }
        if (zzjqVar.zzd() == 5) {
            return new zzeh();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzei zzb(zzjq zzjqVar) {
        if (zzjqVar.zze() == 3) {
            return new zzei("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeu zzc(zzjq zzjqVar) {
        if (zzjqVar.zzf() == 3) {
            return new zzeu(new zzei("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
