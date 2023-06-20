package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzck  reason: invalid package */
/* loaded from: classes2.dex */
final class zzck extends zzfe {
    final /* synthetic */ zzcl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzck(zzcl zzclVar, Class cls) {
        super(cls);
        this.zza = zzclVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzhm.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhi zzb = zzhj.zzb();
        zzb.zza(zzyi.zzn(zzmy.zza(((zzhm) zzaaqVar).zza())));
        zzb.zzb(0);
        return (zzhj) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzcl.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzcl.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzcl.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzcl.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzna.zzb(((zzhm) zzaaqVar).zza());
    }
}
