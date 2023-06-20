package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzauy implements zzauv {
    private final zzazh zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzauy(zzaus zzausVar) {
        zzazh zzazhVar = zzausVar.zza;
        this.zza = zzazhVar;
        zzazhVar.zzv(12);
        this.zzc = zzazhVar.zzi() & 255;
        this.zzb = zzazhVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zzb() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzg();
        }
        if (i10 == 16) {
            return this.zza.zzj();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 == 0) {
            int zzg = this.zza.zzg();
            this.zze = zzg;
            return (zzg & 240) >> 4;
        }
        return this.zze & 15;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final boolean zzc() {
        return false;
    }
}
