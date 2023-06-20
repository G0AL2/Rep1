package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzkj implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkj(zzkr zzkrVar, long j10) {
        this.zzb = zzkrVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr.zzl(this.zzb, this.zza);
    }
}
