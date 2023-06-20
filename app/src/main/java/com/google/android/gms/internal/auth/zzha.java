package com.google.android.gms.internal.auth;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzha {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzew {
        if (!zze(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
            return;
        }
        throw zzew.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(byte b10, byte b11, char[] cArr, int i10) throws zzew {
        if (b10 >= -62 && !zze(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw zzew.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzew {
        if (!zze(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zze(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzew.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
