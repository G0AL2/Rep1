package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgu implements Runnable {
    final /* synthetic */ zzav zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzha zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(zzha zzhaVar, zzav zzavVar, String str) {
        this.zzc = zzhaVar;
        this.zza = zzavVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzli zzliVar2;
        zzliVar = this.zzc.zza;
        zzliVar.zzA();
        zzliVar2 = this.zzc.zza;
        zzliVar2.zzE(this.zza, this.zzb);
    }
}
