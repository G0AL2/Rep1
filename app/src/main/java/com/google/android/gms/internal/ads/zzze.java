package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzze {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzzd zzk;
    private final zzbl zzl;

    private zzze(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzzd zzzdVar, zzbl zzblVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzzdVar;
        this.zzl = zzblVar;
    }

    public zzze(byte[] bArr, int i10) {
        zzdx zzdxVar = new zzdx(bArr, bArr.length);
        zzdxVar.zzh(i10 * 8);
        this.zza = zzdxVar.zzc(16);
        this.zzb = zzdxVar.zzc(16);
        this.zzc = zzdxVar.zzc(24);
        this.zzd = zzdxVar.zzc(24);
        int zzc = zzdxVar.zzc(20);
        this.zze = zzc;
        this.zzf = zzi(zzc);
        this.zzg = zzdxVar.zzc(3) + 1;
        int zzc2 = zzdxVar.zzc(5) + 1;
        this.zzh = zzc2;
        this.zzi = zzh(zzc2);
        this.zzj = zzeg.zzy(zzdxVar.zzc(4), zzdxVar.zzc(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        return zzeg.zzr((j10 * this.zze) / 1000000, 0L, this.zzj - 1);
    }

    public final zzad zzc(byte[] bArr, zzbl zzblVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzbl zzd = zzd(zzblVar);
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/flac");
        zzabVar.zzL(i10);
        zzabVar.zzw(this.zzg);
        zzabVar.zzT(this.zze);
        zzabVar.zzI(Collections.singletonList(bArr));
        zzabVar.zzM(zzd);
        return zzabVar.zzY();
    }

    public final zzbl zzd(zzbl zzblVar) {
        zzbl zzblVar2 = this.zzl;
        return zzblVar2 == null ? zzblVar : zzblVar2.zzd(zzblVar);
    }

    public final zzze zze(List list) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbl(list)));
    }

    public final zzze zzf(zzzd zzzdVar) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzzdVar, this.zzl);
    }

    public final zzze zzg(List list) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaae.zzb(list)));
    }
}
