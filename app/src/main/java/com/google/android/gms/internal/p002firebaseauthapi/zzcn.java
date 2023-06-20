package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcn  reason: invalid package */
/* loaded from: classes2.dex */
final class zzcn extends zzfe {
    final /* synthetic */ zzco zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzco zzcoVar, Class cls) {
        super(cls);
        this.zza = zzcoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzhy.zzc(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhy zzhyVar = (zzhy) zzaaqVar;
        zzhu zzb = zzhv.zzb();
        zzb.zzb(0);
        zzb.zza(zzyi.zzn(zzmy.zza(32)));
        return (zzhv) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzfd(zzhy.zzb(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzfd(zzhy.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhy zzhyVar = (zzhy) zzaaqVar;
    }
}
