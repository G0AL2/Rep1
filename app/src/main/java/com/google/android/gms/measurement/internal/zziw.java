package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zziw implements Runnable {
    final /* synthetic */ zziu zza;
    final /* synthetic */ zziu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzjb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziw(zzjb zzjbVar, zziu zziuVar, zziu zziuVar2, long j10, boolean z10) {
        this.zze = zzjbVar;
        this.zza = zziuVar;
        this.zzb = zziuVar2;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
