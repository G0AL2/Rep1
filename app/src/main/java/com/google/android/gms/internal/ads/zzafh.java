package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzafh extends zzafl {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean zzd(zzdy zzdyVar) {
        return zzk(zzdyVar, zza);
    }

    private static boolean zzk(zzdy zzdyVar, byte[] bArr) {
        if (zzdyVar.zza() < 8) {
            return false;
        }
        int zzc = zzdyVar.zzc();
        byte[] bArr2 = new byte[8];
        zzdyVar.zzB(bArr2, 0, 8);
        zzdyVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final long zza(zzdy zzdyVar) {
        byte[] zzH = zzdyVar.zzH();
        int i10 = zzH[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = zzH[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return zzg(i12 * (i13 >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i14 : i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14));
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzc(zzdy zzdyVar, long j10, zzafi zzafiVar) throws zzbp {
        if (zzk(zzdyVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd());
            int i10 = copyOf[9] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            List zza2 = zzzp.zza(copyOf);
            zzcw.zzf(zzafiVar.zza == null);
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/opus");
            zzabVar.zzw(i10);
            zzabVar.zzT(48000);
            zzabVar.zzI(zza2);
            zzafiVar.zza = zzabVar.zzY();
            return true;
        } else if (zzk(zzdyVar, zzb)) {
            zzcw.zzb(zzafiVar.zza);
            zzdyVar.zzG(8);
            zzbl zzb2 = zzaae.zzb(zzfrj.zzn(zzaae.zzc(zzdyVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzab zzb3 = zzafiVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzafiVar.zza.zzk));
            zzafiVar.zza = zzb3.zzY();
            return true;
        } else {
            zzcw.zzb(zzafiVar.zza);
            return false;
        }
    }
}
