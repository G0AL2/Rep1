package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjn {
    private static final zzsa zzt = new zzsa(new Object());
    public final zzci zza;
    public final zzsa zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzgt zzf;
    public final boolean zzg;
    public final zzty zzh;
    public final zzvn zzi;
    public final List zzj;
    public final zzsa zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbt zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzjn(zzci zzciVar, zzsa zzsaVar, long j10, long j11, int i10, zzgt zzgtVar, boolean z10, zzty zztyVar, zzvn zzvnVar, List list, zzsa zzsaVar2, boolean z11, int i11, zzbt zzbtVar, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.zza = zzciVar;
        this.zzb = zzsaVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzgtVar;
        this.zzg = z10;
        this.zzh = zztyVar;
        this.zzi = zzvnVar;
        this.zzj = list;
        this.zzk = zzsaVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzbtVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzo = z12;
        this.zzp = z13;
    }

    public static zzjn zzh(zzvn zzvnVar) {
        zzci zzciVar = zzci.zza;
        zzsa zzsaVar = zzt;
        return new zzjn(zzciVar, zzsaVar, -9223372036854775807L, 0L, 1, null, false, zzty.zza, zzvnVar, zzfrj.zzo(), zzsaVar, false, 0, zzbt.zza, 0L, 0L, 0L, false, false);
    }

    public static zzsa zzi() {
        return zzt;
    }

    public final zzjn zza(zzsa zzsaVar) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsaVar, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzb(zzsa zzsaVar, long j10, long j11, long j12, long j13, zzty zztyVar, zzvn zzvnVar, List list) {
        return new zzjn(this.zza, zzsaVar, j11, j12, this.zze, this.zzf, this.zzg, zztyVar, zzvnVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j13, j10, this.zzo, this.zzp);
    }

    public final zzjn zzc(boolean z10) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z10, this.zzp);
    }

    public final zzjn zzd(boolean z10, int i10) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zze(zzgt zzgtVar) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgtVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzf(int i10) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjn zzg(zzci zzciVar) {
        return new zzjn(zzciVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }
}
