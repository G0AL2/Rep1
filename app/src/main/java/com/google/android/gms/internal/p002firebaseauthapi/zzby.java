package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzby  reason: invalid package */
/* loaded from: classes2.dex */
final class zzby extends zzfe {
    final /* synthetic */ zzbz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzbz zzbzVar, Class cls) {
        super(cls);
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzgi.zzc(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgi zzgiVar = (zzgi) zzaaqVar;
        new zzcc();
        zzgl zzf = zzcb.zzf(zzgiVar.zzd());
        Object zzb = new zzfo().zza().zzb(zzgiVar.zze());
        zzge zzb2 = zzgf.zzb();
        zzb2.zza(zzf);
        zzb2.zzb((zzjc) zzb);
        zzb2.zzc(0);
        return (zzgf) zzb2.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzbz.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzbz.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzbz.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzbz.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgi zzgiVar = (zzgi) zzaaqVar;
        ((zzcb) new zzcc().zza()).zzd(zzgiVar.zzd());
        new zzfo().zza().zzd(zzgiVar.zze());
        zzna.zzb(zzgiVar.zzd().zza());
    }
}
