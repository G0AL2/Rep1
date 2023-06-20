package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzju implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzp zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzkb zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzkb zzkbVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z10) {
        this.zzf = zzkbVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzkb zzkbVar;
        zzeo zzeoVar;
        synchronized (this.zza) {
            try {
                zzkbVar = this.zzf;
                zzeoVar = zzkbVar.zzb;
            } catch (RemoteException e10) {
                this.zzf.zzs.zzaz().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e10);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzeoVar == null) {
                zzkbVar.zzs.zzaz().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                this.zza.set(zzeoVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
            } else {
                this.zza.set(zzeoVar.zzi(null, this.zzb, this.zzc, this.zze));
            }
            this.zzf.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
