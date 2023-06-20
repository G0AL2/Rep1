package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaax extends zzzf {
    private final long zza;

    public zzaax(zzys zzysVar, long j10) {
        super(zzysVar);
        zzcw.zzd(zzysVar.zzf() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzzf, com.google.android.gms.internal.ads.zzys
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf, com.google.android.gms.internal.ads.zzys
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf, com.google.android.gms.internal.ads.zzys
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
