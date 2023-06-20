package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzcr extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcr() {
        super(zzku.class, new zzcp(zzan.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzcq(this, zzkx.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzku.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzna.zzc(((zzku) zzaaqVar).zza(), 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 6;
    }
}
