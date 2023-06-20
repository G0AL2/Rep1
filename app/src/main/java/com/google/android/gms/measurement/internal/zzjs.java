package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjs implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzp zzd;
    final /* synthetic */ zzkb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzkb zzkbVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.zze = zzkbVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzkb zzkbVar;
        zzeo zzeoVar;
        synchronized (this.zza) {
            try {
                zzkbVar = this.zze;
                zzeoVar = zzkbVar.zzb;
            } catch (RemoteException e10) {
                this.zze.zzs.zzaz().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e10);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzeoVar == null) {
                zzkbVar.zzs.zzaz().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                this.zza.set(zzeoVar.zzf(this.zzb, this.zzc, this.zzd));
            } else {
                this.zza.set(zzeoVar.zzg(null, this.zzb, this.zzc));
            }
            this.zze.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
