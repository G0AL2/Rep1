package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzci  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzci extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci() {
        super(zzhd.class, new zzcg(zzan.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzg(int i10, int i11) {
        zzhf zzb = zzhg.zzb();
        zzb.zza(i10);
        return new zzfd((zzhg) zzb.zzk(), i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzch(this, zzhg.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzhd.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhd zzhdVar = (zzhd) zzaaqVar;
        zzna.zzc(zzhdVar.zza(), 0);
        zzna.zzb(zzhdVar.zze().zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
