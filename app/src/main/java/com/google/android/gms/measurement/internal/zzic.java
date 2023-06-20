package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzic implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzic(zzin zzinVar, AtomicReference atomicReference) {
        this.zzb = zzinVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(this.zzb.zzs.zzf().zzo(this.zzb.zzs.zzh().zzl(), zzel.zzK));
            this.zza.notify();
        }
    }
}
