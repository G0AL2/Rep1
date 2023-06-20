package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaw  reason: invalid package */
/* loaded from: classes2.dex */
class zzaw implements zzau {
    private final zzfg zza;
    private final Class zzb;

    public zzaw(zzfg zzfgVar, Class cls) {
        if (!zzfgVar.zzm().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzfgVar.toString(), cls.getName()));
        }
        this.zza = zzfgVar;
        this.zzb = cls;
    }

    private final zzav zze() {
        return new zzav(this.zza.zza());
    }

    private final Object zzf(zzaaq zzaaqVar) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzd(zzaaqVar);
            return this.zza.zzl(zzaaqVar, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzjz zza(zzyi zzyiVar) throws GeneralSecurityException {
        try {
            zzaaq zza = zze().zza(zzyiVar);
            zzjy zza2 = zzjz.zza();
            zza2.zza(this.zza.zzc());
            zza2.zzb(zza.zzo());
            zza2.zzc(this.zza.zzf());
            return (zzjz) zza2.zzk();
        } catch (zzzt e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzaaq zzb(zzyi zzyiVar) throws GeneralSecurityException {
        try {
            return zze().zza(zzyiVar);
        } catch (zzzt e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final Object zzc(zzyi zzyiVar) throws GeneralSecurityException {
        try {
            return zzf(this.zza.zzb(zzyiVar));
        } catch (zzzt e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzk().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final Object zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.zza.zzk().getName());
        if (this.zza.zzk().isInstance(zzaaqVar)) {
            return zzf(zzaaqVar);
        }
        throw new GeneralSecurityException(concat);
    }
}
