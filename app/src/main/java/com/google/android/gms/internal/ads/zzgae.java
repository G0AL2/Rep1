package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgae implements zzfwm {
    private final zzgfd zza;
    private final zzgac zzb;
    private final zzgao zzc;
    private final zzgab zzd;

    private zzgae(zzgfd zzgfdVar, zzgao zzgaoVar, zzgab zzgabVar, zzgac zzgacVar, int i10, byte[] bArr) {
        this.zza = zzgfdVar;
        this.zzc = zzgaoVar;
        this.zzd = zzgabVar;
        this.zzb = zzgacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgae zza(zzgfd zzgfdVar) throws GeneralSecurityException {
        if (zzgfdVar.zzk()) {
            if (zzgfdVar.zzf().zzl()) {
                if (!zzgfdVar.zzg().zzD()) {
                    zzgfa zzc = zzgfdVar.zzf().zzc();
                    zzgao zzc2 = zzgah.zzc(zzc);
                    zzgab zzb = zzgah.zzb(zzc);
                    zzgac zza = zzgah.zza(zzc);
                    int zzg = zzc.zzg();
                    if (zzg - 2 == 1) {
                        return new zzgae(zzgfdVar, zzc2, zzb, zza, 32, null);
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgeu.zza(zzg)));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
