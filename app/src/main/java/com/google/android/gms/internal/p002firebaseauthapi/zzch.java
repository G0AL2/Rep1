package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzch  reason: invalid package */
/* loaded from: classes2.dex */
final class zzch extends zzfe {
    final /* synthetic */ zzci zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzch(zzci zzciVar, Class cls) {
        super(cls);
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzhg.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhc zzb = zzhd.zzb();
        zzb.zza(zzyi.zzn(zzmy.zza(((zzhg) zzaaqVar).zza())));
        zzb.zzb(0);
        return (zzhd) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzci.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzci.zzg(16, 3));
        hashMap.put("AES256_GCM", zzci.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzci.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzna.zzb(((zzhg) zzaaqVar).zza());
    }
}
