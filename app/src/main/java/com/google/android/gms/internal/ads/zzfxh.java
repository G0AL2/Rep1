package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxh implements zzfxj {
    final /* synthetic */ zzgau zza;
    final /* synthetic */ zzgas zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxh(zzgau zzgauVar, zzgas zzgasVar) {
        this.zza = zzgauVar;
        this.zzb = zzgasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxe(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zzb() {
        zzgau zzgauVar = this.zza;
        return new zzfxe(zzgauVar, this.zzb, zzgauVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Set zze() {
        return this.zza.zzl();
    }
}
