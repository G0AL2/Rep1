package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzff implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzfg zzfgVar, boolean z10) {
        this.zzb = zzfgVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzliVar = this.zzb.zzb;
        zzliVar.zzI(this.zza);
    }
}
