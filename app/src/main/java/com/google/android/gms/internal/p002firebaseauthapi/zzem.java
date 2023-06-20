package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzem  reason: invalid package */
/* loaded from: classes2.dex */
final class zzem implements zzat {
    private final zzjw zza;
    private final zzej zzb;
    private final zzeu zzc;
    private final zzei zzd;

    private zzem(zzjw zzjwVar, zzeu zzeuVar, zzei zzeiVar, zzej zzejVar, byte[] bArr) {
        this.zza = zzjwVar;
        this.zzc = zzeuVar;
        this.zzd = zzeiVar;
        this.zzb = zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzem zza(zzjw zzjwVar) throws GeneralSecurityException {
        if (!zzjwVar.zzg().zzs()) {
            zzjq zzb = zzjwVar.zzb();
            return new zzem(zzjwVar, zzen.zzc(zzb), zzen.zzb(zzb), zzen.zza(zzb), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
