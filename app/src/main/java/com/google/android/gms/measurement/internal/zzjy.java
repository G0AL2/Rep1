package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzjy implements Runnable {
    final /* synthetic */ zzka zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjy(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkb zzkbVar = this.zza.zza;
        Context zzav = zzkbVar.zzs.zzav();
        this.zza.zza.zzs.zzax();
        zzkb.zzo(zzkbVar, new ComponentName(zzav, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
