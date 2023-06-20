package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzci {
    public static final zzci zza = new zzcd();
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcc
    };

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzci) {
            zzci zzciVar = (zzci) obj;
            if (zzciVar.zzc() == zzc() && zzciVar.zzb() == zzb()) {
                zzch zzchVar = new zzch();
                zzcf zzcfVar = new zzcf();
                zzch zzchVar2 = new zzch();
                zzcf zzcfVar2 = new zzcf();
                for (int i10 = 0; i10 < zzc(); i10++) {
                    if (!zze(i10, zzchVar, 0L).equals(zzciVar.zze(i10, zzchVar2, 0L))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < zzb(); i11++) {
                    if (!zzd(i11, zzcfVar, true).equals(zzciVar.zzd(i11, zzcfVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        int zzc = zzc() + 217;
        for (int i10 = 0; i10 < zzc(); i10++) {
            zzc = (zzc * 31) + zze(i10, zzchVar, 0L).hashCode();
        }
        int zzb2 = (zzc * 31) + zzb();
        for (int i11 = 0; i11 < zzb(); i11++) {
            zzb2 = (zzb2 * 31) + zzd(i11, zzcfVar, true).hashCode();
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcf zzd(int i10, zzcf zzcfVar, boolean z10);

    public abstract zzch zze(int i10, zzch zzchVar, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzcf zzcfVar, zzch zzchVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzcfVar, false).zzd;
        if (zze(i12, zzchVar, 0L).zzp == i10) {
            int zzj = zzj(i12, i11, z10);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzchVar, 0L).zzo;
        }
        return i10 + 1;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == zzh(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == zzh(z10) ? zzg(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzch zzchVar, zzcf zzcfVar, int i10, long j10) {
        Pair zzm = zzm(zzchVar, zzcfVar, i10, j10, 0L);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    public final Pair zzm(zzch zzchVar, zzcf zzcfVar, int i10, long j10, long j11) {
        zzcw.zza(i10, 0, zzc());
        zze(i10, zzchVar, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzchVar.zzm;
            j10 = 0;
        }
        int i11 = zzchVar.zzo;
        zzd(i11, zzcfVar, false);
        while (i11 < zzchVar.zzp) {
            long j13 = zzcfVar.zzf;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = zzd(i13, zzcfVar, false).zzf;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        zzd(i11, zzcfVar, true);
        long j15 = zzcfVar.zzf;
        long j16 = zzcfVar.zze;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = zzcfVar.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcf zzn(Object obj, zzcf zzcfVar) {
        return zzd(zza(obj), zzcfVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
