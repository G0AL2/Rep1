package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdp extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdp() {
        super(zzhp.class, new zzdn(zzar.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzdo(this, zzhs.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzhp.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhp zzhpVar = (zzhp) zzaaqVar;
        zzna.zzc(zzhpVar.zza(), 0);
        if (zzhpVar.zze().zzd() == 64) {
            return;
        }
        int zzd = zzhpVar.zze().zzd();
        throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
