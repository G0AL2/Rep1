package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbn  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbn implements zzbp {
    final /* synthetic */ zzfh zza;
    final /* synthetic */ zzfg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbn(zzfh zzfhVar, zzfg zzfgVar) {
        this.zza = zzfhVar;
        this.zzb = zzfgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final zzau zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbl(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final zzau zzb() {
        zzfh zzfhVar = this.zza;
        return new zzbl(zzfhVar, this.zzb, zzfhVar.zzj());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Set zze() {
        return this.zza.zzm();
    }
}
