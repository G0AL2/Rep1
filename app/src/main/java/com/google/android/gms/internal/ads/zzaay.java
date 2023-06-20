package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaay implements zzzu {
    final /* synthetic */ zzzu zza;
    final /* synthetic */ zzaaz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaay(zzaaz zzaazVar, zzzu zzzuVar) {
        this.zzb = zzaazVar;
        this.zza = zzzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        long j11;
        long j12;
        zzzs zzg = this.zza.zzg(j10);
        zzzv zzzvVar = zzg.zza;
        long j13 = zzzvVar.zzb;
        long j14 = zzzvVar.zzc;
        j11 = this.zzb.zzb;
        zzzv zzzvVar2 = new zzzv(j13, j14 + j11);
        zzzv zzzvVar3 = zzg.zzb;
        long j15 = zzzvVar3.zzb;
        long j16 = zzzvVar3.zzc;
        j12 = this.zzb.zzb;
        return new zzzs(zzzvVar2, new zzzv(j15, j16 + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
