package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgk implements zzjt, zzju {
    private final int zza;
    private zzjv zzc;
    private int zzd;
    private zzmu zze;
    private int zzf;
    private zztq zzg;
    private zzad[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zziz zzb = new zziz();
    private long zzj = Long.MIN_VALUE;

    public zzgk(int i10) {
        this.zza = i10;
    }

    private final void zzP(long j10, boolean z10) throws zzgt {
        this.zzk = false;
        this.zzj = j10;
        zzu(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzB(long j10) throws zzgt {
        zzP(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public /* synthetic */ void zzD(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzE() throws zzgt {
        zzcw.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final boolean zzH() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        return zztqVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzad[] zzJ() {
        zzad[] zzadVarArr = this.zzh;
        Objects.requireNonNull(zzadVarArr);
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final int zzbe() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzbf(zziz zzizVar, zzgb zzgbVar, int i10) {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        int zza = zztqVar.zza(zzizVar, zzgbVar, i10);
        if (zza == -4) {
            if (zzgbVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j10 = zzgbVar.zzd + this.zzi;
            zzgbVar.zzd = j10;
            this.zzj = Math.max(this.zzj, j10);
        } else if (zza == -5) {
            zzad zzadVar = zzizVar.zza;
            Objects.requireNonNull(zzadVar);
            long j11 = zzadVar.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzab zzb = zzadVar.zzb();
                zzb.zzW(j11 + this.zzi);
                zzizVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzgt zzbg(Throwable th, zzad zzadVar, boolean z10, int i10) {
        int i11;
        if (zzadVar != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzadVar) & 7;
                this.zzl = false;
                i11 = zzO;
            } catch (zzgt unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzgt.zzb(th, zzK(), this.zzd, zzadVar, i11, z10, i10);
        }
        i11 = 4;
        return zzgt.zzb(th, zzK(), this.zzd, zzadVar, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd(long j10) {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        return zztqVar.zzb(j10 - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public int zze() throws zzgt {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final long zzf() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zziz zzh() {
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        return zzizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public zzjb zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final zzju zzj() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjv zzk() {
        zzjv zzjvVar = this.zzc;
        Objects.requireNonNull(zzjvVar);
        return zzjvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmu zzl() {
        zzmu zzmuVar = this.zze;
        Objects.requireNonNull(zzmuVar);
        return zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final zztq zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzn() {
        zzcw.zzf(this.zzf == 1);
        zziz zzizVar = this.zzb;
        zzizVar.zzb = null;
        zzizVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzo(zzjv zzjvVar, zzad[] zzadVarArr, zztq zztqVar, long j10, boolean z10, boolean z11, long j11, long j12) throws zzgt {
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjvVar;
        this.zzf = 1;
        zzt(z10, z11);
        zzz(zzadVarArr, zztqVar, j11, j12);
        zzP(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public void zzp(int i10, Object obj) throws zzgt {
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzq(int i10, zzmu zzmuVar) {
        this.zzd = i10;
        this.zze = zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzr() throws IOException {
        zztq zztqVar = this.zzg;
        Objects.requireNonNull(zztqVar);
        zztqVar.zzd();
    }

    protected void zzs() {
        throw null;
    }

    protected void zzt(boolean z10, boolean z11) throws zzgt {
    }

    protected void zzu(long j10, boolean z10) throws zzgt {
        throw null;
    }

    protected void zzv() {
    }

    protected void zzw() throws zzgt {
    }

    protected void zzx() {
    }

    protected void zzy(zzad[] zzadVarArr, long j10, long j11) throws zzgt {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzz(zzad[] zzadVarArr, zztq zztqVar, long j10, long j11) throws zzgt {
        zzcw.zzf(!this.zzk);
        this.zzg = zztqVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j10;
        }
        this.zzh = zzadVarArr;
        this.zzi = j11;
        zzy(zzadVarArr, j10, j11);
    }
}
