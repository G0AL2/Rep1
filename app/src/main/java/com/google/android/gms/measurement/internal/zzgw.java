package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgw implements Runnable {
    final /* synthetic */ zzll zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzha zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(zzha zzhaVar, zzll zzllVar, zzp zzpVar) {
        this.zzc = zzhaVar;
        this.zza = zzllVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzli zzliVar2;
        zzli zzliVar3;
        zzliVar = this.zzc.zza;
        zzliVar.zzA();
        if (this.zza.zza() == null) {
            zzliVar3 = this.zzc.zza;
            zzliVar3.zzO(this.zza, this.zzb);
            return;
        }
        zzliVar2 = this.zzc.zza;
        zzliVar2.zzV(this.zza, this.zzb);
    }
}
