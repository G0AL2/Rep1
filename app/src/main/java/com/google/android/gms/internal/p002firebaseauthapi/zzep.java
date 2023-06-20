package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzep  reason: invalid package */
/* loaded from: classes2.dex */
final class zzep extends zzfe {
    final /* synthetic */ zzeq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzeq zzeqVar, Class cls) {
        super(cls);
        this.zza = zzeqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzjn.zzc(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        byte[] zza = zzmy.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        int i10 = zza[31] & 63;
        zza[31] = (byte) i10;
        zza[31] = (byte) (i10 | 128);
        byte[] zzb = zznb.zzb(zza);
        zzjv zzc = zzjw.zzc();
        zzc.zzc(0);
        zzc.zza(((zzjn) zzaaqVar).zzd());
        zzc.zzb(zzyi.zzn(zzb));
        zzjs zzb2 = zzjt.zzb();
        zzb2.zzc(0);
        zzb2.zzb((zzjw) zzc.zzk());
        zzb2.zza(zzyi.zzn(zza));
        return (zzjt) zzb2.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzeq.zzh(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzeq.zzh(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzeq.zzh(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzeq.zzh(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzeq.zzh(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzeq.zzh(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzet.zza(((zzjn) zzaaqVar).zzd());
    }
}
