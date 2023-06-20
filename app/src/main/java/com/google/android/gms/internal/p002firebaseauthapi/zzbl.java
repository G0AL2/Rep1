package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbl  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbl extends zzaw implements zzbk {
    private final zzfh zza;
    private final zzfg zzb;

    public zzbl(zzfh zzfhVar, zzfg zzfgVar, Class cls) {
        super(zzfhVar, cls);
        this.zza = zzfhVar;
        this.zzb = zzfgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbk
    public final zzjz zze(zzyi zzyiVar) throws GeneralSecurityException {
        try {
            zzaaq zzb = this.zza.zzb(zzyiVar);
            this.zza.zzd(zzb);
            zzaaq zzg = this.zza.zzg(zzb);
            this.zzb.zzd(zzg);
            zzjy zza = zzjz.zza();
            zza.zza(this.zzb.zzc());
            zza.zzb(zzg.zzo());
            zza.zzc(this.zzb.zzf());
            return (zzjz) zza.zzk();
        } catch (zzzt e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
