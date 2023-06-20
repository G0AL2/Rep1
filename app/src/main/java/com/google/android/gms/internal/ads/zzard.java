package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzard implements zzary, zzarz {
    private final int zza;
    private zzasa zzb;
    private int zzc;
    private int zzd;
    private zzaxl zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzard(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final boolean zzA() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final boolean zzB() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzary, com.google.android.gms.internal.ads.zzarz
    public final int zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd(zzaru zzaruVar, zzato zzatoVar, boolean z10) {
        int zzb = this.zze.zzb(zzaruVar, zzatoVar, z10);
        if (zzb == -4) {
            if (zzatoVar.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzatoVar.zzc += this.zzf;
        } else if (zzb == -5) {
            zzart zzartVar = zzaruVar.zza;
            long j10 = zzartVar.zzw;
            if (j10 != Long.MAX_VALUE) {
                zzaruVar.zza = new zzart(zzartVar.zza, zzartVar.zze, zzartVar.zzf, zzartVar.zzc, zzartVar.zzb, zzartVar.zzg, zzartVar.zzj, zzartVar.zzk, zzartVar.zzl, zzartVar.zzm, zzartVar.zzn, zzartVar.zzp, zzartVar.zzo, zzartVar.zzq, zzartVar.zzr, zzartVar.zzs, zzartVar.zzt, zzartVar.zzu, zzartVar.zzv, zzartVar.zzx, zzartVar.zzy, zzartVar.zzz, j10 + this.zzf, zzartVar.zzh, zzartVar.zzi, zzartVar.zzd);
                return -5;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarz
    public int zze() throws zzarf {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzarz zzf() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzasa zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzaxl zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public zzazd zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzj() {
        zzayz.zze(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzk(zzasa zzasaVar, zzart[] zzartVarArr, zzaxl zzaxlVar, long j10, boolean z10, long j11) throws zzarf {
        zzayz.zze(this.zzd == 0);
        this.zzb = zzasaVar;
        this.zzd = 1;
        zzo(z10);
        zzt(zzartVarArr, zzaxlVar, j11);
        zzp(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public void zzl(int i10, Object obj) throws zzarf {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    protected void zzn() {
        throw null;
    }

    protected void zzo(boolean z10) throws zzarf {
    }

    protected void zzp(long j10, boolean z10) throws zzarf {
        throw null;
    }

    protected void zzq() throws zzarf {
    }

    protected void zzr() throws zzarf {
    }

    protected void zzs(zzart[] zzartVarArr, long j10) throws zzarf {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzt(zzart[] zzartVarArr, zzaxl zzaxlVar, long j10) throws zzarf {
        zzayz.zze(!this.zzh);
        this.zze = zzaxlVar;
        this.zzg = false;
        this.zzf = j10;
        zzs(zzartVarArr, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzu(long j10) throws zzarf {
        this.zzh = false;
        this.zzg = false;
        zzp(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzv() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzw(int i10) {
        this.zzc = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzx(long j10) {
        this.zze.zzd(j10 - this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzy() throws zzarf {
        zzayz.zze(this.zzd == 1);
        this.zzd = 2;
        zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzz() throws zzarf {
        zzayz.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
