package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgt implements Runnable {
    final /* synthetic */ zzav zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzha zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgt(zzha zzhaVar, zzav zzavVar, zzp zzpVar) {
        this.zzc = zzhaVar;
        this.zza = zzavVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
