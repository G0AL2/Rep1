package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjf implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzkb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjf(zzkb zzkbVar, zzp zzpVar) {
        this.zzb = zzkbVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzkb zzkbVar = this.zzb;
        zzeoVar = zzkbVar.zzb;
        if (zzeoVar == null) {
            zzkbVar.zzs.zzaz().zzd().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeoVar.zzm(this.zza);
        } catch (RemoteException e10) {
            this.zzb.zzs.zzaz().zzd().zzb("Failed to reset data on the service: remote exception", e10);
        }
        this.zzb.zzQ();
    }
}
