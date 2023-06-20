package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfyq extends zzgar {
    final /* synthetic */ zzfyr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyq(zzfyr zzfyrVar, Class cls) {
        super(cls);
        this.zza = zzfyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzggy zzggyVar = (zzggy) zzgmaVar;
        zzggu zzc = zzggv.zzc();
        zzc.zzb(0);
        zzc.zza(zzgji.zzv(zzgik.zza(32)));
        return (zzggv) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzggy.zzd(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgaq(zzggy.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgaq(zzggy.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzggy zzggyVar = (zzggy) zzgmaVar;
    }
}
