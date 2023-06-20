package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzahx {
    public static Pair zza(zzys zzysVar) throws IOException {
        zzysVar.zzj();
        zzahw zzd = zzd(1684108385, zzysVar, new zzdy(8));
        ((zzyl) zzysVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzysVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzys zzysVar) throws IOException {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzahw zzd = zzd(1718449184, zzysVar, zzdyVar);
        zzcw.zzf(zzd.zzb >= 16);
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(zzdyVar.zzH(), 0, 16, false);
        zzdyVar.zzF(0);
        int zzi = zzdyVar.zzi();
        int zzi2 = zzdyVar.zzi();
        int zzh = zzdyVar.zzh();
        int zzh2 = zzdyVar.zzh();
        int zzi3 = zzdyVar.zzi();
        int zzi4 = zzdyVar.zzi();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            zzylVar.zzm(bArr, 0, i10, false);
        } else {
            bArr = zzeg.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzyl) zzysVar).zzo((int) (zzysVar.zze() - zzysVar.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzys zzysVar) throws IOException {
        zzdy zzdyVar = new zzdy(8);
        int i10 = zzahw.zza(zzysVar, zzdyVar).zza;
        if (i10 == 1380533830 || i10 == 1380333108) {
            ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, 4, false);
            zzdyVar.zzF(0);
            int zze = zzdyVar.zze();
            if (zze != 1463899717) {
                Log.e("WavHeaderReader", "Unsupported form type: " + zze);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzahw zzd(int i10, zzys zzysVar, zzdy zzdyVar) throws IOException {
        zzahw zza = zzahw.zza(zzysVar, zzdyVar);
        while (true) {
            int i11 = zza.zza;
            if (i11 == i10) {
                return zza;
            }
            Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zza.zzb + 8;
            if (j10 <= 2147483647L) {
                ((zzyl) zzysVar).zzo((int) j10, false);
                zza = zzahw.zza(zzysVar, zzdyVar);
            } else {
                int i12 = zza.zza;
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + i12);
            }
        }
    }
}
