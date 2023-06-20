package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjr implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzab zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ zzkb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjr(zzkb zzkbVar, boolean z10, zzp zzpVar, boolean z11, zzab zzabVar, zzab zzabVar2) {
        this.zze = zzkbVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzabVar;
        this.zzd = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        zzkb zzkbVar = this.zze;
        zzeoVar = zzkbVar.zzb;
        if (zzeoVar == null) {
            zzkbVar.zzs.zzaz().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzeoVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
