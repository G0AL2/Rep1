package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzh extends zzgar {
    final /* synthetic */ zzfzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzh(zzfzi zzfziVar, Class cls) {
        super(cls);
        this.zza = zzfziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdb zzc = zzgdc.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(((zzgdf) zzgmaVar).zza())));
        zzc.zzb(0);
        return (zzgdc) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgdf.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgde zzc = zzgdf.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgaq((zzgdf) zzc.zzal(), 1));
        zzgde zzc2 = zzgdf.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgaq((zzgdf) zzc2.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdf zzgdfVar = (zzgdf) zzgmaVar;
        if (zzgdfVar.zza() == 64) {
            return;
        }
        int zza = zzgdfVar.zza();
        throw new InvalidAlgorithmParameterException("invalid key size: " + zza + ". Valid keys must have 64 bytes.");
    }
}
