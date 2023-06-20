package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxr extends zzgar {
    final /* synthetic */ zzfxs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxr(zzfxs zzfxsVar, Class cls) {
        super(cls);
        this.zza = zzfxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgbv zzgbvVar = (zzgbv) zzgmaVar;
        new zzfxv();
        zzgby zzf = zzfxu.zzf(zzgbvVar.zze());
        zzgma zza = new zzgbb().zza().zza(zzgbvVar.zzf());
        zzgbr zzc = zzgbs.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgem) zza);
        zzc.zzc(0);
        return (zzgbs) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgbv.zzd(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfxs.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfxs.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfxs.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfxs.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgbv zzgbvVar = (zzgbv) zzgmaVar;
        ((zzfxu) new zzfxv().zza()).zzd(zzgbvVar.zze());
        new zzgbb().zza().zzd(zzgbvVar.zzf());
        zzgim.zza(zzgbvVar.zze().zza());
    }
}
