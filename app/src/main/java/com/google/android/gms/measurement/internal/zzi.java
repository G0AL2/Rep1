package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.2 */
/* loaded from: classes2.dex */
final class zzi implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzav zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ AppMeasurementDynamiteService zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, zzav zzavVar, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zzcfVar;
        this.zzb = zzavVar;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzt().zzB(this.zza, this.zzb, this.zzc);
    }
}
