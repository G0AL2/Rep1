package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwt {
    private final zzgfw zza;

    private zzfwt(zzgfw zzgfwVar) {
        this.zza = zzgfwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzfwt zza(zzgfw zzgfwVar) throws GeneralSecurityException {
        if (zzgfwVar == null || zzgfwVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwt(zzgfwVar);
    }

    public static final zzfwt zzb(zzfwr zzfwrVar) throws GeneralSecurityException {
        zzfwu zzd = zzfwu.zzd();
        zzd.zzc(zzfwrVar.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzfxl.zza(this.zza).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgfw zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxk.zze(cls);
        if (zze != null) {
            zzfxl.zzb(this.zza);
            zzfxc zzc = zzfxc.zzc(zze);
            for (zzgfv zzgfvVar : this.zza.zzh()) {
                if (zzgfvVar.zzi() == 3) {
                    zzfwz zza = zzc.zza(zzfxk.zzf(zzgfvVar.zzc(), zze), zzgfvVar);
                    if (zzgfvVar.zza() == this.zza.zzc()) {
                        zzc.zzf(zza);
                    }
                }
            }
            return zzfxk.zzi(zzc, cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
