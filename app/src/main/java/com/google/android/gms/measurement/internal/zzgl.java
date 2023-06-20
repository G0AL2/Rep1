package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgl implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzha zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzha zzhaVar, zzab zzabVar) {
        this.zzb = zzhaVar;
        this.zza = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzli zzliVar2;
        zzli zzliVar3;
        zzliVar = this.zzb.zza;
        zzliVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzliVar3 = this.zzb.zza;
            zzliVar3.zzM(this.zza);
            return;
        }
        zzliVar2 = this.zzb.zza;
        zzliVar2.zzS(this.zza);
    }
}
