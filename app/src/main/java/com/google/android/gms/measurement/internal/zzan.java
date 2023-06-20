package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzan implements Runnable {
    final /* synthetic */ zzhd zza;
    final /* synthetic */ zzao zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzao zzaoVar, zzhd zzhdVar) {
        this.zzb = zzaoVar;
        this.zza = zzhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzax();
        if (zzaa.zza()) {
            this.zza.zzaA().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
