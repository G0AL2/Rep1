package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxf implements zzfxj {
    final /* synthetic */ zzfwo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxf(zzfwo zzfwoVar) {
        this.zza = zzfwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zza(Class cls) throws GeneralSecurityException {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfwo zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final Set zze() {
        return Collections.singleton(this.zza.zzc());
    }
}
