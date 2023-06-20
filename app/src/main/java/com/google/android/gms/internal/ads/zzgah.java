package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgac zza(zzgfa zzgfaVar) throws GeneralSecurityException {
        if (zzgfaVar.zze() == 3) {
            return new zzfzz(16);
        }
        if (zzgfaVar.zze() == 4) {
            return new zzfzz(32);
        }
        if (zzgfaVar.zze() == 5) {
            return new zzgaa();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgab zzb(zzgfa zzgfaVar) {
        if (zzgfaVar.zzf() == 3) {
            return new zzgab("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgao zzc(zzgfa zzgfaVar) {
        if (zzgfaVar.zzg() == 3) {
            return new zzgao(new zzgab("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
