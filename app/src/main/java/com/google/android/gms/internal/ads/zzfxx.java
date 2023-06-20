package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxx extends zzgar {
    final /* synthetic */ zzfxy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxx(zzfxy zzfxyVar, Class cls) {
        super(cls);
        this.zza = zzfxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgck zzgckVar = (zzgck) zzgmaVar;
        zzgcg zzc = zzgch.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(zzgckVar.zza())));
        zzc.zzb(zzgckVar.zzf());
        zzc.zzc(0);
        return (zzgch) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgck.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfxy.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfxy.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfxy.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfxy.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgck zzgckVar = (zzgck) zzgmaVar;
        zzgim.zza(zzgckVar.zza());
        if (zzgckVar.zzf().zza() != 12 && zzgckVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
