package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzafb extends zzafl {
    private zzze zza;
    private zzafa zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final long zza(zzdy zzdyVar) {
        if (zzd(zzdyVar.zzH())) {
            int i10 = (zzdyVar.zzH()[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int zza = zzza.zza(zzdyVar, i10);
                zzdyVar.zzF(0);
                return zza;
            }
            zzdyVar.zzG(4);
            zzdyVar.zzu();
            int zza2 = zzza.zza(zzdyVar, i10);
            zzdyVar.zzF(0);
            return zza2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzc(zzdy zzdyVar, long j10, zzafi zzafiVar) {
        byte[] zzH = zzdyVar.zzH();
        zzze zzzeVar = this.zza;
        if (zzzeVar == null) {
            zzze zzzeVar2 = new zzze(zzH, 17);
            this.zza = zzzeVar2;
            zzafiVar.zza = zzzeVar2.zzc(Arrays.copyOfRange(zzH, 9, zzdyVar.zzd()), null);
            return true;
        } else if ((zzH[0] & Byte.MAX_VALUE) == 3) {
            zzzd zzb = zzzb.zzb(zzdyVar);
            zzze zzf = zzzeVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzafa(zzf, zzb);
            return true;
        } else if (zzd(zzH)) {
            zzafa zzafaVar = this.zzb;
            if (zzafaVar != null) {
                zzafaVar.zza(j10);
                zzafiVar.zzb = this.zzb;
            }
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        } else {
            return true;
        }
    }
}
