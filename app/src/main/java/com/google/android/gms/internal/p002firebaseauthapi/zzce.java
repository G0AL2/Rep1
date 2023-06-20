package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzce  reason: invalid package */
/* loaded from: classes2.dex */
final class zzce extends zzfe {
    final /* synthetic */ zzcf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzce(zzcf zzcfVar, Class cls) {
        super(cls);
        this.zza = zzcfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzgx.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgx zzgxVar = (zzgx) zzaaqVar;
        zzgt zzb = zzgu.zzb();
        zzb.zza(zzyi.zzn(zzmy.zza(zzgxVar.zza())));
        zzb.zzb(zzgxVar.zze());
        zzb.zzc(0);
        return (zzgu) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzcf.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzcf.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzcf.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzcf.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgx zzgxVar = (zzgx) zzaaqVar;
        zzna.zzb(zzgxVar.zza());
        if (zzgxVar.zze().zza() != 12 && zzgxVar.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
