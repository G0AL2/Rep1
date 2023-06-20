package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzky implements Runnable {
    final /* synthetic */ zzlj zza;
    final /* synthetic */ zzli zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzky(zzli zzliVar, zzlj zzljVar) {
        this.zzb = zzliVar;
        this.zza = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
