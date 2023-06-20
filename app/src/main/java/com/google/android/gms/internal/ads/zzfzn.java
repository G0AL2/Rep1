package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzn extends zzgar {
    final /* synthetic */ zzfzo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzn(zzfzo zzfzoVar, Class cls) {
        super(cls);
        this.zza = zzfzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdt zzgdtVar = (zzgdt) zzgmaVar;
        KeyPair zzb = zzghq.zzb(zzghq.zze(zzfzx.zzc(zzgdtVar.zze().zzf().zzg())));
        ECPoint w10 = ((ECPublicKey) zzb.getPublic()).getW();
        zzgeb zzd = zzgec.zzd();
        zzd.zzb(0);
        zzd.zza(zzgdtVar.zze());
        zzd.zzc(zzgji.zzv(w10.getAffineX().toByteArray()));
        zzd.zzd(zzgji.zzv(w10.getAffineY().toByteArray()));
        zzgdy zzc = zzgdz.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgec) zzd.zzal());
        zzc.zza(zzgji.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgdz) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgdt.zzd(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzfwr zza = zzfws.zza("AES128_GCM");
        bArr = zzfzo.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfzo.zzh(4, 5, 3, zza, bArr, 1));
        zzfwr zza2 = zzfws.zza("AES128_GCM");
        bArr2 = zzfzo.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzo.zzh(4, 5, 3, zza2, bArr2, 3));
        zzfwr zza3 = zzfws.zza("AES128_GCM");
        bArr3 = zzfzo.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfzo.zzh(4, 5, 4, zza3, bArr3, 1));
        zzfwr zza4 = zzfws.zza("AES128_GCM");
        bArr4 = zzfzo.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzo.zzh(4, 5, 4, zza4, bArr4, 3));
        zzfwr zza5 = zzfws.zza("AES128_GCM");
        bArr5 = zzfzo.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfzo.zzh(4, 5, 4, zza5, bArr5, 3));
        zzfwr zza6 = zzfws.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzfzo.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzo.zzh(4, 5, 3, zza6, bArr6, 1));
        zzfwr zza7 = zzfws.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzfzo.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzo.zzh(4, 5, 3, zza7, bArr7, 3));
        zzfwr zza8 = zzfws.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzfzo.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzo.zzh(4, 5, 4, zza8, bArr8, 1));
        zzfwr zza9 = zzfws.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzfzo.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzo.zzh(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzfzx.zza(((zzgdt) zzgmaVar).zze());
    }
}
