package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzfwy {
    @Deprecated
    public static final zzfwt zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgfw zzg = zzgfw.zzg(bArr, zzgkc.zza());
            for (zzgfv zzgfvVar : zzg.zzh()) {
                if (zzgfvVar.zzc().zzi() == 2 || zzgfvVar.zzc().zzi() == 3 || zzgfvVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwt.zza(zzg);
        } catch (zzglc unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
