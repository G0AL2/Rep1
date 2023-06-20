package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgaz extends zzgat {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgaz(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final /* bridge */ /* synthetic */ Object zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgem zzgemVar = (zzgem) zzgmaVar;
        int zzg = zzgemVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgemVar.zzh().zzE(), "HMAC");
        int zza = zzgemVar.zzg().zza();
        int i10 = zzg - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new zzgii(new zzgih("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgii(new zzgih("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgii(new zzgih("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgii(new zzgih("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgii(new zzgih("HMACSHA1", secretKeySpec), zza);
    }
}
