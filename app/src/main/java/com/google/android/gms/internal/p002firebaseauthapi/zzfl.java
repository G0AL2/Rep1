package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfl  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfl extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfl() {
        super(zzfw.class, new zzfj(zzbe.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzi(zzgc zzgcVar) throws GeneralSecurityException {
        if (zzgcVar.zza() >= 10) {
            if (zzgcVar.zza() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzfk(this, zzfz.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzfw.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzfw zzfwVar = (zzfw) zzaaqVar;
        zzna.zzc(zzfwVar.zza(), 0);
        zzn(zzfwVar.zzf().zzd());
        zzi(zzfwVar.zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
