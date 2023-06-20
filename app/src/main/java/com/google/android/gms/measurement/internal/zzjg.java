package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjg implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzkb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(zzkb zzkbVar, AtomicReference atomicReference, zzp zzpVar) {
        this.zzc = zzkbVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzeo zzeoVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e10) {
                this.zzc.zzs.zzaz().zzd().zzb("Failed to get app instance id", e10);
                atomicReference = this.zza;
            }
            if (!this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                this.zzc.zzs.zzaz().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzP(null);
                this.zzc.zzs.zzm().zze.zzb(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzkb zzkbVar = this.zzc;
            zzeoVar = zzkbVar.zzb;
            if (zzeoVar == null) {
                zzkbVar.zzs.zzaz().zzd().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzeoVar.zzd(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzs.zzq().zzP(str);
                this.zzc.zzs.zzm().zze.zzb(str);
            }
            this.zzc.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
