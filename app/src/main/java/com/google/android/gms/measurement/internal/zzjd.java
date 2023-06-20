package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjd implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzll zzc;
    final /* synthetic */ zzkb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjd(zzkb zzkbVar, zzp zzpVar, boolean z10, zzll zzllVar) {
        this.zzd = zzkbVar;
        this.zza = zzpVar;
        this.zzb = z10;
        this.zzc = zzllVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzkb zzkbVar = this.zzd;
        zzeoVar = zzkbVar.zzb;
        if (zzeoVar == null) {
            zzkbVar.zzs.zzaz().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzeoVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
