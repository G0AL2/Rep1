package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzje implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzkb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzje(zzkb zzkbVar, AtomicReference atomicReference, zzp zzpVar, boolean z10) {
        this.zzd = zzkbVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzkb zzkbVar;
        zzeo zzeoVar;
        synchronized (this.zza) {
            try {
                zzkbVar = this.zzd;
                zzeoVar = zzkbVar.zzb;
            } catch (RemoteException e10) {
                this.zzd.zzs.zzaz().zzd().zzb("Failed to get all user properties; remote exception", e10);
                atomicReference = this.zza;
            }
            if (zzeoVar == null) {
                zzkbVar.zzs.zzaz().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzeoVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
