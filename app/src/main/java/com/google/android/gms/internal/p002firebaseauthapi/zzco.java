package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzco  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzco extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco() {
        super(zzhv.class, new zzcm(zzan.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzcn(this, zzhy.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzhv.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhv zzhvVar = (zzhv) zzaaqVar;
        zzna.zzc(zzhvVar.zza(), 0);
        if (zzhvVar.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
