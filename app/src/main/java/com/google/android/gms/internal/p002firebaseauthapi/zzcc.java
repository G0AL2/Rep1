package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzcc extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcc() {
        super(zzgl.class, new zzca(zzms.class));
    }

    public static final void zzh(zzgl zzglVar) throws GeneralSecurityException {
        zzna.zzc(zzglVar.zza(), 0);
        zzna.zzb(zzglVar.zzg().zzd());
        zzi(zzglVar.zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzi(zzgr zzgrVar) throws GeneralSecurityException {
        if (zzgrVar.zza() < 12 || zzgrVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzcb(this, zzgo.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzgl.zze(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzh((zzgl) zzaaqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
