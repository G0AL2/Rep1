package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcu  reason: invalid package */
/* loaded from: classes2.dex */
final class zzcu extends zzfe {
    final /* synthetic */ zzcv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, Class cls) {
        super(cls);
        this.zza = zzcvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzld.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzkz zzb = zzla.zzb();
        zzb.zza((zzld) zzaaqVar);
        zzb.zzb(0);
        return (zzla) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzld zzldVar = (zzld) zzaaqVar;
        if (zzldVar.zze().isEmpty() || !zzldVar.zzf()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
