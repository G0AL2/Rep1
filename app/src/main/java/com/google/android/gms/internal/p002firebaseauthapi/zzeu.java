package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeu  reason: invalid package */
/* loaded from: classes2.dex */
final class zzeu {
    private final zzei zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeu(zzei zzeiVar) {
        this.zza = zzeiVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza = zznb.zza(bArr2, bArr);
        byte[] zzc = zzlx.zzc(bArr, zznb.zzb(bArr2));
        byte[] zzd = zzet.zzd(zzet.zzb);
        zzei zzeiVar = this.zza;
        return zzeiVar.zzb(null, zza, "eae_prk", zzc, "shared_secret", zzd, zzeiVar.zza());
    }
}
