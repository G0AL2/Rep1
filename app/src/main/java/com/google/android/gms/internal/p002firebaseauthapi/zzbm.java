package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbm  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbm implements zzbp {
    final /* synthetic */ zzfg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final zzau zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzaw(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final zzau zzb() {
        zzfg zzfgVar = this.zza;
        return new zzaw(zzfgVar, zzfgVar.zzj());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Set zze() {
        return this.zza.zzm();
    }
}
