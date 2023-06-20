package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbr  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbr {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzkr zza(zzkm zzkmVar) {
        zzko zza2 = zzkr.zza();
        zza2.zzb(zzkmVar.zzb());
        for (zzkl zzklVar : zzkmVar.zzg()) {
            zzkp zzb = zzkq.zzb();
            zzb.zzb(zzklVar.zzb().zze());
            zzb.zzd(zzklVar.zzh());
            zzb.zzc(zzklVar.zzi());
            zzb.zza(zzklVar.zza());
            zza2.zza((zzkq) zzb.zzk());
        }
        return (zzkr) zza2.zzk();
    }

    public static void zzb(zzkm zzkmVar) throws GeneralSecurityException {
        int zzb = zzkmVar.zzb();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzkl zzklVar : zzkmVar.zzg()) {
            if (zzklVar.zzh() == 3) {
                if (zzklVar.zzg()) {
                    if (zzklVar.zzi() != 2) {
                        if (zzklVar.zzh() != 2) {
                            if (zzklVar.zza() == zzb) {
                                if (z10) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z10 = true;
                            }
                            z11 &= zzklVar.zzb().zzh() == 5;
                            i10++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzklVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzklVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzklVar.zza())));
                }
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
