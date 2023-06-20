package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaey implements zzzu {
    final /* synthetic */ zzaez zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaey(zzaez zzaezVar, zzaex zzaexVar) {
        this.zza = zzaezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        zzafl zzaflVar;
        long j10;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        j10 = zzaezVar.zzf;
        return zzaflVar.zzf(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        zzafl zzaflVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        long zzg = zzaflVar.zzg(j10);
        j11 = zzaezVar.zzb;
        j12 = zzaezVar.zzc;
        j13 = zzaezVar.zzb;
        j14 = zzaezVar.zzf;
        j15 = zzaezVar.zzb;
        j16 = zzaezVar.zzc;
        zzzv zzzvVar = new zzzv(j10, zzeg.zzr((-30000) + j11 + ((zzg * (j12 - j13)) / j14), j15, j16 - 1));
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}
