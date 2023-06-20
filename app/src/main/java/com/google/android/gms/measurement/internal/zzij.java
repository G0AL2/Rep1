package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzij implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzij(zzin zzinVar, boolean z10) {
        this.zzb = zzinVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzJ = this.zzb.zzs.zzJ();
        boolean zzI = this.zzb.zzs.zzI();
        this.zzb.zzs.zzF(this.zza);
        if (zzI == this.zza) {
            this.zzb.zzs.zzaz().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzs.zzJ() == zzJ || this.zzb.zzs.zzJ() != this.zzb.zzs.zzI()) {
            this.zzb.zzs.zzaz().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzJ));
        }
        this.zzb.zzae();
    }
}
