package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.2 */
/* loaded from: classes2.dex */
final class zzk implements Runnable {
    final /* synthetic */ zzn zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zzV(this.zza);
    }
}
