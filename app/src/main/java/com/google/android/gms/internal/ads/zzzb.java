package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzb {
    public static zzbl zza(zzys zzysVar, boolean z10) throws IOException {
        zzbl zza = new zzzi().zza(zzysVar, z10 ? null : zzaca.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzzd zzb(zzdy zzdyVar) {
        zzdyVar.zzG(1);
        int zzm = zzdyVar.zzm();
        long zzc = zzdyVar.zzc() + zzm;
        int i10 = zzm / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzr = zzdyVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzr;
            jArr2[i11] = zzdyVar.zzr();
            zzdyVar.zzG(2);
            i11++;
        }
        zzdyVar.zzG((int) (zzc - zzdyVar.zzc()));
        return new zzzd(jArr, jArr2);
    }
}
