package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgaj extends zzgar {
    final /* synthetic */ zzgak zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgaj(zzgak zzgakVar, Class cls) {
        super(cls);
        this.zza = zzgakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        byte[] zzb = zzgin.zzb();
        byte[] zzc = zzgin.zzc(zzb);
        zzgff zzd = zzgfg.zzd();
        zzd.zzc(0);
        zzd.zza(((zzgex) zzgmaVar).zze());
        zzd.zzb(zzgji.zzv(zzc));
        zzgfc zzc2 = zzgfd.zzc();
        zzc2.zzc(0);
        zzc2.zzb((zzgfg) zzd.zzal());
        zzc2.zza(zzgji.zzv(zzb));
        return (zzgfd) zzc2.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgex.zzd(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgak.zzg(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgak.zzg(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgak.zzg(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgak.zzg(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgak.zzg(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgak.zzg(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgan.zza(((zzgex) zzgmaVar).zze());
    }
}
