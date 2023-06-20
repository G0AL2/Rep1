package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfm  reason: invalid package */
/* loaded from: classes2.dex */
final class zzfm extends zzff {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzff
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws GeneralSecurityException {
        zzjc zzjcVar = (zzjc) obj;
        int zzf = zzjcVar.zzf().zzf();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzjcVar.zzg().zzt(), "HMAC");
        int zza = zzjcVar.zzf().zza();
        int i10 = zzf - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new zzmw(new zzmv("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzmw(new zzmv("HMACSHA512", secretKeySpec), zza);
                }
                return new zzmw(new zzmv("HMACSHA256", secretKeySpec), zza);
            }
            return new zzmw(new zzmv("HMACSHA384", secretKeySpec), zza);
        }
        return new zzmw(new zzmv("HMACSHA1", secretKeySpec), zza);
    }
}
