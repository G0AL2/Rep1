package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzahc implements zzyg {
    private final zzee zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzahc(int i10, zzee zzeeVar, int i11) {
        this.zzc = i10;
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyf zza(zzys zzysVar, long j10) throws IOException {
        int zza;
        int zza2;
        long j11;
        long zzf = zzysVar.zzf();
        int min = (int) Math.min(112800L, zzysVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int zzd = zzdyVar.zzd();
        long j12 = -1;
        long j13 = -1;
        long j14 = -9223372036854775807L;
        while (zzdyVar.zza() >= 188 && (zza2 = (zza = zzaho.zza(zzdyVar.zzH(), zzdyVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaho.zzb(zzdyVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j10) {
                    if (j14 == -9223372036854775807L) {
                        return zzyf.zzd(zzb2, zzf);
                    }
                    j11 = zzf + j13;
                } else if (100000 + zzb2 > j10) {
                    j11 = zzf + zza;
                } else {
                    j13 = zza;
                    j14 = zzb2;
                }
                return zzyf.zze(j11);
            }
            zzdyVar.zzF(zza2);
            j12 = zza2;
        }
        return j14 != -9223372036854775807L ? zzyf.zzf(j14, zzf + j12) : zzyf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}
