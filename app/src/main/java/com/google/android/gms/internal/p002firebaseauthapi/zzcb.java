package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb  reason: invalid package */
/* loaded from: classes2.dex */
final class zzcb extends zzfe {
    final /* synthetic */ zzcc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(zzcc zzccVar, Class cls) {
        super(cls);
        this.zza = zzccVar;
    }

    public static final zzgl zzf(zzgo zzgoVar) throws GeneralSecurityException {
        zzgk zzb = zzgl.zzb();
        zzb.zzb(zzgoVar.zzf());
        zzb.zza(zzyi.zzn(zzmy.zza(zzgoVar.zza())));
        zzb.zzc(0);
        return (zzgl) zzb.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* synthetic */ zzaaq zza(zzyi zzyiVar) throws zzzt {
        return zzgo.zze(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    public final /* bridge */ /* synthetic */ Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException {
        return zzf((zzgo) zzaaqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfe
    /* renamed from: zze */
    public final void zzd(zzgo zzgoVar) throws GeneralSecurityException {
        zzna.zzb(zzgoVar.zza());
        zzcc zzccVar = this.zza;
        zzcc.zzi(zzgoVar.zzf());
    }
}
