package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkt extends zzao {
    final /* synthetic */ zzku zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkt(zzku zzkuVar, zzhd zzhdVar) {
        super(zzhdVar);
        this.zza = zzkuVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzao
    public final void zzc() {
        this.zza.zza();
        this.zza.zzs.zzaz().zzj().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
