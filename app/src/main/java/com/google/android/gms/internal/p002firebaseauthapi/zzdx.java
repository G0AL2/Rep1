package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzdx extends zzfg {
    public zzdx() {
        super(zzip.class, new zzdw(zzat.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzip.zzf(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzip zzipVar = (zzip) zzaaqVar;
        zzna.zzc(zzipVar.zza(), 0);
        zzee.zza(zzipVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 5;
    }
}
