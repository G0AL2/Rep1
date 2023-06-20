package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzes  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzes extends zzfg {
    public zzes() {
        super(zzjw.class, new zzer(zzat.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzjw.zzf(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzjw zzjwVar = (zzjw) zzaaqVar;
        zzna.zzc(zzjwVar.zza(), 0);
        if (zzjwVar.zzl()) {
            zzet.zza(zzjwVar.zzb());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 5;
    }
}
