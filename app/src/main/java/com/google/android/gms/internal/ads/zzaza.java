package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaza {
    private static final byte[] zza = {0, 0, 0, 1};
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair zza(byte[] bArr) {
        zzazg zzazgVar = new zzazg(bArr, bArr.length);
        int zzc2 = zzc(zzazgVar);
        int zzd = zzd(zzazgVar);
        int zza2 = zzazgVar.zza(4);
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzazgVar);
            if (zzc(zzazgVar) == 22) {
                zza2 = zzazgVar.zza(4);
            }
        }
        int i10 = zzc[zza2];
        zzayz.zzc(i10 != -1);
        return Pair.create(Integer.valueOf(zzd), Integer.valueOf(i10));
    }

    public static byte[] zzb(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zza, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    private static int zzc(zzazg zzazgVar) {
        int zza2 = zzazgVar.zza(5);
        return zza2 == 31 ? zzazgVar.zza(6) + 32 : zza2;
    }

    private static int zzd(zzazg zzazgVar) {
        int zza2 = zzazgVar.zza(4);
        if (zza2 == 15) {
            return zzazgVar.zza(24);
        }
        zzayz.zzc(zza2 < 13);
        return zzb[zza2];
    }
}
