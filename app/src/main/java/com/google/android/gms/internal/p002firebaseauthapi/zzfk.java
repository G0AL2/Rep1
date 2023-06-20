package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfk  reason: invalid package */
/* loaded from: classes2.dex */
final class zzfk extends zzfe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfk(zzfl zzflVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzfz.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzfz zzfzVar = (zzfz) zzaaqVar;
        zzfv zzb = zzfw.zzb();
        zzb.zzc(0);
        zzb.zza(zzyi.zzn(zzmy.zza(zzfzVar.zza())));
        zzb.zzb(zzfzVar.zze());
        return (zzfw) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzfy zzb = zzfz.zzb();
        zzb.zza(32);
        zzgb zzb2 = zzgc.zzb();
        zzb2.zza(16);
        zzb.zzb((zzgc) zzb2.zzk());
        hashMap.put("AES_CMAC", new zzfd((zzfz) zzb.zzk(), 1));
        zzfy zzb3 = zzfz.zzb();
        zzb3.zza(32);
        zzgb zzb4 = zzgc.zzb();
        zzb4.zza(16);
        zzb3.zzb((zzgc) zzb4.zzk());
        hashMap.put("AES256_CMAC", new zzfd((zzfz) zzb3.zzk(), 1));
        zzfy zzb5 = zzfz.zzb();
        zzb5.zza(32);
        zzgb zzb6 = zzgc.zzb();
        zzb6.zza(16);
        zzb5.zzb((zzgc) zzb6.zzk());
        hashMap.put("AES256_CMAC_RAW", new zzfd((zzfz) zzb5.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzfz zzfzVar = (zzfz) zzaaqVar;
        zzfl.zzi(zzfzVar.zze());
        zzfl.zzn(zzfzVar.zza());
    }
}
