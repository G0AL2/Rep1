package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaaj implements zzyg {
    private final zzze zza;
    private final int zzb;
    private final zzyz zzc = new zzyz();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaaj(zzze zzzeVar, int i10, zzaai zzaaiVar) {
        this.zza = zzzeVar;
        this.zzb = i10;
    }

    private final long zzc(zzys zzysVar) throws IOException {
        while (zzysVar.zze() < zzysVar.zzd() - 6) {
            zzze zzzeVar = this.zza;
            int i10 = this.zzb;
            zzyz zzyzVar = this.zzc;
            long zze = zzysVar.zze();
            byte[] bArr = new byte[2];
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
                zzysVar.zzj();
                zzylVar.zzl((int) (zze - zzysVar.zzf()), false);
            } else {
                zzdy zzdyVar = new zzdy(16);
                System.arraycopy(bArr, 0, zzdyVar.zzH(), 0, 2);
                zzdyVar.zzE(zzyv.zza(zzysVar, zzdyVar.zzH(), 2, 14));
                zzysVar.zzj();
                zzylVar.zzl((int) (zze - zzysVar.zzf()), false);
                if (zzza.zzc(zzdyVar, zzzeVar, i10, zzyzVar)) {
                    break;
                }
            }
            zzylVar.zzl(1, false);
        }
        if (zzysVar.zze() >= zzysVar.zzd() - 6) {
            ((zzyl) zzysVar).zzl((int) (zzysVar.zzd() - zzysVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyf zza(zzys zzysVar, long j10) throws IOException {
        long zzf = zzysVar.zzf();
        long zzc = zzc(zzysVar);
        long zze = zzysVar.zze();
        ((zzyl) zzysVar).zzl(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzysVar);
        return (zzc > j10 || zzc2 <= j10) ? zzc2 <= j10 ? zzyf.zzf(zzc2, zzysVar.zze()) : zzyf.zzd(zzc, zzf) : zzyf.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final /* synthetic */ void zzb() {
    }
}
