package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzkg implements Runnable {
    final /* synthetic */ zzli zza;
    final /* synthetic */ Runnable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkg(zzki zzkiVar, zzli zzliVar, Runnable runnable) {
        this.zza = zzliVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
