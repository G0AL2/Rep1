package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaux implements zzauv {
    private final int zza;
    private final int zzb;
    private final zzazh zzc;

    public zzaux(zzaus zzausVar) {
        zzazh zzazhVar = zzausVar.zza;
        this.zzc = zzazhVar;
        zzazhVar.zzv(12);
        this.zza = zzazhVar.zzi();
        this.zzb = zzazhVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zzb() {
        int i10 = this.zza;
        return i10 == 0 ? this.zzc.zzi() : i10;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final boolean zzc() {
        return this.zza != 0;
    }
}
