package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdu  reason: invalid package */
/* loaded from: classes2.dex */
final class zzdu extends zzfe {
    final /* synthetic */ zzdv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdv zzdvVar, Class cls) {
        super(cls);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzig.zzc(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzig zzigVar = (zzig) zzaaqVar;
        ECParameterSpec zzf = zzmf.zzf(zzee.zzc(zzigVar.zzd().zze().zzf()));
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzmh.zzf.zza("EC");
        keyPairGenerator.initialize(zzf);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        zzio zzc = zzip.zzc();
        zzc.zzb(0);
        zzc.zza(zzigVar.zzd());
        zzc.zzc(zzyi.zzn(w10.getAffineX().toByteArray()));
        zzc.zzd(zzyi.zzn(w10.getAffineY().toByteArray()));
        zzil zzb = zzim.zzb();
        zzb.zzc(0);
        zzb.zzb((zzip) zzc.zzk());
        zzb.zza(zzyi.zzn(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray()));
        return (zzim) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
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
        zzax zza = zzay.zza("AES128_GCM");
        bArr = zzdv.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzdv.zzi(4, 5, 3, zza, bArr, 1));
        zzax zza2 = zzay.zza("AES128_GCM");
        bArr2 = zzdv.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzdv.zzi(4, 5, 3, zza2, bArr2, 3));
        zzax zza3 = zzay.zza("AES128_GCM");
        bArr3 = zzdv.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzdv.zzi(4, 5, 4, zza3, bArr3, 1));
        zzax zza4 = zzay.zza("AES128_GCM");
        bArr4 = zzdv.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzdv.zzi(4, 5, 4, zza4, bArr4, 3));
        zzax zza5 = zzay.zza("AES128_GCM");
        bArr5 = zzdv.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzdv.zzi(4, 5, 4, zza5, bArr5, 3));
        zzax zza6 = zzay.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzdv.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzdv.zzi(4, 5, 3, zza6, bArr6, 1));
        zzax zza7 = zzay.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzdv.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzdv.zzi(4, 5, 3, zza7, bArr7, 3));
        zzax zza8 = zzay.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzdv.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzdv.zzi(4, 5, 4, zza8, bArr8, 1));
        zzax zza9 = zzay.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzdv.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzdv.zzi(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzee.zza(((zzig) zzaaqVar).zzd());
    }
}
