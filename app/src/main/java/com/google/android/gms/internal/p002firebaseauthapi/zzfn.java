package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfn  reason: invalid package */
/* loaded from: classes2.dex */
final class zzfn extends zzfe {
    final /* synthetic */ zzfo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzfo zzfoVar, Class cls) {
        super(cls);
        this.zza = zzfoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzjf.zze(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzjf zzjfVar = (zzjf) zzaaqVar;
        zzjb zzb = zzjc.zzb();
        zzb.zzc(0);
        zzb.zzb(zzjfVar.zzf());
        zzb.zza(zzyi.zzn(zzmy.zza(zzjfVar.zza())));
        return (zzjc) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzfo.zzi(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzfo.zzi(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzfo.zzi(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzfo.zzi(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzfo.zzi(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzfo.zzi(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzfo.zzi(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzfo.zzi(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzfo.zzi(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzfo.zzi(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzjf zzjfVar = (zzjf) zzaaqVar;
        if (zzjfVar.zza() >= 16) {
            zzfo.zzn(zzjfVar.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
