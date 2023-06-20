package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfya extends zzgar {
    final /* synthetic */ zzfyb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfya(zzfyb zzfybVar, Class cls) {
        super(cls);
        this.zza = zzfybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgcp zzc = zzgcq.zzc();
        zzc.zza(zzgji.zzv(zzgik.zza(((zzgct) zzgmaVar).zza())));
        zzc.zzb(0);
        return (zzgcq) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgct.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfyb.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfyb.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfyb.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfyb.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgim.zza(((zzgct) zzgmaVar).zza());
    }
}
