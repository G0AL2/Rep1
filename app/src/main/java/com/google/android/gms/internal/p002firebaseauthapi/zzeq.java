package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzeq extends zzfh {
    public zzeq() {
        super(zzjt.class, zzjw.class, new zzeo(zzas.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzh(int i10, int i11, int i12, int i13) {
        zzjp zza = zzjq.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i12);
        zzjm zza2 = zzjn.zza();
        zza2.zza((zzjq) zza.zzk());
        return new zzfd((zzjn) zza2.zzk(), i13);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzep(this, zzjn.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzjt.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzjt zzjtVar = (zzjt) zzaaqVar;
        if (!zzjtVar.zzf().zzs()) {
            if (zzjtVar.zzk()) {
                zzna.zzc(zzjtVar.zza(), 0);
                zzet.zza(zzjtVar.zze().zzb());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfh
    public final /* synthetic */ zzaaq zzg(zzaaq zzaaqVar) throws GeneralSecurityException {
        return ((zzjt) zzaaqVar).zze();
    }
}
