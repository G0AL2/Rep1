package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zziy implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzjb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziy(zzjb zzjbVar, long j10) {
        this.zzb = zzjbVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
