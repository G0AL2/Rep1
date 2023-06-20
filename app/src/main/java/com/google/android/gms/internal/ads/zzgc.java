package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgc extends zzci {
    private final int zzc;
    private final zztt zzd;

    public zzgc(boolean z10, zztt zzttVar, byte[] bArr) {
        this.zzd = zzttVar;
        this.zzc = zzttVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zzd(i10);
        }
        if (i10 >= this.zzc - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
                return -1;
            }
            return zzs(zzp) + zza;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i10, zzcf zzcfVar, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzcfVar, z10);
        zzcfVar.zzd += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzcfVar.zzc;
            Objects.requireNonNull(obj);
            zzcfVar.zzc = Pair.create(zzv, obj);
        }
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i10, zzch zzchVar, long j10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzchVar, j10);
        Object zzv = zzv(zzr);
        if (!zzch.zza.equals(zzchVar.zzc)) {
            zzv = Pair.create(zzv, zzchVar.zzc);
        }
        zzchVar.zzc = zzv;
        zzchVar.zzo += zzs;
        zzchVar.zzp += zzs;
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzg(boolean z10) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z10 ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            zza = zzw(zza, z10);
            if (zza == -1) {
                return -1;
            }
        }
        return zzt(zza) + zzu(zza).zzg(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzh(boolean z10) {
        int i10 = this.zzc;
        if (i10 == 0) {
            return -1;
        }
        int zzb = z10 ? this.zzd.zzb() : i10 - 1;
        while (zzu(zzb).zzo()) {
            zzb = zzx(zzb, z10);
            if (zzb == -1) {
                return -1;
            }
        }
        return zzt(zzb) + zzu(zzb).zzh(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzj(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i10 - zzt, i11 == 2 ? 0 : i11, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z10);
        }
        if (i11 == 2) {
            return zzg(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzn(Object obj, zzcf zzcfVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcfVar);
        zzcfVar.zzd += zzt;
        zzcfVar.zzc = obj;
        return zzcfVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i10);

    protected abstract int zzr(int i10);

    protected abstract int zzs(int i10);

    protected abstract int zzt(int i10);

    protected abstract zzci zzu(int i10);

    protected abstract Object zzv(int i10);
}
