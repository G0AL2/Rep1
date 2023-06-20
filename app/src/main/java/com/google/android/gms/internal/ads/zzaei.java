package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaei {
    public final zzzy zza;
    public zzaew zzd;
    public zzaee zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzaev zzb = new zzaev();
    public final zzdy zzc = new zzdy();
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();

    public zzaei(zzzy zzzyVar, zzaew zzaewVar, zzaee zzaeeVar) {
        this.zza = zzzyVar;
        this.zzd = zzaewVar;
        this.zze = zzaeeVar;
        zzh(zzaewVar, zzaeeVar);
    }

    public final int zza() {
        int i10;
        if (this.zzl) {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i10 = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzdy zzdyVar;
        zzaeu zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i12 = zzf.zzd;
        if (i12 != 0) {
            zzdyVar = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzeg.zzG(zzf.zze);
            zzdy zzdyVar2 = this.zzk;
            int length = bArr.length;
            zzdyVar2.zzD(bArr, length);
            zzdyVar = this.zzk;
            i12 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z10 = zzb || i11 != 0;
        zzdy zzdyVar3 = this.zzj;
        zzdyVar3.zzH()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        zzdyVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzdyVar, i12, 1);
        if (z10) {
            if (!zzb) {
                this.zzc.zzC(8);
                zzdy zzdyVar4 = this.zzc;
                byte[] zzH = zzdyVar4.zzH();
                zzH[0] = 0;
                zzH[1] = 1;
                zzH[2] = 0;
                zzH[3] = (byte) i11;
                zzH[4] = (byte) ((i10 >> 24) & 255);
                zzH[5] = (byte) ((i10 >> 16) & 255);
                zzH[6] = (byte) ((i10 >> 8) & 255);
                zzH[7] = (byte) (i10 & 255);
                this.zza.zzr(zzdyVar4, 8, 1);
                return i12 + 9;
            }
            zzdy zzdyVar5 = this.zzb.zzn;
            int zzo = zzdyVar5.zzo();
            zzdyVar5.zzG(-2);
            int i13 = (zzo * 6) + 2;
            if (i11 != 0) {
                this.zzc.zzC(i13);
                byte[] zzH2 = this.zzc.zzH();
                zzdyVar5.zzB(zzH2, 0, i13);
                int i14 = (((zzH2[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (zzH2[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                zzH2[2] = (byte) ((i14 >> 8) & 255);
                zzH2[3] = (byte) (i14 & 255);
                zzdyVar5 = this.zzc;
            }
            this.zza.zzr(zzdyVar5, i13, 1);
            return i12 + 1 + i13;
        }
        return i12 + 1;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzl) {
            zzaev zzaevVar = this.zzb;
            return zzaevVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    public final zzaeu zzf() {
        if (this.zzl) {
            zzaev zzaevVar = this.zzb;
            zzaee zzaeeVar = zzaevVar.zza;
            int i10 = zzeg.zza;
            int i11 = zzaeeVar.zza;
            zzaeu zzaeuVar = zzaevVar.zzm;
            if (zzaeuVar == null) {
                zzaeuVar = this.zzd.zza.zza(i11);
            }
            if (zzaeuVar == null || !zzaeuVar.zza) {
                return null;
            }
            return zzaeuVar;
        }
        return null;
    }

    public final void zzh(zzaew zzaewVar, zzaee zzaeeVar) {
        this.zzd = zzaewVar;
        this.zze = zzaeeVar;
        this.zza.zzk(zzaewVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaev zzaevVar = this.zzb;
        zzaevVar.zzd = 0;
        zzaevVar.zzp = 0L;
        zzaevVar.zzq = false;
        zzaevVar.zzk = false;
        zzaevVar.zzo = false;
        zzaevVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (this.zzl) {
            int i10 = this.zzg + 1;
            this.zzg = i10;
            int[] iArr = this.zzb.zzg;
            int i11 = this.zzh;
            if (i10 == iArr[i11]) {
                this.zzh = i11 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
