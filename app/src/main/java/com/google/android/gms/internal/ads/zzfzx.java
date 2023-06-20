package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzx {
    public static void zza(zzgdw zzgdwVar) throws GeneralSecurityException {
        zzghq.zze(zzc(zzgdwVar.zzf().zzg()));
        zzb(zzgdwVar.zzf().zzh());
        if (zzgdwVar.zzi() != 2) {
            zzfxk.zzc(zzgdwVar.zza().zze());
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
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgej.zza(i10))));
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
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgeh.zza(i10))));
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
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzgdn.zza(i10))));
            }
        }
        return i12;
    }
}
