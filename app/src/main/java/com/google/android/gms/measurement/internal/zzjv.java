package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzjv implements Runnable {
    final /* synthetic */ zzeo zza;
    final /* synthetic */ zzka zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjv(zzka zzkaVar, zzeo zzeoVar) {
        this.zzb = zzkaVar;
        this.zza = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzaz().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
