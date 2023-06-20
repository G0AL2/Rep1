package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaxh {
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzart zzq;
    private int zza = 1000;
    private int[] zzb = new int[1000];
    private long[] zzc = new long[1000];
    private long[] zzf = new long[1000];
    private int[] zze = new int[1000];
    private int[] zzd = new int[1000];
    private zzaue[] zzg = new zzaue[1000];
    private zzart[] zzh = new zzart[1000];
    private long zzm = Long.MIN_VALUE;
    private long zzn = Long.MIN_VALUE;
    private boolean zzp = true;
    private boolean zzo = true;

    public final int zza() {
        return this.zzj + this.zzi;
    }

    public final synchronized int zzb(zzaru zzaruVar, zzato zzatoVar, boolean z10, boolean z11, zzart zzartVar, zzaxg zzaxgVar) {
        if (!zzl()) {
            if (z11) {
                zzatoVar.zzc(4);
                return -4;
            }
            zzart zzartVar2 = this.zzq;
            if (zzartVar2 == null || (!z10 && zzartVar2 == zzartVar)) {
                return -3;
            }
            zzaruVar.zza = zzartVar2;
            return -5;
        }
        if (!z10) {
            zzart[] zzartVarArr = this.zzh;
            int i10 = this.zzk;
            if (zzartVarArr[i10] == zzartVar) {
                if (zzatoVar.zzb != null) {
                    zzatoVar.zzc = this.zzf[i10];
                    zzatoVar.zzc(this.zze[i10]);
                    int[] iArr = this.zzd;
                    int i11 = this.zzk;
                    zzaxgVar.zza = iArr[i11];
                    zzaxgVar.zzb = this.zzc[i11];
                    zzaxgVar.zzd = this.zzg[i11];
                    this.zzm = Math.max(this.zzm, zzatoVar.zzc);
                    int i12 = this.zzi - 1;
                    this.zzi = i12;
                    int i13 = this.zzk + 1;
                    this.zzk = i13;
                    this.zzj++;
                    if (i13 == this.zza) {
                        this.zzk = 0;
                        i13 = 0;
                    }
                    zzaxgVar.zzc = i12 > 0 ? this.zzc[i13] : zzaxgVar.zzb + zzaxgVar.zza;
                    return -4;
                }
                return -3;
            }
        }
        zzaruVar.zza = this.zzh[this.zzk];
        return -5;
    }

    public final synchronized long zzc() {
        return Math.max(this.zzm, this.zzn);
    }

    public final synchronized long zzd() {
        if (zzl()) {
            int i10 = this.zzk;
            int i11 = this.zzi;
            int i12 = i10 + i11;
            int i13 = this.zza;
            int i14 = (i12 - 1) % i13;
            this.zzk = i12 % i13;
            this.zzj += i11;
            this.zzi = 0;
            return this.zzc[i14] + this.zzd[i14];
        }
        return -1L;
    }

    public final synchronized long zze(long j10, boolean z10) {
        if (zzl()) {
            long[] jArr = this.zzf;
            int i10 = this.zzk;
            if (j10 >= jArr[i10]) {
                int i11 = 0;
                if (j10 <= this.zzn || z10) {
                    int i12 = -1;
                    while (i10 != this.zzl && this.zzf[i10] <= j10) {
                        if (1 == (this.zze[i10] & 1)) {
                            i12 = i11;
                        }
                        i10 = (i10 + 1) % this.zza;
                        i11++;
                    }
                    if (i12 == -1) {
                        return -1L;
                    }
                    int i13 = (this.zzk + i12) % this.zza;
                    this.zzk = i13;
                    this.zzj += i12;
                    this.zzi -= i12;
                    return this.zzc[i13];
                }
                return -1L;
            }
        }
        return -1L;
    }

    public final synchronized zzart zzf() {
        if (this.zzp) {
            return null;
        }
        return this.zzq;
    }

    public final void zzg() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzi = 0;
        this.zzo = true;
    }

    public final synchronized void zzh(long j10, int i10, long j11, int i11, zzaue zzaueVar) {
        if (this.zzo) {
            if ((i10 & 1) == 0) {
                return;
            }
            this.zzo = false;
        }
        zzayz.zze(!this.zzp);
        zzi(j10);
        long[] jArr = this.zzf;
        int i12 = this.zzl;
        jArr[i12] = j10;
        long[] jArr2 = this.zzc;
        jArr2[i12] = j11;
        this.zzd[i12] = i11;
        this.zze[i12] = i10;
        this.zzg[i12] = zzaueVar;
        this.zzh[i12] = this.zzq;
        this.zzb[i12] = 0;
        int i13 = this.zzi + 1;
        this.zzi = i13;
        int i14 = this.zza;
        if (i13 != i14) {
            int i15 = i12 + 1;
            this.zzl = i15;
            if (i15 == i14) {
                this.zzl = 0;
                return;
            }
            return;
        }
        int i16 = i14 + 1000;
        int[] iArr = new int[i16];
        long[] jArr3 = new long[i16];
        long[] jArr4 = new long[i16];
        int[] iArr2 = new int[i16];
        int[] iArr3 = new int[i16];
        zzaue[] zzaueVarArr = new zzaue[i16];
        zzart[] zzartVarArr = new zzart[i16];
        int i17 = this.zzk;
        int i18 = i14 - i17;
        System.arraycopy(jArr2, i17, jArr3, 0, i18);
        System.arraycopy(this.zzf, this.zzk, jArr4, 0, i18);
        System.arraycopy(this.zze, this.zzk, iArr2, 0, i18);
        System.arraycopy(this.zzd, this.zzk, iArr3, 0, i18);
        System.arraycopy(this.zzg, this.zzk, zzaueVarArr, 0, i18);
        System.arraycopy(this.zzh, this.zzk, zzartVarArr, 0, i18);
        System.arraycopy(this.zzb, this.zzk, iArr, 0, i18);
        int i19 = this.zzk;
        System.arraycopy(this.zzc, 0, jArr3, i18, i19);
        System.arraycopy(this.zzf, 0, jArr4, i18, i19);
        System.arraycopy(this.zze, 0, iArr2, i18, i19);
        System.arraycopy(this.zzd, 0, iArr3, i18, i19);
        System.arraycopy(this.zzg, 0, zzaueVarArr, i18, i19);
        System.arraycopy(this.zzh, 0, zzartVarArr, i18, i19);
        System.arraycopy(this.zzb, 0, iArr, i18, i19);
        this.zzc = jArr3;
        this.zzf = jArr4;
        this.zze = iArr2;
        this.zzd = iArr3;
        this.zzg = zzaueVarArr;
        this.zzh = zzartVarArr;
        this.zzb = iArr;
        this.zzk = 0;
        int i20 = this.zza;
        this.zzl = i20;
        this.zzi = i20;
        this.zza = i16;
    }

    public final synchronized void zzi(long j10) {
        this.zzn = Math.max(this.zzn, j10);
    }

    public final void zzj() {
        this.zzm = Long.MIN_VALUE;
        this.zzn = Long.MIN_VALUE;
    }

    public final synchronized boolean zzk(zzart zzartVar) {
        if (zzartVar == null) {
            this.zzp = true;
            return false;
        }
        this.zzp = false;
        if (zzazo.zzo(zzartVar, this.zzq)) {
            return false;
        }
        this.zzq = zzartVar;
        return true;
    }

    public final synchronized boolean zzl() {
        return this.zzi != 0;
    }
}
