package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgnv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!zzg(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !zzg(b12) && !zzg(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
            return;
        }
        throw zzglc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zzg(b11)) {
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
            if (!zzg(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzglc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !zzg(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw zzglc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zze(byte b10) {
        return b10 < -16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzf(byte b10) {
        return b10 < -32;
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }
}
