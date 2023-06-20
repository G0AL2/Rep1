package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzjc {
    public final zzry zza;
    public final Object zzb;
    public final zztq[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzjd zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzju[] zzi;
    private final zzvm zzj;
    private final zzjm zzk;
    private zzjc zzl;
    private zzty zzm;
    private zzvn zzn;
    private long zzo;

    public zzjc(zzju[] zzjuVarArr, long j10, zzvm zzvmVar, zzvv zzvvVar, zzjm zzjmVar, zzjd zzjdVar, zzvn zzvnVar, byte[] bArr) {
        this.zzi = zzjuVarArr;
        this.zzo = j10;
        this.zzj = zzvmVar;
        this.zzk = zzjmVar;
        zzsa zzsaVar = zzjdVar.zza;
        this.zzb = zzsaVar.zza;
        this.zzf = zzjdVar;
        this.zzm = zzty.zza;
        this.zzn = zzvnVar;
        this.zzc = new zztq[2];
        this.zzh = new boolean[2];
        long j11 = zzjdVar.zzb;
        long j12 = zzjdVar.zzd;
        zzry zzo = zzjmVar.zzo(zzsaVar, zzvvVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zzrf(zzo, true, 0L, j12) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzvn zzvnVar = this.zzn;
            if (i10 >= zzvnVar.zza) {
                return;
            }
            zzvnVar.zzb(i10);
            zzvg zzvgVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzvn zzvnVar = this.zzn;
            if (i10 >= zzvnVar.zza) {
                return;
            }
            zzvnVar.zzb(i10);
            zzvg zzvgVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvn zzvnVar, long j10, boolean z10) {
        return zzb(zzvnVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzvn zzvnVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzvnVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzvnVar.zza(this.zzn, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzju[] zzjuVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzjuVarArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzvnVar;
        zzt();
        long zzf = this.zza.zzf(zzvnVar.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzju[] zzjuVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzjuVarArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zztq[] zztqVarArr = this.zzc;
            if (i13 >= 2) {
                return zzf;
            }
            if (zztqVarArr[i13] != null) {
                zzcw.zzf(zzvnVar.zzb(i13));
                this.zzi[i13].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvnVar.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (this.zzd) {
            long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
        }
        return this.zzf.zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjc zzg() {
        return this.zzl;
    }

    public final zzty zzh() {
        return this.zzm;
    }

    public final zzvn zzi() {
        return this.zzn;
    }

    public final zzvn zzj(float f10, zzci zzciVar) throws zzgt {
        zzvg[] zzvgVarArr;
        zzvn zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzciVar);
        for (zzvg zzvgVar : zzj.zzc) {
        }
        return zzj;
    }

    public final void zzk(long j10) {
        zzcw.zzf(zzu());
        this.zza.zzo(j10 - this.zzo);
    }

    public final void zzl(float f10, zzci zzciVar) throws zzgt {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvn zzj = zzj(f10, zzciVar);
        zzjd zzjdVar = this.zzf;
        long j10 = zzjdVar.zzb;
        long j11 = zzjdVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long zza = zza(zzj, j10, false);
        long j12 = this.zzo;
        zzjd zzjdVar2 = this.zzf;
        this.zzo = j12 + (zzjdVar2.zzb - zza);
        this.zzf = zzjdVar2.zzb(zza);
    }

    public final void zzm(long j10) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjm zzjmVar = this.zzk;
        zzry zzryVar = this.zza;
        try {
            if (zzryVar instanceof zzrf) {
                zzjmVar.zzh(((zzrf) zzryVar).zza);
            } else {
                zzjmVar.zzh(zzryVar);
            }
        } catch (RuntimeException e10) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzjc zzjcVar) {
        if (zzjcVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjcVar;
        zzt();
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzry zzryVar = this.zza;
        if (zzryVar instanceof zzrf) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzrf) zzryVar).zzn(0L, j10);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
