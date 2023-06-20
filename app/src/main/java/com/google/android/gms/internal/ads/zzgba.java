package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgba extends zzgar {
    final /* synthetic */ zzgbb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgba(zzgbb zzgbbVar, Class cls) {
        super(cls);
        this.zza = zzgbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgep zzgepVar = (zzgep) zzgmaVar;
        zzgel zzc = zzgem.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgepVar.zzg());
        zzc.zza(zzgji.zzv(zzgik.zza(zzgepVar.zza())));
        return (zzgem) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgep.zzf(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgbb.zzm(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgbb.zzm(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgbb.zzm(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgbb.zzm(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgbb.zzm(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgbb.zzm(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgbb.zzm(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgbb.zzm(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgbb.zzm(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgbb.zzm(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgep zzgepVar = (zzgep) zzgmaVar;
        if (zzgepVar.zza() >= 16) {
            zzgbb.zzn(zzgepVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
