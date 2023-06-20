package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhu implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzin zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzin zzinVar, AtomicReference atomicReference, boolean z10) {
        this.zzc = zzinVar;
        this.zza = atomicReference;
        this.zzb = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
