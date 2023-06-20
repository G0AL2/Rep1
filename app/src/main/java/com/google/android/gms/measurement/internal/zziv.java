package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zziv implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zziu zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzjb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zzjb zzjbVar, Bundle bundle, zziu zziuVar, zziu zziuVar2, long j10) {
        this.zze = zzjbVar;
        this.zza = bundle;
        this.zzb = zziuVar;
        this.zzc = zziuVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjb.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
