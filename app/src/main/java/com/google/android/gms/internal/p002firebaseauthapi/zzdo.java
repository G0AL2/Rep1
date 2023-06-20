package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdo  reason: invalid package */
/* loaded from: classes2.dex */
final class zzdo extends zzfe {
    final /* synthetic */ zzdp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdp zzdpVar, Class cls) {
        super(cls);
        this.zza = zzdpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzhs.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzho zzb = zzhp.zzb();
        zzb.zza(zzyi.zzn(zzmy.zza(((zzhs) zzaaqVar).zza())));
        zzb.zzb(0);
        return (zzhp) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzhr zzb = zzhs.zzb();
        zzb.zza(64);
        hashMap.put("AES256_SIV", new zzfd((zzhs) zzb.zzk(), 1));
        zzhr zzb2 = zzhs.zzb();
        zzb2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzfd((zzhs) zzb2.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhs zzhsVar = (zzhs) zzaaqVar;
        if (zzhsVar.zza() == 64) {
            return;
        }
        int zza = zzhsVar.zza();
        throw new InvalidAlgorithmParameterException("invalid key size: " + zza + ". Valid keys must have 64 bytes.");
    }
}
