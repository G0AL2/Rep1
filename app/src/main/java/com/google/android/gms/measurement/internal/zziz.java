package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zziz implements Runnable {
    final /* synthetic */ zziu zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzjb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziz(zzjb zzjbVar, zziu zziuVar, long j10) {
        this.zzc = zzjbVar;
        this.zza = zziuVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzjb zzjbVar = this.zzc;
        zzjbVar.zza = null;
        zzjbVar.zzs.zzt().zzG(null);
    }
}
