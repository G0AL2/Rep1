package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaho {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzdy zzdyVar, int i10, int i11) {
        zzdyVar.zzF(i10);
        if (zzdyVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzdyVar.zze();
        if ((8388608 & zze) == 0 && ((zze >> 8) & 8191) == i11 && (zze & 32) != 0 && zzdyVar.zzk() >= 7 && zzdyVar.zza() >= 7 && (zzdyVar.zzk() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzdyVar.zzB(bArr, 0, 6);
            byte b10 = bArr[0];
            byte b11 = bArr[1];
            byte b12 = bArr[2];
            long j10 = bArr[3] & 255;
            return ((b11 & 255) << 17) | ((b10 & 255) << 25) | ((b12 & 255) << 9) | (j10 + j10) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
