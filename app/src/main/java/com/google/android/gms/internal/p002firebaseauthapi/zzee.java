package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzee  reason: invalid package */
/* loaded from: classes2.dex */
final class zzee {
    public static void zza(zzij zzijVar) throws GeneralSecurityException {
        zzmf.zzf(zzc(zzijVar.zze().zzf()));
        zzb(zzijVar.zze().zzg());
        if (zzijVar.zzh() != 2) {
            zzbq.zzc(zzijVar.zza().zzd());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zzb(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zziz.zza(i10))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int zzc(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zziu.zza(i10))));
            }
            return 2;
        }
        return 1;
    }

    public static int zzd(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzia.zza(i10))));
            }
        }
        return i12;
    }
}
