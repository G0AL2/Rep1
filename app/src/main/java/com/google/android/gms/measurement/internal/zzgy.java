package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgy implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzha zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgy(zzha zzhaVar, zzp zzpVar) {
        this.zzb = zzhaVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzli zzliVar2;
        zzliVar = this.zzb.zza;
        zzliVar.zzA();
        zzliVar2 = this.zzb.zza;
        zzliVar2.zzK(this.zza);
    }
}
