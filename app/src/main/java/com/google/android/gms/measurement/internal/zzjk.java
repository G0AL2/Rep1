package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjk implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzkb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(zzkb zzkbVar, zzp zzpVar, Bundle bundle) {
        this.zzc = zzkbVar;
        this.zza = zzpVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzkb zzkbVar = this.zzc;
        zzeoVar = zzkbVar.zzb;
        if (zzeoVar == null) {
            zzkbVar.zzs.zzaz().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeoVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzs.zzaz().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
