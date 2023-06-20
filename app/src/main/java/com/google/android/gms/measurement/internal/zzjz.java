package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzjz implements Runnable {
    final /* synthetic */ zzka zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjz(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
